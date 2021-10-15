package Day12;

import java.util.Random;
import java.util.Scanner;

public class Day12_4_차량번호분배 {
	// 문제 : 차량번호 랜덤으로 0000~9999 사이의 난수 10개 생성 
	// 1. 모든 차량을 배열에 저장 
	// * 끝자리 번호로 홀수/짝수
	// 2. 차량 끝자리 번호가 홀수 배열 생성
	// 3. 차량 끝자리 번호가 짝수 배열 생성 
	// [출력] 3개의 배열 모두 출력 
		// 난수 => 정수 0~9999 사이의 랜덤 생성
		// 정수 -> 4자릿수 문자열 변환
	
	public static void main(String[] args) {
		
		//0.설정 [ 초기값 1번 실행할 변수 ] 
		Scanner scanner = new Scanner(System.in); // 입력객체
		String[] carnumbers = new String[10]; // String 10개 저장할수 있는 배열 
		String[] carnumbers_odd = new String[10]; // 홀수차량들
		String[] carnumbers_even = new String[10]; // 짝수차량들 
		
		Random random = new Random(); // 난수 객체 
		
		while(true) {
			System.out.print("1.차량 출입 : ");
			int ch = scanner.nextInt();
			if( ch== 1 ) {
				
				//////////////////////// 차량 번호 저장 /////////////////////////////
				int intnum = random.nextInt(10000);	// 0~9999
				// 정수 -> 4자릿수 문자열 변환 
				String strnum = String.format( "%04d", intnum );
						// String.format( 형식 , 데이터) : 문자열 형식 메소드 
							// 형식 : %d -> 형식대상의 데이터가 정수 
								// %4d : 4자릿수 
								// %04d : 비어있는 자릿수는 0으로 사용
				// 차량번호 저장  [ 비어있는 배열에 저장 ]
				for( int i = 0 ; i<carnumbers.length; i++ ) {
					if( carnumbers[i] == null ) {
						carnumbers[i] = strnum; 
						// 홀수 짝수 구분 [   값 % 2 == 0  나머지가 0이면 짝수 나머지가 1이면 홀수  
							// 1. 문자열 -> 정수 변환   2.홀 짝 구분
						if( Integer.parseInt(strnum) % 2 == 0 ) {  //  정수형( 차량번호 ) % 2 == 0 이면 짝수
							for( int j = 0 ; j<carnumbers_even.length; j++ ) {
								if( carnumbers_even[j] == null ) {
									carnumbers_even[j] = strnum; break;
								}
							}
						}else { // 홀수 
							for( int j = 0 ; j<carnumbers_odd.length; j++ ) {
								if( carnumbers_odd[j] == null ) {
									carnumbers_odd[j] = strnum; break;
								}
							}
						}
						break;
					}
				}
				////////////////////////차량 출력 저장 /////////////////////////////
				System.out.println(" ******** 현재 주차중인 차량 ******** ");
				for( String num : carnumbers ) { // 인덱스번호가 필요없는 반복 
					// for( 자료형 임시변수 : 배열명 ) : 
					// 배열내 0번 인덱스부터 마지막인덱스까지 임시변수에 대입 
					if( num !=null ) System.out.println( num );
				}
				
				System.out.println(" ******** 현재 주차중인 홀수차량 ******** ");
				for( String num : carnumbers_odd ) { // 인덱스번호가 필요없는 반복 
					if( num !=null ) System.out.println( num );
				}
				
				System.out.println(" ******** 현재 주차중인 짝수차량 ******** ");
				for( String num : carnumbers_even ) { // 인덱스번호가 필요없는 반복 
					if( num !=null ) System.out.println( num );
				}
				
				
				
			}
		}
		
	}
	

}
