package Day01;

public class Day01_2 { // c s 

	// System.out.print() // main ���� ���� �Ұ� 
	// main + ctrl+ �����̽��� 
	public static void main(String[] args) { // m s
		// 1. ��� 
			// print(����� ����);  : ��� 
			// println( ����� ����); : ����� �ٹٲ�[���� �ٲ� ] 
			// printf( ���Ĺ��� , ��¹��� ); : ���Ĺ��� �´� ��� 
				// f : format : ���
				// ���Ĺ��� 
					// %d : ����
					// %f : �Ǽ�
					// %s : ���ڿ� 
					// %c : ���� 
				// ����� [ p.34 ] 
					// \ : �������� ��ȭ��ȣ \
					// \n : �ٹٲ� 
					// \t : ��[�鿩���� => 5ĭ ]
					// \r : ���� [ �Ǿ����� �̵� ] 
					// \\ : \ ��� 
		
		//��1 : syso + ctrl+�����̽��� 
		System.out.print("java");
		System.out.print(12345); // ���� �̱� ������ ���ڿ��� ����ó�� x 
		System.out.print("java10"); // ����+���� => ���� 
		
			// System : �̸� ������� �ý����̶�� Ŭ���� 
				// out : ��� ��Ʈ�� 
					// print(�μ�:����ϰ� ������) : ��� �Լ� 
			// . : Ŭ������ ���(�Լ�,����) ���� ������[Ư������]
			// " " : Ű����[�̸� �ۼ��� �ܾ�] , ���� �� ������ ��� ���ڿ��� ����ó�� 
			// ; : ������ �����ڵ� �� [ ��ó�� ] 

		// ctrl+F11 : ������ 
		
		//����2
		System.out.println("java");
		System.out.println(12345);
		System.out.println("java10");

		// ����3 
		System.out.printf("%s" , "java");
		System.out.printf("%d" , 12345 );
		System.out.printf("%s" , "java10");
		
		// printf ���� 
		System.out.printf("���̴� %d �Դϴ� " , 20);
		System.out.println("���̴� " + 20 + " �Դϴ�");
			// + : ���� ������ 
		
		// ����� 
		System.out.print("\njava\n"); // �յڷ� �ٹٲ� 
		System.out.print("\t12345 ");
		System.out.print("\rjava10");
		
		// ����1
		/*  ��°�� 
		 * 				[[ �⼮�� ]]
		 * --------------------------------------
		 * �̸�		1����		2����		3����		���
		 * ��ȣ��		�⼮		�Ἦ		�⼮
		 * ���缮		�⼮		�Ἦ		�⼮ 
		 * --------------------------------------
		 */
		System.out.println("\n\t\t[[�⼮��]]");
		System.out.println("-----------------------------------");
		System.out.println("�̸�\t1����\t2����\t3����\t���");
		System.out.println("��ȣ��\t�⼮\t�Ἦ\t�⼮");
		System.out.println("���缮\t�⼮\t�Ἦ\t�⼮");
		System.out.println("-----------------------------------");
		
		// ����2 : �����
		/*
			\    /\
			 )  ( ')
			(  /  )
			 \(__)|
		*/
		System.out.println("\\    /\\");
		System.out.println(" )  ( ')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|"); // | : shift + ��ȭ��ȣ[�齽����]
		
		// ����3 : �� 
		/*
 			|\_/|
			|q p|   /}
			( 0 )"""\
			|"^"`    |
			||_/=\\__|
		*/
		System.out.println();
		
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\"); // " " ����ó�� ������ => \" : " ��� 
		System.out.println("|\"^\"`    |");
		System.out.println("||_/=\\\\__|");
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} // m e
	
} // c e
