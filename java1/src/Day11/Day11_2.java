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
		
	}

}
