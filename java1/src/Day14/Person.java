package Day14;

public class Person {
	//필드
	private String name;

	//생성자
	public Person(String name) {
		this.name = name;
	}
	//메소드 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
