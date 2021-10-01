package Day04;

public class Day04_6_틱택토게임 {
	
	// 배열을 이용한 틱택토게임 프로그램 	
	public static void main(String[] args) {
		// 1. 게임판 생성 [9칸 생성 ]
			// String 객체 9개를 저장하는 배열 선언 
		String[] 게임판 = {   "[ ]" , "[ ]" , "[ ]" ,
							"[ ]" , "[ ]" , "[ ]" ,
							"[ ]" , "[ ]" , "[ ]" , } ;
		// 2. 게임판 출력 [ 인덱스가 0번부터 시작하기 때문에 for 초기값을 0부터 시작 ]
		for( int i = 0 ; i<게임판.length ; i++ ) {
			// 3칸씩 출력후 줄바꿈??????
			System.out.println( 게임판[i] );
		}
		
		
	}

}
