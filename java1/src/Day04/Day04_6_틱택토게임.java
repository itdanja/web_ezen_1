package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_6_ƽ������� {
	
	// �迭�� �̿��� ƽ������� ���α׷� 	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// 1. ������ ���� [9ĭ ���� ]
		// String ��ü 9���� �����ϴ� �迭 ���� 
		String[] ������ = {   "[ ]" , "[ ]" , "[ ]" ,
							"[ ]" , "[ ]" , "[ ]" ,
							"[ ]" , "[ ]" , "[ ]" , } ;
		
		String winner = ""; // �¸� ���� ���� ���� 
		
		while(true) {
			
			// 2. ������ ��� [ �ε����� 0������ �����ϱ� ������ for �ʱⰪ�� 0���� ���� ]
			for( int i = 0 ; i<������.length ; i++ ) {
				System.out.print( ������[i] );
				// 3ĭ���� �ٹٲ�
				if( i%3 == 2 ) System.out.println();
			}
			
			// 3. �÷��̾ ��ġ�� �����Ͽ� ��[O] �α� 
			while(true) {
				System.out.print(" >> [�÷��̾� ����] ��ġ ���� : "); 
				int index = scanner.nextInt();
				// ������ ��ġ�� �̹� ���� ������쿡 �ٽ� �Է¹ޱ� ???
				if( ������[index].equals("[ ]") ) {
					������[index] = "[O]"; // �ش� ��ġ ������ ��� ���� 
					break; // �������� ���� �ξ����� �ݺ��� ���� 
				}else {
					System.out.println(" >> [ �̹� �� �ڸ� �Դϴ� ] : �ٽ� ����");
				}
			}
			// 4. ��ǻ��[ 0~8 ���� ������ �����ؼ� ��[X] �α� ] 
			System.out.println(" >> [��ǻ�� ����] ��ġ ������ ");
			while(true) {
				Random random = new Random();
				int index = random.nextInt(9); // 0~8 ������ ���� ���� 
				if( ������[index].equals("[ ]") ) {
					������[index] = "[X]"; break;
				}
			}
			// 5. �¸��� �Ǵ� 
				// 1. 0 1 2  // 3 4 5 // 6 7 8  [���η� �̱�¼�] ����� ������� �ش� ��� �¸�
			for( int i = 0 ; i<=6 ; i+=3 ) {
				if( ������[i].equals(������[i+1] ) && ������[i+1].equals(������[i+2])  ) {
					if( !������[i].equals("[ ]") ) {
						// ! : ���� [ true => false ]
						winner = ������[i];
					}
				}
			}
				// 2. 0 3 6  // 1 4 7 // 2 5 8   [���η� �̱�¼�] ����� ������� �ش� ��� �¸�
				// 3. 0 4 8  // 2 4 6			 [�밢���� �̱�¼�]����� ������� �ش� ��� �¸�
			
			// 6. �¸��ڰ� �������� �������� 
			if( winner.equals("[O]") ) {
				System.out.println(" >>>> [[ �÷��̾� �¸� ]]");
				break;
			}
		}
	}
}
