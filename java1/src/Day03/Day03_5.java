package Day03;

import java.util.Scanner;

public class Day03_5 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// �ݺ����� �� ��� ��� 
	/*	
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
	*/
	System.out.println("\n ----------------------------");	
		// ����3) 
		System.out.print("����3) �� �� : "); int line3 = scanner.nextInt();
			// i�� 1���� �Է¹��� �ټ�(line)���� 1�� �����ϸ鼭 ������ 
		for( int i = 1 ; i<=line3 ; i++ ) {
			// �����
			for( int s = 1 ; s<=i ; s++ ) { System.out.print("*");}
			// �ٹٲ�
			System.out.println();
		}
	System.out.println("\n ----------------------------");	
		// ����4) 	
		System.out.print("����4) �� �� : "); int line4 = scanner.nextInt();
		
		for( int i = 1 ; i<=line4 ; i++ ) {
			// ����� 
			for( int s = 1 ; s<=line4-i+1 ; s++ ) { System.out.print("*");}
			// �ٹٲ�
			System.out.println();
		}
		
	System.out.println("\n ----------------------------");	
		// ����5)
		System.out.print("����5) �� �� : "); int line5 = scanner.nextInt();
		for( int i = 1 ; i<=line5 ; i++ ) {
			// ������� 
			for( int b = 1 ; b<=line5-i ; b++ ) { System.out.print(" "); }
			// ����� 
			for( int s = 1 ; s<=i ; s++ ) { System.out.print("*");}
			// �ٹٲ�
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
