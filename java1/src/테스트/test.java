package �׽�Ʈ;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class test {
	
	

	public static void main(String[] args) {

	

	String[][]boards =new String[100][5]; //�迭���� 100���� ���ο� 5���� ����ĭ

	Scanner scanner=new Scanner(System.in); //�Է°�ü

	while(true) {//���� ���� �����°�

		System.out.printf("=========�����=============\n");

		System.out.printf(" %2s \t %10s \t %5s \t %5s %3s\n","��ȣ","����","�ۼ���","��¥","��ȸ��");

		// �޴��� ����� printf ���ϴ������� ������ ����ϱ����� %5s: ��ŭ ĭ����� \n:���ٳ����� \t : �鿩����

		for (int i = 0; i < boards.length; i++) {// �迭���� i�� �迭�����۰� 1����

			if (boards[i][0]!=null) System.out.printf(" %2s \t %10s \t %5s \t %5s %3s\n",

				i , boards[i][0] , boards[i][2],boards[i][3],boards[i][4]);

				//  �ܿ��µ� �� �̷��� �Ǵ� ������ ���

			}

	 	System.out.println("==============================");

	 	System.out.println("1.�۾���2.�ۻ󼼺��� >>>���� :"); int ch = scanner.nextInt();//�Է��Ҽ��ְ� �����

	 	if(ch==1) {//1����

	 		System.out.println("==================�۾���==========");

	 		scanner.nextLine();// ���������ִ� �κ� ó��

	 		System.out.println("1.���� :");  String title = scanner.nextLine();// 

	 		System.out.println("2.�ۼ��� :");String writer = scanner.nextLine();

	 		System.out.println("3.���� :");String content = scanner.nextLine();

	 		

	 		Date now = new Date();//��¥ �Է��Ҽ��ְ� ����

	 		SimpleDateFormat dateFormat = new SimpleDateFormat("mm_dd");

	 		String date = dateFormat.format(now);

	 		

	 		String count = "1";// ��ȸ�� �Է��Ҽ��ְ� ����

	 		for (int i = 0; i < boards.length; i++) {

	 			if (boards[i][0]==null) {

	 				boards[i][0]=title;boards[i][1]=writer;boards[i][2]=content;

	 				boards[i][3]=date;boards[i][4]=count;break;// break�ȴ����� 100���ѹ�������

				}

			}

	

	 	}

	 	if (ch==2) {System.out.println("�� ��� �����ϱ� >>>:"); 
	 	
	 			int ch2 = scanner.nextInt();// 2���������� 

	 			int count = Integer.parseInt(boards[ch2][4]);// ��ȸ�� �Ҽ��ְ� ����??

	 			boards[ch2][4]= Integer.toString(++count);

	 			System.out.println("=============��ù� �� ������=============");

	 			System.out.println("���� :"+boards[ch2][0]);

	 			System.out.println("�ۼ��� :"+boards[ch2][1]);

	 			System.out.println("���� :"+boards[ch2][2]);

		}

	 	

	 	

	}

	

	

	

	}

	

}
