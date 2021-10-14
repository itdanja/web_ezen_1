package Day11;

public class Member2 implements Cloneable {
				// ���� �������̽� ���� 
	// �ʵ� 
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	// ������ 
	public Member2(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	// �޼ҵ� 
	public Member2 getMember2( ) {
		Member2 cloned = null; // �� ���� ����
		try {
			cloned = (Member2)clone(); // �Ϲݿ��� �߻�
					// �ش� �޼ҵ带 ȣ���� ��ü�� ���� 
					// clone(); ���� Cloneable �������̽� ���� 
		} catch (CloneNotSupportedException e) {}
		return cloned;
	}
	@Override
	public String toString() {
		System.out.println(" id: " + this.id);
		System.out.println(" name: " + this.name);
		System.out.println(" password: " + this.password);
		System.out.println(" age: " + this.age);
		System.out.println(" adult: " + this.adult);
		return "";
	}
	
	
	
}
