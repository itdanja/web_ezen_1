package Day09;

public class Day09_5_계좌프로그램 {
	
	// 계좌 프로그램 [ 상속 , 인터페이스 ]
		// ATM [인터페이스] 
			// 추상메소드 : 계좌등록 , 예금 , 출금 , 이체 , 잔고 
		// 1. 은행[슈퍼클래스]
				// 필드(속성) : 계좌번호 , 예금액 
		// 2. 국민은행[서브클래스]
		// 3. 신한은행[서브클래스]
	
	public static Bank[] banklist = new Bank[100];
	
	public static void main(String[] args) {
		// 1. 인터페이스 생성 
		ATM atm;
		// 2. 인터페이스 클래스 연결 
		atm = new 국민은행();
		// 3. 인터페이스로 부터 클래스 조작 
		atm.계좌등록();
		atm.예금();
		atm.출금();
		atm.잔고();
		
		// 4. 인터페이스내 클래스 변경
		atm = new 신한은행();
		atm.계좌등록();
		
		// 5. 동일한 슈퍼클래스로부터 서로 다른 서브클래스를 배열로 사용 
			// 슈퍼클래스로 배열 선언 
		Bank account1 = new Bank();	
		banklist[0] = account1;
		
		국민은행 account2 = new 국민은행();
		banklist[1] = account2;
		
		신한은행 account3 = new 신한은행();
		banklist[2] = account3;
		
	}
}
