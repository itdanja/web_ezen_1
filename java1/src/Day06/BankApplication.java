package Day06;

import java.util.Scanner;

public class BankApplication {

	// ���������� 
		// public : ������Ʈ�� �������� ȣ�� ����
		// private : ���� Ŭ���� �������� ȣ�� ���� 
		// default[����] : ������ ��Ű���������� ȣ�� ���� 
		// protected : ������ ��Ű���������� ȣ�� ���� 

	// 100�� ���°�ü�� �����Ҽ� �ִ� �迭 ���� 
		// main�޼ҵ� �ۿ� ����� : main�޼ҵ� �� ��� �޼ҵ忡�� ȣ�� ���� 
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
		// private : ���� Ŭ���� �������� ȣ�� ���� 
			// static : �������� : ���α׷� ���ݿ� ���� ���� ���� 
				// main�޼ҵ�� ���� ���α׷� ���۽� �޸� �Ҵ� 
				// ��� �޼ҵ忡 ���Ǵ� �ʵ忡 ���� 
				// <----> �������� : ����� {  } �ȿ����� ��� --> {} ������ ������ �ʱ�ȭ
	
	public static void main(String[] args) {
		
		boolean run = true;
		while(run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.���� ");
			System.out.println("----------------------------------------------");
			System.out.println("����> ");
			int selectNo = scanner.nextInt();
			if( selectNo == 1 ) {}
			else if( selectNo == 2 ) {}
			else if( selectNo == 3 ) {}
			else if( selectNo == 4 ) {}
			else if( selectNo == 5 ) { run = false;}
		}
		System.out.println("���α׷� ����");
	}

}
