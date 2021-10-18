package Day13;

public class 호랑이소리 extends Thread {
	
	// 스레드 이름 변경
	public 호랑이소리() {
		super.setName("호랑이소리 스레드");
	}
	@Override
	public void run() {
		for( int i = 0 ; i<5 ; i++) {
			
			try {Thread.sleep(1000);} 
			catch (InterruptedException e) {}
			
			System.out.println("호랑이소리" + i);
		}
	}
	
}
