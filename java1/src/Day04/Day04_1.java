package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_1 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
	// 무한루프 => while 이용한 무한반복 
		// 키보드를 이용한 루프제어
		// 무한루프 종료 방법 : 1. 조건을 false 2.break
		while(true) { 
			
			// 랜덤[난수] 생성 
			// 1. Random 클래스  // 2. Math 클래스
				// Random 객체 
					// .nextInt() : int형 표현할수 단위만큼 난수 생성 
					// .nextInt(숫자) : 0~숫자전까지 난수
					// .nextInt( 숫자 ) + 초기값 : 초기값~숫자까지의 난수
			Random random = new Random();
			System.out.println( random.nextInt(10) + 1 );
			
				//System.out.println( random.nextInt() );
				//System.out.println( random.nextDouble() );
				//System.out.println( random.nextBoolean() );
			//System.out.println("무한루프");
			//int 선택 = scanner.nextInt();
			//if( 선택 == 4 ) break;	
		}

	
	}

}
