package Day11;

import java.io.IOException;

public class Day11_5 {
	
	// 1. �޴� => while ���ѷ���
	// 2. �Է¹ޱ� : 1. Scanner ��ü  2. System.in.read()
	// 3. ���θ޴� ���� 
	
//	���� �˻� ���α׷�
//	1.���� : ������� �迭 ���� 
//		[ 4���� ������ �迭�� ��� ]
//		1. �ȴ�! ���̹� ��α�&����Ʈ
//		2. ������ ��Ʈ ���� Ȱ�� ������
//		3. Tucker�� Go ��� ���α׷���
//		4. ȥ�� �����ϴ� C ���
//
//	2. Scanner -> System.in.read()
//
//	3.�˻���� : �˻��� �Է¹޾� �˻��� �ܾ ���Ե� ������ ��� ���
//	4.������� : ������ ������ �Է¹޾� ������ ��ü�� �ܾ�� ���ο� �ܾ� �Է¹޾� ��ü
//	
//	String[] ������� = {	
//			"�ȴ�! ���̹� ��α�&����Ʈ",
//			"������ ��Ʈ ���� Ȱ�� ������",
//			"Tucker�� Go ��� ���α׷���",
//			"ȥ�� �����ϴ� C ���"
//	};
	public static void main(String[] args) throws IOException {
		
		//0.�غ�
		String[] ������� = {	"�ȴ�! ���̹� ��α�&����Ʈ","������ ��Ʈ ���� Ȱ�� ������","Tucker�� Go ��� ���α׷���","ȥ�� �����ϴ� C ���"};
		
		// 1.�޴� 
		while(true) {
			System.out.print("1.�˻� 2.����   ���� : ");
				// ����Ʈ�迭 ���� [ Ű����κ��� �Է¹��� ����Ʈ�� ������ �迭 ] 
			byte[] bs = new byte[100]; // �˳��� 100����Ʈ [ �����̸� 100���� // �ѱ��̸� 50���� ]
			// �Է�[Ű����=����Ʈ]�ޱ� --->  ����Ʈ�迭�� ���� 
			int count =  System.in.read( bs ); // 1. ������ ���ܹ߻� [ 1.������.2.try ]
				// count : ����Ʈ�� �о�� ���� ���� ����
				// ���ڼ� + 2 [ \n , \r ]
			// ��1)
			// ����Ʈ --> ���ڿ� ��ȯ[ ����Ʈ�迭 , 0 , �Է��ѹ��ڼ� ) 
			String ch = new String(bs , 0 , count-2 ); // 100����Ʈ ��� ���ڿ� ��ȯ
			if( ch.equals("1") ) { 
				System.out.println("---------�˻�â---------");
				System.out.println(" �˻��� ������ : ");
				count =  System.in.read( bs );
				String book = new String(bs , 0 , count-2 );
				for( int i = 0 ; i<�������.length ;i++) {
					// ������ ��� ��ġ������� 
					if( �������[i].equals( book ) ) {
						System.out.println( �������[i] );
					}
					// 1�������� ���Ե� �������ϰ��
					if( �������[i].contains( book ) ) {
						System.out.println( �������[i]);
					}
					// 2�������� ���Ե� �������ϰ��
					if( �������[i].indexOf(book) != -1 ) {
						System.out.println( �������[i]);
					}
				}
			}
			if( ch.equals("2") ) { System.out.println("---------����â---------");}
			
			// ��2)
			// ���ڿ� ---> ���ڿ� ��ȯ 
			int ch2 = Integer.parseInt(ch);
			if( ch2==1 ) { System.out.println("---------�˻�â---------");}
			if( ch2==2 ) { System.out.println("---------����â---------");}
			
		}
	}
}








