package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class MemberDao {

	public static void main(String[] args) {
		
		try {
			// 1.mysql 드라이브 확인
			Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println(" 1. 드라이브 가져오기 성공 ");
			// 2. DB 연동 
			Connection con = DriverManager.getConnection( 
						"jdbc:mysql://localhost:3307/javafx?serverTimezome=UTC" ,"root" , "1234");
				System.out.println(" 2. DB 연동 성공 ");
				
		}
		catch (Exception e) {
			System.out.println(" DB 연동 실패 ");
		}
	}

}
