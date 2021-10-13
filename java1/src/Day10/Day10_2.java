package Day10;

public class Day10_2 {

	public static void main(String[] args) {
		
		// p.332 추상클래스 예제 
		// Phone phone = new Phone("유재석");		
			// 1. 추상클래스만으로 객체 생성 불가 
		
		SmartPhone smartPhone = new SmartPhone("유재석");
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
	}
	
}
