package Day13;

public class Day13_����1  {
	
	public static void main(String[] args) {
		
		�������Ҹ� �������Ҹ� = new �������Ҹ�();
		����̼Ҹ� ����̼Ҹ� = new ����̼Ҹ�();
		ȣ���̼Ҹ� ȣ���̼Ҹ� = new ȣ���̼Ҹ�();
		
		�������Ҹ�.start();
		����̼Ҹ�.start();
		ȣ���̼Ҹ�.start();
		
		try {
			Thread.sleep(6000);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println( "������1 �̸� : "+ �������Ҹ�.getName() ) ;
		System.out.println( "������2 �̸� : "+ ����̼Ҹ�.getName() ) ;
		System.out.println( "������3 �̸� : "+ ȣ���̼Ҹ�.getName() ) ;
		
		
		
		
		
		
	}

}
