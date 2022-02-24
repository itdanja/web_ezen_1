package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDao {	// 1. db 연동 클래스 
	
	private PreparedStatement ps; 	// 2. sql 조작 인터페이스 
	private Connection con;			// 3. db 연결 인터페이스 
	private ResultSet rs;			// 4. sql 결과 인터페이스 
	
	// db 클래스 생성자 
	public MemberDao(){	
		try {
			con = getConnection();				// 아래에 있는 연결 메소드의 반환타입을 con 에 저장 
					// 반환값과 예외처리 옴 
//			System.out.println("연동성공 ");  // 연동 테스트 출력
		}
		catch (Exception e) {
			System.out.println( e );
		}
	}
	
	// db 연결 메소드 
	public static Connection getConnection() throws Exception {
											// 예외처리 던지기 
		Class.forName("oracle.jdbc.OracleDriver"); // db드라이브 연결 [ 무조건 예외처리 발생 ] 
		// 특정 db 연결 
		Connection con = DriverManager.getConnection 
				("jdbc:oracle:thin:@//localhost:1521/xe" , "system","1234");
		return con; // 연결된 인터페이스 반환
	}
	
}




