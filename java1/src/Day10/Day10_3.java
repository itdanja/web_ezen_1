package Day10;

import Day10.A.B;
import Day10.A.C;

public class Day10_3 {
	
	public static void main(String[] args) {
		
		// p.394 : ��øŬ���� 
		A a = new A(); // AŬ������ �޸��Ҵ�ɶ� ��ø�� Ŭ�������� �޸��Ҵ�X
			
		// 2. �ν��Ͻ� ��� Ŭ���� ��ü ���� 
		A.B b = a.new B();	// �ν��Ͻ� Ŭ���� 
		// A.B b2 = new A.B(); // ���� Ŭ���� 
			b.field1 = 3;
			b.method1();
	
		
		// 3. ���� ��� Ŭ���� ��ü ���� 
		A.C c = new A.C(); 
		c.field1 = 3;
		c.method1();
		
		A.C.field2 = 3; // static : ��ü �������� ���� ���� 
		A.C.method2();
		
		// 4. ���� Ŭ���� ��ü ���� 
		a.method();
		
		
	}

}
