package Day13;

public class ThreadB extends Thread {
	
	public boolean stop =false;
	public boolean work = true;
	
	@Override
	public void run() {
		while(!stop) { // stop이 true 이면 무한루프 끝 
			if(work) {
				System.out.println("ThreadB 작업 내용");
			}
			else {
				Thread.yield();
			}
		}
		System.out.println("ThreadB 종료");
	}

}
