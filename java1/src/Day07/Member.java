package Day07;

import java.util.Scanner;

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
	public static boolean signup() {
		// public : main�� ���� Ŭ���� ( �ܺ�Ŭ���� ) �� ȣ�� �ϱ� ����
		// 1. �Է¹ޱ� 
		System.out.println("------------------ȸ������ ������ ----------------");
		System.out.println(" ���̵� : ");		String m_id = BookApplication.scanner.next();
			// ���̵� �ߺ�üũ 
			boolean check = idcheck(m_id);
			if( check ) {
				System.out.println(" [[ �˸� ]] : ����Ҽ� ���� ���̵� �Դϴ� ");
				return false; // ȸ������ ����  
			}
		System.out.println(" ��й�ȣ : ");	String m_pw = BookApplication.scanner.next();
		System.out.println(" ���� : ");		String m_name = BookApplication.scanner.next();
		System.out.println(" ����ó : ");		String m_phone = BookApplication.scanner.next();
		
		// 2. �Է¹��� ������ ��ü ���� [ ������ ] 
		Member member = new Member(m_id, m_pw, m_name, m_phone);
		
		// 3. ���� ��ü�� �迭�� �ֱ� [ ������� ã�Ƽ� �ֱ� ]
		for( int i = 0 ; i < BookApplication.members.length ; i ++ ) {
			if( BookApplication.members[i] == null ) {
				BookApplication.members[i] = member;
				return true;  // ȸ������ ����  	// ��ȯ�� : ȸ�����Լ���/���� => TRUE / FALSE
			}
		}
		return false; // ȸ������ ����  [ ������� ������� ]
	}
	// 6. ���̵� üũ(�ߺ�üũ) �޼ҵ�
	public static boolean idcheck( String check_id ) {
		for( int i = 0 ; i<BookApplication.members.length; i++ ) {
			if( BookApplication.members[i] != null && 
					BookApplication.members[i].getM_id().equals(check_id) ) {
				return true; // �μ��� ������ ���̵� �迭�� �����ϸ� true 
			}
		}
		return false; // �迭�� ������ ���� ������� 
	}

	
	
		// 3. �α��� �޼ҵ� [ �Է¹��� ���̵�� ��й�ȣ�� �迭�� �����ϸ� �α��� ���� �ƴϸ� ���� ]
	public static String login() {
		// 1. ���̵� , ��й�ȣ �Է¹ޱ�
		System.out.println("------------------�α��� ������ ----------------");
		System.out.println(" ���̵� : "); String m_id = BookApplication.scanner.next();
		System.out.println(" ��й�ȣ : "); String m_pw = BookApplication.scanner.next();
		// 2. �迭�� �����ϸ� �α��� ���� 
		for( int i = 0 ; i<BookApplication.members.length ; i++ ) {
			if(BookApplication.members[i] != null && 
					BookApplication.members[i].getM_id().equals(m_id) && 
					BookApplication.members[i].getM_pw().equals(m_pw) ) {
				return m_id; // �α��� ������ ������ ���̵� ��ȯ
			}
		}
		return null; // �α��� ����  // ��ȯ�� : �α��� ������ => ������ ���̵� / ���н� null
	}
		// 4. ���̵�ã�� �޼ҵ� ( �̸� , ����ó �Է¹޾� => ���̵� �˷��ֱ� ) 
	public static String findid() {
		// 1. �Է¹ޱ� 
		System.out.println("------------------���̵�ã�� ������ ----------------");
		System.out.println(" ���� : "); String m_name = BookApplication.scanner.next();
		System.out.println(" ����ó : "); String m_phone = BookApplication.scanner.next();
		// 2. �迭�� ������ ������ ��ü ã�� 
		for( int i = 0 ; i<BookApplication.members.length ; i++ ) {
			if(BookApplication.members[i] != null && 
					BookApplication.members[i].getM_name().equals(m_name) && 
					BookApplication.members[i].getM_phone().equals(m_phone) ){
				return BookApplication.members[i].getM_id(); // ���̵� ã�� ���� 
			}
		}
		return null; 	// ��ȯ�� : ã������� => ���̵� / ���н� null
	}
		// 5. ��й�ȣã�� �޼ҵ� ( ���̵� , ����ó �Է¹޾� => ��й�ȣ �˷��ֱ� )
	public static String findpw() {
		// 1. �Է¹ޱ� 
		System.out.println("------------------���̵�ã�� ������ ----------------");
		System.out.println(" ���̵� : "); String m_id = BookApplication.scanner.next();
		System.out.println(" ����ó : "); String m_phone = BookApplication.scanner.next();
		// 2. �迭�� ������ ������ ��ü ã�� 
		for( int i = 0 ; i<BookApplication.members.length ; i++ ) {
			if(BookApplication.members[i] != null && 
					BookApplication.members[i].getM_id().equals(m_id) && 
					BookApplication.members[i].getM_phone().equals(m_phone) ){
				return BookApplication.members[i].getM_pw(); // ���̵� ã�� ���� 
			}
		}
		return null;	 // ��ȯ�� : ã������� => ��й�ȣ / ���н� null
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
