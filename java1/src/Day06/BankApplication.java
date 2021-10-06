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
			if( selectNo == 1 ) { createAccount();} 
			else if( selectNo == 2 ) {}
			else if( selectNo == 3 ) {}
			else if( selectNo == 4 ) {}
			else if( selectNo == 5 ) { run = false;}
		}
		System.out.println("프로그램 종료");
	}
	//메소드 선언 
	//접근제한자 키워드 반환타입 메소드명( 매개변수 , 매겨변수2 ~~ ) {  실행코드; return; }

	// 계좌생성하기 [ 인수x 반환x ]
		// static 사용이유 : main에서 호출하기 위해 [ 미사용시 : main 해당 메소드 사용불가 ]
	private static void createAccount() {
		System.out.println("--------------");
		System.out.println("계좌생성");
		System.out.println("--------------");
		// 1. 입력받기 => 변수에 저장 
		System.out.print(">> 계좌번호 : ");	String ano = scanner.next();	
		System.out.print(">> 계좌주 : ");	String owner = scanner.next();
		System.out.print(">> 초기입금액 : ");int balance = scanner.nextInt();
		
		// 2. 객체 생성 [ 입력받은 변수값을 객체 생성자에 넣어서 객체 만들기 ] 
		Account account = new Account(ano, owner, balance);
		
		// 3. 배열저장 [ 배열내 빈공간[null] 을 찾아서 빈공간 인덱스에 객체 저장 ] 
		for( int i = 0 ; i<accountArray.length ; i++ ) {
			if( accountArray[i] == null ) { // i번째 인덱스가 비어 있으면 
				accountArray[i] = account; // i번째 인덱스의 객체 넣기 
				System.out.println("결과 : 계좌가 생성되었습니다. ");
				break; // 계좌생성시 반복문 종료 
			}
		}
	}	
	// 계좌목록보기 [ 인수x 반환x ] 
	private static void accountList() {
		
	}
	// 예금하기  [ 인수x 반환x ] 
	private static void deposit() { 
		
	}
	// 출금하기 [ 인수x 반환x ] 
	private static void withdraw() {
		
	}
	
	// Account 배열에서 ano와 동일한 Account객체찾기 메소드 [ 인수o( String ano ) 반환o ( Account 객체 ) ] 
	private static Account findAccount( String ano ) {
		
	}
	
	
	
	

}
