package Day10;

import Day10.Button; // Button Ŭ���� �������� 

public class CallListener implements Button.OnClickListener {
									// Ŭ������.�����������̽� 
	@Override
	public void onClick() {
		System.out.println("��ȭ�� �̴ϴ�");
	}
}
