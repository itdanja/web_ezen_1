package Day01;

import java.util.Scanner;

public class Day01_3 {

	// main메소드(함수)
	public static void main(String[] args) {
		
		// 출력 클래스 : System
		System.out.print("입력 : "); // 출력 메소드 호출
		
		// 입력 클래스 : Scanner 객체 : 
			// 1. 키보드로부터 입력받은 값을 메모리[저장장치] 객체 저장
			// 2. 다른 변수로 입력값 옮기기
			// 3. 새로운 입력값 받기 
		
		Scanner 입력객체 = new Scanner(System.in);
			// 객체 : 클래스 기반으로 생성된 메모리 공간
				// 객체 선언 : 클래스명 객체명[임의] = new 생성자( )
					// new : 메모리 할당 연산자 
					// System.out : 출력
					// System.out : 입력 
			// 객체에서 꺼내오기 
				// .next() : 객체내 저장된 문자열 호출 [ 띄어쓰기 x ]
				// .nextInt() : 객체내 저장된 정수 호출 
				// .nextLine() : 객체내 저장된 문자열 호출 [ 띄어쓰기 o ] 
				// 등등 
	
		String string1 = 입력객체.next();
			// 객체내 저장된 입력값을 변수에 저장 
		System.out.println("입력된 문자열은 : " + string1);
		
		System.out.print("입력2 : ");
			// 두번째 입력값 꺼내오기 
		String string2 = 입력객체.next();
			// 출력
		System.out.println("입력된 두번째 문자열은 : " + string2);
		
	}
}
