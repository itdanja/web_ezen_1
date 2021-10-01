package Day04;

public class Day04_4_배열 {

	// 객체 : [클래스] 설계도 기반으로 생성된 메모리 공간
	// 변수 : [자료형] 하나의 값을 저장할수 있는 메모리 공간
		// 배열 : 같은 타입의 데이터를 연속된 공간의 나열 , (저장순서) 인덱스 부여
			// 같은 타입 변수의 관리 효율성
			// 다른 타입x
		// 1. 인덱스 : 저장되는 순서번호 [ 0번부터 시작~~ ]
		// 2. [ ] : [인덱스번호]
		
	// int 정수1  , int 정수2 , int 정수3 ~~~~ int 정수 100 
	// int[] 정수 = new int[100]
	
	public static void main(String[] args) {
		
		// p.153 예3)
		// 1. 배열 선언  [ 타입[] 배열명 = { 값1, 값2 , 값3 }  ]
			// 1. 타입[] 배열명 = { 값1, 값2 , 값3 } 
			// 2. 타입[] 배열명 = new 타입[길이];
	
		int[] scores = { 83 , 90 , 87 };
			// int[] 배열명 : 배열선언 
				// = { 값1(인덱스0) , 값2(인덱스1) , 값3(인덱스2) }
		
		//2. 배열 호출 [ 인덱스 호출하면 값이 호출 된다 ]
		System.out.println(" scores[0] : " + scores[0] );
		System.out.println(" scores[1] : " + scores[1] );
		System.out.println(" scores[2] : " + scores[2] );
		
		//3. 반복문 활용 [ 반복문 이용한 인덱스 번호 호출 ] 
		int sum = 0;
		for( int i = 0 ; i<3 ; i++ ) { sum += scores[i]; } 
		System.out.println(" 배열내 총합 : " + sum );
		System.out.println(" 배열내 평균 : " + (sum)/3 );
		
		
		// 예2)	// int형 변수 3개를 저장할수 있는 배열 선언 
		int[] 정수배열1 = new int[3]; // => int 4바이트 *3 => 12바이트
			// 1. 타입 : 자료형/클래스 
				// 2. 배열명 : 아무거나[임의]
					// 3. new : 메모리할당 연산자 
						// 4. 타입[배열의길이]
		// 1. 해당 인덱스에 값 넣기 
		정수배열1[0] = 3; 정수배열1[1] = 4 ; 정수배열1[2] =5;
		// 2. 출력 
		System.out.println( 정수배열1 ); // 메모리 주소값[ 배열주소 = 첫번째 인덱스 주소] 출력
		System.out.println( 정수배열1[0] ); // 해당 인덱스의 값 출력 
		System.out.println( 정수배열1[1] );
		System.out.println( 정수배열1[2] );
		
		
		
	}
	

}








