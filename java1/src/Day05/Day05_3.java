package Day05;

import java.util.Scanner;

public class Day05_3 {

	// p.181 Ȯ�ι���
		// 1. 2
			// ���� : �����̸� ����  
			// �� : ������ ���� �� 
			// 3. ==  !=  ��ü �ּҰ� ��   [ ��ü ���빰 �� x ]
				// .equals [ ��ü ���빰 �� o ]
		// 2. 3
			// 1. ���α׷� ����� �޸� �ʱ�ȭ
			// 3. �������� �ʴ� ��ü�� �ڵ� �Ҹ� 
	
		// 3. 2  [ ���ڿ� �����ص� ��ü�� �ٸ��� �ֱ� ������ ]
	
		// 4. 2  [ int[] array= { 1 , 2 , 3 } ] 
	
		// 5. 3 [ boolean Ÿ�� �迭�� �ʱⰪ�� false ] 
			// ���� = 0  , �Ǽ� = 0.0  , �� = false , ���ڿ�[��ü] = null
	
		// 6. 3  /  5
		//		�迭��.length : ����� 
		//	  	�迭��[��].length : �ش� ���� �� ���� 
	
		// 7. [ �迭�� ��� �ε����� �����ϱ� ���ؼ� for Ȱ�� ] 

		/*
		 * 	for( int i = 0 ; i<array.length; i++ ) { // i�� �ε��� 0���� 4���� 1�������ϸ鼭 �ݺ� 
		 * 		if( array[i] > max ) max = array[i]  // i��° �ε��� ���� max���� ũ�� max�� i��° �ε��� �� �ֱ� 
		 * 	}
		 */
	
		// 8. [ �迭�� ��� �ε����� �����ϱ� ���ؼ� for Ȱ�� ] 
		/*
		 * 	int count = 0 ; // ���� ���� 
		 * 
		 *	// �� �ݺ���
		 *	for( int i = 0 ; i < array.length ; i++ ) {
		 *		// �� �ݺ��� 
		 *		for( int j = 0 ; j< array[i].length ; j++ ){
		 *			// �ش� �ε��� �� �����ͼ� sum �����հ� ���ϱ�  
		 *			sum += array[i][j];
		 *		}
		 *		count += array[i].length;  // 2 + 3 + 5 
		 *	}
		 * 	avg = (double)sum / count;
		 * 
		 */
	
		// 9. 
	
		public static void main(String[] args) {
			
			boolean run = true; // while ���ѷ��� ���� ���� 
			Scanner scanner = new Scanner(System.in); // �Է°�ü 
			int studentNum = 0; // �л��� => �迭�� ����
			int[] scores = null; // �л����� �迭 [ �ʱⰪ�� null ���� ] 
			
			while(run) { // ���ѷ��� [ 5���Է��ϸ� ���ѷ��� ���� ] 
			
				System.out.println("-----------------------------------------------");
				System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
				System.out.println("-----------------------------------------------");
				System.out.print("���� : ");
				
				int selectNo = scanner.nextInt();
				if( selectNo == 1 ) {
					System.out.print("�л��� : ");	studentNum = scanner.nextInt();
					scores = new int[studentNum]; // �Է¹��� ������ŭ �迭���� �Ҵ� 
				} 
				else if( selectNo == 2 ) { 
					// �迭�� �Ҵ�� ��� �ε����� �� �ֱ� => for 
					for( int i = 0 ; i<studentNum ; i++  ) {
						System.out.print("scores[" + i + "] : ");
						scores[i] = scanner.nextInt(); // �Է¹��� ���� i��°�� ���� 
					}
				} 
				else if( selectNo == 3 ) {
					for( int i = 0 ; i<studentNum; i++ ) {
						System.out.println("scores[" + i + "] : " + scores[i] ); // i��° �ε��� �� ��� 
					}
				} 
				else if( selectNo == 4 ) {
					int max = 0;  int sum = 0 ; double avg = 0.0;
					
					for( int i = 0 ; i< studentNum ; i++ ) {
						if( scores[i] > max ) max = scores[i]; // i��° �ε��� ���� max ���� ũ�� max�� i��° �ε��� �� �ֱ� 
						sum += scores[i]; // i��° �ε��� ���� sum �� �����հ� 
					}
					avg = (double)sum / studentNum ;
					System.out.println("�ְ� ���� : " + max);
					System.out.println("��� ���� : " + avg);
				}
				else if( selectNo == 5 ) { 
					run = false;
				} 
			}
			System.out.println("���α׷� ����");
			
		}
	
	
	
	
	
	
}










