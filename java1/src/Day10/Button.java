package Day10;

public class Button {
	
	// ��ø �������̽� : Ŭ���� ���ο� �������̽� ���� 
	interface OnClickListener{
		void onClick(); // �߻�޼ҵ� 
	}
	//1.�ʵ� :  �������̽� �ʵ� 
	OnClickListener listener;
	// 2. ������ 
	// 3. �޼ҵ� 
	void setOnClickCListener( OnClickListener listener ) {
		this.listener = listener;
	}
	void touch() {
		listener.onClick();
	}
	
	

}
