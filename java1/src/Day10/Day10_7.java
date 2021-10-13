package Day10;

public class Day10_7 {
	
	
	public static void main(String[] args){
	
		// ����ó�� : 1.�Ϲݿ��� 2.���࿹�� 
			// ���� : �پ��� ���� �߻��� => ���α׷� ����ȭ
			// *try {} �ȿ��� ���ܹ߻��ϸ� catch�� ����Ŭ���� ��ü�� �����߻������� �����ϰ� catch ����
			// * �� ���ܰ� ������� try {} ��������� catch{}�� ���� ���� 
			
			// try{  ���ܰ� �߻� ���� �ڵ� }
			// catch( ����Ŭ������ ������ ){ ���� �߻��� ����Ǵ� �ڵ� }
			// finally{ ���� �ֵ� ���� ������ ����Ǵ� �ڵ� }
		
			// ����Ŭ���� 
				// * Exception : ���� ����Ŭ���� : ��� ���� ���� ����  
				// 1. NullPointerException 
				// 2. ArrayIndexOutOfBoundsException
				// 3. NumberFormatException
				// ~~~~~ ��� 
			// ���� ������ 
				// ���� : �޼ҵ峻���� �߻��� ���ܸ� ȣ���Ѱ����� �̵� [ ���� ���ϼ� ] 
		
			// ��������� ���� 
		
		// ��1 p.423 : NullPointerException ����
		try {
			String data = null;	// String ��ü�� null ���� 
			System.out.println( data.toString() ); //  toString() : ��ü������ȯ
		}catch( Exception e  ) {
			System.out.println("���ܰ� �߻� �߽��ϴ� . [ �����ڿ��� ���� ]" );
			System.out.println("�������� : " + e);
		}finally {System.out.println(" ** ������ ����Ǵ� ��ġ");}
		
		// ��2: ArrayIndexOutOfBoundsException ����
		try {
			String[] ���ڿ��迭 = new String[2]; // String 2���� �����ϴ� �迭 ���� 
			���ڿ��迭[0] = "���缮";		���ڿ��迭[1]="��ȣ��";		���ڿ��迭[3] ="�ŵ���";
		}
		catch (Exception e) {
			System.out.println("�迭�� �ڸ��� �����մϴ�. [�����ڿ��� ����]");
			System.out.println("�������� : " + e);
		}
		finally {System.out.println(" ** ������ ����Ǵ� ��ġ");}
		
		// ��3: p.426 : NumberFormatException ����
		try {
			String data1 ="100"; 	// "100" -> 100   [����]
			String data2 ="a100";	// "a100" -> a100 [�Ұ���]
			System.out.println( Integer.parseInt( data1 ) ) ;
			System.out.println( Integer.parseInt( data2 ) ) ;
					// Integer : ���� ���� Ŭ���� [ ���� ���� �޼ҵ� ���� ]
						// .parseInt( ���� ) : ���ڸ� ���������� ��ȯ���ִ� �޼ҵ� 
		}
		catch( Exception e ) {
			System.out.println("���ڰ� ���Ե� ���ڿ��� ������ ��ȯ�� �Ұ�. [�����ڿ��� ����]");
			System.out.println("�������� : "+ e);
		}
		finally { System.out.println(" ** ������ ����Ǵ� ��ġ ");}
			
	}
	
}
