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
			number[i] = scanner.nextInt(); // �Է¹��� ���� �ش� �ε��� �迭�� ���� 
			// �ߺ�üũ!!!!!!!
			
		}
	}
}
