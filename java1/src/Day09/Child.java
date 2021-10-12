package Day09;

public class Child extends Parent {

	private String name;
	
	public Child() {
		this("ȫ�浿");
		System.out.println("child call");
	}
	
	public Child( String name) {
		this.name = name;
		System.out.println(" child String name call");
	}
	
	
	
	
	
}
