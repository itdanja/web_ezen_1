package Day04;

import java.util.Scanner;

public class Day04_7_�ζ��Ǻ��� {

	public static void main(String[] args) {
		
		// 0. �Է°�ü 
		Scanner scanner = new Scanner(System.in);
		// 0. �迭    [  �迭���� : �ڷ���[] �迭�� = new �ڷ���[����]   ] 
		int[] number = new int[6]; // int�� 6�� ������ �����Ҽ� �ִ� �迭 
		
		// 1. ����ڷκ��� 6�� ���� �Է¹޾� �迭�� ���� 
		for( int i = 0 ; i<6 ; i++) {
			System.out.print(i+"��° ��ȣ[1~45] ���� : "); 
			
			int num = scanner.nextInt();
			if( num < 1 || num > 45 ) { // 1 ~ 45 ���̰� �ƴҰ�� 
				System.out.println(" [[ �˸� ]] : 0 ~ 45 ���̸� �Է� ���� �մϴ� : �ٽ� �Է� ");
				i--; // �������� �Է��� �ƴϱ� ������ i ����
				continue;
			}
			Boolean check = true; // �ߺ��� ������� true �ߺ��� �������� false
			// �ߺ�üũ!!!!!!! : ���࿡ �Է��� ���� �迭�� ������ ���� �����ϸ� �ٽ� �Է� 
			for( int j = 0 ; j<6 ; j++ ) {
				if( num == number[j] ) { // �ߺ�ã�� ���� 
					System.out.println(" [[ �˸� ]] : ������ ���� �̹� ���� �մϴ� : �ٽ� �Է� " );
					i--;  // �������� �Է��� �ƴϱ� ������ i ����
					check = false; // �ߺ��� �ִ°�� 
					break;
				}
			}
			// 1~45 ���� �� �̸鼭 �ߺ����� �ƴϸ� i��° �迭�� ���� 
			if( check ) number[i] = num;
		}
		// 2. ��� 
		System.out.print(" ����ڰ� ������ �� : ");
		for( int i = 0 ; i<6 ; i++ ) {
			System.out.print( number[i] +" ");
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
}
