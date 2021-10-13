package Day10;

public class Day10_9 {
	
	public static void main(String[] args) {
		Account account = new Account();
		account.deposit(10000);
		System.out.println("예금액 : " + account.getBalance() );
		
		try {
			account.withdraw(30000); // 해당 메소드는 예외던지기 사용
		}
		catch( 잔고부족 e ) {
			System.out.println( e.getMessage() );
				// 예외객체.getMessage : 예외 정보 
			e.printStackTrace();
				// 예외객체.printStackTrace() : 예외 추적 [ 예외 위치 ]
		}
		
		
	}
	

}
