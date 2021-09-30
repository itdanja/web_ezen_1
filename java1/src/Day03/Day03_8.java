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
				System.out.println("예금액>");
			}
			else if( 선택 == 2 ) { 
				System.out.println("출금액>");
			}
			else if( 선택 == 3 ) {
				System.out.println("잔고>");
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
