package Day13;

public class 강아지소리 extends Thread {

	// 스레드 이름 변경
	public 강아지소리() {
		super.setName("강아지소리 스레드");
	}
	
	@Override
	public void run() {
		for( int i = 0 ; i<5 ; i++) {
			
			try {Thread.sleep(1000);} 
			catch (InterruptedException e) {}
			
			System.out.println("강아지소리" + i);
		}
	}
}
