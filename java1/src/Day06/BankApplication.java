package Day06;

import java.util.Scanner;

public class BankApplication {

	// 접근제한자 
		// public : 프로젝트내 모든곳에서 호출 가능
		// private : 현재 클래스 내에서만 호출 가능 
		// default[생략] : 동일한 패키지내에서만 호출 가능 
		// protected : 동일한 패키지내에서만 호출 가능 

	// 100개 계좌객체를 저장할수 있는 배열 선언 
		// main메소드 밖에 선언시 : main메소드 외 모든 메소드에서 호출 가능 
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
		// private : 현재 클래스 내에서만 호출 가능 
			// static : 정적변수 : 프로그램 전반에 걸쳐 수명 유지 
				// main메소드와 같이 프로그램 시작시 메모리 할당 
				// 모든 메소드에 사용되는 필드에 선언 
				// <----> 지역변수 : 선언된 {  } 안에서만 사용 --> {} 밖으로 나가면 초기화
	
	public static void main(String[] args) {
		
		boolean run = true;
		while(run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 ");
			System.out.println("----------------------------------------------");
			System.out.println("선택> ");
			int selectNo = scanner.nextInt();
			if( selectNo == 1 ) {}
			else if( selectNo == 2 ) {}
			else if( selectNo == 3 ) {}
			else if( selectNo == 4 ) {}
			else if( selectNo == 5 ) { run = false;}
		}
		System.out.println("프로그램 종료");
	}

}
