package Day13;

public class Day13_4 {
	
	public static void main(String[] args) {
		
		// �����׸� : ���׸��� �������
			// 1. Ÿ�� ��ȯ 
		//1. ��ü���� 
		Box box = new Box();
		//2. ��ü �޼ҵ� ȣ��
		box.set("ȫ�浿");				// ȫ�浿[String] -> object   [�ڵ�]
		String name = (String)box.get(); // object -> string		[����]

		box.set( new Apple() );
		Apple apple = (Apple)box.get();
		
		// ���׸� : ����ȯ�� ���� ��ü Ŭ���� ���� 
		Box2<String> box2 = new Box2<>();
		// Ŭ������<�Ű�Ŭ����> ������ = new ������<>();
		box2.set("hello");
		String str = box2.get();
		
		Box2<Integer> box22 = new Box2<>();
		box22.set( 6 );
		int value = box22.get();
		
		// ��Ƽ���׸� 
		Product< Tv , String > product1 = new Product<>();
		product1.setKind( new Tv() );
		product1.setModel("����Ʈtv");
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		Product< Car , String > product2 = new Product<>();
		product2.setKind( new Car() );
		product2.setModel("����");
		Car car = product2.getKind();
		String carmodel = product2.getModel();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
