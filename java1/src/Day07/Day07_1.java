package Day07; // ���� Ŭ������ ��Ű�� ��ġ 

import java.util.Arrays;
import java.util.Random;
// �ٸ� ��Ű���κ��� Ŭ���� �������� 
import java.util.Scanner;

import Day06.Account;
import Day06.Student; // import ��Ű����.Ŭ����

public class Day07_1 {

	// Day06 : Ŭ���� [ ���赵 : �ڷ��� ����� ]
		// 1. ��� ( ���û���o �ʼ�x )
			// 1. �ʵ� : ������ ���� [ �޸��Ҵ� ]
			// 2. ������ : ������ �ʱⰪ [ ��ü �ʵ� �ʱⰪ ]  
			// 3. �޼ҵ� : ������ ���� 
				// ��ȯŸ�� �޼ҵ��( �μ�1 , �μ�2 , �μ�3 ~~~ ) { return ��ȯ��   }
		// 2. ��ü(Ŭ������ �ν��Ͻ�) ����
			// Ŭ������ ��ü��
				// ��ü�� = new ������(); 	<---- �ν��Ͻ� 
			// ��ü�� ��� ���� [ ��ü��.��� ���ٿ����� ]

	public static void main(String[] args) {
		// p.236
		// p.238
		double result = 10 * 10 *Calculator.pi;
			// �ش� Ŭ������ ��� ���� ��� 
				// 1. ��ü ���� [ �ش� Ŭ�����κ��� �޸� �Ҵ� ]
				// 2. static[ �������� ] : ���α׷� ���۽� �޸� �Ҵ� [ main ���ຸ�� �켱 ]
		
		int result2 = Calculator.plus( 10 , 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result1 : " + result);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result2);
		
		// p.245
		Person p1 = new Person("123456-1234567", "���");
		
		// �ʵ� ȣ�� 
		System.out.println(p1.nation + " " + p1.ssn+" " + p1.name);
		
		// �ʵ� ���� [ final �ʵ�� ���� �Ұ� => ��� �����  ] 
			//p1.nation = "usa";
			//p1.ssn="654321-7654321";
		p1.name="��������";
		
		// p.253 : import : �ٸ� ��Ű���κ��� Ŭ���� �������� Ű���� 
			// 1. import ��Ű����.Ŭ������ [ Ŭ���� �ܺο� �ۼ� ] 
			// 2. ��Ű����.Ŭ������ ��ü�� ; [Ŭ���� ���ο� �ۼ� ]
		
		
	}			
		


}





