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
					// ����Ŭ������ implements Runnable
						// Runnable runnable = new ����Ŭ������(); 
						// Thread thread = new Thread(runnable);
						// Thread.start();
				// 2. Thread : ������ Ŭ���� 
					// ����Ŭ������ extends Thread
						// Thread thread = new ����Ŭ������();
						// Thread.start();
				// 3. �͸� ���� ��ü [ ��ȸ�� ] 
		
			// * �������̽� : ��üx , �߻�޼ҵ忡���� ���� �ʼ� , ������ ����
	
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
		
		System.out.println("-----------------------------------------------");
		// p.583 [ ��Ƽ������ : �͸�ü runnable ] 
			// �͸� ��ü : �������̽��� ������ = new Ŭ������( new �������̽���(){  ����  } );
			// �͸� ��ü �� ? ��ȸ�� 
		
		Thread thread2 = new Thread( new Runnable() {
			@Override
			public void run() {
				// �Ҹ�
				for( int i = 0 ; i<5 ; i++ ) { // 
					toolkit.beep(); // ������ �Ҹ� �޼ҵ�
					// ������ ����ó��
					try {Thread.sleep(1000);} catch (InterruptedException e) {} 
				}
			}
		});
		thread2.start();
		
		// ���� 
		for( int i = 0 ; i<5 ; i++ ) {
			System.out.println("��");
			// ������ ����ó��
			try {Thread.sleep(1000);}  // 1�� �Ͻ����� [ Thread.sleep( �и���[1000/1��] ) ]
			catch (InterruptedException e) {} 
		}
		
		System.out.println("-----------------------------------------------");
		
		// p .584 [ ��Ƽ������ : Thread Ŭ���� ��� ] 
		Thread thread3 = new BeepThread();
		thread3.start(); // run �޼ҵ� ȣ�� 
		
		// ������ �̸� Ȯ�� 
		System.out.println( "������ �� : " + thread3.getName() );
		
		// ���� 
		for( int i = 0 ; i<5 ; i++ ) {
			System.out.println("��");
			// ������ ����ó��
			try {Thread.sleep(1000);}  // 1�� �Ͻ����� [ Thread.sleep( �и���[1000/1��] ) ]
			catch (InterruptedException e) {} 
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
