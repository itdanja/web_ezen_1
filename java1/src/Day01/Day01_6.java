package Day01;

import java.util.Scanner;

public class Day01_6 {
	//����3 : �ϳ��� �湮�� �Է¹޾� ����ϱ� 
	/*[�Է¹ޱ�] : �ۼ��� , ���� , ��¥ 
	 *[ ��� ] 
	 *	---------------�湮��--------------------
	 *  | ���� | �ۼ��� | 	���� 	| ��¥  |
	 *  |  1  | ��ȣ�� | �ȳ��ϼ��� | 09-28|
	 *  ----------------------------------------
	 */
	public static void main(String[] args) {
		
		// 1. �Է°�ü ���� 
		Scanner scanner = new Scanner(System.in);
		System.out.print(" �ۼ��� : ");	String writer = scanner.next();
			scanner.nextLine(); 
		System.out.print(" ���� : ");	String contents = scanner.nextLine();// ���� ���� o 
			// scanner.nextLine(); // next �������� nextLine ���� ���� �߻� 
				// �ذ��� : next �� nextLine ���̿� nextLine() �߰� 
		
		System.out.print(" ��¥ : ");	String date = scanner.next();
		// 2. ��� 
		System.out.println("------------ �湮�� -------------- ");
		System.out.println("| ���� | �ۼ��� | ���� \t | ��¥ |");
		System.out.println("|  1  | "+writer+" | " + contents + "\t | " + date +" |");
		System.out.println("--------------------------------- ");
	
	}
	
}
