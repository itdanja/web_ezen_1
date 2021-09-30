package Day03;

import java.util.Scanner;

public class Day03_8 {
	
	// 확인문제7 :  ATM 프로그램
	public static void main(String[] args) {
		
		// 종료버튼 누르기전까지 무한실행 프로그램 => while(true)
		boolean 실행 = true; // 무한루프 제어하는 변수 
		int 예금액 = 0 ; // 예금액
		Scanner scanner = new Scanner(System.in); // 입력객체 
		
		while( 실행 ) { // [ 실행변수 true 무한루프 실행 // 실행변수가 false이면 무한루프 종료 ]
			System.out.println("          신한은행 ATM             ");
			System.out.println("--------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
			System.out.println("--------------------------------");
			System.out.print("선택> ");	int 선택 = scanner.nextInt();
			
			if( 선택 == 1 ) {
				System.out.print("예금액>"); 		예금액 += scanner.nextInt();
				System.out.println(" [[ 알림 ]] 예금 완료 ");
			}
			else if( 선택 == 2 ) { 
				System.out.print("출금액>"); 	int 출금액 = scanner.nextInt();
				
				if( 예금액 < 출금액 )  { System.out.println(" [[ 알림 ]] 잔고가 부족합니다 "); }
				else  { 예금액-= 출금액; System.out.println(" [[ 알림 ]] 출금 완료 "); }
				
			}
			else if( 선택 == 3 ) {
				System.out.println("잔고>"+예금액);
			}
			else if( 선택 == 4 ) {  // 만약에 4를 입력했을때 
				실행=false;	// 실행변수를 false 대입하여 무한루프[while] 종료
				System.out.println("     [[이용해주셔서 감사합니다]]"); 
			}
			else {
				System.out.println(" [[경고]] : 알수 없는 번호 입니다 ");
			}
		}
		
	}

}
	// 확인문제 
		// 1. if , switch   // for , while , do~while
		// 2. 2.
		// 3. 
			/*
			 * 	int num = 0 ;
			 * 	for( int i = 1 ; i<=100 ; i++ ){ if( i%3== 0 ) sum += i; }
			 * 	System.out.println(" 3의 배수의 합 : "+ sum );
			 */
		// 4.----
		// 5. 4x + 5y = 60
			/*
			 * 
			 * 	for( int x = 1 ; x<=10 ; x++ ){ 
			 * 		for( int y = 1 ; y<=10 ; y++) {
			 * 			if(  (4*x)  +  (5*y ) == 60 ){ 
			 * 				System.out.printf("(%d , %d) \n" , x , y ); 
			 * 			}
			 * 		}
			 * 	}
			 */
		// 6.
			/*
			 * 	for( int i = 1 ; i<=5 ; i++ ) {
			 * 
			 * 		for( int s = 1 ; s<= i ; s++ ) { System.out.print("*"); }
			 * 
			 * 		System.out.println();
			 * 
			 * 	}
			 */





