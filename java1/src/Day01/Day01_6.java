package Day01;

import java.util.Scanner;

public class Day01_6 {
	//문제3 : 하나의 방문록 입력받아 출력하기 
	/*[입력받기] : 작성자 , 내용 , 날짜 
	 *[ 출력 ] 
	 *	---------------방문록--------------------
	 *  | 순번 | 작성자 | 	내용 	| 날짜  |
	 *  |  1  | 강호동 | 안녕하세요 | 09-28|
	 *  ----------------------------------------
	 */
	public static void main(String[] args) {
		
		// 1. 입력객체 선언 
		Scanner scanner = new Scanner(System.in);
		System.out.print(" 작성자 : ");	String writer = scanner.next();
			scanner.nextLine(); 
		System.out.print(" 내용 : ");	String contents = scanner.nextLine();// 공백 포함 o 
			// scanner.nextLine(); // next 다음으로 nextLine 사용시 문제 발생 
				// 해결방법 : next 와 nextLine 사이에 nextLine() 추가 
		
		System.out.print(" 날짜 : ");	String date = scanner.next();
		// 2. 출력 
		System.out.println("------------ 방문록 -------------- ");
		System.out.println("| 순번 | 작성자 | 내용 \t | 날짜 |");
		System.out.println("|  1  | "+writer+" | " + contents + "\t | " + date +" |");
		System.out.println("--------------------------------- ");
	
	}
	
}
