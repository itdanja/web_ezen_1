package Day12;

import java.util.Random;
import java.util.Scanner;

public class Day12_4_������ȣ�й� {
	// ���� : ������ȣ �������� 0000~9999 ������ ���� 10�� ���� 
	// 1. ��� ������ �迭�� ���� 
	// * ���ڸ� ��ȣ�� Ȧ��/¦��
	// 2. ���� ���ڸ� ��ȣ�� Ȧ�� �迭 ����
	// 3. ���� ���ڸ� ��ȣ�� ¦�� �迭 ���� 
	// [���] 3���� �迭 ��� ��� 
		// ���� => ���� 0~9999 ������ ���� ����
		// ���� -> 4�ڸ��� ���ڿ� ��ȯ
	
	public static void main(String[] args) {
		
		//0.���� [ �ʱⰪ 1�� ������ ���� ] 
		Scanner scanner = new Scanner(System.in); // �Է°�ü
		String[] carnumbers = new String[10]; // String 10�� �����Ҽ� �ִ� �迭 
		String[] carnumbers_odd = new String[10]; // Ȧ��������
		String[] carnumbers_even = new String[10]; // ¦�������� 
		
		Random random = new Random(); // ���� ��ü 
		
		while(true) {
			System.out.print("1.���� ���� : ");
			int ch = scanner.nextInt();
			if( ch== 1 ) {
				
				//////////////////////// ���� ��ȣ ���� /////////////////////////////
				int intnum = random.nextInt(10000);	// 0~9999
				// ���� -> 4�ڸ��� ���ڿ� ��ȯ 
				String strnum = String.format( "%04d", intnum );
						// String.format( ���� , ������) : ���ڿ� ���� �޼ҵ� 
							// ���� : %d -> ���Ĵ���� �����Ͱ� ���� 
								// %4d : 4�ڸ��� 
								// %04d : ����ִ� �ڸ����� 0���� ���
				// ������ȣ ����  [ ����ִ� �迭�� ���� ]
				for( int i = 0 ; i<carnumbers.length; i++ ) {
					if( carnumbers[i] == null ) {
						carnumbers[i] = strnum; 
						// Ȧ�� ¦�� ���� [   �� % 2 == 0  �������� 0�̸� ¦�� �������� 1�̸� Ȧ��  
							// 1. ���ڿ� -> ���� ��ȯ   2.Ȧ ¦ ����
						if( Integer.parseInt(strnum) % 2 == 0 ) {  //  ������( ������ȣ ) % 2 == 0 �̸� ¦��
							for( int j = 0 ; j<carnumbers_even.length; j++ ) {
								if( carnumbers_even[j] == null ) {
									carnumbers_even[j] = strnum; break;
								}
							}
						}else { // Ȧ�� 
							for( int j = 0 ; j<carnumbers_odd.length; j++ ) {
								if( carnumbers_odd[j] == null ) {
									carnumbers_odd[j] = strnum; break;
								}
							}
						}
						break;
					}
				}
				////////////////////////���� ��� ���� /////////////////////////////
				System.out.println(" ******** ���� �������� ���� ******** ");
				for( String num : carnumbers ) { // �ε�����ȣ�� �ʿ���� �ݺ� 
					// for( �ڷ��� �ӽú��� : �迭�� ) : 
					// �迭�� 0�� �ε������� �������ε������� �ӽú����� ���� 
					if( num !=null ) System.out.println( num );
				}
				
				System.out.println(" ******** ���� �������� Ȧ������ ******** ");
				for( String num : carnumbers_odd ) { // �ε�����ȣ�� �ʿ���� �ݺ� 
					if( num !=null ) System.out.println( num );
				}
				
				System.out.println(" ******** ���� �������� ¦������ ******** ");
				for( String num : carnumbers_even ) { // �ε�����ȣ�� �ʿ���� �ݺ� 
					if( num !=null ) System.out.println( num );
				}
				
				
				
			}
		}
		
	}
	

}
