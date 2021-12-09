package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductDao extends DB {
	public ProductDao() {
		super();
	}
	public static ProductDao productDao = new ProductDao() ; 	
	public static ProductDao getProductDao() { return productDao; }
	
	// 1. 제품 등록 메소드 
	public boolean productwrite(Product product) {
		
		String sql ="insert into product( p_name , p_price , p_category , p_manufacturer , p_active , p_size , p_stock , p_img , p_contents ) values(?,?,?,?,?,?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, product.getP_name() );ps.setInt(2, product.getP_price() );ps.setString(3, product.getP_category() );
			ps.setString(4, product.getP_manufacturer() );ps.setInt(5, product.getP_active() );ps.setString(6, product.getP_size() );
			ps.setInt(7, product.getP_stock() );ps.setString(8, product.getP_img() );ps.setString(9, product.getP_contents() );
			ps.executeUpdate(); return true;
		}catch (Exception e) { System.out.println(e);}	return false;
	}
	
	// 2. 제품 모든 출력 메소드 
	public ArrayList<Product> getproductlist( String key , String keyword ){
		ArrayList<Product> products = new ArrayList<Product>();
		String sql = null;
		if( key != null && keyword !=null ) {
			 sql ="select * from product where "+key+" = '"+keyword+"'";
		}else {
			 sql ="select * from product";
		}
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while( rs.next()) {
				Product product = new Product(
						rs.getInt(1), 
						rs.getString(2), 
						rs.getInt(3), 
						rs.getString(4), 
						rs.getString(5), 
						rs.getInt(6), 
						rs.getString(7), 
						rs.getInt(8), 
						rs.getString(9), 
						rs.getString(10), 
						rs.getString(11) );
				products.add(product);
			}
			return products;
		}catch (Exception e) { System.out.println(e);}return null;
	}
	// 3. 제품 조건[ 검색 / 카데고리 ] 출력 메소드 
	
	// 4. 제품 수정 메소드 
	
	// 4. 제품 상태 메소드
	public boolean activeupdate( int p_num ) {
		try {
			String sql ="select p_active from product where p_num = "+p_num;// 1. 해당 제품번호의 제품상태 검색
			ps = con.prepareStatement(sql); rs = ps.executeQuery();
			if( rs.next() ) {
				int p_active = rs.getInt(1)+1;				// 2. 검색된 제품상태 + 1 [ 다음 상태 ]
				if( p_active == 4 ) { p_active = 1; }		// * 만약에 제품상태가 4이면 1로 변경
				sql = "update product set p_active = "+p_active +" where p_num ="+p_num;
				ps = con.prepareStatement(sql); ps.executeUpdate(); return true;
		}
		}catch (Exception e) {} return false;
		
	}
	
	// 5. 제품 삭제 메소드 
	public boolean productdelete( int p_num) {
		String sql = "delete from product where p_num = "+p_num;
		try {
			ps = con.prepareStatement(sql);
			ps.executeUpdate(); return true;
		}catch (Exception e) {} return false;
		
	}
}













