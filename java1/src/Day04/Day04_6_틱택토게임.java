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
		int count = 0 ; // ���� �� �� 
		
		while(true) {
			
			// 2. ������ ��� [ �ε����� 0������ �����ϱ� ������ for �ʱⰪ�� 0���� ���� ]
			for( int i = 0 ; i<������.length ; i++ ) {
				System.out.print( ������[i] );
				// 3ĭ���� �ٹٲ�
				if( i%3 == 2 ) System.out.println();
			}
				// 6. �¸��ڰ� �������� �������� 
				if( winner.equals("[O]") ) {
					System.out.println(" >>>> [[ �÷��̾� �¸� ]]");
					break;
				}else if( winner.equals("[X]")) {
					System.out.println(" >>>> [[ ��ǻ�� �¸� ]]");
					break;
				}

			// 3. �÷��̾ ��ġ�� �����Ͽ� ��[O] �α� 
			while(true) {
				System.out.print(" >> [�÷��̾� ����] ��ġ ���� : "); 
				int index = scanner.nextInt();
				// ������ ��ġ�� �̹� ���� ������쿡 �ٽ� �Է¹ޱ� ???
				if( ������[index].equals("[ ]") ) {
					������[index] = "[O]"; // �ش� ��ġ ������ ��� ����
					count++; // ���� �� ���� 1����
					break; // �������� ���� �ξ����� �ݺ��� ���� 
				}else {
					System.out.println(" >> [ �̹� �� �ڸ� �Դϴ� ] : �ٽ� ����");
				}
			}
				// 7. 9ĭ ���� ��� ���������� 
				if( count == 9 ) {
					
					// 2. ������ ��� [ �ε����� 0������ �����ϱ� ������ for �ʱⰪ�� 0���� ���� ]
					for( int i = 0 ; i<������.length ; i++ ) {
						System.out.print( ������[i] );
						// 3ĭ���� �ٹٲ�
						if( i%3 == 2 ) System.out.println();
					}
					
					System.out.println(" >>>> [[ ���º� ]]");
					break;
				}
				
			// 4. ��ǻ��[ 0~8 ���� ������ �����ؼ� ��[X] �α� ] 
			System.out.println(" >> [��ǻ�� ����] ��ġ ������ ");
			while(true) {
				Random random = new Random();
				int index = random.nextInt(9); // 0~8 ������ ���� ���� 
				if( ������[index].equals("[ ]") ) {
					count++; // ���� �� ���� 1����
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
			for( int i = 0 ; i<=2 ; i++  ) {
				if( ������[i].equals(������[i+3]) && ������[i+3].equals(������[i+6])) {
					if( !������[i].equals("[ ]") ) {
						// ! : ���� [ true => false ]
						winner = ������[i];
					}
				}
			}
				// 3. 0 4 8  // 2 4 6			 [�밢���� �̱�¼�]����� ������� �ش� ��� �¸�
			if( ������[0].equals(������[4]) && ������[4].equals(������[8]) ) {
				if( !������[0].equals("[ ]") ) {
					// ! : ���� [ true => false ]
					winner = ������[0];
				}
			}
			if( ������[2].equals(������[4]) && ������[4].equals(������[6])) {
				if( !������[2].equals("[ ]") ) {
					// ! : ���� [ true => false ]
					winner = ������[2];
				}
			}
			
		}
	}
}
