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
		String sql = "delete from member where m_id=? and m_password=?";
		try {
			
			ps = con.prepareStatement(sql);
			ps.setString(1, id); 
			ps.setString(2, password);
			ps.executeUpdate(); 
			
			return true;
			
		}catch (Exception e) { System.out.println(e);  } return false;
		
	}
	
	

	
}




















