package Day11;

public class Day11_2 {
	
	public static void main(String[] args) {
		
		// API : 
			// ���̺귯�� : ������� Ŭ���� , �������̽� 
		// Object Ŭ���� 
			// 1. equals() : ��ü �� 
		
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if( obj1.equals(obj2) ) {
			System.out.println("1.�� ��ü�� �����մϴ�");
		}else {
			System.out.println("1.�� ��ü�� �ٸ��ϴ�.");
		}
		
		if( obj1.equals(obj3) ) {
			System.out.println("2.�� ��ü�� �����մϴ�");
		}else {
			System.out.println("2.�� ��ü�� �ٸ��ϴ�.");
		}
			// 2. toString() : ��ü���� 
				// ��ü�� �ּҰ� [ �ڷ������� �� ȣ�� ] 
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());
		String ���ڿ� = "���缮";
		System.out.println( ���ڿ�.toString() );
			
			// 3. clone() : ��ü ���� 
				// 1. ���� ���� : �迭 ��ü�� ���� �Ұ� [ �ּҸ� ���� ]
				// 2. ���� ���� : �迭 ��ü�� ���� ���� 
		// 1. ��ü ���� 
		Member2 original = new Member2("blue", "ȫ�浿", "12345", 25, true);
		
		// 2. ��ü ���� 
		Member2 cloned = original.getMember2();
		cloned.password="67890";
		
		System.out.println("---------------������ ��ü ���� ");
		cloned.toString();
		
		System.out.println("---------------���� ��ü ���� ");
		original.toString();
		
			// 3_1 ���� ���� 
		// 1. ��ü ���� 
		Member3 original2 = new Member3("ȫ�浿", 25, 
				new int[] {90,90}, new Car("�ҳ�Ÿ"));
		// 2. ���� ���� 
		Member3 cloned2 = original2.getMember3();
		cloned2.scores[0] = 100;
		cloned2.car.model ="�׷���";
		
		System.out.println(" ----- ���� ��ü ");
		original2.toString();
		
		System.out.println(" ----- ���� ���� ��ü");
		cloned2.toString();
		
			// finalize() : ��ü �Ҹ��� 
		cloned2 = null; // �ش� ��ü�� null
		System.gc(); // �ڵ�����
			// null ��ü�� �� �޸�
				// ���� : ������,�ּҰ�  
				// �� : �� 
					// int ������ = 10;
						// ���� : ������ , ������ �� �ּҰ�
						// �� : [�ּҸ� �������ִ� �޸�] : ��
		cloned2 = original2.getMember3(); // �޸� �Ҵ� 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
