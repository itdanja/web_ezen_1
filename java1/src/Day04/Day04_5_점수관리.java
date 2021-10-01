package Day04;

import java.util.Scanner;

public class Day04_5_점수관리 {
	
	// 배열을 이용한 점수관리 프로그램
		// 1. 학생수를 입력받아 학생수만큼 배열의길이 할당 
		// 2. 메뉴 [ 1.학생수 2.점수입력 3.분석[등수(내림차순),평균] 4.종료 ]
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int[] 학생점수목록 = null; // 배열선언후 공백넣기 
		
		while(true) {
			System.out.println("1.학생수 2.점수입력 3.분석 4.종료");
			System.out.print("선택 : ");	int ch = scanner.nextInt();
			if( ch == 1 ) {
				System.out.print(" 학생 수 입력[배열길이] : "); int size = scanner.nextInt();
				// 배열에 메모리 할당 
				학생점수목록 = new int[size]; // 입력받은 수 만큼 메모리 할당 
				System.out.println(size +"만큼 학생목록 생성");
			}
			if( ch == 2 ) {
				// 학생수만큼 점수 입력 받기  [ 배열명.length : 배열의길이 ]
				for( int i = 0 ; i<학생점수목록.length ; i++ ) {
					System.out.println(i +"번째 학생의 점수 입력 : ");
					학생점수목록[i] = scanner.nextInt();
				}
			}
			if( ch == 3 ) {
				
			}
			if( ch == 4) break;
		}
		
	}
	
	

}
