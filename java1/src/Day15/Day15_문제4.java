package Day15;

import java.util.Scanner;
import java.util.Stack;

public class Day15_����4 {

	// ����4 : ���ñ����� �̿��� ���ڿ� ���� ��� 
		// [ ����1] ���ñ���
		// [ ����2] �Է¹��� ���ڿ��� ������� ���ÿ� ���� 
			// Char // String 
		// [ ����3 ] ���ڿ� �ݴ�� ��� 
		// [ ��� ���� ]
			// �Է� : ABC 
			// ��� : CBA 
	
	public static void main(String[] args) {
		
		// 0. ���� ��ü ���� 
		Stack<Character> stack = new Stack<>();
		
		// 1. �Է¹ޱ� 
		Scanner scanner = new Scanner(System.in);
		System.out.print("���ڿ� : "); String ���ڿ� = scanner.next();
		
		// 2. ���ڿ��� ���� �ϳ��� ���� ���� 
		for( int i = 0 ; i<���ڿ�.length() ; i++ ) {
			stack.push( ���ڿ�.charAt(i) );
				// ���ڿ�.charAt( �ε��� ) : ���ڿ��� i��° �ε����� ���� ����
			// ���ø�.puth( ���� ) : �ش� ���� ����  
		}
		
		// 3. ������ [ ���� ������ŭ POP ]
		for( int i = 0 ; i<���ڿ�.length() ;i++ ) {
			System.out.print( stack.pop() );
		}
	
		
	}
	
	
}





