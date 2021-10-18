package Day13;

public class Day13_4 {
	
	public static void main(String[] args) {
		
		// 비제네릭 : 제네릭이 없을경우
			// 1. 타입 변환 
		//1. 객체생성 
		Box box = new Box();
		//2. 객체 메소드 호출
		box.set("홍길동");				// 홍길동[String] -> object   [자동]
		String name = (String)box.get(); // object -> string		[강제]

		box.set( new Apple() );
		Apple apple = (Apple)box.get();
		
		// 제네릭 : 형변환이 많은 객체 클래스 사용시 
		Box2<String> box2 = new Box2<>();
		// 클래스명<매개클래스> 변수명 = new 생성자<>();
		box2.set("hello");
		String str = box2.get();
		
		Box2<Integer> box22 = new Box2<>();
		box22.set( 6 );
		int value = box22.get();
		
		// 멀티제네릭 
		Product< Tv , String > product1 = new Product<>();
		product1.setKind( new Tv() );
		product1.setModel("스마트tv");
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		Product< Car , String > product2 = new Product<>();
		product2.setKind( new Car() );
		product2.setModel("디젤");
		Car car = product2.getKind();
		String carmodel = product2.getModel();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
