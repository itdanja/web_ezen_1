package Day14;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Day14_4_ȸ����_List {

	// ȸ���� ���α׷� 
		// 1. ����Ʈ�� �̿��� ȸ������ , �α��� , ȸ������ , ȸ������ , ȸ��Ż�� 
	public static void main(String[] args) {
		
		// 0.����  [ �Է°�ü ]
		Scanner scanner = new Scanner(System.in);
		// 0.���� [ ����Ʈ ���� : User Ŭ������ ������ �ִ� Ŭ���� ( UserŬ������ ������ ����) ] 
		ArrayList<User> users = new ArrayList<>();
		// 0.���� [ ���� �о���� : ���Ͽ� �ִ� ȸ������ ����Ʈ�� ���� ]
		
		
		// 1. �޴� 
		while(true) {
			
			System.out.println("1.ȸ������ 2.�α��� ");
			int ch = scanner.nextInt();
			if( ch == 1 ) {
				// 1. �Է¹ޱ� 
				System.out.println(" ���̵� : ");		String id = scanner.next();
				System.out.println(" ��й�ȣ : ");	String password = scanner.next();
				System.out.println(" ���� : ");		String name = scanner.next();
				
				// 2. �Է¹��� �����͸� ��üȭ [ 3�� ������ �ϳ��� ��ü�� ]
				User user = new User(id,password,name);
				
					// * ���̵� �ߺ�üũ [ ����Ʈ�� ��ü �ϳ��� temp�� ���� ] 
					boolean idcheck = true;
					for( User temp : users ) {
						if( temp.getId().equals(id) ) {
							System.out.println(" [[ �ߺ��� ���̵� �Դϴ� ]]");
							idcheck=false;	 break;
						}
					}
				// 3. ����Ʈ�� ���� [ ���࿡ �ߺ����� ������ ]
				if( idcheck ) {users.add( user ); System.out.println(" [[ ȸ������ ���� ]]");}
				// 4. ����ó�� 
					// 1. ������� Ŭ����
							// new FileOutputStream("���ϰ��/���ϸ�.Ȯ����" );  ���ξ��� 
							// new FileOutputStream("���ϰ��/���ϸ�.Ȯ����" , true );  �̾�� 
					try {
						
						FileOutputStream fileOutputStream = 
							new FileOutputStream("C:/Users/505-t/git/web_ezen_1/java1/src/Day14/userlist.txt" , true );
						
						// 2. �ʵ尣 ���� [ , ]  // ȸ���� ���� [ \n ]
						String outstring = user.getId()+","+user.getPassword()+","+user.getName()+"\n";
						
						// 3. String ---> bytes �������� [ write( ����Ʈ�� ) ]
						fileOutputStream.write( outstring.getBytes() );
					
						System.out.println(" [[ ���� ó�� ���� ]]");
				
					}
					catch (Exception e) {
						System.out.println(" [[ ���� ó�� ���� ]]");
					}
				
			}
			else if( ch == 2  ) {
				// 1. �Է¹ޱ� 
				System.out.println(" ���̵� : ");		String id = scanner.next();
				System.out.println(" ��й�ȣ : ");	String password = scanner.next();
				// 2. ����Ʈ�� ��ü�� �� �ϱ� 
				
				boolean logincheck = true;
				for( User temp : users ) {
					if( temp.getId().equals(id) && temp.getPassword().equals(password) ) {
						System.out.println(" [[ �α��� ���� ]]"); 
						logincheck = false; break;
					}
				}
				if( logincheck ) { System.out.println(" [[ ������ ȸ�������� �����ϴ� ]]  "); }
			}
		}
	}
}







