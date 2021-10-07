package Day07;

import java.util.Scanner;

public class BookApplication { // ���� Ŭ���� 
	
//	------------------- ȸ���� ������ ���α׷� ---------------------
//	// [����1] : ��ü���� [ ȸ�� Ŭ���� , ���� Ŭ����  ]
//		���� : �ʵ� , ������ , �޼ҵ�
//	// [����2] : ��ü�� �迭�� ����
//	// [����3] : ȸ���� ���α׷� �̿�
//		[ �α����� ] : �α��� , ȸ������ , ���̵�/��й�ȣ ã��   
//		[ �α��ν� ] : 1.������� ,2. �뿩 , 3.�ݳ�  , 4.�α׾ƿ�
//	// [����4] : ������[ ID:admin ] �� ���� ��� ���� 
//		[ ������ �α��ν� ] : 1.������� ,2.������� 3. �α׾ƿ� 
	
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
				String loginid = Member.login();
					// login �޼ҵ��� ��ȯ���� ���� ����
				// 1. �α��� ����
				if( loginid ==null ) { System.out.println(" [[ �˸� ]] : ������ ȸ�������� �����ϴ�");}
				// 2. �����ڸ޴�
				else if( loginid.equals("admin")) { admin_menu(); }
				// 3.  �Ϲ�ȸ���޴�
				else { member_menu( loginid ); }
					
			}
			if( ch == 2 ) {
				// ȸ������ �޼ҵ� ȣ�� 
					// 1. �ٸ�Ŭ���� �޼ҵ� ȣ�� ��� 
						// 1. ��ü������ ��ü�� ���� ��� ���� 
							//Member member = new Member();
							//member.login()
						// 2. �ش� �޼ҵ� static
				Member.signup();
			}
			if( ch == 3 ) {
				// ���̵�ã�� �޼ҵ� ȣ�� 
			 	String findid = Member.findid();
			 	if( findid == null ) { System.out.println(" [[ �˸� ]] : ������ ȸ�������� �����ϴ�");}
			 	else {System.out.println(" [[ ȸ������ ���̵�� "+findid+" ]] ");}
			}
			if( ch == 4 ) {
				// ��й�ȣã�� �޼ҵ� ȣ�� 
			 	String findpw = Member.findpw();
			 	if( findpw == null ) { System.out.println(" [[ �˸� ]] : ������ ȸ�������� �����ϴ�");}
			 	else {System.out.println(" [[ ȸ������ ��й�ȣ�� "+findpw+" ]] ");}
			 	
			}
		}
	}
	// 2. �α��ν� �޴� �޼ҵ�  
	public static void member_menu( String loginid ) {
		Book book = new Book(); // Book �ӽð�ü : �޼ҵ� ȣ���
		while(true) {
			System.out.println(" ---------- Menu ----------");
			System.out.println(" 1.������� | 2.�뿩 | 3.�ݳ� | 4.�α׾ƿ� ");
			System.out.print("���� : ");	int ch = scanner.nextInt();
			if( ch == 1 ) { book.book_list(); }
			if( ch == 2 ) { book.book_rental( loginid ); } 
			if( ch == 3 ) { book.book_return( loginid ); }
			if( ch == 4 ) { System.out.println(" [[ �˸� ]] : �α׾ƿ� �Ǿ����ϴ� "); return; }
		}
	}
	
	// 3. ������ �޴� �޼ҵ� 
	public static void admin_menu() {
		Book book = new Book(); // Book �ӽð�ü : �޼ҵ� ȣ��� 
		while(true) {
			System.out.println(" ---------- Admin Menu ----------");
			System.out.println(" 1.������� | 2.������� | 3.�α׾ƿ� ");
			System.out.print("���� : ");	int ch = scanner.nextInt();
			if( ch == 1 ) { book.book_add();}
			if( ch == 2 ) { book.book_list(); } 
			if( ch == 3 ) { System.out.println(" [[ �˸� ]] : �α׾ƿ� �Ǿ����ϴ� "); return; }
		}
	}
	
	
	
	
	
	
	
	
	
}
