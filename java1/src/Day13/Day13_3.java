package Day13;

public class Day13_3 {

	
	// ������ ���� 
		// 1. Thread.sleep( �и���[1000/1��] ) : �и��ʸ�ŭ �Ͻ������� �ٽ� ���� 
			// * ����ó�� �ʼ�
		// 2. Thread.yield() : �ٸ� �����忡�� �纸
	public static void main(String[] args) {
		
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
	}
	
}
