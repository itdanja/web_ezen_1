package Day11;

public class Member {

	public String id;
	
	public Member( String id ) {
		this.id = id;
	}
	
	// object Ŭ������ �޼ҵ�[equals] �������̵�
	@Override
	public boolean equals(Object obj) { // ���� ��ü�� �μ��� ���� [ �񱳴�� ]
		if( obj instanceof Member ) { // instanceof : ��Ӱ��� Ȯ�� Ű���� 
			// Member Ŭ������ obj ���ԵǾ� �ִ��� Ȯ�� [true,false]
			Member member = (Member)obj;
			// �μ��� ��ü�� ��������ȯ
			if( id.equals(member.id)) {
			// ����Ŭ������ ������ �μ��� ������ �� 
				return true;
			}
		}
		return false;
	}
	@Override
	public String toString() {
		return "���� ��ü�� ����� �ʵ�� : " + this.id;
	}
	
	
	
	
	
	
	
}
