package Day11;

import java.io.IOException;

public class Day11_5 {
	
	// 1. 메뉴 => while 무한루프
	// 2. 입력받기 : 1. Scanner 객체  2. System.in.read()
	// 3. 세부메뉴 구현 
	
//	도서 검색 프로그램
//	1.조건 : 도서목록 배열 선언 
//		[ 4개의 도서를 배열에 등록 ]
//		1. 된다! 네이버 블로그&포스트
//		2. 스프링 부트 실전 활용 마스터
//		3. Tucker의 Go 언어 프로그래밍
//		4. 혼자 공부하는 C 언어
//
//	2. Scanner -> System.in.read()
//
//	3.검색기능 : 검색을 입력받아 검색한 단어가 포함된 도서를 모두 출력
//	4.수정기능 : 수정할 도서를 입력받아 선택후 교체할 단어와 새로운 단어 입력받아 교체
//	
//	String[] 도서목록 = {	
//			"된다! 네이버 블로그&포스트",
//			"스프링 부트 실전 활용 마스터",
//			"Tucker의 Go 언어 프로그래밍",
//			"혼자 공부하는 C 언어"
//	};
	public static void main(String[] args) throws IOException {
		
		//0.준비물
		String[] 도서목록 = {	"된다! 네이버 블로그&포스트","스프링 부트 실전 활용 마스터","Tucker의 Go 언어 프로그래밍","혼자 공부하는 C 언어"};
		
		// 1.메뉴 
		while(true) {
			System.out.print("1.검색 2.수정   선택 : ");
				// 바이트배열 선언 [ 키보드로부터 입력받은 바이트를 저장할 배열 ] 
			byte[] bs = new byte[100]; // 넉넉히 100바이트 [ 영문이면 100글자 // 한글이면 50글자 ]
			// 입력[키보드=바이트]받기 --->  바이트배열에 저장 
			int count =  System.in.read( bs ); // 1. 무조건 예외발생 [ 1.던지기.2.try ]
				// count : 바이트를 읽어온 개수 저장 변수
				// 문자수 + 2 [ \n , \r ]
			// 예1)
			// 바이트 --> 문자열 변환[ 바이트배열 , 0 , 입력한문자수 ) 
			String ch = new String(bs , 0 , count-2 ); // 100바이트 모두 문자열 변환
			if( ch.equals("1") ) { 
				System.out.println("---------검색창---------");
				System.out.println(" 검색할 도서명 : ");
				count =  System.in.read( bs );
				String book = new String(bs , 0 , count-2 );
				for( int i = 0 ; i<도서목록.length ;i++) {
					// 도서명 모두 일치했을경우 
					if( 도서목록[i].equals( book ) ) {
						System.out.println( 도서목록[i] );
					}
					// 1도서명이 포함된 도서명일경우
					if( 도서목록[i].contains( book ) ) {
						System.out.println( 도서목록[i]);
					}
					// 2도서명이 포함된 도서명일경우
					if( 도서목록[i].indexOf(book) != -1 ) {
						System.out.println( 도서목록[i]);
					}
				}
			}
			if( ch.equals("2") ) { System.out.println("---------수정창---------");}
			
			// 예2)
			// 문자열 ---> 숫자열 변환 
			int ch2 = Integer.parseInt(ch);
			if( ch2==1 ) { System.out.println("---------검색창---------");}
			if( ch2==2 ) { System.out.println("---------수정창---------");}
			
		}
	}
}








