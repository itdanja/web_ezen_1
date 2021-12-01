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
		
		String sql = "insert into member(id,password,name,birth,sex,phone,address) values(?,?,?,?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, member.getM_id() );	ps.setString(2, member.getM_password() );
			ps.setString(3, member.getM_name() );	ps.setString(4, member.getM_brith() );
			ps.setString(5, member.getM_sex() );	ps.setString(6, member.getM_phone() );
			ps.setString(7, member.getM_address() );	ps.executeUpdate();
		}
		catch (Exception e) {}
		return false;
	}

}




















