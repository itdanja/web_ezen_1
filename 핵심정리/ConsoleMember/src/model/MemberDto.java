package model;

public class MemberDto {
	
	private int m_num ; 
	private String m_id;
	private String m_password;
	private String m_name;
	
	public MemberDto() {} // 빈생성자 
	public MemberDto(int m_num, String m_id, String m_password, String m_name) { // 풀생성자 
		this.m_num = m_num;
		this.m_id = m_id;
		this.m_password = m_password;
		this.m_name = m_name;
	}
	public MemberDto( String m_id, String m_password, String m_name) { // 회원가입시 사용
		this.m_id = m_id;
		this.m_password = m_password;
		this.m_name = m_name;
	}
	
	public MemberDto(String m_id, String m_password) {
		super();
		this.m_id = m_id;
		this.m_password = m_password;
	}
	public int getM_num() {
		return m_num;
	}
	public void setM_num(int m_num) {
		this.m_num = m_num;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getM_password() {
		return m_password;
	}
	public void setM_password(String m_password) {
		this.m_password = m_password;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	
	
	
}
