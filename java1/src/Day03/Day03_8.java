package Day03;

import java.util.Scanner;

public class Day03_8 {
	
	// Ȯ�ι���7 :  ATM ���α׷�
	public static void main(String[] args) {
		
		// �����ư ������������ ���ѽ��� ���α׷� => while(true)
		boolean ���� = true; // ���ѷ��� �����ϴ� ���� 
		int ���ݾ� = 0 ; // ���ݾ�
		Scanner scanner = new Scanner(System.in); // �Է°�ü 
		
		while( ���� ) { // [ ���ຯ�� true ���ѷ��� ���� // ���ຯ���� false�̸� ���ѷ��� ���� ]
			System.out.println("          �������� ATM             ");
			System.out.println("--------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.���� ");
			System.out.println("--------------------------------");
			System.out.print("����> ");	int ���� = scanner.nextInt();
			
			if( ���� == 4 ) {  // ���࿡ 4�� �Է������� 
				����=false;	// ���ຯ���� false �����Ͽ� ���ѷ���[while] ����
				System.out.println("     [[�̿����ּż� �����մϴ�]]"); 
			}
			
		}
		
	}

}
