package Day07;

import java.util.Scanner;

public class BookApplication { // ���� Ŭ���� 
	
	// 0. �迭 
	public static Member[] members = new Member[100];
	public static Book[] books = new Book[100];
	// 0. �Է°�ü
	public static Scanner scanner = new Scanner(System.in);
	
	// mian �޼ҵ�=> �ڵ���� �������� 
	public static void main(String[] args) {
		main_menu(); // �޼ҵ� ȣ�� 
	}
	
	// 1. ���θ޴� �޼ҵ� 
	public static void main_menu() {
		while(true) {
			System.out.println("\n\n ------------------ �α��� ������ -------------");
			System.out.println(" 1.�α��� | 2.ȸ������ | 3.���̵�ã�� | 4.��й�ȣã�� ");
			System.out.print(" >>> ���� : ");	int ch = scanner.nextInt();
			if( ch == 1 ) {
				// �α��� �޼ҵ� ȣ��
			}
			if( ch == 2 ) {
				// ȸ������ �޼ҵ� ȣ�� 
					// 1. �ٸ�Ŭ���� �޼ҵ� ȣ�� ��� 
						// 1. ��ü������ ��ü�� ���� ��� ���� 
						// 2. �ش� �޼ҵ� static
				Member.signup();
			}
			if( ch == 3 ) {
				// ���̵�ã�� �޼ҵ� ȣ�� 
			}
			if( ch == 4 ) {
				// ��й�ȣã�� �޼ҵ� ȣ�� 
			}
		}
	}
	// 2. �α��ν� �޴� �޼ҵ�  
	public static void login_menu() {
		
	}
	// 3. ������ �޴� �޼ҵ� 
	public static void admin_menu() {
		
	}
	
	
	
	
	
	
	
	
	
}
