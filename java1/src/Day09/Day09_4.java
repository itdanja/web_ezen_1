package Day09;

public class Day09_4 {
	
	// �������̽� : ��ü�� ������� �����ϴ� Ÿ�� 
		// ���� : Ŭ�������� �����ؾ� �ϴ� ������ �����ϴµ� ���Ǵ� �߻��ڷ� 
		// �߻�????? : 
		// �� : ������
			// �������̽�[��ư] = �̵���ư , ���ݹ�ư , ����ư  
			// Ŭ����[���ӵ�] = ������� , ��ɰ��� , RPG����
				// ������ �������� ���δٸ� Ŭ�������� ����
		// implements : �����ϴ�
			// �߻�޼ҵ� : ���� �ִ� �޼ҵ� => ����� Ŭ���������� ���� 
			// �߻�޼ҵ� ����
		// �������̽��� ȥ�ڼ� ��ü ����x
	
	public static void main(String[] args) {
		
		// p.347 ~ 354
			// 1. �������̽� ���� : RemoteControl
			// 2. Ŭ���� ���� : Television implements RemoteControl
			// 3. Ŭ���� ���� : Audio implements RemoteControl
		// 1. ������ ���� [ �޸� �Ҵ� x] 
		RemoteControl rc;
		// 2. �������� �ڷ����� Ŭ���� ���� 
		rc = new Television(); // �ش� �������� �ڷ��������� ��� 
			// �ڷ����� ������ ���
			rc.turnOn();
			rc.turnOff();
			rc.setVolume(5);
		// 3. �ڷ����� �������� ����� ������ ���� 
		System.out.println(" ** �������� ����� �������� �����մϴ�!! ");
		rc = new Audio();
			// ����� ������ ��� 
			rc.turnOn();
			rc.turnOff();
			rc.setVolume(15);
		
	}
	
}
