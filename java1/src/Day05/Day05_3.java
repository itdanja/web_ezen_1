package Day05;

public class Day05_3 {

	// p.181 확인문제
		// 1. 2
			// 스택 : 변수이름 저장  
			// 힙 : 변수내 실제 값 
			// 3. ==  !=  객체 주소값 비교   [ 객체 내용물 비교 x ]
				// .equals [ 객체 내용물 비교 o ]
		// 2. 3
			// 1. 프로그램 종료시 메모리 초기화
			// 3. 참조되지 않는 객체는 자동 소멸 
	
		// 3. 2  [ 문자열 동일해도 객체가 다를수 있기 때문에 ]
	
		// 4. 2  [ int[] array= { 1 , 2 , 3 } ] 
	
		// 5. 3 [ boolean 타입 배열의 초기값은 false ] 
			// 정수 = 0  , 실수 = 0.0  , 논리 = false , 문자열[객체] = null
	
		// 6. 3  /  5
		//		배열명.length : 행길이 
		//	  	배열명[행].length : 해당 행의 열 길이 
	
		// 7. [ 배열내 모든 인덱스에 접근하기 위해서 for 활용 ] 

		/*
		 * 	for( int i = 0 ; i<array.length; i++ ) { // i는 인덱스 0부터 4까지 1씩증가하면서 반복 
		 * 		if( array[i] > max ) max = array[i]  // i번째 인덱스 값이 max보다 크면 max에 i번째 인덱스 값 넣기 
		 * 	}
		 */
	
		// 8. [ 배열내 모든 인덱스에 접근하기 위해서 for 활용 ] 
		/*
		 * 	int count = 0 ; // 점수 개수 
		 * 
		 *	// 행 반복문
		 *	for( int i = 0 ; i < array.length ; i++ ) {
		 *		// 열 반복문 
		 *		for( int j = 0 ; j< array[i].length ; j++ ){
		 *			// 해당 인덱스 값 가져와서 sum 누적합계 더하기  
		 *			sum += array[i][j];
		 *		}
		 *		count += array[i].length;  // 2 + 3 + 5 
		 *	}
		 * 	avg = (double)sum / count;
		 * 
		 */
	
		// 9. 
	
	
	
	
	
	
	
	
}
