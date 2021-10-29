package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import domain.Member;

public class MemberDao {

	// JDBC �ֿ� �������̽� , Ŭ���� 
		// 1. Connection : DB���� �������̽� [ DriverManager Ŭ���� ] 
		
	// 1. �ʵ� 
		private Connection connection ; // ���� �������̽� ���� 
		// ����Ŭ������ ��ü ����� 
		private static MemberDao memberDao = new MemberDao();
	// 2. ������ 
		public MemberDao() {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection(
						"jdbc:mysql://localhost:3307/javafx?serverTimezone=UTC" , 
						"root" , "1234");
			}
			catch (Exception e) {
				System.out.println(" * DB ���� ���� : " + e);
			}
		}
	
	// 3. �޼ҵ� 
		public static MemberDao getMemberDao() { return memberDao; }
	
		// ��� �޼ҵ� 
		// 1. ȸ������ �޼ҵ�  [ �μ��� member��ü�� �޾� db�� �����ϴ� �޼ҵ� ]
	public boolean signup( Member member ) {
		// 1. SQL �ۼ� [ SQL : DB ���۾� DML ]
		String sql = "insert into member(m_id, m_password,m_name,m_email,m_point)"
						+ " values( ? , ? , ? , ? , ?)";
		try {
			// 2. SQL ---> DB ���� [ PreparedStatement �������̽� : ����� DB�� SQL ���� ]
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
			// 3. SQL ���� [ ? �� ������ �ֱ� ] : 
				preparedStatement.setString( 1 , member.getM_id() );		// ù��° ? �� ������ �ֱ� 
				preparedStatement.setString( 2 , member.getM_password() );	// �ι�° ? �� ������ �ֱ� 
				preparedStatement.setString( 3 , member.getM_name() );
				preparedStatement.setString( 4 , member.getM_email() );
				preparedStatement.setInt( 5 , member.getM_point() );
			// 4. SQL ���� 
				preparedStatement.executeUpdate();
			// 5. SQL ���
				return true; // DB ���� ������ true ��ȯ	
		}
		catch (Exception e) {}
		return false;
	}
		// 2. �α��� �޼ҵ� 
		
		// 3. ���̵�ã�� �޼ҵ� 
		
		// 4. �н�����ã�� �޼ҵ� 
		
		// 5. ȸ������ �޼ҵ� 
		
		// 6. ȸ��Ż�� �޼ҵ� 
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// DB ���� �׽�Ʈ
	/*
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
	*/

}
