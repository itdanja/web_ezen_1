package Day15;

import java.util.HashSet;
import java.util.Scanner;

public class Day15_����2 {

//	����2: set �÷���
//	* �ζ� ���α׷�
//		1. 6�� �Է¹޾� set �÷��ǿ� �����Ͽ� ��� 
//		[����] �ߺ��� ��� X
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<>();
		
		while(true) {
			System.out.print(" 1~45 ���� ����(�ߺ��Ұ�) : ");
			int num = scanner.nextInt();
			
			if( num < 1 || num > 45 ) {
				System.out.println("**�����Ҽ� ���� ��ȣ");
			}
			else {
				// �ߺ�Ȯ�� 
				if( set.contains(num) ) {
					System.out.println("** �ߺ� ��ȣ �Դϴ�");
				}else {
					set.add(num);
					System.out.println(" Ȯ�� : "+ set );
				}
			}
			// ���ѷ��� ������ ���� : 6�� ��� �Է� �Ǿ�����
			if( set.size() == 6 ) break;
		}
	}
}
