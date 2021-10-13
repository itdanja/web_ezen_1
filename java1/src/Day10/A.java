package Day10;

public class A {

	// 필드 
	int 필드 = 0;

	// 생성자 : 현재 클래스명과 이름이 동일하면 생성자 // 동일하지 않으면 메소드 
	A(){
		System.out.println(" A 객체가 생성됨");
	}
	
	// 인스턴스 멤버 클래스 // 
	class B{
		// 1.필드
		int field1;
		// 2.생성자 
		public B() {System.out.println(" B 객체가 생성됨");}
		// 3.메소드 
		void method1() {}
	}
	
	// 정적 멤버 클래스 // 
	static class C{
		//1. 필드
		int field1;
		static int field2;
		// 2. 생성자 
		public C() {System.out.println(" C 객체가 생성됨");}
		// 3. 메소드 
		void method1() {}
		static void method2() {}
	}
	
	// 3. 메소드 [ A클래스내 메소드 ]
	void method() {
		// 로컬 클래스 //
		class D{
			// 1. 필드
			int field1;
			// 2. 생성자 
			public D() {System.out.println(" D 객체가 생성됨");}
			// 3. 메소드 
			void method1() { System.out.println( 필드 );}	
		}
		// 메소드내 지역변수 
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
	
	
}




