package Day06;

public class Day06_3 {

	public static void main(String[] args) {	
	
	// p.218
		// 객체 만들기 [ 생성자 정의 선언이 없을경우 빈생성자 ]  
		Calculator calculator = new Calculator();
		// 객체를 통한 메소드 호출 
		calculator.powerOn();
		
		// 객체를 통한 메소드 호출 [ 인수도 전달 해서 리턴값을 변수에 저장  ] 
		int result1 = calculator.plus(5, 6);
		System.out.println("함수 결과물 : " + result1 );
		
		byte x = 10; byte y = 4;
		double result2 = calculator.divide(x, y);
		System.out.println("함수 결과물 : " + result2 );
		
		calculator.poweroff();
		
	// p.223
		Car4 car4; // 객체
		car4 = new Car4(); // 인스턴스화
			// 1. 객체내 필드에 값을 초기화할수 있는방법
				// 1. 객체명.필드명 = 10
				// 2. new 클래스명( 10 )
				// 3. 객체명.set메소드( 10 )
		
		car4.setGas(5); // setGas 메소드 호출 [ 인수로 5 넣기 ]
		
		boolean gasState = car4.isLeftGas(); // 가스 확인 메소드 
		
		if( gasState ) {
			System.out.println(" 출발 ");
			car4.run();
		}
		
		if( car4.isLeftGas() ) {
			System.out.println("gas 주입할 필요가 있습니다 ");
		}else {
			System.out.println("gas를 주입하세요.");
		}
		
	}
}









