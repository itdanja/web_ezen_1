package Day02;

public class Day02_5 {
	
	// ���� : char 	' ' 
	// ���ڿ� : �ڷ��� ���� => String Ŭ����  " "
	public static void main(String[] args) {
		
		char ����1 = 'a';
		// char ����2 = 'abc'; // char 2����Ʈ�� �ϳ��� ���ڸ� ���� ����
		// 1. String �̿��� ���ڿ� ���� 
		String ���ڿ�1 = "abc";	System.out.println( ���ڿ�1 );
		
		// 2. �迭�� �̿��� ���ڿ� ���� 
		char[] ���ڿ�2 = { 'a' , 'b' , 'c' };	
		System.out.println( ���ڿ�2 );
		
		// String : ���ڿ� ���� ���ִ� Ŭ���� 
			// ��ü�� �� ������ �Ұ� [ .equals( ���ڿ� ) ] 
			// ��ü �� �޼ҵ� [ equals( ���ڿ� ) ]
		String �̸� = "���缮"; // ���� : 1����Ʈ  // �ѱ� : 2����Ʈ 
		String �̸�2 = new String("���缮");
		
		System.out.println( �̸� == �̸�2 );
		System.out.println( �̸�.equals(�̸�2) );
		
		//dfksfksdlkfn
		
	}
	
	

}
