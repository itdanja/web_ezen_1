package Day06;

public class Day06_4 {

	// p.235
	public static void main(String[] args) {
		
		// 1. ��ü �����
		Car5 car5;
		Car5 myCar = new Car5("������");
		Car5 yourCar = new Car5("����");
		
		// 2. ��ü�� ���� �޼ҵ� ȣ�� 
		myCar.run();
		yourCar.run();
		
	}
	
	// p.277 : Ȯ�ι��� 
		// 1. �ϳ��� Ŭ�����κ��� ������ ��ü���� ���� 
		// 2. 4
		// 3. 4 [ �ݵ��x ]
		// 4. 3 [ ������ ��ȣ�� ���� ] 
		// 5. 1
			//this.���κ�����
			//this() : ������ ������� ȣ��
			//this( ������ , ������ )
		// 6. 4 
			// �޼ҵ���� �ߺ����� [ �����ε� ] 
			// 3 : �μ��� ������ ������ �ڵ����� �迭�� ���� 
		// 7. 2
		// 8~11 : 
		// 12 : �ʵ� , ������ , �޼ҵ� 
		// 13 :
			/* String name; 
				String id;
				String password;
				int age;
			 */
		// 14 : 
			/*
			 * 	Member( String name , String id ){ 
			 * 		this.name = name;
			 * 		this.id = id;
			 * 	}
			 */
		// 15 :
			/*
			 * 	// 1. �α��� �޼ҵ� [ �μ� : id , password ��ȯ : true ]
				boolean login( String id , String password ) {
					
					if( id.equals("hong") && password.equals("1234") ) {
						return true; // �����Ұ�� true ���� 
					}else {
						return false; // �������� ������� fasle ���� 
					}
				}
				// 2. �α׾ƿ� �޼ҵ� [ �μ� : id , ��ȯ x ] 
				void logout( String id  ) {
					System.out.println( id +" �� �α׾ƿ� �Ǿ����ϴ� ");
				}
			 */
		// 16~19 : ���� 
	
		// 20
	
	
	
}











