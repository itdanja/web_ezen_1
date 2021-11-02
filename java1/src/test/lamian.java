package test;

import java.util.Iterator;

import java.util.Random;

import java.util.Scanner;

 

public class lamian {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int 현재위치 = 3;
		int 현재층 = 1;
		boolean top = false;
		boolean under = false;
		
		while(true) {
			System.out.println("1. 상승합니다. 2. 하강합니다. 3. 멈춥니다.");
			int a = scanner.nextInt();
			
			for( int i = 0 ; i<4 ;i++) {
				System.out.println("현재 엘레베이터 층 : " + 현재위치);
				현재위치--;
				if( 현재위치 == 현재층 ) {
					System.out.println("엘레베이터가 도착했습니다!!");
					break;
				}
			}
			
			if(a==1) {
				if(top) {
					System.out.println("상승 합니다");
				} else {
					System.out.println("가고 싶은 층을 선택 해 주십시오");
					System.out.print("지하1층[0], 1층[1], 2층[2], 3층[3] 중 선택 : ");
						int s =scanner.nextInt();
					
						for( int i = 현재위치 ; i<4 ; i++ ) {
							
							System.out.println(" 올라갑니다 현재층 : " + i );
							현재위치++;
							if(  s == 현재위치) {
								System.out.println("도착했습니다"); break;
							}
							
						}
						
					}
				
				} else if (a==2) {
					if(under) {
						System.out.println("가고 싶은 층을 선택 해 주십시오");
						System.out.print("지하1층[0], 1층[1], 2층[2], 3층[3] 중 선택 : ");
					
					} else {
						System.out.println("하강 합니다");
				}
				} else if(a==3) {
					System.out.println("멈춰졌습니다.");
					break;
				}
		}
	}
}
