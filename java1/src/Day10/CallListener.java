package Day10;

import Day10.Button; // Button 클래스 가져오기 

public class CallListener implements Button.OnClickListener {
									// 클래스명.내부인터페이스 
	@Override
	public void onClick() {
		System.out.println("전화를 겁니다");
	}
}
