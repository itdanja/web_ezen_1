package Day03;

import java.util.Scanner;

public class Day03_2 {
	
	public static void main(String[] args) {
		
		// 입력객체
		Scanner 입력객체 = new Scanner(System.in);
	/*	
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
		System.out.print("문제3 정수1 : ");	int 정수6 = 입력객체.nextInt();
		System.out.print("문제3 정수2 : ");	int 정수7 = 입력객체.nextInt();
		System.out.print("문제3 정수3 : ");	int 정수8 = 입력객체.nextInt();
		System.out.print("문제3 정수4 : ");	int 정수9 = 입력객체.nextInt();
		int 최댓값 = 정수6; // max변수에 첫번째 값 넣기 

		if( 최댓값 < 정수7 ) 최댓값 = 정수7;	// 만약에 max 변수에 있는 값 보다 크면 max값 변경 
		if( 최댓값 < 정수8 ) 최댓값 = 정수8;
		if( 최댓값 < 정수9 ) 최댓값 = 정수9;
		System.out.println(" 가장 큰수는 : " + 최댓값 );
		
		// 문제4 : 4개의 정수를 입력받아 오름차순으로 출력 
		System.out.print("문제4 정수1 : ");	int 정수10 = 입력객체.nextInt();
		System.out.print("문제4 정수2 : ");	int 정수11 = 입력객체.nextInt();
		System.out.print("문제4 정수3 : ");	int 정수12 = 입력객체.nextInt();
		System.out.print("문제4 정수4 : ");	int 정수13 = 입력객체.nextInt();
		
		int temp; // 교환시 사용되는 임시변수
		///////////////////////////////// 크면 뒤로 가기 => 오름차순 ////////////////////	
			// 1. 1번째 변수와 2번째,3번째 4번째 변수와 비교 = 3번  
		if( 정수10 > 정수11 ) { temp = 정수10; 정수10 = 정수11; 정수11 = temp; }
		if( 정수10 > 정수12 ) { temp = 정수10; 정수10 = 정수12; 정수12 = temp; }
		if( 정수10 > 정수13 ) { temp = 정수10; 정수10 = 정수13; 정수13 = temp; }
			// 2. 2번째 변수와 3번째,4번째 변수와 비교 = 2번 
		if( 정수11 > 정수12 ) { temp = 정수11; 정수11 = 정수12; 정수12 = temp; }
		if( 정수11 > 정수13 ) { temp = 정수11; 정수11 = 정수13; 정수13 = temp; }
			// 3. 3번째 변수와 4번째 변수와 비교 = 1번 
		if( 정수12 > 정수13 ) { temp = 정수12; 정수12 = 정수13; 정수13 = temp; }
			// 4. 4번째 변수는 비교를 3번 당했기 때문에 비교 x
		System.out.printf(" 오름차순 : %d  %d  %d  %d  \n" , 정수10 , 정수11 , 정수12 , 정수13 );

		///////////////////////////////// 작으면 뒤로 가기 => 내림차순 ////////////////////	
		// 문제5 : 4개의 정수를 입력받아 내림차순으로 출력 
		if( 정수10 < 정수11 ) { temp = 정수10; 정수10 = 정수11; 정수11 = temp; }
		if( 정수10 < 정수12 ) { temp = 정수10; 정수10 = 정수12; 정수12 = temp; }
		if( 정수10 < 정수13 ) { temp = 정수10; 정수10 = 정수13; 정수13 = temp; }
		if( 정수11 < 정수12 ) { temp = 정수11; 정수11 = 정수12; 정수12 = temp; }
		if( 정수11 < 정수13 ) { temp = 정수11; 정수11 = 정수13; 정수13 = temp; }
		if( 정수12 < 정수13 ) { temp = 정수12; 정수12 = 정수13; 정수13 = temp; }
		System.out.printf(" 내림차순 : %d  %d  %d  %d  \n" , 정수10 , 정수11 , 정수12 , 정수13 );
	 */	
		// 문제6 : 로그인페이지
			// [ 입력 ] : 아이디와 비밀번호를 입력받기
			// [ 조건 ] : 회원아이디가 admin 이고 비밀번호가 1234 일 경우에는 로그인 성공 아니면 로그인 실패 출력
	
		System.out.println("==========로그인페이지==========");
		System.out.print(" 아이디 : ");		String 아이디 = 입력객체.next();
		System.out.print(" 비밀번호 : ");		int 비밀번호 = 입력객체.nextInt();
		
		if( 아이디.equals("admin") ) {
			// String 비교시 equals메소드 사용 	// 아이디가 admin 이면 
			if( 비밀번호 == 1234 ) {
				System.out.println(" >>>>>> 로그인 성공 >>>>>>");
			}else {
				System.out.println(" [로그인실패] 패스워드가 다릅니다");
			}
		}
		else {
			System.out.println(" [로그인실패] 존재하지 않는 아이디 입니다");
		}
	}
	
}








