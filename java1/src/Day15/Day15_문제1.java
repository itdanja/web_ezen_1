package Day15;

import java.util.ArrayList;
import java.util.Scanner;

public class Day15_����1 {
//	����1: list �÷��� 
//	*����� ���α׷�
//	[ �޴� ]
//		1. ��� �߰� ( �ο����� �Է¹޾� ����ȣ[�ε���] ��ȯ )
//		2. ��� ��� ( ����ȣ �Է¹޾� ��� ��� )
//		[������] 
//		3. ��� ����( ����ȣ 1������ ���� ������ ���� ��� )
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// 0. ����Ʈ ��ü�� Interger ��ü���� ����
		ArrayList<Integer> list = new ArrayList<>();
		while(true) {
			////////////////////////////////////////////////////////////
			System.out.println(" ----- ��� ��Ȳ ------ ");
			for( int i = 0 ; i<list.size() ; i++ ) {
				System.out.println("����ȣ : "+ (i+1) +"�� " + " �ο� : " + list.get(i) );
			}
			///////////////////////////////////////////////////////////
			System.out.println("1.����߰� 2.������ 3.[������]������� ");
			int ch = scanner.nextInt();
			if( ch == 1 ) {  
				System.out.print(" �ο��� : "); int count = scanner.nextInt();
				// 1. ����Ʈ�� ��ü ����
				list.add( count );
				System.out.println(" **������ ����ȣ : " + list.size() );
			}
			else if( ch == 2 ) {
				System.out.print(" ����� ����ȣ : " ); int num = scanner.nextInt();
				// 2. ����Ʈ�� ��ü ���� 
				list.remove(num-1); // -1 �� �ϴ� ���� [ ����ȣ�� 1����  // �ε��� 0���� ]
				System.out.println(" **��� �Ǿ����ϴ� ");
			}
			else if( ch == 3 ) {
				if( list.isEmpty() ) {
					System.out.println(" ** ������� ���� �����ϴ� ");
				}else {
					System.out.println(" ** ����ȣ 1�� ���� ");
					list.remove(0); // ����ȣ 1�� ���� 
				}
			}
			
		} // while end 
	} // main end 
} // class end 
