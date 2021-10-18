package Day13;

public class Calculator {
	// 필드 
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	public synchronized void setMemory( int memory) {
			// 동기화 : 우선 스레드가 끝날때까지 다른 스레드 대기 [ 순서대기 ]
		this.memory = memory;
		// 1. 2초간 스레드 일시정지
		try {Thread.sleep(2000);}catch (Exception e) {}
		
		System.out.println("스레드명 : " + 
				Thread.currentThread().getName()+" : "+this.memory );
	}

}
