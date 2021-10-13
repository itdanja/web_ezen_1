package Day10;

public class Day10_4 {
	
	public static void main(String[] args) {
		
	Button button = new Button();
		// button 객체내 인터페이스 존재!!!!!! 
	button.setOnClickCListener( new CallListener() );
	button.touch();
	
	System.out.println("객체내 인터페이스와 연결된 구현객체 변경 ");
	button.setOnClickCListener( new MessageListener() );
	button.touch();
	
	}
}
