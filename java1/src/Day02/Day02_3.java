package Day02;

public class Day02_3 {
	
	/* p.64 연산자 [ 연산시 사용되는 특수문자 ]
	 * 
		 산술연산자 : +(더하기) - * / %(나머지)
		 		+ ( 연결연산자 )
		 		
		 비교연산자 : 결과 t/f
		 	>= 이상[크거나같다]		> 초과 [ 크다 ]	== [ 같다 ]
		 	<= 이하[작거나같다]		< 미만 [ 작다 ]	!= [ 같지않다 ]
		 	
		 논리연산자 : 비교연산자가 2개이상일때 
		 	&& : AND[이면서, 면서 , 이고 , 그리고 , 모두 ]
		 	|| : OR[이거나 , 거나 , 또는 , 하나라도 ]
		 	! : NOT[ 부정 (반대 ) ]
		 
		 대입연산자 : 
		 	=	[ 오른쪽값이 왼쪽에 대입 ]
		 	+=	[ 오른쪽값을 왼쪽값에 더한 후 왼쪽에 대입 ] 
		 	*= /= -= %=
		 	
		 증감연산자 :
		  	++ [ 1증가 ]
		  	-- [ 1감소 ]
		  	
		 조건연산자 : 
		 	조건식 ? 참  : 거짓

	*/
	
		public static void main(String[] args) {
			
			// p.76 : 산술연산자 
			int 정수1 = 10; int 정수2 = 20;
			System.out.println(" 더하기 : " + 정수1+정수2 ); 	// 문자 + 숫자 + 숫자 => 연결연산자 
			System.out.println(" 더하기 : " + (정수1+정수2) ); // 숫자 + 숫자 
			System.out.println(" 빼기 : " + (정수1-정수2) );
			System.out.println(" 곱하기 : " + (정수1*정수2) );
			System.out.println(" 나누기 : " + (정수1/정수2) );
			System.out.println(" 나머지 : " + (정수1%정수2) );
			
			// p.70 : 증감연산자 [ ++ : 1증가  -- : 1감소 ]
				// 규칙적인 증가/감소
				// 정수1 = 정수1 + 1 
				// 정수1 += 1 
				// 정수++		
			
			정수1++;	System.out.println( " 증가 : " + 정수1);
			정수1--;	System.out.println( " 감소 : " + 정수1);
				// 선위증가[ ++변수명 ] , 후위증가[ 변수명++ ]
			System.out.println(" 선위증가 : " + ++정수1);	// 1증가 11
			System.out.println(" 확인 : " + 정수1 );		// 확인  11
			System.out.println(" 후위증가 : " + 정수1++ ); // 1증가 11
			System.out.println(" 확인 : " + 정수1 );		// 12
			
			System.out.println(" 선위감소 : " + --정수1); 	// 1감소 11
			System.out.println(" 확인 : " + 정수1 );  		// 11 
			System.out.println(" 후위감소 : " + 정수1-- ); 	// 1감소 11
			System.out.println(" 확인 : " + 정수1); 		// 10
			
			// p.88 : 비교연산자 => 결과 => T / F
			System.out.println(" 이상 : " + (정수1 >= 정수2) ); 	// 10 >= 20 f
			System.out.println(" 이하 : " + (정수1 <= 정수2) );		// 10 <= 20 t
			System.out.println(" 초과 : " + (정수1 > 정수2) );		// 10 > 20  f
			System.out.println(" 미만 : " + (정수1 < 정수2) ); 		// 10 < 20  t
			System.out.println(" 같다 : " + (정수1 == 정수2) ); 	// 10 == 20 f
			System.out.println(" 같지않다 : " + (정수1 != 정수2) ); 	// 10 != 20 t
			
			// P.92 : 논리연산자 : AND / OR : 비교연산자가 2개이상일때 
				// AND : 2개이상의 비교연산자가 모두 TRUE => 결과 TRUE // 하나라도 FALSE => 결과 FALSE
				// OR : 2개이상의 비교연산자가 하나라도 TRUE => 결과 TRUE
			int 정수3 = 30; int 정수4 = 40;
			System.out.println(" AND : " + (정수1>=정수2 && 정수4 >=정수3 ) ); // F && T => F
			System.out.println(" OR : " + (정수1>=정수2 || 정수4 >= 정수3 ) );	// F && T => T 
			System.out.println(" not : " + !(정수1>=정수2 || 정수4 >= 정수3) ); // !T => F
			
			// P.98 : 대입연산자 : 
			정수1 += 1;  // 변수명 += 값    오른쪽값을 왼쪽변수명 더한후에 왼쪽 변수에 대입 
			정수1 *= 10;	System.out.println( 정수1 );
			정수1 -= 10;	System.out.println( 정수1 );
			정수1 /= 10;	System.out.println( 정수1 );
			
			// p.100 : 조건 연산자 [ 조건식(비교연산자) ? 참(true) : 거짓(false) 
				int 점수 = 85;
				char 등급 = 점수 > 90 ? 'A' : 'B' ; 					System.out.println( 등급 );
				char 등급2 = 점수 > 90 ? 'A' : 점수 > 80 ? 'B' : 'C' ;	System.out.println( 등급2 );
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
