package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class MemberDao {

	public static void main(String[] args) {
		
		try {
			// 1.mysql ����̺� Ȯ��
			Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println(" 1. ����̺� �������� ���� ");
			// 2. DB ���� 
			Connection con = DriverManager.getConnection( 
						"jdbc:mysql://localhost:3307/javafx?serverTimezome=UTC" ,"root" , "1234");
				System.out.println(" 2. DB ���� ���� ");
				
		}
		catch (Exception e) {
			System.out.println(" DB ���� ���� ");
		}
	}

}
