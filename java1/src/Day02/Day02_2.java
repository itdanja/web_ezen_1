package Day02;

public class Day02_2 {

	// 변수 : 하나의 값을 저장할수 있는 메모리 공간 
		// 메모리[주기억장치=RAM] : 현재 실행중인 프로그램 기억 
			// 프로그램 <--- 프로세스[스레드] <----- 명령어[코드] 집합
		// 변수 개수 증가 ---> 용량 증가 ---> 속도 감소 
		// 변수 효율성 => 자료형 
	
	// 변수 선언 
		// 자료형 변수명[임의]
		// int age;
	
	// 변수명 규칙 
		// 숫자로 시작 x   // 대소문자 구분  //
	
	// 변수값 저장 [ 오른쪽값이 왼쪽에 대입 : 대입연산자 = ]
		// int score; // 변수 선언 
		// score = 90 ; // 변수에 90값 대입
	
	// 변수는 선언된 블록 내에서만 가능 가능하다 [ 괄호 안으로 이동 가능 // 괄호 밖으로 이동 불가 ]
	
	public static void main(String[] args) {
		// p.35 예
		int value = 10 ; //  int형 자료의 value 변수명을 갖는 변수 선언과 동시에 10 대입 
		int result = value + 10 ; // 변수는 연산이 가능 	
		System.out.println(" 결과 : " +  result );
		
		// p.38  자료형 
			// 자료형 사용 목적 : 메모리 효율성 [ 적절한 사용 ] 
			// 컴퓨터는 기계어 사용 [ 0 ,  1 ] 단위 : bit => 0 혹은 1 
				// bit => 8bit => 1바이트		[ 01010101 => 1바이트 [ 8칸 ] ]
				// byte => 1024byte => 1kbyte
				
		/*
		 * 	[논리]
		 *  boolean	1비트			true , false
		 *	[문자]
		 *  char	2바이트		문자[유니코드]
		 *  [정수]
		 *  byte	1바이트		+-127
		 * 	short	2바이트		+-3만정도
		 *  int		4바이트		+-20억정도
		 *  long	8바이트		+-20억 이상 
		 *  [실수]
		 *  float	4바이트		소수점 8자리 표현
		 *  double	8바이트 		소수점 18자리 표현
		 */
		
		// p.40 : byte [ -128 ~ +127 ]
		byte var1 = -128; 	System.out.println( var1 );
		byte var2 = -30;	System.out.println( var2 );
		byte var3 = 30;		System.out.println( var3 );
		// byte var4 = 128;	System.out.println( var4 ); // 오류
		byte var4 = 'j';	System.out.println( var4 );
		
		// p.43 : char [ 한글자 ] : 유니코드 
		char c1 = 'A'; 		System.out.println( c1 );
		char c2 = 65;		System.out.println( c2 );
		char c3 = '\u0041';	System.out.println( c3 );
		
		char c4 = '가';		System.out.println( c4 );
		char c5 = 44032;	System.out.println( c5 );
		char c6 = '\uac00';	System.out.println( c6 );
		// 컴퓨터[0,1]는 문자를 어떻게 처리????????????
			// 아스키코드 : 미국 [ 기계어 ----> 영어 -----> 기계어 ]
			// 유니코드[java] : 전세계 모든 문자 표현 
		
		// p.44~45 : short[2바이트] , int[*기본 정수 자료형 / 4바이트] 타입
		short num1 = 30000;			System.out.println( num1 );
		//short num2 = 40000;		System.out.println( num2 );
		int num2 = 10;				System.out.println( num2 );
		int num3 = 012;				System.out.println( num3 ); // 8진수
		int num4 = 0xA;				System.out.println( num4 ); // 16진수
			// 진수 목적 : 컴퓨터가 표현할수 있는 단위 한계 해결
			// 2진수 [ 0 , 1 ] : 기계어 
			// 8진수 [ 0 ~ 7 ] :								[ 0 ]
			// 10진수 [ 0 ~ 9 ] : 사람 						
			// 16진수 [ 0 ~ 9 A B C D E F ] : 다양한 표현단위	[ 0x ]
		
		// p.46 : Long[ 8바이트 ] : 20억이상
		Long num5 = 2000000000L; 	System.out.println( num5 );
		
		// p.47~48 : float[4바이트] , double[ *기본 실수 자료형 / 8바이트 ] 
		double val = 3.14; 			System.out.println( val );
		//float val2 = 3.14;		System.out.println( val2 );
		float val2 = 3.14f;			System.out.println( val2 );
		
		double val3 = 0.1234567890123456789;	System.out.println( val3 );
			// 소수점 18자리까지 표현 
		float val4 = 0.1234567890123456789f;	System.out.println( val4 );
			// 소수점 8자리까지 표현 
		
		// boolean : 1비트[0(false),1(true)]
		boolean bol = true;			System.out.println( bol );
		
		// p.49~51 : 타입변환
			// 1. 자동 타입변환 [ 크기순 : 작은상자에서 큰상자로 이동 가능 ]
				// byte -> short(char) -> int -> long -> float -> double
						
				// 작은상자에서 큰상자로 이동 가능 // 큰상자에서 작은상자로 이동 불가 
		byte bytevalue = 10;
		int intvalue = bytevalue; // 자동 형변환 [가능 ] byte -> int  
		//byte bytevalue2 = intvalue;	// 불가  int -> byte 
		
			// 2. 강제 타입변환 [ 메모리손실 => 데이터 손실 ]
				// 자료형 변수명 = (자료형)변수명;
			// p.54
		byte bytevalue2 = (byte)intvalue;
		
		// 연습문제
			// 1 : 4
			// 2 : 1 4 5
			// 3 : byte			short		int		long
			//					char
			//								float	double
			//		boolean
		
			// 4 :	타입 : int , double
			//		변수이름 : age , price 
			//		리터럴 : 10 , 3.14
			// 5 : 3
			// 6 : 4
			// 7 : 3
			// 8 : 1 [ 연산시 기본타입 : int ]
				//1. byte + byte => int => byte [x]
				//2. int + byte => int => int
				//3. int + float => int => float
				//4. int + double => int => double		
	}
	
		
}













