package Day03;

import java.util.Scanner;

public class Day03_2 {
	
	public static void main(String[] args) {
		
		// �Է°�ü
		Scanner �Է°�ü = new Scanner(System.in);
		
		// ����1 : 2���� ������ �Է¹޾� �� ū�� ��� 
		System.out.print("����1 ����1 : ");	int ����1 = �Է°�ü.nextInt();
		System.out.print("����1 ����2 : ");	int ����2 = �Է°�ü.nextInt();
		
		if( ����1 > ����2 ) 		System.out.println(" �� ū���� : " + ����1 ); 
		else if( ����1 < ����2 ) 	System.out.println(" �� ū���� : " + ����2 ); 
		else 					System.out.println(" �� ���� ���� ");
		
		// ����2 : 3���� ������ �Է¹޾� ���� ū�� ��� 
		System.out.print("����2 ����1 : ");	int ����3 = �Է°�ü.nextInt();
		System.out.print("����2 ����2 : ");	int ����4 = �Է°�ü.nextInt();
		System.out.print("����2 ����3 : ");	int ����5 = �Է°�ü.nextInt();
		
		if( ����3 > ����4 && ����3 > ����5 )			System.out.println(" ���� ū���� : "+����3);
		else if( ����4 > ����3 && ����4 > ����5 ) 	System.out.println(" ���� ū���� : "+����4);
		else if( ����5 > ����3 && ����5 > ����4 )	System.out.println(" ���� ū���� : "+����5);
		else 									System.out.println(" �� ������ ���� ");
		
		// ����3 : 4���� ������ �Է¹޾� ���� ū�� ��� 
		// ����4 : 4���� ������ �Է¹޾� ������������ ��� 
		// ����5 : 4���� ������ �Է¹޾� ������������ ��� 
		
	}
	
}








