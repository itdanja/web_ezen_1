package Day13;

public class Day13_3 {

	
	// 스레드 제어 
		// 1. Thread.sleep( 밀리초[1000/1초] ) : 밀리초만큼 일시정지후 다시 실행 
			// * 예외처리 필수
		// 2. Thread.yield() : 다른 스레드에게 양보
	public static void main(String[] args) {
		
		// 1. 스레드 생성 
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		// 2. 스레드 실행 [ run 메소드 호출 ] 
		threadA.start();
		threadB.start();
			// 3초간 일시정지 
		try {Thread.sleep(3000);} catch (Exception e) {}
		
		threadA.work = false; // 스레드A가 양보 [ 스레드A 실행X ] 
		
		try {Thread.sleep(3000);} catch (Exception e) {}
		
		threadA.work=true;	//  스레드A가 출력 
		
		try {Thread.sleep(3000);} catch (Exception e) {}
		
		threadA.stop = true; // 무한루프 종료 
		threadB.stop = true;
	}
	
}
