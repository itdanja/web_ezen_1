package Day09;

public class Car {
	
	//�ʵ� [ ���� , �迭 , ��ü �� ]
	Tire frontLeftTire = new Tire(6, "�տ���");
	Tire frontRightTire = new Tire(2, "�տ�����");
	Tire backLeftTire = new Tire(3, "�ڿ���");
	Tire backRightTire = new Tire(4, "�ڿ�����");
	//������
	//�޼ҵ�
	int run( ) { // ���������� ������ => �⺻��: default
		System.out.println("[�ڵ����� �޸��ϴ�]");
		if( frontLeftTire.roll() == false ) { stop(); return 1; }
		if( frontRightTire.roll() == false ) { stop(); return 2; }
		if( backLeftTire.roll() == false ) { stop(); return 3; }
		if( backRightTire.roll() == false ) { stop(); return 4; }
		return 0;
	}
	
	void stop() {
		System.out.println("[�ڵ����� ����ϴ�]");
	}
	
}
