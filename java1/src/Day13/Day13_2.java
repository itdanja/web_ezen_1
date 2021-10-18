package Day13;

public class Day13_2 {

	public static void main(String[] args) {
		
		// 스레드 우선순위
		//p.590
		//1 . 10개의 멀티스레드 생성 
		for( int i = 1 ; i<=10 ; i++ ) {
			
			// 2. 멀티스레드 생성 [ 이름 부여 ] 
			Thread thread = new CalcThread("스레드 " + i );
			System.out.println( i + "번째 스레드 생성 ");
			
			// 3. 우순선위 설정 
			if( i != 10 ) { // 1~9까지 낮은 우선순위 
				// 해당 스레드를 낮은 우선순위로 설정 
				thread.setPriority( Thread.MIN_PRIORITY );
			}else { // 만약에 스레드 번호가 10이면 높은 우선순위
				thread.setPriority( Thread.MAX_PRIORITY );
			}
			
			// 4.스레드 시작 
			thread.start();
		}
		
		//p.592
		// 스레드 동기화 메소드 
			// 동기화 : 여러 스레드가 동일한 메소드 접근할때 
			//        먼저 접근한 메소드부터 처리 나머지는 대기 
		
		Calculator calculator = new Calculator();
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
