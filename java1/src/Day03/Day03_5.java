package Day03;

import java.util.Scanner;

public class Day03_5 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// �ݺ����� �� ��� ��� 
		// ����1) �Է¹��� ������ŭ �� ��� [ i�� 1���� �Է¹����������� 1������ ]
		System.out.print("����1) �� ���� : "); int s = scanner.nextInt();
		for( int i = 1 ; i<=s ; i++ ) { System.out.print("* "); }
		
	System.out.println("\n ----------------------------");
	
		// ����2) �Է¹��� ������ŭ ����� // 5������(5���) �ٹٲ�
		System.out.print("����2) �� ���� : "); int s2 = scanner.nextInt();
		for( int i = 1 ; i<=s2 ; i++ ) {
			System.out.print("* ");
			if( i%5==0 ) System.out.println();
		}
		
	}
	

}
