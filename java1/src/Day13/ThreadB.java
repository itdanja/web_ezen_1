package Day13;

public class ThreadB extends Thread {
	
	public boolean stop =false;
	public boolean work = true;
	
	@Override
	public void run() {
		while(!stop) { // stop�� true �̸� ���ѷ��� �� 
			if(work) {
				System.out.println("ThreadB �۾� ����");
			}
			else {
				Thread.yield();
			}
		}
		System.out.println("ThreadB ����");
	}

}
