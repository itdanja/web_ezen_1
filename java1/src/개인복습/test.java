package ���κ���;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class test {
	
	/* ����ö ����	
	 * [����1] ��4( ������ ->��� ->���� ->���� ->������)
	 * [����2] ��ö3�� ��ü [�������� 3�� ��ö ���]
	 * [����3] ��� ��ȣ�� �޾Ƽ� �ش翪���� ����ؼ� �������� ����
	 * [����4] ���� �ҿ�ð� 2��
	 * 
	 * ��߽�ȣ �޴�
	 * 1.���� 2.��� 3.���� 4.����
	 * 
	 * ���� : 1�� ���ý� �������� ���� ���� ��ö�� ���������� �̵�
	 * ���� : ���� �ش翪�� ��ö�� ������ ���� ���
	 */
		public static void main(String[] args) throws Exception {
			
			Scanner scanner = new Scanner(System.in);
			Queue<String> ������ = new LinkedList<String>();
			Queue<String> ��꿪 = new LinkedList<String>();
			Queue<String> ���￪ = new LinkedList<String>();
			Queue<String> ���ο� = new LinkedList<String>();
			
			������.offer("1����ö");
			������.offer("2����ö");
			������.offer("3����ö");
			
			while(true) {
				System.out.println(������);
				System.out.println(��꿪);
				System.out.println(���￪);
				System.out.println(���ο�);
				System.out.println("1.���� 2.��� 3.���� 4.����");
				int ch = scanner.nextInt();
				
				if(ch==1) {
					System.out.println(������);
					if(!������.isEmpty()) {
						Thread.sleep(2000);	
						System.out.println("��� : "+������.peek());
						��꿪.offer( ������.poll() );
					}
				}
				if(ch==2) {
					System.out.println(��꿪);
					if(!��꿪.isEmpty()) {
					Thread.sleep(2000);
					System.out.println("��� : "+��꿪.peek());
					���￪.offer(��꿪.poll());
					}
				}
				if(ch==3) {
					System.out.println(���￪);
					if(!���￪.isEmpty()) {
					Thread.sleep(2000);	
					System.out.println("��� : "+���￪.peek());	
					���ο�.offer(���￪.poll());
					}
				}
				if(ch==4) {
					System.out.println(���ο�);
					if(!���ο�.isEmpty()) {
					Thread.sleep(2000);	
					System.out.println("��� : "+���ο�.peek());	
					������.offer(���ο�.poll());
					}
				}
			}
		}
	
}

			

