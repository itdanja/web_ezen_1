package Day10;

public class A {

	// �ʵ� 
	int �ʵ� = 0;

	// ������ : ���� Ŭ������� �̸��� �����ϸ� ������ // �������� ������ �޼ҵ� 
	A(){
		System.out.println(" A ��ü�� ������");
	}
	
	// �ν��Ͻ� ��� Ŭ���� // 
	class B{
		// 1.�ʵ�
		int field1;
		// 2.������ 
		public B() {System.out.println(" B ��ü�� ������");}
		// 3.�޼ҵ� 
		void method1() {}
	}
	
	// ���� ��� Ŭ���� // 
	static class C{
		//1. �ʵ�
		int field1;
		static int field2;
		// 2. ������ 
		public C() {System.out.println(" C ��ü�� ������");}
		// 3. �޼ҵ� 
		void method1() {}
		static void method2() {}
	}
	
	// 3. �޼ҵ� [ AŬ������ �޼ҵ� ]
	void method() {
		// ���� Ŭ���� //
		class D{
			// 1. �ʵ�
			int field1;
			// 2. ������ 
			public D() {System.out.println(" D ��ü�� ������");}
			// 3. �޼ҵ� 
			void method1() { System.out.println( �ʵ� );}	
		}
		// �޼ҵ峻 �������� 
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
	
	
}




