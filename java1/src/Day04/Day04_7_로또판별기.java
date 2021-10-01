package Day04;

import java.util.Scanner;

public class Day04_7_로또판별기 {

	public static void main(String[] args) {
		
		// 0. 입력객체 
		Scanner scanner = new Scanner(System.in);
		// 0. 배열    [  배열선언 : 자료형[] 배열명 = new 자료형[길이]   ] 
		int[] number = new int[6]; // int형 6개 변수를 저장할수 있는 배열 
				
		// 1. 사용자로부터 6개 수를 입력받아 배열에 저장 
		for( int i = 0 ; i<6 ; i++) {
			System.out.print(i+"번째 번호[1~45] 선택 : "); 
			number[i] = scanner.nextInt(); // 입력받은 값을 해당 인덱스 배열에 저장 
			// 중복체크!!!!!!!
			
		}
	}
}
