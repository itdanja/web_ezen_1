package Day13;

public class PrintThread1 extends Thread {
	
	private boolean stop;
	
	public void setStop( boolean stop ) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		
		try {
			while(!stop) {
				System.out.println("������!!");
				Thread.sleep(1);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("�ڿ� ����!!");
		System.out.println("���� ����!!");
	}
	

}
