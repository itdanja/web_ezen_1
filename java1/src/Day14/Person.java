package Day14;

public class Person {
	//�ʵ�
	private String name;

	//������
	public Person(String name) {
		this.name = name;
	}
	//�޼ҵ� 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
