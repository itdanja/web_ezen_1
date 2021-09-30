package Day03;

import java.util.Scanner;

public class Day03_5 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 반복으로 별 모양 찍기 
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
		
	}
	

}
