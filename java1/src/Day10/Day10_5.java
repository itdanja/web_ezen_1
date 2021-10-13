package Day10;

public class Day10_5 {
	
	public static void main(String[] args) {
		
		Anonymous anonymous = new Anonymous();
		
		anonymous.field.wake(); // 익명 자식 객체 내 메소드 호출 
		anonymous.method1(); // 객체내 메소드 호출 => 메소드내 익명객체 
		anonymous.method2( 
				
			new Person() {
				void study() {
					System.out.println("공부합니다");
				}
				@Override
				void wake() {
					System.out.println("8시에 일어납니다");
					study();
				}
			}
	
		);
		
		
	}

}
