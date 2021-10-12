package Day09;

public class Parent {

	public String nation;
	
	public Parent() {
		this("대한민국"); // 현재 클래스내 생성자 
		System.out.println("parent call");
	}
	public Parent( String nation ) {
		this.nation = nation;
		System.out.println("parent  String nation call");
	}
	
	
}
