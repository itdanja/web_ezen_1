package Day03;

import java.util.Scanner;

public class Day03_3 {
	
	// if( ������ ) switch(����������)
		// ����Ǽ��� ������ �ִ°�� => switch[�ӵ� ����]
		// ����Ǽ��� ������ ���� �ʴ°�� => if[��]
			/* ���� : switch( key:�˻��� ) {
					case �˻� : ���๮;
					case �˻� : ���๮;
					case �˻� : ���๮;
					default : ���๮;
			*/
			// break : switch Ȥ�� �ݺ����� Ż��� ���Ǵ� Ű���� ( ���� ����� �߰�ȣ Ż�� )
	public static void main(String[] args) {
		// ��1 )
		int ���� = 80;
		switch( ���� ) { // ������ �˻�!!!! 
			// ������ 90�̸� 
			case 90 : System.out.println(" A��� �Դϴ� ");break;
			// ������ 80�̸�
			case 80 : System.out.println(" B��� �Դϴ� ");break;
			// ������ 70�̸� 
			case 70 : System.out.println(" C��� �Դϴ� ");break;
			// �׿�
			default : System.out.println(" Ż�� �Դϴ� ");
		}
	//////////////////////////////////////////////////////////////////////
		if( ���� == 90 ) System.out.println(" A��� �Դϴ� ");
		else if( ���� == 80 ) System.out.println(" B��� �Դϴ� ");
		else if( ���� == 70 ) System.out.println(" C��� �Դϴ� ");
		else System.out.println(" Ż�� �Դϴ� ");
	
		// ��2 ) 
		int ��ư = 3 ; 
		switch( ��ư ) {
			case 1 : System.out.println(" 1������ �̵� "); break;
			case 2 : System.out.println(" 2������ �̵� "); break;
			case 3 : System.out.println(" 3������ �̵� "); break;
			default : System.out.println(" ���� ");
		}
		
		// p.118 char switch �� 
		char grade = 'B';
		switch( grade ) {
			case 'A' :
			case 'a' :	System.out.println("��� ȸ�� �Դϴ� "); break;
			
			case 'B' : 
			case 'b' :	System.out.println("�Ϲ� ȸ�� �Դϴ� "); break;
			
			default :
				System.out.println("�մ� �Դϴ� ");
		}
		// p.119 String stitch ��
		String position = "����";
		switch(position) {
			case "����" : System.out.println("700����"); break;
			case "����" : System.out.println("500����"); break;
			default : System.out.println("300����");
		}
		
		// ����1 : [switch] ����,����,���� ���� �Է¹޾� ����� 90�� �̻��̸� "A���" 80���̻��̸� "B" ������ Ż�� 
		Scanner �Է°�ü = new Scanner(System.in);
		System.out.print(" ���� : ");	int ���� = �Է°�ü.nextInt();
		System.out.print(" ���� : ");	int ���� = �Է°�ü.nextInt();
		System.out.print(" ���� : ");	int ���� = �Է°�ü.nextInt();
		int ��� = ( ���� +���� + ���� ) / 3 ;
		
		switch( ���/10 ) { // 1�� �ڸ��� ���� 
			case 10 :
			case 9:	System.out.println(" A��� "); break;
			case 8: System.out.println(" B��� "); break;
			default : System.out.println(" Ż�� ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
