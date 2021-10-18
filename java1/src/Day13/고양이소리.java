package Day13;

public class 고양이소리 extends Thread {

	// 스레드 이름 변경
	public 고양이소리() {
		super.setName("고양이소리 스레드");
	}
	
	@Override
	public void run() {
		for( int i = 0 ; i<5 ; i++) {
			
			try {Thread.sleep(1000);} 
			catch (InterruptedException e) {}
			
			System.out.println("고양이소리" + i);
		}
	}
}
