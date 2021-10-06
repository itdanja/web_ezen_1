package Day06;

public class Day06_4 {

	// p.235
	public static void main(String[] args) {
		
		// 1. 객체 만들기
		Car5 car5;
		Car5 myCar = new Car5("포르쉐");
		Car5 yourCar = new Car5("벤츠");
		
		// 2. 객체를 통한 메소드 호출 
		myCar.run();
		yourCar.run();
		
	}
	
	// p.277 : 확인문제 
		// 1. 하나의 클래스로부터 여러개 객체생성 가능 
		// 2. 4
		// 3. 4 [ 반드시x ]
		// 4. 3 [ 동일한 괄호내 존재 ] 
		// 5. 1
			//this.내부변수명
			//this() : 내부의 빈생성자 호출
			//this( 데이터 , 데이터 )
		// 6. 4 
			// 메소드명은 중복가능 [ 오버로딩 ] 
			// 3 : 인수에 ··· 넣으면 자동으로 배열로 생성 
		// 7. 2
		// 8~11 : 
		// 12 : 필드 , 생성자 , 메소드 
		// 13 :
			/* String name; 
				String id;
				String password;
				int age;
			 */
		// 14 : 
			/*
			 * 	Member( String name , String id ){ 
			 * 		this.name = name;
			 * 		this.id = id;
			 * 	}
			 */
		// 15 :
			/*
			 * 	// 1. 로그인 메소드 [ 인수 : id , password 반환 : true ]
				boolean login( String id , String password ) {
					
					if( id.equals("hong") && password.equals("1234") ) {
						return true; // 동일할경우 true 리턴 
					}else {
						return false; // 동일하지 않을경우 fasle 리턴 
					}
				}
				// 2. 로그아웃 메소드 [ 인수 : id , 반환 x ] 
				void logout( String id  ) {
					System.out.println( id +" 님 로그아웃 되었습니다 ");
				}
			 */
		// 16~19 : 생략 
	
		// 20
	
	
	
}











