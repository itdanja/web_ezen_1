package Day13;

public class CalcThread extends Thread {

	// ������
	public CalcThread( String name) {
		super.setName( name );
		// super.�޼ҵ�() : �θ�Ŭ������ �޼ҵ� ���� 
	}
	
	@Override
	public void run() {
		for( int i = 0 ; i<2000000000; i++ ) {}
						// 20��ȸ �ݺ� 
		System.out.println("�ݺ��� ���� :" + getName() );
		
	}
	
	
}
