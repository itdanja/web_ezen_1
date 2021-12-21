package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Map;

import org.json.simple.JSONObject;

import dto.Cart;
import dto.Porder;
import dto.Porderdetail;

public class PorderDao extends DB {
	
	public PorderDao() {
		super();
	}
	public static PorderDao porderDao = new PorderDao() ; 	
	public static PorderDao getPorderDao() { return porderDao; }
	
	//1. 주문 등록 [ 1.주문등록 2.세부주문 등록 3.재고업데이트 ]
	public boolean orderwrite( Porder porder , ArrayList<Cart> carts ) {
		// 1.주문등록
		String sql = "insert into porder( m_num , order_name , order_phone,"
				+ "order_address , order_pay , order_payment , delivery_pay,"
				+ "order_contents)values(?,?,?,?,?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, porder.getM_num() );	
			ps.setString(2, porder.getOrder_name() );
			ps.setString(3, porder.getOrder_phone() );
			ps.setString(4, porder.getOrder_address() );
			ps.setInt(5, porder.getOrder_pay() );
			ps.setString(6, porder.getOrder_payment() );
			ps.setInt(7, porder.getDelivery_pay() );
			ps.setString(8, porder.getOrder_contents() );
			ps.executeUpdate();
			// 방금 주문한 주문번호 검색
			sql ="select * from porder where m_num="+porder.getM_num()+" order by order_num desc";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery(); if( rs.next() ) {
				int order_num = rs.getInt(1); // 주문번호
				for( Cart cart : carts ) { // 카트내 제품수만큼 DB에 저장
					//2. 주문 상세 등록 
					sql ="insert into porderdetail( order_num, p_num , p_count , delivery_state)"
							+ "values(?,?,?,?)";
					ps=con.prepareStatement(sql);
					ps.setInt(1, order_num);	ps.setInt(2, cart.getP_num());
					ps.setInt(3, cart.getP_count() ); ps.setInt(4, 1 ); ps.executeUpdate();
					
					// 3. 재고 업데이트 처리 [ 주문시 주문수량 만큼 제품 재고 차감 ]
					sql = "update product set p_stock = p_stock-? where p_num =?";
					ps=con.prepareStatement(sql);
					ps.setInt(1, cart.getP_count() );	ps.setInt(2, cart.getP_num() );
					ps.executeUpdate();
				}
				return true;
			} 
		}
		catch (Exception e) {System.out.println(e);}
		return false;
	}
	
	// 주문목록
	public ArrayList<Porder> getporderlist( int m_num){
		ArrayList<Porder> porders = new ArrayList<Porder>();
		String sql ="select * from porder where m_num = "+m_num+" order by order_num desc";
		try {
			ps = con.prepareStatement(sql);
			rs=ps.executeQuery();
			while( rs.next() ) {
				Porder porder = new Porder( 
						rs.getInt(1), rs.getInt(2),
						rs.getString(3),rs.getString(4),
						rs.getString(5),rs.getString(6),
						rs.getInt(7),rs.getString(8),
						rs.getInt(9),rs.getInt(10),
						rs.getString(11));
				porders.add(porder);
			}
			return porders;
		}catch (Exception e) {} return null;
	}
	// 상세목록
	public ArrayList<Porderdetail> getPorderdetaillist( int order_num ){
		ArrayList< Porderdetail > porderdetails = new ArrayList<Porderdetail>();
		
		String sql = "select * from porderdetail where order_num="+order_num;
		try {
			ps = con.prepareStatement(sql);
			rs=ps.executeQuery();
			while( rs.next() ) {
				Porderdetail porderdetail = new Porderdetail( 
						rs.getInt(1), rs.getInt(2),
						rs.getInt(3), rs.getInt(4), rs.getInt(5));
				porderdetails.add(porderdetail);
			}
			return porderdetails;
		}catch (Exception e) {} return null;
		
	}
	
	// 날짜별 주문수 
	public JSONObject getorderdatecount(){
		JSONObject jsonObject = new JSONObject();
		String sql = "select substring_index( order_date , ' ' , 1 ) , count(*) "
				+ "from porder group by substring_index( order_date , ' ' , 1 ) order by substring_index( order_date , ' ' , 1 ) asc ";
		try {
			PreparedStatement ps4 = con.prepareStatement(sql);
			ResultSet rs4 = ps4.executeQuery(sql);
			while( rs4.next() ) { // 검색된 레코드 개수만큼 json에 추가 
				jsonObject.put( rs4.getString(1) , rs4.getString(2) );
								// 날짜		, 주문수 	=> 엔트리 저장[ 키 : 값 ]
			}
			return jsonObject;
		}catch (Exception e) {} return null;
	}
	
	// 제품별 판매량 
	public JSONObject getpcount() {
		JSONObject jsonObject = new JSONObject();
		String sql = "select p_num , sum(p_count) from porderdetail group by p_num";
		try {
			ps = con.prepareStatement(sql);
			rs=ps.executeQuery();
			while( rs.next() ) {
				String sql2 = "select p_name from product where p_num = "+rs.getInt(1);
				PreparedStatement ps2  = con.prepareStatement(sql2);
				ResultSet rs2 =ps2.executeQuery();
				if( rs2.next() ) {
					jsonObject.put( rs2.getString(1) , rs.getInt(2) );
									// sql2 결과[ 제품명]	// sql 결과[ 제품번호 , 제품총판매수 ] 
				}
			}
			return jsonObject;
		}catch (Exception e) {} return null;
	}
	// 제품별 날짜 판매량
	public JSONObject getpdatecount( int p_num) {
		JSONObject jsonObject = new JSONObject();
		String sql = "select order_num , p_count from porderdetail where p_num = "+p_num;
		try {
			ps = con.prepareStatement(sql);
			rs=ps.executeQuery();
			while( rs.next()  ) {
				sql="select substring_index( order_date , ' ' , 1 ) from porder where order_num="+rs.getInt(1);
				PreparedStatement ps2  = con.prepareStatement(sql);
				ResultSet rs2 =ps2.executeQuery();
				if( rs2.next() ) {
					jsonObject.put( rs2.getString(1) ,  rs.getInt(2) );
				}
			}
			return jsonObject;
		}
		catch (Exception e){ } return null;
	}
}































