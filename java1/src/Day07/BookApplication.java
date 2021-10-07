package Day07;

import java.util.Scanner;

public class BookApplication { // 실행 클래스 
	
	// 0. 배열 
	public static Member[] members = new Member[100];
	public static Book[] books = new Book[100];
	// 0. 입력객체
	public static Scanner scanner = new Scanner(System.in);
	
	// mian 메소드=> 코드실행 시작지점 
	public static void main(String[] args) {
		main_menu(); // 메소드 호출 
	}
	
	// 1. 메인메뉴 메소드 
	public static void main_menu() {
		while(true) {
			System.out.println("\n\n ------------------ 로그인 페이지 -------------");
			System.out.println(" 1.로그인 | 2.회원가입 | 3.아이디찾기 | 4.비밀번호찾기 ");
			System.out.print(" >>> 선택 : ");	int ch = scanner.nextInt();
			if( ch == 1 ) {
				// 로그인 메소드 호출
			}
			if( ch == 2 ) {
				// 회원가입 메소드 호출 
					// 1. 다른클래스 메소드 호출 방법 
						// 1. 객체생성후 객체로 부터 멤버 접근 
						// 2. 해당 메소드 static
				Member.signup();
			}
			if( ch == 3 ) {
				// 아이디찾기 메소드 호출 
			}
			if( ch == 4 ) {
				// 비밀번호찾기 메소드 호출 
			}
		}
	}
	// 2. 로그인시 메뉴 메소드  
	public static void login_menu() {
		
	}
	// 3. 관리자 메뉴 메소드 
	public static void admin_menu() {
		
	}
	
	
	
	
	
	
	
	
	
}
