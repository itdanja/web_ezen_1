package Day13;

public class ȣ���̼Ҹ� extends Thread {
	
	// ������ �̸� ����
	public ȣ���̼Ҹ�() {
		super.setName("ȣ���̼Ҹ� ������");
	}
	@Override
	public void run() {
		for( int i = 0 ; i<5 ; i++) {
			
			try {Thread.sleep(1000);} 
			catch (InterruptedException e) {}
			
			System.out.println("ȣ���̼Ҹ�" + i);
		}
	}
	
}
