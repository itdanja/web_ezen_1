package Day11;

public class Day11_2 {
	
	public static void main(String[] args) {
		
		// API : 
			// 라이브러리 : 만들어진 클래스 , 인터페이스 
		// Object 클래스 
			// 1. equals() : 객체 비교 
		
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if( obj1.equals(obj2) ) {
			System.out.println("1.두 객체는 동등합니다");
		}else {
			System.out.println("1.두 객체는 다릅니다.");
		}
		
		if( obj1.equals(obj3) ) {
			System.out.println("2.두 객체는 동등합니다");
		}else {
			System.out.println("2.두 객체는 다릅니다.");
		}
			// 2. toString() : 객체정보 
				// 객체의 주소값 [ 자료형들은 값 호출 ] 
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());
		String 문자열 = "유재석";
		System.out.println( 문자열.toString() );
		
	}

}
