package Day09;

public class KumhoTire extends Tire {
	// �ʵ� 
	// ������ 
	public KumhoTire(int maxRotation, String location) {
		super(maxRotation, location);
		// TODO Auto-generated constructor stub
	}
	
	// �޼ҵ� 
	@Override
	public boolean roll() {
		
		++accumulatedRotation; 	// ���� ȸ���� ���� 
		if( accumulatedRotation < maxRotation ) {	// �ִ�ȸ���� �� ũ�� 
			System.out.println(location + "KumhoTire ���� : "
					+(maxRotation-accumulatedRotation)+"ȸ"); // ���� ���� ��� 
			return true; // true ������ ������ ǥ���ϴ� ��ȯ
		}else { // �ִ�ȸ������ �� ������
			System.out.println("*** " + location +" KumhoTire ��ũ *** ");
			return false; // false ������ ������ ǥ���ϴ� ��ȯ
		}
	
	}
	
	
	

}
