package Day13;

public class Day13_3 {

	
	// ������ ���� 
		// 1. Thread.sleep( �и���[1000/1��] ) : �и��ʸ�ŭ �Ͻ������� �ٽ� ���� 
			// * ����ó�� �ʼ�
		// 2. Thread.yield() : �ٸ� �����忡�� �纸
		// 3. .join() : �ٸ� �������� ���Ḧ ��ٸ�
		// 4. stop() : ������ ���� 
	public static void main(String[] args) {
		/*
		// 1. ������ ���� 
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		// 2. ������ ���� [ run �޼ҵ� ȣ�� ] 
		threadA.start();
		threadB.start();
			// 3�ʰ� �Ͻ����� 
		try {Thread.sleep(3000);} catch (Exception e) {}
		
		threadA.work = false; // ������A�� �纸 [ ������A ����X ] 
		
		try {Thread.sleep(3000);} catch (Exception e) {}
		
		threadA.work=true;	//  ������A�� ��� 
		
		try {Thread.sleep(3000);} catch (Exception e) {}
		
		threadA.stop = true; // ���ѷ��� ���� 
		threadB.stop = true;
		*/
		
		// p.607
		SumThead sumThead = new SumThead();
		sumThead.start();
		
		// main �����尡 sum�����尡 ���������� ��ٸ�
		try { sumThead.join(); }catch (Exception e) {}
		
		System.out.println( "1~100�� �� : " + sumThead.getSum() );
		
		// p.613
		PrintThread1 printThread1 = new PrintThread1();
		printThread1.start();
		
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		
		printThread1.setStop(true); // while���� true �־ ���ѷ��� ���� 
		printThread1.interrupt(); // ���ܸ� �߻����Ѽ� �ݺ��� Ż�� 
		printThread1.stop(); // ������ �������� => �������� ���� 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
