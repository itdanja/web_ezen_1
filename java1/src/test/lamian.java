package test;

import java.util.Iterator;

import java.util.Random;

import java.util.Scanner;

 

public class lamian {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int ������ġ = 3;
		int ������ = 1;
		boolean top = false;
		boolean under = false;
		
		while(true) {
			System.out.println("1. ����մϴ�. 2. �ϰ��մϴ�. 3. ����ϴ�.");
			int a = scanner.nextInt();
			
			for( int i = 0 ; i<4 ;i++) {
				System.out.println("���� ���������� �� : " + ������ġ);
				������ġ--;
				if( ������ġ == ������ ) {
					System.out.println("���������Ͱ� �����߽��ϴ�!!");
					break;
				}
			}
			
			if(a==1) {
				if(top) {
					System.out.println("��� �մϴ�");
				} else {
					System.out.println("���� ���� ���� ���� �� �ֽʽÿ�");
					System.out.print("����1��[0], 1��[1], 2��[2], 3��[3] �� ���� : ");
						int s =scanner.nextInt();
					
						for( int i = ������ġ ; i<4 ; i++ ) {
							
							System.out.println(" �ö󰩴ϴ� ������ : " + i );
							������ġ++;
							if(  s == ������ġ) {
								System.out.println("�����߽��ϴ�"); break;
							}
							
						}
						
					}
				
				} else if (a==2) {
					if(under) {
						System.out.println("���� ���� ���� ���� �� �ֽʽÿ�");
						System.out.print("����1��[0], 1��[1], 2��[2], 3��[3] �� ���� : ");
					
					} else {
						System.out.println("�ϰ� �մϴ�");
				}
				} else if(a==3) {
					System.out.println("���������ϴ�.");
					break;
				}
		}
	}
}
