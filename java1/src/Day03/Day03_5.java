package Day03;

import java.util.Scanner;

public class Day03_5 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 반복으로 별 모양 찍기 
	/*	
		// 문제1) 입력받은 정수만큼 별 출력 [ i는 1부터 입력받은정수까지 1씩증가 ]
		System.out.print("문제1) 별 개수 : "); int s = scanner.nextInt();
		for( int i = 1 ; i<=s ; i++ ) { System.out.print("* "); }
		
	System.out.println("\n ----------------------------");
		// 문제2) 입력받은 정수만큼 별출력 // 5개마다(5배수) 줄바꿈
		System.out.print("문제2) 별 개수 : "); int s2 = scanner.nextInt();
		for( int i = 1 ; i<=s2 ; i++ ) {
			System.out.print("* ");
			if( i%5==0 ) System.out.println();
		}
	*/
	System.out.println("\n ----------------------------");	
		// 문제3) 
		System.out.print("문제3) 줄 수 : "); int line3 = scanner.nextInt();
			// i은 1부터 입력받은 줄수(line)까지 1씩 증가하면서 내려감 
		for( int i = 1 ; i<=line3 ; i++ ) {
			// 별찍기
			for( int s = 1 ; s<=i ; s++ ) { System.out.print("*");}
			// 줄바꿈
			System.out.println();
		}
	System.out.println("\n ----------------------------");	
		// 문제4) 	
		System.out.print("문제4) 줄 수 : "); int line4 = scanner.nextInt();
		
		for( int i = 1 ; i<=line4 ; i++ ) {
			// 별찍기 
			for( int s = 1 ; s<=line4-i+1 ; s++ ) { System.out.print("*");}
			// 줄바꿈
			System.out.println();
		}
		
	System.out.println("\n ----------------------------");	
		// 문제5)
		System.out.print("문제5) 줄 수 : "); int line5 = scanner.nextInt();
		for( int i = 1 ; i<=line5 ; i++ ) {
			// 공백찍기 
			for( int b = 1 ; b<=line5-i ; b++ ) { System.out.print(" "); }
			// 별찍기 
			for( int s = 1 ; s<=i ; s++ ) { System.out.print("*");}
			// 줄바꿈
			System.out.println();
		}
	System.out.println("\n ----------------------------");	
		// 문제6)	
		System.out.print("문제6) 줄 수 : "); int line6 = scanner.nextInt();
		for( int i =1 ; i<=line6 ; i++ ) {
			//공백찍기
			for( int b = 1 ; b<=i-1 ; b++ ) { System.out.print(" ");}
			//별찍기
			for( int s = 1 ; s<=line6-i+1 ; s++ ) {System.out.print("*");}
			//줄바꿈
			System.out.println();
		}
	System.out.println("\n ----------------------------");
		// 문제7)	
		System.out.print("문제7) 줄 수 : "); int line7 = scanner.nextInt();
		for( int i = 1 ; i<=line7 ; i++ ) {
			//공백찍기
			for( int b = 1 ; b<=line7-i ; b++ ) { System.out.print(" ");}
			//별찍기 
			for( int s = 1 ; s<=i*2-1 ; s++ ) {System.out.print("*");}
			//줄바꿈
			System.out.println();
		}
	System.out.println("\n ----------------------------");	
		// 문제8)	
		System.out.print("문제8) 줄 수 : "); int line8 = scanner.nextInt();
		for( int i = 1 ; i<=line8 ; i++ ) {
			//공백찍기
			for( int b = 1 ; b<=line8-i ; b++ ) { System.out.print(" ");}
			//별찍기 
			for( int s = 1 ; s<=i*2-1 ; s++ ) {System.out.print(i);}
			//줄바꿈
			System.out.println();
		}
	System.out.println("\n ----------------------------");
		// 문제9)	
		System.out.print("문제9) 줄 수 : "); int line9 = scanner.nextInt();
		for( int i = 1 ; i<=line9 ; i++ ) {
			for( int b = 1 ; b<=i-1 ; b++ ) {System.out.print(" ");}
			for( int s = 1 ; s<=line9*2-(i*2-1); s++ ) {System.out.print("*");}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
