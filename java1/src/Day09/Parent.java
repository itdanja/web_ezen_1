package Day09;

public class Parent {

	public String nation;
	
	public Parent() {
		this("���ѹα�"); // ���� Ŭ������ ������ 
		System.out.println("parent call");
	}
	public Parent( String nation ) {
		this.nation = nation;
		System.out.println("parent  String nation call");
	}
	
	
}
