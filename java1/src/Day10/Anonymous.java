package Day10;

public class Anonymous {
	
	// �ʵ� 
	Person person = new Person(); // ��ü
	// �͸� �ڽ� ��ü : ��ȸ�� 
	Person field = new Person() {
		// �޼ҵ� 
		void work() {
			System.out.println("����մϴ�");
		}
		@Override // �޼ҵ� : �������̵� 
		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�");
			work();
		}
	}; // �͸�ü ���� �� 
	// ������ 
	// �޼ҵ� 
	void method1() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("��å�� �մϴ�");
			}
			@Override
			void wake() {
				System.out.println("7�ÿ� �Ͼ�ϴ�.");
				walk();
			}			
		};
		localVar.wake();
	}
	void method2( Person person ) {
		person.wake();
	}
	
	
	
	
	
	
	
}
