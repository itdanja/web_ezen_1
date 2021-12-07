package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dto.Member;

public class MemberDao {
	// 1. 빌드 -> 라이브러리 추가
	// 2. 프로젝트내 WEB-INF -> lib -> 라이브러리 추가
		//1. 자주 사용하는 인터페이스 
		private Connection con;
		private ResultSet rs;
		private PreparedStatement ps;
		
		// 2. 생성자 
		public MemberDao() {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3307/jsp?serverTimezone=UTC" , "root","1234");
			
			}
			catch (Exception e) {System.out.println("[연동 실패]");}
		}
		public static MemberDao memberDao = new MemberDao() ; 	// 3. Dao 객체 생성
		public static MemberDao getmemberDao() { return memberDao; } // 4. Dao 객체 반환
		
	//1. 회원가입 메소드 
	public boolean membersignup( Member member) {
		
		String sql = "insert into member(m_id,m_password,m_name,m_birth,m_sex,m_phone,m_address) values(?,?,?,?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, member.getM_id() );	ps.setString(2, member.getM_password() );
			ps.setString(3, member.getM_name() );	ps.setString(4, member.getM_brith() );
			ps.setString(5, member.getM_sex() );	ps.setString(6, member.getM_phone() );
			ps.setString(7, member.getM_address() );	ps.executeUpdate();
			return true;
		}
		catch (Exception e) {System.out.println(e);}
		return false;
	}
	// 아이디 체크 메소드 
	public boolean idcheck(String userid) {
		
		String sql = "select m_id from member where m_id = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, userid );
			rs = ps.executeQuery();
			if( rs.next() ) { return true; }	// 아이디 존재함
		}catch (Exception e) {} 
		return false; // 아이디 존재하지 않음
	}
	
	// 로그인 체크 메소드 
	public boolean login(String id , String password) {
		String sql = "select * from member where m_id =? and m_password = ? ";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, id); 		ps.setString(2, password);
			rs = ps.executeQuery(); 	if( rs.next() ) { return true; }
		}catch (Exception e) {}  return false;
	}
	
	// 회원 탈퇴 메소드 
	public boolean delete( String id , String password ) {
		
		String sql1 = "select * from member where m_id =? and m_password=?";	// 회원검사
		String sql2 = "delete from member where m_id=? and m_password=?";		// 회원삭제
		try {
				ps = con.prepareStatement(sql1);	
				ps.setString(1, id); 
				ps.setString(2, password);
				rs = ps.executeQuery();
				
				if( rs.next() ) { // 아이디와 비밀번호가 동일한경우에 결과가 있는경우에만 회원삭제 
					PreparedStatement ps2 = con.prepareStatement(sql2);
					ps2.setString(1, id); 
					ps2.setString(2, password);
					ps2.executeUpdate(); return true;
				}
		}catch (Exception e) { System.out.println(e);  } return false;
	}
	// 회원 정보 출력 메소드
	public Member getmember( String id ) {
		
		String sql = "select * from member where m_id =? ";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			if( rs.next() ) {
				// 동일한 아이디의 레코드를 비밀번호를 제외한 객체화
				Member member = new Member(
							rs.getInt(1) ,
							rs.getString(2) ,
							null ,
							rs.getString(4) ,
							rs.getString(5) ,
							rs.getString(6) ,
							rs.getString(7) ,
							rs.getString(8) ,
							rs.getInt(9) ,
							rs.getString(10) 
						);
				return member;
			}
		}catch (Exception e) {} return null;
		
	}
	// 회원수정
	public boolean update( String type , String newdata , String id ) {
		String sql = "update member set "+type+" = ? where m_id = ?";
		try {
			ps =con.prepareStatement(sql);
			ps.setString(1, newdata);	ps.setString(2, id);
			ps.executeUpdate(); return true;
		}catch (Exception e) {} return false;
	}
	
	// 회원번호 검색 메소드 
	public int getmembernum( String id) {
		
		String sql ="select m_num from member where m_id=?";
		try {
			ps =con.prepareStatement(sql); ps.setString(1, id);
			rs = ps.executeQuery(); 
			if( rs.next() ) { return rs.getInt(1); }
		}catch (Exception e) {} return 0;
		
	}
	
	// 회원아이디 검색 메소드 
	public String getmemberid( int m_num) {
		
		String sql ="select m_id from member where m_num=?";
		try {
			ps =con.prepareStatement(sql); ps.setInt(1, m_num);
			rs = ps.executeQuery(); 
			if( rs.next() ) { return rs.getString(1); }
		}catch (Exception e) {} return null;
		
	}
	
	

	
}




















