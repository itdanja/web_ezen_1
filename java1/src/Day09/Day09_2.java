package Day09;

public class Day09_2 {

	public static void main(String[] args) {
		
		// 1. �ڵ��� ��ü ���� 
		Car car = new Car();
		
		// 2. �ڵ��� 5�� ���� 
		for( int i = 1 ; i<=5 ; i++ ) {
			
			int probleLocation = car.run();
				// car ȸ�� �޼ҵ� ȣ�� �ؼ� ��ȯ�� ������ ����
			switch( probleLocation ) {
				case 1:
					System.out.println("�տ��� HankookTire �� ��ü ");
					car.frontLeftTire = new HankookTire(15, "�տ���");
					break;
				case 2:
					System.out.println("�տ����� KumhoTire �� ��ü ");
					car.frontRightTire = new KumhoTire(13, "�տ�����");
					break;
				case 3:
					System.out.println("�ڿ��� HankookTire �� ��ü ");
					car.backLeftTire = new HankookTire(14, "�ڿ���");
					break;
				case 4:
					System.out.println("�ڿ����� KumhoTire �� ��ü ");
					car.backRightTire = new KumhoTire(17, "�ڿ�����");
					break;
			}
			System.out.println("----------------------------");
		}
	}
	
}


	// p.338

		// 1. 1
		// 2. 2 
		// 3. 1 
		// 4. 4 
		// 5. 05 [ super(name) ]  : �ڽ�Ŭ�������� �θ�Ŭ������ ������ ȣ�� ���߱� ������ 
			// ���࿡ �θ�Ŭ������ �����ڰ� ������ �����Ͽ��� �߻����� ���� 
		// 6. 








