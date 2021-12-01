package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
				System.out.println("[연동 성공]");
			}
			catch (Exception e) {
				System.out.println("[연동 실패]");
			}
		}
		public static MemberDao memberDao = new MemberDao() ; 	// 3. Dao 객체 생성
		public static MemberDao getmemberDao() { return memberDao; } // 4. Dao 객체 반환
		

}









