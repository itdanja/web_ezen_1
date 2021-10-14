package Day11;

public class Member2 implements Cloneable {
				// 복제 인터페이스 연결 
	// 필드 
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	// 생성자 
	public Member2(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	// 메소드 
	public Member2 getMember2( ) {
		Member2 cloned = null; // 빈 변수 생성
		try {
			cloned = (Member2)clone(); // 일반예외 발생
					// 해당 메소드를 호출한 객체를 복제 
					// clone(); 사용시 Cloneable 인터페이스 연결 
		} catch (CloneNotSupportedException e) {}
		return cloned;
	}
	@Override
	public String toString() {
		System.out.println(" id: " + this.id);
		System.out.println(" name: " + this.name);
		System.out.println(" password: " + this.password);
		System.out.println(" age: " + this.age);
		System.out.println(" adult: " + this.adult);
		return "";
	}
	
	
	
}
