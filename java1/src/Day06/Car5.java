package Day06;

public class Car5 {
	// 1.필드 [ 데이터 저장 ] 
	String model;
	int speed;
	
	// 2.생성자 [ 데이터 초기값 ] : 객체 선언시 
	public Car5( String model ) {
		// 외부로부터 들어온 데이터 [ 인수 ] 를 내부 변수 에 저장
		// model = model; // [ 내부변수 = 인수변수 ] : 충돌!!! 
		this.model = model; // [ this.내부변수 = 인수변수
			// 인수는 내부변수와 이름을 동일하게 선언
	}
	
	// 3.메소드 [ 데이터 행동 ]  
	void setSpeed( int speed ) {
		this.speed = speed;
	}
	// 
	void run() {
		for( int i = 10 ; i<=50 ;i+=10) {
			this.setSpeed(i); // 내부클래스에서는 메소드 바로 호출 가능 
			System.out.println( this.model+
					"가 달립니다.(시속 : "+this.speed+"km/h");
		}
	}
}
