package Day06;

public class Calculator {
	
	// 필드 
	
	// 생성자 
	
	// 메소드 
		// 인수x() 반환x[void]
	void powerOn() {
		System.out.println("전원을 켭니다");
	}
	
		// 인수o[int , int ] 반환o[int]
	int plus( int x , int y) {
		int result = x+y;
		return result;
	}
		// 인수o [int , int ] 반환o[double]
	double divide( int x , int y ) {
		double result = (double)x / (double)y;
		return result;
	}
		// 인수x() 반환x[void]
	void poweroff() {
		System.out.println("전원을 끕니다");
	}

	
}
