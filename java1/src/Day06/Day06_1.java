package Day06;

public class Day06_1 {
	
	public static void main(String[] args) {
		
	
	// P.195
	// 1. ��ü ����� : Ŭ���� �̿��� �޸� �Ҵ� 
		Student student = new Student();
		//Ŭ������ ��ü�� = new ������();
			// Ŭ������ == �����ڸ� 
		System.out.println(" student ������ Student ��ü�� �����մϴ� ");
		
		Student student2 = new Student();
		System.out.println(" student ������ �� �ٸ� Student ��ü�� �����մϴ� ");
	
		System.out.println(" ��ü�̸� ��� : " + student );
			// ���� 
				// 0 , 1 : 2���� [ ���� ]
				// 0 ~ 7 : 8���� 
				// 0 ~ 9 : 10���� 
				// 0 ~ 9 a b c d e f : 16���� 
		
	
	// p.201	
		// 1. �ڵ��� ��ü ����� 
		Car car = new Car();
		
		// 2. ��ü�� ���[�ʵ�] ȣ�� 
		System.out.println("����ȸ�� : " + car.company );
		System.out.println("�𵨸� : " + car.model );
		System.out.println("���� : " + car.color );
		System.out.println("�ְ�ӵ� : " + car.maxSpeed );
		System.out.println("����ӵ� : " + car.speed );
	
		// 3. ��ü�� ���[�ʵ�] �� ���� 
		System.out.println(" >>>> �ӵ� ���� ");
		car.speed = 60 ;
		System.out.println("������ �ӵ� : " + car.speed );
		
	// p.205 : �����ڸ� �̿��� ��ü ���� 
		Car2 car2 = new Car2("����", 3000); // ������ 
		
	// p.207 : ������ => �ʵ� �ʱ�ȭ 
		
		Korean korean = new Korean("���ڹ�", "011225-1234567");
		System.out.println("korean1 name : " + korean.name );
		System.out.println("korean1 ssn : " + korean.ssn);
		
		Korean korean2 = new Korean("���ڹ�","930525-0654321");
		System.out.println("korean2 name : " + korean2.name );
		System.out.println("korean2 ssn : " + korean2.ssn);
		
		// ����ִ� ��ü [ ������� ] 
		Korean korean3 = new Korean();
		korean3.name = "���ڹ�";
		korean3.ssn = "011225-1234567";
		System.out.println("korean3 name : " + korean.name );
		System.out.println("korean3 ssn : " + korean.ssn);
		
	}
	
}










