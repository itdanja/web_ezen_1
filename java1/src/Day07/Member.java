package Day07;

public class Member { // ȸ�� Ŭ���� ���� 
	
	// 1. �ʵ� [ ���̵� , ��й�ȣ , �̸� , ����ó ��� ]
	private String m_id ;
	private String m_pw ;
	private String m_name;
	private String m_phone;
	
	// 2. ������ [ ��ü ������ �ʵ��� �ʱⰪ ]
		// 1. ȸ�����Խ� �����Ǵ� ��ü�� ������ 
	public Member(String m_id, String m_pw, String m_name, String m_phone) {
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_name = m_name;
		this.m_phone = m_phone;
	}
		// 2. �� ������ 
	public Member() {}

	// 3. �޼ҵ� [ ���� ]
		// 2. ȸ������ �޼ҵ� [ �Է¹��� ������ ��ü �����ؼ� �迭�� ���� ]
	public boolean signup() {
		// public : main�� ���� Ŭ���� ( �ܺ�Ŭ���� ) �� ȣ�� �ϱ� ����
		
		
		
		
		
		return true; // ȸ������ ����  	// ��ȯ�� : ȸ�����Լ���/���� => TRUE / FALSE
	}
		// 3. �α��� �޼ҵ� [ �Է¹��� ���̵�� ��й�ȣ�� �迭�� �����ϸ� �α��� ���� �ƴϸ� ���� ]
	public String login() {
		
		return null; // �α��� ����  // ��ȯ�� : �α��� ������ => ������ ���̵� / ���н� null
	}
		// 4. ���̵�ã�� �޼ҵ� ( �̸� , ����ó �Է¹޾� => ���̵� �˷��ֱ� ) 
	public String findid() {
		return null; 	// ��ȯ�� : ã������� => ���̵� / ���н� null
	}
		// 5. ��й�ȣã�� �޼ҵ� ( ���̵� , ����ó �Է¹޾� => ��й�ȣ �˷��ֱ� )
	public String findpw() {
		return null;	 // ��ȯ�� : ã������� => ��й�ȣ / ���н� null
	}
		// 6. ���̵� üũ(�ߺ�üũ) �޼ҵ�
	public boolean idcheck( String check_id ) {
		return true; // �μ��� ������ ���̵� �迭�� �����ϸ� true 
	}
	
		// 1. �ʵ带 private => get, set �޼ҵ� ��� 
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getM_pw() {
		return m_pw;
	}
	public void setM_pw(String m_pw) {
		this.m_pw = m_pw;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_phone() {
		return m_phone;
	}
	public void setM_phone(String m_phone) {
		this.m_phone = m_phone;
	}
}
