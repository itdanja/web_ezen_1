package Day05;

import java.util.Scanner;

public class Day05_2_ȸ�����湮�� {
	
	public static void main(String[] args) {
		
		// 0.�Է� ��ü
		Scanner scanner = new Scanner(System.in);
		
		// 1. ȸ�� 100��[id,pw] �����ϴ� ��� ���� 
		String[][] ȸ����� = new String[100][2]; // 100�� * 2�� => 200ĭ 
		
		// 2. �޴� => �޴��� ��� �ݺ�����  : ���ѷ��� [ while ] 
		while(true) {
			System.out.println("\n\n\t - ȸ���� �湮�� - ");
			System.out.println("-------------------------------");
			System.out.print(" [[ 1.ȸ������ 2.�α���  ���� : ");
			int ch = scanner.nextInt(); 
			// 3. �Է¿� ���� �� ���� 
			switch(ch) {
				case 1 : 
					System.out.println(" - ȸ������ ������ "); 
					System.out.println(" Id : ");	String id = scanner.next();
					System.out.println(" Password : "); String pw = scanner.next();
					
					// id �ߺ�üũ [ �迭�� ��� �ε����� �����ؼ� ������ ���̵� �ִ��� üũ ]
					boolean idcheck = true; // �ߺ�üũ ���� 
					for( int i = 0  ;  i<ȸ�����.length ; i++ ) {  // ȸ�����.length : �迭�� ���α��� => 100
						if( ȸ�����[i][0] != null && ȸ�����[i][0].equals(id) ) { // i��° id�� �����ϸ� 
							System.out.println("[[�˸�]] : �ߺ��� ���̵� �����մϴ� ");
							idcheck = false;
							break; // �ߺ�ã�� for ���� 
						}
					}
					// �ߺ�üũ ������ true�̸� �迭�� �� ������ ã�Ƽ� ���� 
					if( idcheck ) {
						for( int i = 0 ; i<ȸ�����.length ; i++ ) {
							if( ȸ�����[i][0] == null ) { // i��°�� �����̸� 
								ȸ�����[i][0] = id ; ȸ�����[i][1] = pw;
								System.out.println("[[�˸�]] : ȸ�������� �Ǿ����ϴ�");
								break; // �����ϱ� for ���� 
							}
						}
					}
					break;
				
				case 2 :
					System.out.println(" - �α��� ������ "); break;
				default :
					System.out.println("[[�˸�]] : �˼� ���� ��ȣ �Դϴ� ");
			}
		}
		
		
		
		
		
	}

}
