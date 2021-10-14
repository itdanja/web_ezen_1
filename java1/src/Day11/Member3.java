package Day11;

import java.util.Arrays;

public class Member3 implements Cloneable {

	// 필드 
	public String name;
	public int age;
	public int[] scores; // 깊은복제
	public Car car;		// 깊은복제 
	// 생성자 
	public Member3(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	// 메소드 
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//1. 얕은 복사를 통해 name, age 복사 
		Member3 cloned = (Member3)super.clone();
		//2. 깊은복제
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
					// Arrays.copyOf( 복제대상 , 복제대상길이 )
		//3. 깊은복제
		cloned.car = new Car( this.car.model);
		
		return cloned;
	}
	
	public Member3 getMember3( ) {
		Member3 cloned = null; // 빈 변수 생성
		try {
			cloned = (Member3)clone(); // 일반예외 발생
					// 해당 메소드를 호출한 객체를 복제 
					// clone(); 사용시 Cloneable 인터페이스 연결 
		} catch (CloneNotSupportedException e) {}
		return cloned;
	}
	@Override
	public String toString() {
		System.out.println(" name: " + this.name);
		System.out.println(" age: " + this.age);
		System.out.println(" array : " + this.scores );
		System.out.println(" car : " + this.car.model);
	
		return "";
	}
	
	
	
	
	

}
