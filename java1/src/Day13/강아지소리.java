package Day13;

public class �������Ҹ� extends Thread {

	// ������ �̸� ����
	public �������Ҹ�() {
		super.setName("�������Ҹ� ������");
	}
	
	@Override
	public void run() {
		for( int i = 0 ; i<5 ; i++) {
			
			try {Thread.sleep(1000);} 
			catch (InterruptedException e) {}
			
			System.out.println("�������Ҹ�" + i);
		}
	}
}
