package Day05;

import java.util.Scanner;

public class Day05_2_ȸ�����湮�� {
	
	public static void main(String[] args) {
		
		// 0.�Է� ��ü
		Scanner scanner = new Scanner(System.in);
		
		// 1. ȸ�� 100��[id,pw] �����ϴ� ��� ���� 
		String[][] ȸ����� = new String[100][2]; // 100�� * 2�� => 200ĭ 
		// 1. �湮�� 100��[contents , writer ] �����ϴ� ��� ���� 
		String[][] �湮�� = new String[100][2];
		
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
					System.out.print(" Id : ");	String id = scanner.next();
					System.out.print(" Password : "); String pw = scanner.next();
					
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
					System.out.println(" - �α��� ������ "); 
					// 1. �Է� -> ����
					System.out.print(" Id : ");	String logid = scanner.next();
					System.out.print(" Password : "); String logpw = scanner.next();
					// 2. �迭������ �Է��� ���̵�� �н����尡 �����ϴ��� => �����ϸ� �α��� ���� 
						// for���� �̿��� ��� �ε����� �����ؼ� �ϳ��� �� 
					
					boolean logincheck = true;
					for( int i = 0 ; i<ȸ�����.length ; i++ ) {
						if( ȸ�����[i][0] != null && ȸ�����[i][0].equals(logid) && ȸ�����[i][1].equals(logpw) ) {
							System.out.println("[[ �˸� ]] : �α��� ���� ");
								////////////////////////////////�α��� ������ �޴�/////////////////////////////////////////
								while(true) { // ȸ���޴� ���ѷ���
									System.out.println("\n\n\t - ȸ�� �޴� - ");
									System.out.print(" [[ 1.�湮�� ���� 2.�湮�� Ȯ�� 3.�α׾ƿ�  ���� : ");
									int ch2 = scanner.nextInt();
										
									if( ch2 == 1  ) { 
											scanner.nextLine(); // nextLine ���� �ذ� 
										System.out.print(">>>> �湮 ���� : "); String contents = scanner.nextLine();
										// �湮�� �迭�� ������� ã�Ƽ� ����� �α��ε� ���̵� ���� 
										for( int j = 0 ; j < �湮��.length ; j++ ) {
											if( �湮��[j][0] == null ) { // i��° �ε����� ���� ����[null] �̸� 
												�湮��[j][0] = contents ; 	�湮��[j][1] = logid;
												System.out.println(">>>> �湮�� ���");
												break;
											}
										}
									}
									else if( ch2 == 2 ){
										System.out.println("---------- �湮�� ��� -------------");
										System.out.printf("%10s \t %s \n" , "�ۼ���" , "����");
										// �迭�� ������ ������ ��� ���� ���
										for( int j = 0 ; j<�湮��.length ; j++ ) {
											if( �湮��[j][0] == null ) { break; }
											System.out.printf("%10s \t %s \n" , �湮��[j][1] , �湮��[j][0]);
										}
									}
									else if( ch2 == 3 ) {
										System.out.println("[[ �˸� ]] : �α׾ƿ� �Ǿ����ϴ� ");
										break;
									}
									else System.out.println("[[ �˸� ]] : �˼� ���� �ൿ�Դϴ� ");
								}
								////////////////////////////////////////////////////////////////////////////////////////
							logincheck = false;
							break;
						}
					}
					// �α��� ���н� 
					if( logincheck ) System.out.println("[[ �˸� ]] : �α��� ���� ( ������ ȸ�������� �����ϴ� )");
					break;
					
				default :
					System.out.println("[[�˸�]] : �˼� ���� ��ȣ �Դϴ� ");
			}
		}
		
		
		
		
		
	}

}
