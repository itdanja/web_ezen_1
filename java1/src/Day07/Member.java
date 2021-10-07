package Day07;

import java.util.Scanner;

public class Member { // 회원 클래스 설계 
	
	// 1. 필드 [ 아이디 , 비밀번호 , 이름 , 연락처 등등 ]
	private String m_id ;
	private String m_pw ;
	private String m_name;
	private String m_phone;
	
	// 2. 생성자 [ 객체 생성시 필드의 초기값 ]
		// 1. 회원가입시 생성되는 객체의 생성자 
	public Member(String m_id, String m_pw, String m_name, String m_phone) {
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_name = m_name;
		this.m_phone = m_phone;
	}
		// 2. 빈 생성자 
	public Member() {}

	// 3. 메소드 [ 동작 ]
		// 2. 회원가입 메소드 [ 입력받은 정보로 객체 생성해서 배열에 저장 ]
	public static boolean signup() {
		// public : main이 속한 클래스 ( 외부클래스 ) 로 호출 하기 위해
		// 1. 입력받기 
		System.out.println("------------------회원가입 페이지 ----------------");
		System.out.println(" 아이디 : ");		String m_id = BookApplication.scanner.next();
			// 아이디 중복체크 
			boolean check = idcheck(m_id);
			if( check ) {
				System.out.println(" [[ 알림 ]] : 사용할수 없는 아이디 입니다 ");
				return false; // 회원가입 실패  
			}
		System.out.println(" 비밀번호 : ");	String m_pw = BookApplication.scanner.next();
		System.out.println(" 성명 : ");		String m_name = BookApplication.scanner.next();
		System.out.println(" 연락처 : ");		String m_phone = BookApplication.scanner.next();
		
		// 2. 입력받은 정보로 객체 생성 [ 생성자 ] 
		Member member = new Member(m_id, m_pw, m_name, m_phone);
		
		// 3. 만든 객체를 배열에 넣기 [ 빈공간을 찾아서 넣기 ]
		for( int i = 0 ; i < BookApplication.members.length ; i ++ ) {
			if( BookApplication.members[i] == null ) {
				BookApplication.members[i] = member;
				return true;  // 회원가입 성공  	// 반환값 : 회원가입성공/실패 => TRUE / FALSE
			}
		}
		return false; // 회원가입 실패  [ 빈공간이 없을경우 ]
	}
	// 6. 아이디 체크(중복체크) 메소드
	public static boolean idcheck( String check_id ) {
		for( int i = 0 ; i<BookApplication.members.length; i++ ) {
			if( BookApplication.members[i] != null && 
					BookApplication.members[i].getM_id().equals(check_id) ) {
				return true; // 인수와 동일한 아이디가 배열내 존재하면 true 
			}
		}
		return false; // 배열내 동일한 값이 없을경우 
	}

	
	
		// 3. 로그인 메소드 [ 입력받은 아이디와 비밀번호가 배열내 존재하면 로그인 성공 아니면 실패 ]
	public static String login() {
		// 1. 아이디 , 비밀번호 입력받기
		System.out.println("------------------로그인 페이지 ----------------");
		System.out.println(" 아이디 : "); String m_id = BookApplication.scanner.next();
		System.out.println(" 비밀번호 : "); String m_pw = BookApplication.scanner.next();
		// 2. 배열내 존재하면 로그인 성공 
		for( int i = 0 ; i<BookApplication.members.length ; i++ ) {
			if(BookApplication.members[i] != null && 
					BookApplication.members[i].getM_id().equals(m_id) && 
					BookApplication.members[i].getM_pw().equals(m_pw) ) {
				return m_id; // 로그인 성공시 성공한 아이디 반환
			}
		}
		return null; // 로그인 실패  // 반환값 : 로그인 성공시 => 성공한 아이디 / 실패시 null
	}
		// 4. 아이디찾기 메소드 ( 이름 , 연락처 입력받아 => 아이디 알려주기 ) 
	public static String findid() {
		// 1. 입력받기 
		System.out.println("------------------아이디찾기 페이지 ----------------");
		System.out.println(" 성명 : "); String m_name = BookApplication.scanner.next();
		System.out.println(" 연락처 : "); String m_phone = BookApplication.scanner.next();
		// 2. 배열내 동일한 정보의 객체 찾기 
		for( int i = 0 ; i<BookApplication.members.length ; i++ ) {
			if(BookApplication.members[i] != null && 
					BookApplication.members[i].getM_name().equals(m_name) && 
					BookApplication.members[i].getM_phone().equals(m_phone) ){
				return BookApplication.members[i].getM_id(); // 아이디 찾기 성공 
			}
		}
		return null; 	// 반환값 : 찾았을경우 => 아이디 / 실패시 null
	}
		// 5. 비밀번호찾기 메소드 ( 아이디 , 연락처 입력받아 => 비밀번호 알려주기 )
	public static String findpw() {
		// 1. 입력받기 
		System.out.println("------------------아이디찾기 페이지 ----------------");
		System.out.println(" 아이디 : "); String m_id = BookApplication.scanner.next();
		System.out.println(" 연락처 : "); String m_phone = BookApplication.scanner.next();
		// 2. 배열내 동일한 정보의 객체 찾기 
		for( int i = 0 ; i<BookApplication.members.length ; i++ ) {
			if(BookApplication.members[i] != null && 
					BookApplication.members[i].getM_id().equals(m_id) && 
					BookApplication.members[i].getM_phone().equals(m_phone) ){
				return BookApplication.members[i].getM_pw(); // 아이디 찾기 성공 
			}
		}
		return null;	 // 반환값 : 찾았을경우 => 비밀번호 / 실패시 null
	}

		// 1. 필드를 private => get, set 메소드 사용 
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
