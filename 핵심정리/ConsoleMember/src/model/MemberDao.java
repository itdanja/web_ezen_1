package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDao {
	protected Connection con;	// 1. DB ���� [ ���� ]
	protected PreparedStatement ps; // 2.SQL ��û���� [ �ڵ��� ]
	protected ResultSet rs;		// 3. ��� �� ��û [ �ù蹰 ] 
	
	// 2. ������ 
	public MemberDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/membertest?serverTimezone=UTC" , "root","1234");	
			System.out.println("[���� Ȯ��]");
		}
		catch (Exception e) {System.out.println("[���� ����]");}
	}
	
	public static MemberDao memberDao = new MemberDao() ; 	// 3. Dao ��ü ����
	public static MemberDao getmemberDao() { return memberDao; } // 4. Dao ��ü ��ȯ
	
	public boolean signup(MemberDto memberDto) {
		//1.[��û] ȸ������ ���빰 �������ּ���~~~
		String ��û = "insert into member(m_id,m_password,m_name) values(?,?,?)";
		//2. [��û] ����
		try {
			ps = con.prepareStatement(��û);
			ps.setString( 1 , memberDto.getM_id()  );
			ps.setString( 2 , memberDto.getM_password()  );
			ps.setString( 3 , memberDto.getM_name()  );
			//3. [��û����] ó�� �߳���???
			ps.executeUpdate();
			return true;
		} catch (SQLException e) { System.out.println( e );} return false;
		
	}
	
	public boolean login(MemberDto memberdto) {
		
		String sql = "select * from member where m_id = ? and m_password = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, memberdto.getM_id());
			ps.setString(2, memberdto.getM_password());
			rs = ps.executeQuery();
			if(rs.next()) {
				return true;
			}
		} catch (Exception e) {System.out.println("�α��� ���� : " + e);} return false;
	}
	
	public boolean idcheck(String m_id) {
		String sql ="select * from member where m_id=?";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, m_id);
			rs=ps.executeQuery();
			if(rs.next()) {
				return true;
			}
			
		} catch (Exception e) {System.out.println("���̵� Ȯ�� ����");} return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
