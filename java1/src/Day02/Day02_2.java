package Day02;

public class Day02_2 {

	// ���� : �ϳ��� ���� �����Ҽ� �ִ� �޸� ���� 
		// �޸�[�ֱ����ġ=RAM] : ���� �������� ���α׷� ��� 
			// ���α׷� <--- ���μ���[������] <----- ��ɾ�[�ڵ�] ����
		// ���� ���� ���� ---> �뷮 ���� ---> �ӵ� ���� 
		// ���� ȿ���� => �ڷ��� 
	
	// ���� ���� 
		// �ڷ��� ������[����]
		// int age;
	
	// ������ ��Ģ 
		// ���ڷ� ���� x   // ��ҹ��� ����  //
	
	// ������ ���� [ �����ʰ��� ���ʿ� ���� : ���Կ����� = ]
		// int score; // ���� ���� 
		// score = 90 ; // ������ 90�� ����
	
	// ������ ����� ��� �������� ���� �����ϴ� [ ��ȣ ������ �̵� ���� // ��ȣ ������ �̵� �Ұ� ]
	
	public static void main(String[] args) {
		// p.35 ��
		int value = 10 ; //  int�� �ڷ��� value �������� ���� ���� ����� ���ÿ� 10 ���� 
		int result = value + 10 ; // ������ ������ ���� 	
		System.out.println(" ��� : " +  result );
		
		// p.38  �ڷ��� 
			// �ڷ��� ��� ���� : �޸� ȿ���� [ ������ ��� ] 
			// ��ǻ�ʹ� ���� ��� [ 0 ,  1 ] ���� : bit => 0 Ȥ�� 1 
				// bit => 8bit => 1����Ʈ		[ 01010101 => 1����Ʈ [ 8ĭ ] ]
				// byte => 1024byte => 1kbyte
				
		/*
		 * 	[��]
		 *  boolean	1��Ʈ			true , false
		 *	[����]
		 *  char	2����Ʈ		����[�����ڵ�]
		 *  [����]
		 *  byte	1����Ʈ		+-127
		 * 	short	2����Ʈ		+-3������
		 *  int		4����Ʈ		+-20������
		 *  long	8����Ʈ		+-20�� �̻� 
		 *  [�Ǽ�]
		 *  float	4����Ʈ		�Ҽ��� 8�ڸ� ǥ��
		 *  double	8����Ʈ 		�Ҽ��� 18�ڸ� ǥ��
		 */
		
		// p.40 : byte [ -128 ~ +127 ]
		byte var1 = -128; 	System.out.println( var1 );
		byte var2 = -30;	System.out.println( var2 );
		byte var3 = 30;		System.out.println( var3 );
		// byte var4 = 128;	System.out.println( var4 ); // ����
		byte var4 = 'j';	System.out.println( var4 );
		
		// p.43 : char [ �ѱ��� ] : �����ڵ� 
		char c1 = 'A'; 		System.out.println( c1 );
		char c2 = 65;		System.out.println( c2 );
		char c3 = '\u0041';	System.out.println( c3 );
		
		char c4 = '��';		System.out.println( c4 );
		char c5 = 44032;	System.out.println( c5 );
		char c6 = '\uac00';	System.out.println( c6 );
		// ��ǻ��[0,1]�� ���ڸ� ��� ó��????????????
			// �ƽ�Ű�ڵ� : �̱� [ ���� ----> ���� -----> ���� ]
			// �����ڵ�[java] : ������ ��� ���� ǥ�� 
		
		// p.44~45 : short[2����Ʈ] , int[*�⺻ ���� �ڷ��� / 4����Ʈ] Ÿ��
		short num1 = 30000;			System.out.println( num1 );
		//short num2 = 40000;		System.out.println( num2 );
		int num2 = 10;				System.out.println( num2 );
		int num3 = 012;				System.out.println( num3 ); // 8����
		int num4 = 0xA;				System.out.println( num4 ); // 16����
			// ���� ���� : ��ǻ�Ͱ� ǥ���Ҽ� �ִ� ���� �Ѱ� �ذ�
			// 2���� [ 0 , 1 ] : ���� 
			// 8���� [ 0 ~ 7 ] :								[ 0 ]
			// 10���� [ 0 ~ 9 ] : ��� 						
			// 16���� [ 0 ~ 9 A B C D E F ] : �پ��� ǥ������	[ 0x ]
		
		// p.46 : Long[ 8����Ʈ ] : 20���̻�
		Long num5 = 2000000000L; 	System.out.println( num5 );
		
		// p.47~48 : float[4����Ʈ] , double[ *�⺻ �Ǽ� �ڷ��� / 8����Ʈ ] 
		double val = 3.14; 			System.out.println( val );
		//float val2 = 3.14;		System.out.println( val2 );
		float val2 = 3.14f;			System.out.println( val2 );
		
		double val3 = 0.1234567890123456789;	System.out.println( val3 );
			// �Ҽ��� 18�ڸ����� ǥ�� 
		float val4 = 0.1234567890123456789f;	System.out.println( val4 );
			// �Ҽ��� 8�ڸ����� ǥ�� 
		
		// boolean : 1��Ʈ[0(false),1(true)]
		boolean bol = true;			System.out.println( bol );
		
		// p.49~51 : Ÿ�Ժ�ȯ
			// 1. �ڵ� Ÿ�Ժ�ȯ [ ũ��� : �������ڿ��� ū���ڷ� �̵� ���� ]
				// byte -> short(char) -> int -> long -> float -> double
						
				// �������ڿ��� ū���ڷ� �̵� ���� // ū���ڿ��� �������ڷ� �̵� �Ұ� 
		byte bytevalue = 10;
		int intvalue = bytevalue; // �ڵ� ����ȯ [���� ] byte -> int  
		//byte bytevalue2 = intvalue;	// �Ұ�  int -> byte 
		
			// 2. ���� Ÿ�Ժ�ȯ [ �޸𸮼ս� => ������ �ս� ]
				// �ڷ��� ������ = (�ڷ���)������;
			// p.54
		byte bytevalue2 = (byte)intvalue;
		
		// ��������
			// 1 : 4
			// 2 : 1 4 5
			// 3 : byte			short		int		long
			//					char
			//								float	double
			//		boolean
		
			// 4 :	Ÿ�� : int , double
			//		�����̸� : age , price 
			//		���ͷ� : 10 , 3.14
			// 5 : 3
			// 6 : 4
			// 7 : 3
			// 8 : 1 [ ����� �⺻Ÿ�� : int ]
				//1. byte + byte => int => byte [x]
				//2. int + byte => int => int
				//3. int + float => int => float
				//4. int + double => int => double		
	}
	
		
}













