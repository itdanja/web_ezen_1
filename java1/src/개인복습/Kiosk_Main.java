package ���κ���;

import java.util.Scanner;

public class Kiosk_Main {//class start
	//console Ű����ũ [ ���Ǳ� ] ����
	
	// 1. �޴��� [ 1. �ݶ� [300] 2.ȯŸ [200] 3. ���̴�[100] 4.���� ]
		// �޴��� �Ʒ��� ������ ��ǰ�� ��� [ ��ǰ ���� / �� ���� ���� �ݾ� ��� ]
	// 2. �ʱ� ��� [10����] �ȷ����� ��� ���� 	// ��� ������ ���� �Ұ�
	// 3. ������ �ݾ��� �Է¹޾Ƽ� ������ ��ŭ ���� �� �ܵ� ���
	
	//Ŭ������ //�迭��[i][j]
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {//main start
		while(true) {
			System.out.println("\t  [  ���� �޴��Դϴ�.  ]");
			System.out.println("[ 1. �ݶ� [300] 2.ȯŸ [200] 3. ���̴�[100] 4.���� ]");
			System.out.print("���� > :"); int ch =  Kiosk_Main.scanner.nextInt();
			
			if(ch == 1) {Coke.cokeBuy();} //�ݶ� �����ϱ�
			else if(ch == 2) {Fanta.fantaBuy();} //ȯŸ �����ϱ�
			else if(ch == 3) {Soda.sodaBuy();} //���̴� �����ϱ�
			else if(ch == 4) {Payment.order();} //���� �ϱ�
			else {System.out.println("[�˸�] �߸��� �Է��Դϴ�.");}
			//���ڿ� �߻� �� ���� �߻� -> ó����� -> try catch -> ��� �־�� ����...
	

	
		}
	}//main end
}//class end
