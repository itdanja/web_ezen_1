package Day11;

import java.io.IOException;

public class Day11_4 {
	
	public static void main(String[] args) throws IOException{
		
		// Ű����κ��� ���ڿ� �޾ƿ��� ����
			// Ű����[����Ʈ] �Է� =>  �Է½�Ʈ�� => �ڹ� ���α׷�
		
		//String Ŭ���� 
			// 1. String ������ : ����Ʈ�� �� ���ڿ� ��ȯ
				// ������ ��13�� ���� ���� 
				// ���ڿ����� �ε����� ���� 
		
		// p.497
		// 1. ����Ʈ�迭�� ���� ���� 
		byte[] bytes = { 72 , 101 , 108 , 108 , 111 , 32 , 74 , 97 , 118 , 97 };
				//�����ڵ�	: H    e     l     l     o    sp   J    a     v    a
		// 2. ����Ʈ�迭�� String �����ڿ� �ֱ� 
		String str1 = new String(bytes);
		System.out.println( str1 );
		
		// 3. 						  // s , c
		String str2 = new String(bytes , 6 , 4 );
		System.out.println( str2 );
		
		// p.498
		// 1. ����Ʈ 100���� �����Ҽ� �ִ� �迭 
		byte[] bytes2 = new byte[100];
		
		System.out.print(" �Է� : ");		
		int readcount =  System.in.read(bytes2); // ������ ����ó��
			// ����°��� �׻� ����ó�� �߻� 
			//System.in.read(�迭��) : Ű����κ��� �о�� ����Ʈ�� �迭�� ���� 
		System.out.println( new String(bytes2) );
							// ����Ʈ�� -> ���ڿ� ��ȯ 
		System.out.println( new String(bytes2 , 0 , readcount-2 ));
		
		// p.499
			// 2. charAt(�ε���) : ���� ����
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7);
		switch( sex ) {
			case '1':
			case '3': System.out.println("����"); break;
			case '2':
			case '4': System.out.println("����"); break;
		}
		// p.500
			// 3. equals(�񱳴���ڿ�) : ���ڿ� �� 
			String strVar1 = new String("�Ź�ö");
			String strVar2 = "�Ź�ö";
			
			// == �Ұ� 
			if( strVar1 == strVar2 ) {System.out.println(" 1.���� ");}
			else {System.out.println(" 1.�ٸ���");}
			
			// equals ���� 
			if( strVar1.equals(strVar2)){System.out.println(" 2.���� ");}
			else {System.out.println(" 2.�ٸ���");}
		
		// p.502
			// 4. getBytes() : ���ڿ��� ����Ʈ���� ��ȯ 
			String str = "�ȳ��ϼ���"; // �ѱ� 1���� 2����Ʈ // ���� 1���� 1����Ʈ 
			
			byte[] bytes3 = str.getBytes(); // String�� ����Ʈ�� ��ȯ�� �迭�� ����
			System.out.println( bytes3.length ); // �ѱ� ���ڼ�*2 = 10����Ʈ
			// ����Ʈ ---> ���ڿ� 
			System.out.println( new String(bytes3) );
				// ���ڵ� ����
					// 1.UTF-8 : ������ ����� 
					// 2.EUC-KR[ CP949 ] : ���� , �ѱ�
		// P.504
			// 5. indexOf() : ���ڿ� ã�� [ �μ� : ã�����ڿ�   ��ȯ: ã�� �ε�����ġ ]
			String subject = "�ڹ� ���α׷���";
			System.out.println( subject.indexOf("���α׷���") );
			
			if( subject.indexOf("�ڹ�") != -1 ) {
									// �ε����� -1 : �ε����� ���� // ã�����ڰ� �������� ����
				System.out.println("�ڹٿ� ���õ� å�Դϴ�");
			}else {
				System.out.println("�ڹٿ� ���þ��� å�Դϴ�.");
			}
		// p.505
			// 6. length() : ���ڿ��� ���� 
			System.out.println( subject.length() ); //8ĭ : �ε���0~7
			
					
			
			
			
			
		
		

	}

}
