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
	System.out.println("\n ----------------------------");	
		// ����6)	
		System.out.print("����6) �� �� : "); int line6 = scanner.nextInt();
		for( int i =1 ; i<=line6 ; i++ ) {
			//�������
			for( int b = 1 ; b<=i-1 ; b++ ) { System.out.print(" ");}
			//�����
			for( int s = 1 ; s<=line6-i+1 ; s++ ) {System.out.print("*");}
			//�ٹٲ�
			System.out.println();
		}
	System.out.println("\n ----------------------------");
		// ����7)	
		System.out.print("����7) �� �� : "); int line7 = scanner.nextInt();
		for( int i = 1 ; i<=line7 ; i++ ) {
			//�������
			for( int b = 1 ; b<=line7-i ; b++ ) { System.out.print(" ");}
			//����� 
			for( int s = 1 ; s<=i*2-1 ; s++ ) {System.out.print("*");}
			//�ٹٲ�
			System.out.println();
		}
	System.out.println("\n ----------------------------");	
		// ����8)	
		System.out.print("����8) �� �� : "); int line8 = scanner.nextInt();
		for( int i = 1 ; i<=line8 ; i++ ) {
			//�������
			for( int b = 1 ; b<=line8-i ; b++ ) { System.out.print(" ");}
			//����� 
			for( int s = 1 ; s<=i*2-1 ; s++ ) {System.out.print(i);}
			//�ٹٲ�
			System.out.println();
		}
	System.out.println("\n ----------------------------");
		// ����9)	
		System.out.print("����9) �� �� : "); int line9 = scanner.nextInt();
		for( int i = 1 ; i<=line9 ; i++ ) {
			for( int b = 1 ; b<=i-1 ; b++ ) {System.out.print(" ");}
			for( int s = 1 ; s<=line9*2-(i*2-1); s++ ) {System.out.print("*");}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
