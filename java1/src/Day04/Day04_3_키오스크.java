package Day04;

import java.util.Scanner;

public class Day04_3_Ű����ũ {
	
	// console�� Ű����ũ [ ���Ǳ� ]
		// 1. �޴��� [ 1.�ݶ�[300] 2.ȯŸ[200] 3.���̴�[100] 4.���� ]
			// �޴��� �Ʒ��� ������ ��ǰ�� ��� [ ��ǰ ���� / �� ���� ���� �ݾ� ]
		// 2. �ʱ� ��� [ 10���� ] �ȷ����� ��� ���� // ��� ������ ���źҰ�
		// 3. ������ �ݾ��� �Է¹޾Ƽ� ������ ��ŭ ������ �ܵ� ��� 
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// ��� ����[�������� : ����� ��ȣ �ȿ����� ��� �����ϴ�]  
		int �ݶ���� = 10 ; int ȯŸ��� = 10 ; int ���̴���� = 10;
		
		// ��ٱ��� ����
		int �ݶ󱸸ż� = 0 ; int ȯŸ���ż� = 0 ; int ���̴ٱ��ż� = 0;
		
		// 1. ���ѷ��� 
		while(true) {
			System.out.println("-------------------- �޴� ------------------- ");
			System.out.println("1.�ݶ�[300] 2.ȯŸ[200] 3.���̴�[100] 4.����");
			System.out.print(">>>>>> ���� : "); int ch = scanner.nextInt();
			
			if( ch == 1 ) {  // 1�� �ݶ� ���������� 
				// ��� ������� ���� �Ұ�
				if( �ݶ���� == 0 ) { System.out.println(" [[ �ݶ� ��� �����ϴ� : ��ǰ �غ��� ]] "); }
				else {
					System.out.println(" [[ �ݶ� ��ҽ��ϴ� ]] "); 
					�ݶ󱸸ż�++;
					�ݶ����--;
				}
			}
			if( ch == 2 ) {  // 2�� ȯŸ�� ���������� 
				// ��� ������� ���� �Ұ�
				if( ȯŸ��� == 0 ) { System.out.println(" [[ ȯŸ ��� �����ϴ� : ��ǰ �غ��� ]] "); }
				else {
					System.out.println(" [[ ȯŸ ��ҽ��ϴ� ]] "); 
					ȯŸ���ż�++;
					ȯŸ���--;
				}
			}
			if( ch == 3 ) {  // 3�� ���̴ٸ� ���������� 
				// ��� ������� ���� �Ұ�
				if( ���̴���� == 0 ) { System.out.println(" [[ ���̴� ��� �����ϴ� : ��ǰ �غ��� ]] "); }
				else {
					System.out.println(" [[ ���̴� ��ҽ��ϴ� ]] "); 
					���̴ٱ��ż�++;
					���̴����--;
				}
			}
			///////////////////////////// ��ٱ��� ��� ////////////////////////////
			System.out.println(" ------------- ��ٱ��� ---------------- ");
			System.out.println(" ��ǰ��\t��ǰ����\t������");
			if( �ݶ󱸸ż� > 0 ) { System.out.println(" �ݶ�\t"+�ݶ󱸸ż�+"\t"+�ݶ󱸸ż�*300); }
			if( ȯŸ���ż� > 0 ) { System.out.println(" ȯŸ\t"+ȯŸ���ż�+"\t"+ȯŸ���ż�*200); }
			if( ���̴ٱ��ż� > 0 ) { System.out.println(" ���̴�\t"+���̴ٱ��ż�+"\t"+���̴ٱ��ż�*100); }
			System.out.println(" >>>>>> �� ������ " + ( (�ݶ󱸸ż�*300) + (ȯŸ���ż�*200) + (���̴ٱ��ż�*100) ) );
			System.out.println(" --------------------------------------\n");
			
			if( ch == 4 ) { 
				if( �ݶ󱸸ż� ==0 && ȯŸ���ż� ==0 && ���̴ٱ��ż� ==0 ) { System.out.println("[�˸�] ������ ��ǰ�� �����ϴ� ");}
				else{
					while(true) {
						System.out.print(" >>>>> ���� �Ͻðڽ��ϱ�? [y] [n] : "); String ch2 = scanner.next();
						if( ch2.equals("y") ) {
							
							while(true) {
								System.out.print(" >>>>> �ݾ� ���� : "); int money = scanner.nextInt();
								int totalpay = (�ݶ󱸸ż�*300) + (ȯŸ���ż�*200) + (���̴ٱ��ż�*100) ;
								if( money < totalpay ) { 
									System.out.println(" [�˸�] �ݾ��� �����մϴ� ");
								}
								else {
									System.out.println(" [�����Ϸ�] : �ܵ� : " + ( money - totalpay ));
									// ��ٱ��� �ʱ�ȭ 
									�ݶ󱸸ż� = 0 ; ȯŸ���ż� = 0 ; ���̴ٱ��ż� = 0 ; break;
								}
							}
							break;
							
						}else if( ch2.equals("n") ) {
							// ��ٱ��� �ʱ�ȭ 
							�ݶ󱸸ż� = 0 ; ȯŸ���ż� = 0 ; ���̴ٱ��ż� = 0 ;
							break;
						}else {
							System.out.println("[�˸�] :  �˼� ���� �ൿ �Դϴ� ");
						}
					}
				}
			}
			
			
		} // while end 
	} // main end 
	
} // class end 







