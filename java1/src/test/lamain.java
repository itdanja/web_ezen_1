package test;
import java.util.Iterator;

import java.util.Random;

import java.util.Scanner;

 

public class lamain {

	

 

	public static void main(String[] args) {

 

		Scanner scanner = new Scanner(System.in);


		String[] ������ = {	 "[]", "[]", "[]",

							"[]", "[]", "[]", 

							"[]", "[]", "[]",

 

		}; 

		String winner = ""; // �̱� ��� 

		int count = 0; // ���� �˼� 
		

		while (true) {

 
////////////////////////////////////////////////////////////////////
			for (int i = 0; i < ������.length; i++) { // ������ ��� 3������ �ٹٲ�

				System.out.print(������[i]);// printin �����ϸ� ���ηγ��� �ٵ� t �ιٲپ����� ��

				if (i%3 == 2) 

					System.out.println();


			}
////////////////////////////////////////////////////////////////////
 

			if (winner.equals("[O]")) {

				System.out.println("�÷��̾� �¸�");

				break; // �������� 

			}

			if (winner.equals("[x]")) {

				System.out.println("��ǻ�� �¸�");

				break; // �������� 

			}

		

 

		while (true) {

			System.out.println("=========ƽ�������===========");

			System.out.println("�÷��̾���ġ����  :");

			int index = scanner.nextInt();

 

			if (������[index].equals("[]")) { // ��� ������ 

				������[index] = "[O]"; // �� �α� 

				count++; // ���� �� �� ���� 

				break;

			} else {

				System.out.println("�̵̹��ڸ��Դϴ�");

			}

		}

 

		if (count == 9) { // ���� �˼��� 9�� �̸� ���º� ó�� 

								for (int i = 0; i < ������.length; i++) {
					
									System.out.print(������[i]);
					
									if (i % 3 == 2) {
										System.out.println();
									}
								}

			System.out.println("���º� �Դϴ�");
			break;
		}

		System.out.println("��ǻ����ġ����:");

		while(true) {

			Random random = new Random();

			int index = random.nextInt(9); // 0 ~ 8 

			if (������[index].equals("[]"))

					 {������[index]="[X]";

					 count++;

					 break;

			}

		}

		

		/////////�¸��� ���ϴ¹�

		/*

		 *  �̱�¹�� 012

		 * 			345

		 * 			678

		 */

		//����

		for (int i = 0 ; i<=6 ; i+=3 ) {// �����԰Ŷ� ����̰��ִ���

			if (������[i].equals(������[i+1])&& ������[i+1].equals(������[i+2])) {

				if(!������[i].equals("[]")) {

					winner= ������[i];

				}

			}

		}

		//����

		for (int i = 0; i <=2; i+=1) { // �����԰Ŷ� ����̰��ִ���

			if (������[i].equals(������[i+3])&&������[i+3].equals(������[i+6])) {

				if(!������[i].equals("[]")) {

					winner=  ������[i];	

				}

				

			}

			

		}

		// �밢�� �ε� ���ʿ��� �Ʒ���

		

			if (������[0].equals(������[4])&&������[4].equals(������[8])) {

				if(!������[0].equals("[]")) {

					winner=  ������[0];	

			}

			

		}

		// �밢���ε� �����ʾƷ����� ���� �����ϴ°�

		

		

			if (������[2].equals(������[4])&&������[4].equals(������[6])) {

				if(!������[2].equals("[]")) {

					winner=  ������[2];	

			}

			

		}

		

		} // we

	}//me

	

}//ce