package dto;

public class Login {
	
	private int m_num;
	private String m_id;
	
	public Login(int m_num, String m_id) {
		this.m_num = m_num;
		this.m_id = m_id;
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
}
