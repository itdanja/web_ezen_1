package Day14;

import java.util.ArrayList;
import java.util.Scanner;

public class Day14_4_ȸ����_List {

	// ȸ���� ���α׷� 
		// 1. ����Ʈ�� �̿��� ȸ������ , �α��� , ȸ������ , ȸ������ , ȸ��Ż�� 
	public static void main(String[] args) {
		
		// 0.����  [ �Է°�ü ]
		Scanner scanner = new Scanner(System.in);
		// 0.���� [ ����Ʈ ���� : User Ŭ������ ������ �ִ� Ŭ���� ( UserŬ������ ������ ����) ] 
		ArrayList<Object> users = new ArrayList<>();
		
		
		
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
				
				// 3. ����Ʈ�� ���� 
				users.add( user );
				
			}
		}
	}
}
