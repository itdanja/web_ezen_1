package Day04;

import java.util.Scanner;

public class Day04_5_�������� {
	
	// �迭�� �̿��� �������� ���α׷�
		// 1. �л����� �Է¹޾� �л�����ŭ �迭�Ǳ��� �Ҵ� 
		// 2. �޴� [ 1.�л��� 2.�����Է� 3.�м�[���(��������),���] 4.���� ]
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int[] �л�������� = null; // �迭������ ����ֱ� 
		
		while(true) {
			System.out.println("1.�л��� 2.�����Է� 3.�м� 4.����");
			System.out.print("���� : ");	int ch = scanner.nextInt();
			if( ch == 1 ) {
				System.out.print(" �л� �� �Է�[�迭����] : "); int size = scanner.nextInt();
				// �迭�� �޸� �Ҵ� 
				�л�������� = new int[size]; // �Է¹��� �� ��ŭ �޸� �Ҵ� 
				System.out.println(size +"��ŭ �л���� ����");
			}
			if( ch == 2 ) {
				// �л�����ŭ ���� �Է� �ޱ�  [ �迭��.length : �迭�Ǳ��� ]
				for( int i = 0 ; i<�л��������.length ; i++ ) {
					System.out.println(i +"��° �л��� ���� �Է� : ");
					�л��������[i] = scanner.nextInt();
				}
			}
			if( ch == 3 ) {
				
			}
			if( ch == 4) break;
		}
		
	}
	
	

}
