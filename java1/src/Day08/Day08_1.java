package Day08;

public class Day08_1 {
		// ����Ŭ���� => main�޼ҵ�[ ������ ]
	
	public static void main(String[] args) {
		
		// ����Ŭ���� �̿��� ��ü ���� 
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);
		System.out.println("�� : " + dmbCellPhone.model );	// �θ� �ʵ� ����  // private ������ �ƴҰ�� ��� ���� ���� 
		System.out.println("���� : " + dmbCellPhone.color );	// �θ� �ʵ� ���� 
		
		System.out.println("ä�� : " + dmbCellPhone.channel ); // ���� �ʵ� 
		
		// �θ� �޼ҵ� 
		dmbCellPhone.powerOn(); 
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("�ȳ��ϼ���");
		dmbCellPhone.receiveVoice("�ȳ��ϼ��� ���� ȫ�浿 �Դϴ�" );
		dmbCellPhone.sendVoice("�ݰ����ϴ�");
		dmbCellPhone.hangUp();
		
		// ���� �޼ҵ� 
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
		
	}
	
}
