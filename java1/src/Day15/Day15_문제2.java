package Day15;

import java.util.HashSet;
import java.util.Scanner;

public class Day15_문제2 {

//	문제2: set 컬렉션
//	* 로또 프로그램
//		1. 6개 입력받아 set 컬렉션에 저장하여 출력 
//		[조건] 중복값 허용 X
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<>();
		
		while(true) {
			System.out.print(" 1~45 숫자 선택(중복불가) : ");
			int num = scanner.nextInt();
			
			if( num < 1 || num > 45 ) {
				System.out.println("**선택할수 없는 번호");
			}
			else {
				// 중복확인 
				if( set.contains(num) ) {
					System.out.println("** 중복 번호 입니다");
				}else {
					set.add(num);
					System.out.println(" 확인 : "+ set );
				}
			}
			// 무한루프 끝나느 조건 : 6개 모두 입력 되었을때
			if( set.size() == 6 ) break;
		}
	}
}
