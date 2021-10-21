package view;

import java.util.Scanner;

import controller.MemberController;
import database.File;
import model.Member;

public class Application {

	// 0.설정 [ main 밖에 만드는 이유?? :  ] 
	public static Scanner scanner = new Scanner(System.in);
		// public :
		// static : 
	
	public static void main(String[] args) {
		// 0.프로그램 파일 로딩 
		File.fileload(1);
		
		// 1. 프로그램 시작 
		mainmenu(); // 메인 메뉴 메소드 호출
	}
	
	// 1. 메인 메뉴 메소드 
	public static void mainmenu( ) {
		// void : 
		while(true) { // 무한루프 
			try {
				System.out.println("\n+++++++++++++ 회원 커뮤니티 ++++++++++++++");
				System.out.println("1.로그인 2.회원가입 3.아이디찾기 4.비밀번호찾기");
				System.out.println("+++++++++++++++++++++++++++++++++++++++");
				System.out.print("\t 선택 : ");		int ch = scanner.nextInt();
				
				if( ch == 1 ) {
					System.out.println("++++++++++++ 로그인 페이지 ++++++++++++");
				}
				else if( ch == 2 ){
					System.out.println("++++++++++++ 회원가입 페이지 ++++++++++++");
					// * 입력받기 -> 변수 저장 -> 변수가 여러개 -> 객체 -> 객체 여러개 -> 배열/컬렉션 담는다
					System.out.print(" Id[4글자이상] : "); 		String id = scanner.next();
					System.out.print(" Password[4글자만] : "); 	String passowrd = scanner.next();
					System.out.print(" name[2글자이상] : "); 		String name = scanner.next();
					System.out.print(" Email[@형식] : "); 		String Email = scanner.next();
					// 4개 변수를 따로따로 저장하면 힘들어짐 => 4개 변수를 묶어줄 객체화
					Member member = new Member(id, passowrd, name, Email, 0 );
					
					// Controller 전달 [ 다른 클래스내 메소드 호출하는 방법 :  1.    2. 
					boolean result =  MemberController.signup(member);
					if(result) {
						System.out.println(" [알림] : 회원가입 성공 ");
					}else {
						System.out.println(" [알림] : 회원가입 실패 ");
					}
					System.out.println("+++++++++++++++++++++++++++++++++++++++");
				}
				else if( ch == 3 ){
					System.out.println("++++++++++++ 아이디찾기 페이지 ++++++++++++");
				}
				else if( ch == 4 ){
					System.out.println("++++++++++++ 비밀번호찾기 페이지 ++++++++++++");
				}
				else {
					System.err.println(" [알림] : 알수없는 행동 입니다 [ 관리자에게 문의 ]");
				}
			}
			catch (Exception e) {
				System.err.println(" [알림] : 메뉴 페이지 오류 [ 관리자문의 ] ");
				scanner = new Scanner(System.in); // 입력객체 초기화
						// new : 
			}
		}
	}
	// 2. 회원 메뉴 메소드
	public static void membermenu( String id ) {
								// 인수 : 
		
	}
	// 3. 게시판 메뉴 메소드 
	public static void boardmenu( String id ) {
				
	}
}
