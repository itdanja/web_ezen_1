package Day14;

public class Person<T> {
	//�ʵ�
	private String name;
	private int age;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	//������
	public Person(String name ) {
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
