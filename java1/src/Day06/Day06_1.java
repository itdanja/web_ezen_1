package Day06;

public class Day06_1 {
	
	public static void main(String[] args) {
		
	
	// P.195
	// 1. 객체 만들기 : 클래스 이용한 메모리 할당 
		Student student = new Student();
		//클래스명 객체명 = new 생성자();
			// 클래스명 == 생성자명 
		System.out.println(" student 변수가 Student 객체를 참조합니다 ");
		
		Student student2 = new Student();
		System.out.println(" student 변수가 또 다른 Student 객체를 참조합니다 ");
	
		System.out.println(" 객체이름 출력 : " + student );
			// 진수 
				// 0 , 1 : 2진수 [ 기계어 ]
				// 0 ~ 7 : 8진수 
				// 0 ~ 9 : 10진수 
				// 0 ~ 9 a b c d e f : 16진수 
		
	
	// p.201	
		// 1. 자동차 객체 만들기 
		Car car = new Car();
		
		// 2. 객체내 멤버[필드] 호출 
		System.out.println("제작회사 : " + car.company );
		System.out.println("모델명 : " + car.model );
		System.out.println("색깔 : " + car.color );
		System.out.println("최고속도 : " + car.maxSpeed );
		System.out.println("현재속도 : " + car.speed );
	
		// 3. 객체내 멤버[필드] 값 변경 
		System.out.println(" >>>> 속도 증가 ");
		car.speed = 60 ;
		System.out.println("수정된 속도 : " + car.speed );
		
	// p.205 : 생성자를 이용한 객체 생성 
		Car2 car2 = new Car2("검정", 3000); // 생성자 
		
	// p.207 : 생성자 => 필드 초기화 
		
		Korean korean = new Korean("박자바", "011225-1234567");
		System.out.println("korean1 name : " + korean.name );
		System.out.println("korean1 ssn : " + korean.ssn);
		
		Korean korean2 = new Korean("김자바","930525-0654321");
		System.out.println("korean2 name : " + korean2.name );
		System.out.println("korean2 ssn : " + korean2.ssn);
		
		// 비어있는 객체 [ 빈생성자 ] 
		Korean korean3 = new Korean();
		korean3.name = "박자바";
		korean3.ssn = "011225-1234567";
		System.out.println("korean3 name : " + korean.name );
		System.out.println("korean3 ssn : " + korean.ssn);
		
	}
	
}










