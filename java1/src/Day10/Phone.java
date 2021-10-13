package Day10;

public abstract class Phone {
	// abstract : 추상클래스 선언 
	
	// 1. 필드
	public String owner;

	//2. 생성자
	public Phone( String owner) {
		this.owner = owner;
	}
	//추상메소드 
	public abstract void sound();
	
	//3.메소드 
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
	
}
