package database;

import java.io.FileOutputStream;

import controller.MemberController;
import model.Member;

public class File {
	
	// �ʵ�
		// 1. ȸ�������� �����ϴ� ������ ��� 
	private static String memberpath = 
			"C:/Users/505-t/git/web_ezen_1/"
			+ "java1_Member_Board_Project/"
			+ "src/database/memberlist.txt";
	
	// ���� �޼ҵ� 
	public static boolean filesave( int type ) {
							// type : 1:ȸ������ 2:�Խù����� 3:�������
		try {				
			FileOutputStream fileOutputStream = null; //������
			if( type == 1 ) { // ȸ������ 
				// 1. ���ϰ�ü�� ��� ���� 
				fileOutputStream = new FileOutputStream( memberpath );
				// 2. �ݺ����� �̿��� ȸ������Ʈ���� �ϳ��� ȸ�� ��������
				for( Member member : MemberController.memberlist ) {
					// 3. �� ȸ������ �ʵ�[,]�� ȸ��[/n] ����
					String outstring = member.getId()+","+member.getPassword()+","+
										member.getName()+","+member.getEmail()+","+
										member.getPoint()+"\n";
					// 4. ����Ʈ�� �������� 
					fileOutputStream.write( outstring.getBytes() );
				}
				// 5. ��Ʈ�� ����� �ʱ�ȭ
				fileOutputStream.flush(); // ���Ͻ�Ʈ���� �����ϴ� ����Ʈ ���� 
				fileOutputStream.close(); // ���Ͻ�Ʈ�� �ݱ�
				
				return true; // ����ó�� ����
			}
	
		}catch (Exception e) {
			System.out.println(" [�˸�] : ���� ���� ���� �߻� [ �����ڿ��� ���� ]");
		}
		return false; // ����ó�� ����
	}
	
	// �ҷ����� �޼ҵ�
	public boolean fileload( int type ) {
		return true; // ���� ������ ������
	}
	

	
}
