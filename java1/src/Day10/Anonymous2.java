package Day10;

public class Anonymous2 {

	// �ʵ� => �͸� ���� ��ü
	Vehicle field = new Vehicle() {
		@Override
		public void run() {
			System.out.println("�����Ű� �޸��ϴ�.");
		}
	}; // ���� �� 
	
	// �������� => �޼ҵ� �ȿ��� �͸� ���� ��ü 
	void method1() {
		Vehicle localVar = new Vehicle() {
			@Override
			public void run() {
				System.out.println("�¿����� �޸��ϴ�");
			}
		}; // ���� ��
		localVar.run();
	}
	// �Ű����� => �޼ҵ忡 �͸� ���� ��ü�� ���� �ޱ�[�μ����Ű�����] 
	void method2( Vehicle vehicle ) { vehicle.run(); }
}
