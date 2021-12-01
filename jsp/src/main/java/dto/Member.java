package dto;

public class Member {
	private int m_num;
	private String m_id;
	private String m_password;
	private String m_name;
	private String m_brith;
	private String m_sex;
	private String m_phone;
	private String m_address;
	private int m_point;
	private String m_sdate;
	//빈생성자
	public Member() {}
	// 풀생성자
	public Member(int m_num, String m_id, String m_password, String m_name, String m_brith, String m_sex,
			String m_phone, String m_address, int m_point, String m_sdate) {
		super();
		this.m_num = m_num;
		this.m_id = m_id;
		this.m_password = m_password;
		this.m_name = m_name;
		this.m_brith = m_brith;
		this.m_sex = m_sex;
		this.m_phone = m_phone;
		this.m_address = m_address;
		this.m_point = m_point;
		this.m_sdate = m_sdate;
	}
	// 회원가입 생성자 
	public Member(String m_id, String m_password, String m_name, String m_brith, String m_sex, String m_phone,
			String m_address) {
		this.m_id = m_id;
		this.m_password = m_password;
		this.m_name = m_name;
		this.m_brith = m_brith;
		this.m_sex = m_sex;
		this.m_phone = m_phone;
		this.m_address = m_address;
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
	public String getM_brith() {
		return m_brith;
	}
	public void setM_brith(String m_brith) {
		this.m_brith = m_brith;
	}
	public String getM_sex() {
		return m_sex;
	}
	public void setM_sex(String m_sex) {
		this.m_sex = m_sex;
	}
	public String getM_phone() {
		return m_phone;
	}
	public void setM_phone(String m_phone) {
		this.m_phone = m_phone;
	}
	public String getM_address() {
		return m_address;
	}
	public void setM_address(String m_address) {
		this.m_address = m_address;
	}
	public int getM_point() {
		return m_point;
	}
	public void setM_point(int m_point) {
		this.m_point = m_point;
	}
	public String getM_sdate() {
		return m_sdate;
	}
	public void setM_sdate(String m_sdate) {
		this.m_sdate = m_sdate;
	}
	
}












