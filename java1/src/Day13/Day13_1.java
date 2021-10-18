package Day13;

import java.awt.Toolkit; // Toolkit Ŭ���� �������� [ UI ���� �޼ҵ� ���� ]

public class Day13_1 {
	// 1. CPU : �޸� ����  [ �������� : �ҷ��� ��ɾ��� ]
	// 2. �޸�[�ֱ����ġ]
	public static void main(String[] args) {
		// 1. main : ���� ������ ����
			// 1. ù�ڵ���� ���������� ���� 
			// 2. return[��������] ������ ���� ���� 
		
		// 2. ��Ƽ������ [ ���� �۾� ] 
			// * �ü���� �����忡�� �ڿ� �Ҵ� (�����ٸ�) => ���������� ó��
			// 1. ������ �������� �ϳ��� ���������� ���μ��� ����������� 
			// 2. ��Ƽ������ ���� ���
				// 1. Runnable : ������ �������̽�
		
			// * �������̽� : ��üx , �߻�޼ҵ忡���� ���� �ʼ� 
	
		// p.581 [ ���� ������ : �Ҹ������ -> �������  ] 
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		// �Ҹ�
		for( int i = 0 ; i<5 ; i++ ) { // 
			toolkit.beep(); // ������ �Ҹ� �޼ҵ�
			
			// ������ ����ó��
			try {Thread.sleep(1000);}  // 1�� �Ͻ����� [ Thread.sleep( �и���[1000/1��] ) ]
			catch (InterruptedException e) {} 
		}
		
		// ���� 
		for( int i = 0 ; i<5 ; i++ ) {
			System.out.println("��");
			// ������ ����ó��
			try {Thread.sleep(1000);}  // 1�� �Ͻ����� [ Thread.sleep( �и���[1000/1��] ) ]
			catch (InterruptedException e) {} 
		}
		
		System.out.println("-----------------------------------------------");
		// p.582 [ ��Ƽ ������ : �Ҹ��� ���ڸ� ���ÿ� ��� ] 
		
		// 1. �������̽� ���� 
		Runnable runnable = new BeepTask();
		// 2. ������ Ŭ������ �������̽� ���� 
		Thread thread = new Thread(runnable);
		// 3. ������ ���� 
		thread.start();
		
		// ���� 
		for( int i = 0 ; i<5 ; i++ ) {
			System.out.println("��");
			// ������ ����ó��
			try {Thread.sleep(1000);}  // 1�� �Ͻ����� [ Thread.sleep( �и���[1000/1��] ) ]
			catch (InterruptedException e) {} 
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
