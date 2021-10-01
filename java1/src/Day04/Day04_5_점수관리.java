package Day04;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Day04_5_점수관리 {
	
	// 배열을 이용한 점수관리 프로그램
		// 1. 학생수를 입력받아 학생수만큼 배열의길이 할당 
		// 2. 메뉴 [ 1.학생수 2.점수입력 3.분석[등수(내림차순),평균] 4.종료 ]
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		Integer[] 학생점수목록 = null; // 배열선언후 공백넣기 
		
		while(true) {
			System.out.println("1.학생수 2.점수입력 3.분석 4.종료");
			System.out.print("선택 : ");	int ch = scanner.nextInt();
			if( ch == 1 ) {
				System.out.print(" 학생 수 입력[배열길이] : "); int size = scanner.nextInt();
				// 배열에 메모리 할당 
				학생점수목록 = new Integer[size]; // 입력받은 수 만큼 메모리 할당 
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
				// 1. 내림차순 
//				for(int i = 0 ; i<학생점수목록.length ; i++ ) {
//					for( int j = i+1 ; j<학생점수목록.length ; j++ ) {
//						if( 학생점수목록[i] < 학생점수목록[j] ) {
//							// 스왑 [ 교체 ] 
//							int temp = 학생점수목록[j];
//							학생점수목록[j] = 학생점수목록[i];
//							학생점수목록[i] = temp;
//						}
//					}
//				}
				// 정렬 순서도 
				// i = 0 		j = 1 		j = 1 2 3 
				// i = 1 		j = 2 		j = 2 3 
				// i = 2		j = 3		j = 3 
				// i = 3		j = 4		실행x
				
				// 2. 클래스 이용한 정렬  [ 배열 관련 클래스 = Arrays ] 
				Arrays.sort( 학생점수목록 ); // 오름차순 / 오름차순 반대는 내림차순 
				Arrays.sort( 학생점수목록, Collections.reverseOrder() );
						// Collections.reverseOrder() : 순서 뒤집기 [ 기본 자료형은 불가 // 객체만 가능 ]
				
				// 2. 출력 
				int sum = 0 ;
				for( int i = 0 ; i<학생점수목록.length ; i++ ) {
					System.out.println( (i+1) + "등 점수 : " + 학생점수목록[i]);
					sum += 학생점수목록[i];
				}
				System.out.println(" 모든 학생들의 점수 평균 : " +  sum / 학생점수목록.length );
				
			}
			if( ch == 4) break;
		}
		
	}
	
	

}
