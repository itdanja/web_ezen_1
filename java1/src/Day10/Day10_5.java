package Day10;

public class Day10_5 {
	
	public static void main(String[] args) {
		
		Anonymous anonymous = new Anonymous();
		
		anonymous.field.wake(); // �͸� �ڽ� ��ü �� �޼ҵ� ȣ�� 
		anonymous.method1(); // ��ü�� �޼ҵ� ȣ�� => �޼ҵ峻 �͸�ü 
		anonymous.method2( 
				
			new Person() {
				void study() {
					System.out.println("�����մϴ�");
				}
				@Override
				void wake() {
					System.out.println("8�ÿ� �Ͼ�ϴ�");
					study();
				}
			}
	
		);
		
		
	}

}
