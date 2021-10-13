package Day10;

public class Button {
	
	// 중첩 인터페이스 : 클래스 내부에 인터페이스 선언 
	interface OnClickListener{
		void onClick(); // 추상메소드 
	}
	//1.필드 :  인터페이스 필드 
	OnClickListener listener;
	// 2. 생성자 
	// 3. 메소드 
	void setOnClickCListener( OnClickListener listener ) {
		this.listener = listener;
	}
	void touch() {
		listener.onClick();
	}
	
	

}
