package ���κ���;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class test {
	
	public static void main(String[] args) {

		// while �ۿ� ����ϴ� ����?? :  while �ȿ��� ����� ������ �ݺ��ȴ� x
		Scanner scanner = new Scanner(System.in);
		String[][] ȸ����� = new String[100][2];
		String[][] �湮�� = new String[100][3];
		
		while(true) {
			
			System.out.println("==========ȸ���湮��=============");
			System.out.println(" 1.ȸ������ 2.�α��� >>>>>���� :");int ch = scanner.nextInt();
			
			switch(ch) { // � ������ ���� ���� ������ �����Ҽ��ֵ��� �����ִ� ���~!  
					// if  switch ���� 
						// if( TRUE/FALSE )		// if(  age>11 )	// if ( >= <= > == != )
						// switch( �˻���� )  	// case �˻���  break;
			case 1 :

				System.out.printf("===========ȸ������===========\n\n");
	
				System.out.println("ID :"); String id = scanner.next();
	
				System.out.println("PW :"); String pw = scanner.next();

				boolean idcheck = true; // boolean ��  �� ������ �Ǵ��Ѵ�
	
				for (int i = 0; i < ȸ�����.length; i++) {
	
					if (ȸ�����[i][0] !=null && ȸ�����[i][0].equals(id)) {//ȸ����Ͽ� ���������ʰų�  ȸ����Ͽ��ִ� ���̵� �����ϸ� �ɸ��°�
	
						System.out.println("������ ID �� �����մϴ�");
	
						idcheck =false;
	
						break;// ���̵��ߺ�üũ�� �˸��� ����
	
					}
	
				}

					if(idcheck) {// if �� �ι����� ���Ļ� �� ���������� �� �����

						for (int i = 0; i < ȸ�����.length; i++) {

							if (ȸ�����[i][0]==null) { ȸ�����[i][0]=id ;ȸ�����[i][1]=pw;

							System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�");

							break;

								

							}

							

						}

					}

					break;// ���� �� ������ �����!!
						// �Ⱦ��� case1 ������ -> case2 
					

		case 2 :

			System.out.println("=========�α���=========");

			System.out.println("ID �Է� :");String id2 =scanner.next();

			System.out.println("PW �Է� :");String pw2 = scanner.next();

			

			boolean id2check=true;

			for (int i = 0; i < ȸ�����.length; i++) {

				if (ȸ�����[i][0] !=null&&ȸ�����[i][0].equals(id2)&&ȸ�����[i][1].equals(pw2)) {// ���� �Է��� ���̵� ����� ������ �α��μ���

					System.out.println("�α��μ���");

					id2check = false;

					while(true) {

					System.out.println("1. �湮�� �ۼ� 2. �湮�ϻ� ����");
					int ch3 = scanner.nextInt();


					if (ch3==1) {

						System.out.println("=======�湮�� �ۼ��ϱ�===========");

						scanner.nextLine();

						System.out.println("���� :");String title = scanner.nextLine();

						System.out.println("�ۼ��� :");String writer = scanner.nextLine();

						System.out.println("���� :");String contents = scanner.nextLine();

					

					for (int j = 0; j < �湮��.length; j++) {

						if (�湮��[j][0]==null) {

							�湮��[j][0]=title;�湮��[j][1]=writer;�湮��[j][2]=contents;

							break;

						}

						}
					}
					
					
					if(ch3==2) {

						System.out.println("=====�湮�� �� ����========");
						System.out.println("����\t�ۼ���\t����");
						
						for( int j = 0 ; j<�湮��.length; j++ ) {
							if( �湮��[j][0] !=null ) {
								System.out.println(�湮��[j][0] +"\t"+ �湮��[j][1] +"\t"+ �湮��[j][2] );
							}
						}
					}
					// ���ۼ��� �� ���⿡ �� ����,,


							

				}
			}
			if( id2check ) {
				System.out.println("�α��� ���� [ �ùٸ� ������ �����ϴ�]");
			}

							

					

				}

				

			}

		

			

			

			

			

		}

	}
}

			

