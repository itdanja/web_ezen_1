package view;

import java.text.SimpleDateFormat;
import java.util.Scanner;

import controller.BoardController;
import controller.MemberController;
import controller.ReplyController;
import database.File;
import model.Board;
import model.Member;
import model.Reply;

public class Application {

	// 0.���� [ main �ۿ� ����� ����?? :  ] 
	public static Scanner scanner = new Scanner(System.in);
		// public :
		// static : 
	
	public static void main(String[] args) {
		
		String ���ڿ� = new String("��ȣ��");
		
		
		
		// 0.���α׷� ���� �ε� 
		File.fileload(1);	// ȸ�� ���� �ҷ����� 
		File.fileload(2); 	// �Խù� ���� �ҷ����� 
		
		// 1. ���α׷� ���� 
		mainmenu(); // ���� �޴� �޼ҵ� ȣ��
	
	}
	
	// 1. ���� �޴� �޼ҵ� 
	public static void mainmenu( ) {
		// void : 
		while(true) { // ���ѷ��� 
			try {
				System.out.println("\n+++++++++++++ ȸ�� Ŀ�´�Ƽ ++++++++++++++");
				System.out.println("1.�α��� 2.ȸ������ 3.���̵�ã�� 4.��й�ȣã��");
				System.out.println("+++++++++++++++++++++++++++++++++++++++");
				System.out.print("\t ���� : ");		int ch = scanner.nextInt();
				
				if( ch == 1 ) {
					System.out.println("++++++++++++ �α��� ������ ++++++++++++");
					System.out.print(" Id : "); 		String id = scanner.next();
					System.out.print(" Password : "); 	String password = scanner.next();
					
					boolean result  =  MemberController.login(id, password);
					
					if( result ) {// �α��� ������ 
						System.err.println(" [�˸�] : �α��� ���� ");
						membermenu(id); // ȸ���޴� �޼ҵ� ȣ�� ( �α��� ������ ���̵� �μ��� ���� )
						
					}else {
						System.err.println(" [�˸�] : �α��� ���� ( ������ ȸ�������� �����ϴ� ) ");
					}
					
				}
				else if( ch == 2 ){
					System.out.println("++++++++++++ ȸ������ ������ ++++++++++++");
					// * �Է¹ޱ� -> ���� ���� -> ������ ������ -> ��ü -> ��ü ������ -> �迭/�÷��� ��´�
					System.out.print(" Id[4�����̻�] : "); 		String id = scanner.next();
					System.out.print(" Password[4���ڸ�] : "); 	String passowrd = scanner.next();
					System.out.print(" name[2�����̻�] : "); 		String name = scanner.next();
					System.out.print(" Email[@����] : "); 		String Email = scanner.next();
					// 4�� ������ ���ε��� �����ϸ� ������� => 4�� ������ ������ ��üȭ
					Member member = new Member(id, passowrd, name, Email, 0 );
					
					// Controller ���� [ �ٸ� Ŭ������ �޼ҵ� ȣ���ϴ� ��� :  1.    2. 
					boolean result =  MemberController.signup(member);
					if(result) {
						System.err.println(" [�˸�] : ȸ������ ���� ");
					}else {
						System.err.println(" [�˸�] : ȸ������ ���� ");
					}
					System.out.println("+++++++++++++++++++++++++++++++++++++++");
				}
				else if( ch == 3 ){
					System.out.println("++++++++++++ ���̵�ã�� ������ ++++++++++++");
					System.out.print(" Name : "); 	String name = scanner.next();
					System.out.print(" Email : "); 	String email = scanner.next();
					
					boolean result = MemberController.forgotid(name, email);
					
					if( result ) {
						System.err.println(" [�˸�] : ȸ������ ���̵� �̸��Ϸ� �����߽��ϴ� ");
					}else {
						System.err.println(" [�˸�] : ������ ȸ�������� �����ϴ�" );
					}
					System.out.println("+++++++++++++++++++++++++++++++++++++++");
				}
				else if( ch == 4 ){
					System.out.println("++++++++++++ ��й�ȣã�� ������ ++++++++++++");
					System.out.print(" Id : "); 	String id = scanner.next();
					System.out.print(" Email : "); 	String email = scanner.next();
					
					boolean result = MemberController.forgotpassword(id, email);
					
					if( result ) {
						System.err.println(" [�˸�] : ȸ������ ��й�ȣ�� �̸��Ϸ� �����߽��ϴ� ");
					}else {
						System.err.println(" [�˸�] : ������ ȸ�������� �����ϴ�" );
					}
					System.out.println("+++++++++++++++++++++++++++++++++++++++");
				}
				else {
					System.err.println(" [�˸�] : �˼����� �ൿ �Դϴ� [ �����ڿ��� ���� ]");
				}
			}
			catch (Exception e) {
				System.err.println(" [�˸�] : �޴� ������ ���� [ �����ڹ��� ] ");
				scanner = new Scanner(System.in); // �Է°�ü �ʱ�ȭ
						// new : 
			}
		}
	}
	// 2. ȸ�� �޴� �޼ҵ�
	public static void membermenu( String id ) {
		while(true) { // ���ѷ��� 
			try {
				System.out.println("\n+++++++++++++ ȸ�� ������ ++++++++++++++");
				System.out.println("1.ȸ������ 2.Ŀ�´�Ƽ 3.�α׾ƿ� ");
				System.out.println("+++++++++++++++++++++++++++++++++++++++");
				System.out.print("\t ���� : ");		int ch = scanner.nextInt();
				if( ch == 1 ) {
					System.out.println("\n+++++++++++++ ȸ������ ������ ++++++++++++++");
					
					System.out.println("+++++++++++++++++++++++++++++++++++++++");
				}
				if( ch == 2 ) {
					boardmenu(id); // �Խ��� �޼ҵ� ȣ�� 
				}
				if( ch == 3 ) {
					System.out.println(" [�˸�] : �α׾ƿ� �Ǿ����ϴ� ");
					//break; // ���� ����� �ݺ��� Ż�� 
					return; // ���� �޼ҵ� ����[��ȯ] ������ 
				}
			}
			catch (Exception e) {
				System.err.println(" [�˸�] : �޴� ������ ���� [ �����ڹ��� ] ");
				scanner = new Scanner(System.in);
			}
		}
	}
	// 3. �Խ��� �޴� �޼ҵ� 
	public static void boardmenu( String id ) {
		while(true) { // ���ѷ��� 
			try {
				System.out.println("\n+++++++++++++ �Խ��� ������ ++++++++++++++");
				System.out.println("\n��ȣ\tŸ��Ʋ\t\t�ۼ���\t�ۼ���\t��ȸ��");
				// �Խù� ��� 
				int i = 1; // for �ݺ�Ƚ�� i => �Խù���ȣ
				for( Board board : BoardController.boardlist ) {
			
					System.out.println( i +"\t"+ board.getTitle() +
										"\t\t"+board.getWriter() + "\t" + board.getDate() +
										"\t"+board.getView() );
					i++;
				}
				System.out.println("+++++++++++++++++++++++++++++++++++++++");
				System.out.println("+++++++++++++++++++++++++++++++++++++++");
				System.out.println("1.��� 2.�󼼺��� 3.�ڷΰ��� ");
				System.out.println("+++++++++++++++++++++++++++++++++++++++");
				System.out.print("\t ���� : ");		int ch = scanner.nextInt();
				if( ch == 1 ) {
					System.out.println("\n+++++++++++++ �Խù� ��� ++++++++++++++");
						// �Է¹ޱ� -> ���� ���� -> ��ü -> ����Ʈ -> ����
							scanner.nextLine(); // next ������ nextLine ���°�� ���� �߻�
						System.out.print(" ���� : ");	String title = scanner.nextLine();
						System.out.print(" ���� : ");	String contents = scanner.nextLine();
						// ��üȭ 
						Board board = new Board(title , contents , id );
						BoardController.add( board );
						
					System.out.println("+++++++++++++++++++++++++++++++++++++++");
				}
				if( ch == 2 ) {
					
					System.out.print(" *** �Խù���ȣ : "); int index = scanner.nextInt();
					Board board = BoardController.detail(index-1);
					if( board == null ) {
						System.err.println(" [�˸�] : ������ �Խù� ��ȣ�� �������� �ʽ��ϴ�");
					}else {
						System.out.println("\n+++++++++++++ �Խù� �� ++++++++++++++");
						System.out.println(" ���� : " + board.getTitle() );
						System.out.println(" ���� : " + board.getContents() );
						System.out.println(" �ۼ��� : " + board.getWriter() );
						System.out.println(" �ۼ��� : " + board.getDate() );
						System.out.println(" ��ȸ�� : " + board.getView() );
						System.out.println("-------------------���-------------------");
						System.out.println("�ۼ���\t��۳���\t\t�ۼ���");
						// ������
						for( Reply reply : board.getReplylist() ) {
							System.out.println(reply.getWriter()+"\t"+
											reply.getContents()+"\t\t"+reply.getDate());
						}
						System.out.println("+++++++++++++++++++++++++++++++++++++++");
						
						System.out.print("1.��۾��� 2.�ڷΰ��� "); 
						if( board.getWriter().equals(id) ) { // �Խù��ۼ��� == �α��ε�id
							System.out.print("  3.�Խù� ���� 4.�Խù� ����");
						}
						int ch2 = scanner.nextInt();
						if( ch2 == 1 ) { // ��۾���
							scanner.nextLine();
							System.out.println( "\n���� : " ); 	String contents = scanner.nextLine();
							Reply reply = new Reply(contents, id );
							boolean result = ReplyController.add(index-1, reply);
							
							if( result ) {
								System.out.println(" [�˸�] ��� ��� ");
							}else {
								System.err.println(" [�˸�] �ش� �Խù���ȣ�� �������� �ʽ��ϴ�;");
							}
						}
						if( ch2 == 2 ) { return; }
						if( ch2 == 3 ) {}
						if( ch2 == 4 ) {}
						
					}
					
				}
				if( ch == 3 ) {
					return; // ���� �޼ҵ� ����[��ȯ] ������ 
				}
			}
			catch (Exception e) {
				System.err.println(" [�˸�] : �޴� ������ ���� [ �����ڹ��� ] ");
				scanner = new Scanner(System.in);
			}
		}		
	}
}


















