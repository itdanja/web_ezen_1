package view;

import java.util.Scanner;

import controller.MemberController;
import database.File;
import model.Member;

public class Application {

	// 0.���� [ main �ۿ� ����� ����?? :  ] 
	public static Scanner scanner = new Scanner(System.in);
		// public :
		// static : 
	
	public static void main(String[] args) {
		// 0.���α׷� ���� �ε� 
		File.fileload(1);
		
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
						System.out.println(" [�˸�] : ȸ������ ���� ");
					}else {
						System.out.println(" [�˸�] : ȸ������ ���� ");
					}
					System.out.println("+++++++++++++++++++++++++++++++++++++++");
				}
				else if( ch == 3 ){
					System.out.println("++++++++++++ ���̵�ã�� ������ ++++++++++++");
				}
				else if( ch == 4 ){
					System.out.println("++++++++++++ ��й�ȣã�� ������ ++++++++++++");
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
								// �μ� : 
		
	}
	// 3. �Խ��� �޴� �޼ҵ� 
	public static void boardmenu( String id ) {
				
	}
}
