package Day10;

public class Day10_4 {
	
	public static void main(String[] args) {
		
	Button button = new Button();
		// button ��ü�� �������̽� ����!!!!!! 
	button.setOnClickCListener( new CallListener() );
	button.touch();
	
	System.out.println("��ü�� �������̽��� ����� ������ü ���� ");
	button.setOnClickCListener( new MessageListener() );
	button.touch();
	
	}
}
