package Day11;

public class Day11_1 {

	// p.488 : 10�� ���� Ȯ�ι��� 
		// 1. 4 
			// 1. ����� ���� Ȥ�� �������� �߸��� �ڵ��� ������ ���ܶ� �Ѵ�
			// 2. ���࿹��[���� ���߿� ���ܹ߻�] , �Ϲݿ���[���� ���� ���ܹ߻� ]
			// 3. try{ }catch(����Ŭ���� ������){}
			// 4. �����ڰ� ����Ŭ������ ���� ����
		// 2. 3
			// 3. finally : ���� ���� ������� ����Ǵ� �� [ �׻� ���� ]
		// 3. 4
			// throws : ���� ������ => �޼ҵ� �ȿ��� �߻��� ���ܸ� �޼ҵ� ȣ��� ������ ���� 
			// Exception : ����Ŭ�����߿� ����Ŭ����
			// throw : ����� ���� ���� 
		// 4. 2
		// 5. 3
			// 3: catch( Exception e ) {} catch( ClassNotFoundException ) {}
			// Exception : �����߿��� ����Ŭ������ �տ� ������� �ڿ� �ִ� �ڽ�Ŭ������ �ǹ̾���
		// 6. 10 -> ���ڷ� ��ȯ �Ҽ� ����
			// ������ 
				// 1. main �޼ҵ� ���� 
				// 2. 03�� / 04�� : �迭���� / ���� ���� 
				// 3. 05�� : for������  [ i�� 0���� 2���� 1������ ]
					// i = 0 �϶�
						// value = Integer.parseInt( strArray[0] ) => 10 => ���� �߻�x
				// 4. 12�� : finally
						// ��� 10
					// i = 1 �϶�
						// value = Integer.parseInt( strArray[1] ) => a10 => ���� �߻�o
				// 5. 10�� : ���� ���� ĳġ
						// ���ڷ� ��ȯ �Ҽ� ����
				// 6. 12�� : finally 
						// ��� 10 [ value ������ ] 
					// i = 2 �϶� 
						// value = Integer.parseInt( strArray[2] ) => �ε��� ���� => ���ܹ߻� 
				// 7. 08�� : �ε��� ���� ĳġ 
						// �ε����� �ʰ����� 
				// 8. 12�� : finally 
						// ��� 10 [ value ������ ] 
				// 9. �ݺ��� ���� 
		// 7.
			// ���̵� ������� ����Ŭ���� ����� 
			// ��й�ȣ�� �ٸ���� ����Ŭ���� ����� 
			
		public static void main(String[] args) {
			
			try {
				login("white", "12345");
			}
			catch (Exception e) {
				System.out.println( e.getMessage() );
			}
			try {
				login("blue", "54321");
			}catch (Exception e) {
				System.out.println( e.getMessage() );
			}
		}
		
		// �α��� �޼ҵ� 
		//public static void login( String id , String password ) throws Exception {
		public static void login( String id , String password ) throws NotExistIDException , WrongPasswordException {
			
			if( !id.equals("blue") ) {
				// ! : ���� ������ : true => false  / false =>true
				throw new NotExistIDException("���̵� �������� �ʽ��ϴ�");
			}
			if( !password.equals("12345") ) {
				throw new WrongPasswordException("�н����尡 �ٸ��ϴ�");
			}
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
