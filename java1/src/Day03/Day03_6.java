package Day03;

public class Day03_6 {
	
	public static void main(String[] args) {
		
		// for( �ʱⰪ ; ���ǹ� ; ������ ) { ���๮ }
		
		// �ʱⰪ
		// while( ���ǹ� ){  
		//		���๮
		//		������
		// }
		
		//p.125 ��1
		int i = 1;	// 1. �ʱⰪ 
		while( i<=10 ) { // 2. ���ǹ�
			System.out.print( i+" "); // 3.���๮ 
			i++; // 4.������
		}
	System.out.println("\n------------------------");
		// for ���� 
		for( int j = 1 ; j<=10 ; j++ ) {
			System.out.print(j+" ");
		}
		
	System.out.println("\n------------------------");	
		// p.125 ��2
		int sum = 0 ;
		int h = 1; // 1.�ʱⰪ 
		while( h<=100 ) { sum+=h; h++; }
		System.out.println(" 1~100���� �����հ� : "+sum);
		
		// for ����
		int sum2 = 0 ;
		for( int k = 1 ; k<=100 ; k++ ) { sum2+=k; }
		System.out.println(" 1~100���� �����հ� : "+sum2);
	
		// ���ѷ��� => while(true)
		while(true) { System.out.println(" ��ӽ����� "); }
	
	}
	
	
	
	

}
