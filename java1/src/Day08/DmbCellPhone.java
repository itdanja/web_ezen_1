package Day08;

public class DmbCellPhone extends CellPhone  {
					// extents : �����ϴ� // ��� 1�� 

	// �ڵ��� �⺻��� => CellPhone ���
	// 1. �ʵ� 
	int channel;
	// 2. ������ 
	public DmbCellPhone( String model , String color , int channel ) {
	// this : ���� Ŭ������ ��� 
		// �θ� Ŭ������ ������ ������ 
	//		this.model = model;	// �θ�Ŭ������ ��� ��� 
	//		this.color = color;	// �θ�Ŭ������ ��� ��� 
	//		this.channel = channel; // ����Ŭ���� ��� ���
	//	
		// �θ� Ŭ������ ������ ������ => super() Ű���带 �̿��� �θ�Ŭ���� ������ȣ�� 
		super(model, color); // super( ) : �θ�Ŭ������ ������ ȣ�� 
		this.channel = channel;
	}

	// 3. �޼ҵ� 
	void turnOnDmb() {System.out.println("ä�� : " + channel +"�� DMB ��� ������ �����մϴ�");}
	void changeChannelDmb( int channl ) {
		this.channel = channl;
		// this.chaanel : �Ķ��� => ���� Ŭ������ ���
		// channel : ������ => �޼ҵ忡 �ܺηκ��� ���� ���� [ �μ� ]
		System.out.println("ä�� : "+channl +"������ �ٲߴϴ�");
	}
	void turnOffDmb() {System.out.println("DMB��� ������ ����ϴ�");}
	
	// �������̵� [ �θ�Ŭ������ �޼ҵ� ������ ] :�ڵ��ϼ� 
	
	@Override // ������=>�ڵ庯�� // @ : ������̼�
	void powerOn() {
		// super.powerOn(); // �θ�޼ҵ� ȣ�� 
		System.out.println("@���� �޼ҵ� ������ : DMB�� �մϴ�" );
	}
	
}








