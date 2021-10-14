package Day11;

import java.io.IOException;

public class Day11_4 {
	
	public static void main(String[] args) throws IOException{
		
		// 키보드로부터 문자열 받아오는 원리
			// 키보드[바이트] 입력 =>  입력스트림 => 자바 프로그램
		
		//String 클래스 
			// 1. String 생성자 : 바이트열 를 문자열 변환
				// 생성자 약13개 정도 존재 
				// 문자열에도 인덱스가 존재 
		
		// p.497
		// 1. 바이트배열에 정수 저장 
		byte[] bytes = { 72 , 101 , 108 , 108 , 111 , 32 , 74 , 97 , 118 , 97 };
				//유니코드	: H    e     l     l     o    sp   J    a     v    a
		// 2. 바이트배열을 String 생성자에 넣기 
		String str1 = new String(bytes);
		System.out.println( str1 );
		
		// 3. 						  // s , c
		String str2 = new String(bytes , 6 , 4 );
		System.out.println( str2 );
		
		// p.498
		// 1. 바이트 100개를 저장할수 있는 배열 
		byte[] bytes2 = new byte[100];
		
		System.out.print(" 입력 : ");		
		int readcount =  System.in.read(bytes2); // 무조건 예외처리
			// 입출력관련 항상 예외처리 발생 
			//System.in.read(배열명) : 키보드로부터 읽어온 바이트를 배열에 저장 
		System.out.println( new String(bytes2) );
							// 바이트열 -> 문자열 변환 
		System.out.println( new String(bytes2 , 0 , readcount-2 ));
		
		// p.499
			// 2. charAt(인덱스) : 문자 추출
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7);
		switch( sex ) {
			case '1':
			case '3': System.out.println("남자"); break;
			case '2':
			case '4': System.out.println("여자"); break;
		}
		// p.500
			// 3. equals(비교대상문자열) : 문자열 비교 
			String strVar1 = new String("신민철");
			String strVar2 = "신민철";
			
			// == 불가 
			if( strVar1 == strVar2 ) {System.out.println(" 1.같다 ");}
			else {System.out.println(" 1.다르다");}
			
			// equals 가능 
			if( strVar1.equals(strVar2)){System.out.println(" 2.같다 ");}
			else {System.out.println(" 2.다르다");}
		
		// p.502
			// 4. getBytes() : 문자열을 바이트열로 변환 
			String str = "안녕하세요"; // 한글 1개당 2바이트 // 영문 1개당 1바이트 
			
			byte[] bytes3 = str.getBytes(); // String을 바이트로 변환후 배열에 대입
			System.out.println( bytes3.length ); // 한글 글자수*2 = 10바이트
			// 바이트 ---> 문자열 
			System.out.println( new String(bytes3) );
				// 인코딩 종류
					// 1.UTF-8 : 전세계 공용어 
					// 2.EUC-KR[ CP949 ] : 영문 , 한글
		// P.504
			// 5. indexOf() : 문자열 찾기 [ 인수 : 찾을문자열   반환: 찾은 인덱스위치 ]
			String subject = "자바 프로그래밍";
			System.out.println( subject.indexOf("프로그래밍") );
			
			if( subject.indexOf("자바") != -1 ) {
									// 인덱스가 -1 : 인덱스가 없다 // 찾을문자가 존재하지 않음
				System.out.println("자바와 관련된 책입니다");
			}else {
				System.out.println("자바와 관련없는 책입니다.");
			}
		// p.505
			// 6. length() : 문자열의 길이 
			System.out.println( subject.length() ); //8칸 : 인덱스0~7
			
					
			
			
			
			
		
		

	}

}
