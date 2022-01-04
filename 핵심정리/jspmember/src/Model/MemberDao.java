package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class MemberDao {
	protected Connection con;	// 1. DB 연결 [ 도로 ]
	protected PreparedStatement ps; // 2.SQL 요청응답 [ 자동차 ]
	protected ResultSet rs;		// 3. 결과 값 요청 [ 택배물 ] 
	
	// 2. 생성자 
	public MemberDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/membertest?serverTimezone=UTC" , "root","1234");	
			System.out.println("[연동 확인]");
		}
		catch (Exception e) {System.out.println("[연동 실패]");}
	}
	
	public static MemberDao memberDao = new MemberDao() ; 	// 3. Dao 객체 생성
	public static MemberDao getmemberDao() { return memberDao; } // 4. Dao 객체 반환

	public boolean signup( MemberDto memberDto) {
		
		String sql = "insert into member(m_id, m_password, m_name) values(?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, memberDto.getM_id());
			ps.setString(2, memberDto.getM_password());
			ps.setString(3, memberDto.getM_name());
			ps.executeUpdate();
			return true;
			
		} catch (Exception e) {
			System.out.println("회원가입 실패 : " + e);} return false;
	}
	
	public boolean login(String id, String password) {
		String sql="select * from member where m_id=? and m_password=?";
		
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, password);
			rs=ps.executeQuery();
			if(rs.next()) {
				return true;				
			}
		} catch (Exception e) {System.out.println("로그인 실패 오휴");} return false;
		
	}
	public boolean ldcheck(String id) {
		String sql ="select * from member where m_id=?";
		try {
			ps= con.prepareStatement(sql);
			ps.setString(1, id);
			rs= ps.executeQuery();
			if(rs.next()) {
				return true;
			}
		} catch (Exception e) {System.out.println("중복체크 오류"+e);} return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
