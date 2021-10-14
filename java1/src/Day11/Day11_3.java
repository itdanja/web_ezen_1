package Day11;

public class Day11_3 {

	public static void main(String[] args) {
		
		// System 클래스 [ 모든 멤버가 static 이기때문에 객체 필요없음 ]
			// 1. exit : 프로그램 종료 
		/*
		System.setSecurityManager( new SecurityManager() {
			@Override
			public void checkExit(int status) {
				if( status !=5 ) {
					throw new SecurityException();
						// i가 0일때 status = 0  true => 예외발생 o
						// i가 1일때 status = 1  true => 예외발생 o
						// ~~~~~ 
						// i가 5일때 status = 5  false => 예외발생 x
				}
			}
		});
		
		for( int i = 0 ; i<10; i++ ) { // i는 0부터 9까지 1씩 증가 
			System.out.println(i); // 출력 
			try {
				System.exit(i);	// i를 exit() 넣기 
				// [ i가 5일때 예외가 없기때문에 exit 실행 ]
			}catch (Exception e) {}
		}
		*/
			// 2.
		// for이 1000000 회 실행 했을때 걸리는시간 
		// 1. 시작 시간 
		long time1 = System.nanoTime();
		int sum = 0 ;
		for( int i = 1 ; i<=1000000 ; i++ ) {
			sum+=i;
		}
		// 2. 끝나는 시간 
		long time2 = System.nanoTime();
		
		System.out.println("1~1000000까지의 합 : " + sum);
		System.out.println("걸린시간 : " + (time2-time1) +" 나노초 ");
		System.out.println( System.nanoTime() );
		
			// 3. 시스템 정보 읽기 [ System.getgetProperty("호출키") ]
		System.out.println("pc os :"+ System.getProperty("os.name"));
		System.out.println("pc 사용자이름 :" + System.getProperty("user.name"));
		System.out.println("pc 사용자 폴더 위치 :"+System.getProperty("user.home"));
		
		
		
		
		
		
	}
	
	
}
