package Day03;

import java.util.Scanner;

public class Day03_8 {
	
	// Ȯ�ι���7 :  ATM ���α׷�
	public static void main(String[] args) {
		
		// �����ư ������������ ���ѽ��� ���α׷� => while(true)
		boolean ���� = true; // ���ѷ��� �����ϴ� ���� 
		int ���ݾ� = 0 ; // ���ݾ�
		Scanner scanner = new Scanner(System.in); // �Է°�ü 
		
		while( ���� ) { // [ ���ຯ�� true ���ѷ��� ���� // ���ຯ���� false�̸� ���ѷ��� ���� ]
			System.out.println("          �������� ATM             ");
			System.out.println("--------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.���� ");
			System.out.println("--------------------------------");
			System.out.print("����> ");	int ���� = scanner.nextInt();
			
			if( ���� == 1 ) {
				System.out.print("���ݾ�>"); 		���ݾ� += scanner.nextInt();
				System.out.println(" [[ �˸� ]] ���� �Ϸ� ");
			}
			else if( ���� == 2 ) { 
				System.out.print("��ݾ�>"); 	int ��ݾ� = scanner.nextInt();
				
				if( ���ݾ� < ��ݾ� )  { System.out.println(" [[ �˸� ]] �ܰ� �����մϴ� "); }
				else  { ���ݾ�-= ��ݾ�; System.out.println(" [[ �˸� ]] ��� �Ϸ� "); }
				
			}
			else if( ���� == 3 ) {
				System.out.println("�ܰ�>"+���ݾ�);
			}
			else if( ���� == 4 ) {  // ���࿡ 4�� �Է������� 
				����=false;	// ���ຯ���� false �����Ͽ� ���ѷ���[while] ����
				System.out.println("     [[�̿����ּż� �����մϴ�]]"); 
			}
			else {
				System.out.println(" [[���]] : �˼� ���� ��ȣ �Դϴ� ");
			}
		}
		
	}

}
	// Ȯ�ι��� 
		// 1. if , switch   // for , while , do~while
		// 2. 2.
		// 3. 
			/*
			 * 	int num = 0 ;
			 * 	for( int i = 1 ; i<=100 ; i++ ){ if( i%3== 0 ) sum += i; }
			 * 	System.out.println(" 3�� ����� �� : "+ sum );
			 */
		// 4.----
		// 5. 4x + 5y = 60
			/*
			 * 
			 * 	for( int x = 1 ; x<=10 ; x++ ){ 
			 * 		for( int y = 1 ; y<=10 ; y++) {
			 * 			if(  (4*x)  +  (5*y ) == 60 ){ 
			 * 				System.out.printf("(%d , %d) \n" , x , y ); 
			 * 			}
			 * 		}
			 * 	}
			 */
		// 6.
			/*
			 * 	for( int i = 1 ; i<=5 ; i++ ) {
			 * 
			 * 		for( int s = 1 ; s<= i ; s++ ) { System.out.print("*"); }
			 * 
			 * 		System.out.println();
			 * 
			 * 	}
			 */





