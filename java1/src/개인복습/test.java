package ���κ���;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class test {
	
	public static void main(String[] args) {

		

		Scanner scanner= new Scanner(System.in);

		String[][] �л���� = new String[100][8]; // ���� �� ����,,

		

		

		while(true) {

				System.out.printf("\n\n-------------------------------------------------\n\n");

				System.out.printf("\n\t\t\t����ǥ\n");

				System.out.println("\n-------------------------------------------------\n");

				System.out.printf(" %2s \t %4s  %3s  %3s %3s %3s%3s\n","��ȣ","�̸�","����","����","����","���","����");

				System.out.println("\n-------------------------------------------------\n");

				for (int i = 0; i < �л����.length; i++) {

					if (�л����[i][0] !=null) {

						System.out.printf(" %2s \t %4s  %3s  %3s %3s %3s%3s\n",

								i,�л����[i][0],�л����[i][1],�л����[i][2],�л����[i][3],�л����[i][4],�л����[i][5]);

						

					}

					

				}

				

				System.out.println("1.��������ϱ� >>>>����:");int ch =scanner.nextInt(); // ���ù� �־� �� �ص� �Ǵ°���

				

				if(ch==1) {

					scanner.nextLine();

					System.out.println("�̸� :"); String name=scanner.nextLine();

					System.out.println("��������:"); String Kor =scanner.nextLine();

					System.out.println("�������� :"); String Eng =scanner.nextLine();

					System.out.println("�������� :"); String Math =scanner.nextLine();

					

					int total = ( Integer.parseInt(Kor) + Integer.parseInt(Eng) + Integer.parseInt(Math) ) ;

					System.out.println("���� :"+total);

					float ave = ( total )/3; 	// ���� ���� ��� ��� �����ؼ� �ѹ��� ����Ұ����� 


					for (int j = 0; j < �л����.length; j++) {

						if (�л����[j][0] ==null) {

							�л����[j][0] = name; �л����[j][1] = Kor;�л����[j][2] = Eng;

							�л����[j][3] = Math; �л����[j][4]= String.valueOf(total);

							break;

						}

						

					}

					

					

				}


		}

		}
}

			

