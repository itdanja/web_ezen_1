package Day03;

import java.util.Scanner;

public class Day03_2 {
	
	public static void main(String[] args) {
		
		// 입력객체
		Scanner 입력객체 = new Scanner(System.in);
		
		// 문제1 : 2개의 정수를 입력받아 더 큰수 출력 
		System.out.print("문제1 정수1 : ");	int 정수1 = 입력객체.nextInt();
		System.out.print("문제1 정수2 : ");	int 정수2 = 입력객체.nextInt();
		
		if( 정수1 > 정수2 ) 		System.out.println(" 더 큰수는 : " + 정수1 ); 
		else if( 정수1 < 정수2 ) 	System.out.println(" 더 큰수는 : " + 정수2 ); 
		else 					System.out.println(" 두 수는 같다 ");
		
		// 문제2 : 3개의 정수를 입력받아 가장 큰수 출력 
		System.out.print("문제2 정수1 : ");	int 정수3 = 입력객체.nextInt();
		System.out.print("문제2 정수2 : ");	int 정수4 = 입력객체.nextInt();
		System.out.print("문제2 정수3 : ");	int 정수5 = 입력객체.nextInt();
		
		if( 정수3 > 정수4 && 정수3 > 정수5 )			System.out.println(" 가장 큰수는 : "+정수3);
		else if( 정수4 > 정수3 && 정수4 > 정수5 ) 	System.out.println(" 가장 큰수는 : "+정수4);
		else if( 정수5 > 정수3 && 정수5 > 정수4 )	System.out.println(" 가장 큰수는 : "+정수5);
		else 									System.out.println(" 세 정수는 같다 ");
		
		// 문제3 : 4개의 정수를 입력받아 가장 큰수 출력 
		// 문제4 : 4개의 정수를 입력받아 오름차순으로 출력 
		// 문제5 : 4개의 정수를 입력받아 내림차순으로 출력 
		
	}
	
}








