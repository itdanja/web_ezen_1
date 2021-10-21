package controller;

import java.util.ArrayList;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import database.File;
import model.Member;

public class MemberController {
	
	//1. �ʵ� [ ��� ȸ���� ��� �ִ� ��ü = �÷��� �����ӿ�ũ vs �迭 ] 
	public static ArrayList<Member> memberlist = new ArrayList<>();

	//2. �޼ҵ� 
	// 1. ȸ������ 
	public static boolean signup( Member member) {
		// ��ȯŸ�� : 
		// 1. ��ȿ���˻� 
		if( member.getId().length()<4 ){ 
			System.out.println(" [�˸�] : ID�� 4�����̻� ���� �մϴ�"); 
			return false; 
		}
		if( member.getPassword().length() != 4 ) { 
			System.out.println(" [�˸�] : Password�� 4���ڸ� �Դϴ�"); 
			return false;  
		}
		if( member.getName().length() < 2 ) { 
			System.out.println(" [�˸�] : Name�� 2�����̻� ���� �Դϴ�"); 
			return false; 
		}
		if( !member.getEmail().contains("@") ) { 
			System.out.println(" [�˸�] : Email @ ���� ���� �մϴ�"); 
			return false; 
		}
		// 2. ID �ߺ�üũ [ ����Ʈ�� ������ ���̵� �ִ��� Ȯ�� ]
		for( Member temp : memberlist ) {
			if( temp.getId().equals( member.getId()) ) {
				System.out.println(" [�˸�] : �̹� ������� ���̵� �Դϴ�");
				return false;
			}
		}
		// 3. ����Ʈ ���� 
		memberlist.add(member);
		// 4. ���� ó�� 
		File.filesave(1);
		//File file = new File();
		//file.filesave(1);
		
		// 5. ���Ը��� ���� 
		sendmail(member.getEmail(), 3, "" );
		
		return true; // ȸ������ ������ 
		
	}
	// 2. �α��� 
	public static boolean login( String id , String password ) {
		for( Member member : memberlist ) {
			if( member.getId().equals(id) && 
					member.getPassword().equals(password) ) {
				return true; // �α��� ������ 
			}
		}
		return false; // �α��� ���н�
	}
	// 3. ���̵�ã��[ �̸� , �̸��� �μ��� �޾� �ش� ���Ͽ� ���̵� ���� ]
	public static boolean forgotid( String name , String email ) {
		for( Member member : memberlist ) {
			if( member.getName().equals(name) &&
					member.getEmail().equals(email) ) {
				
				// ���� �޼ҵ� ȣ�� [  �޴»���̸���  , 1(���̵�ã��) , ����(ã�����̵�)
				sendmail(member.getEmail(), 1, member.getId() );
				
				return true; // ���̵�ã�� ������  
			}
		}
		return false; // ���̵�ã�� ����  
	}
	// 4. ��й�ȣã��[ ���̵� , �̸��� �μ��� �޾� �ش� ���Ͽ� ��й�ȣ ���� ] 
	public static boolean forgotpassword( String id , String email ) {
		for( Member member : memberlist ) {
			if( member.getId().equals(id) && 
					member.getEmail().equals(email) ) {
				
				sendmail(member.getEmail(), 2, member.getPassword() );
				
				return true; // ��й�ȣã�� ������ 
			}
		}
		return false; // ��й�ȣã�� ���н� 
	}
	// 5. ȸ������[ ���̵� �μ��� �޾� �ش� ���̵��� ��� ���� ��ȯ ] 
	public Member info( String loginid ) {
		Member member = null;
		return member;
	}
	// 6. ȸ����������[ ���̵�� ���������� �޾Ƽ� ������Ʈ ó���� �������� ��ȯ
	public boolean info ( String loginid , Member updatemember) {
		return true;
	}
	// 7. ȸ��Ż�� [ ���̵� �μ��� �޾� �ش� ���̵� ���� �� �������� ��ȯ
	public boolean delete( String loginid ) {
		return true;
	}
	
	// 8. �������� �޼ҵ� 
	public static void sendmail( String tomail , int type , String contents ) {
							// tomail : �޴»�� �̸��� 	// type : ���̵�ã��(1),��й�ȣã��(2),���Ը���(3)
							// contents : ���Ͽ� ���� ����
		
		// SMTP : ���� ���� ���� ��������
			// �������� : ��� �Ծ� [ ��� ] 
		
		// 1. API ���̺귯�� �ٿ� [ activation.jar , mail.jar ] 
		// 2. ���� ������Ʈ�� ���̺귯�� ��� 
		
		// 0. ���� [ �����»���� ���̵� , ��й�ȣ , ����ȸ���� ȣ��Ʈ ]
		String fromemail = "������ID@naver.com";
		String frompassword = "������ID�� ��й�ȣ";
		
		Properties properties = new Properties(); // ���� �÷��� map �����ӿ�ũ
		properties.put("mail.smtp.host", "smtp.naver.com"); // host : ȣ��Ʈ �ּ� 
		properties.put("mail.smtp.port" , 587 ); // port : ȣ��Ʈ�� �����ϴ� ��ȣ 
		properties.put("mail.smtp.auth" , true ); // auth : ȸ������ 
		
		// 1. ���� 
		//Session session = Session.getDefaultInstance( properties , new Authenticator() {  �ڵ�  } );
		
		Session session = Session.getDefaultInstance( properties , new Authenticator() {
			
			// �͸� ���� ��ü : ��ȸ�� ��ü
			@Override //�н����� ���� �޼ҵ� 
			protected PasswordAuthentication getPasswordAuthentication() { 	
				return new PasswordAuthentication(fromemail, frompassword);		
			}									// ������ �̸��� , ������ �н����� 
		}); // ���� �� 
		
		try {
			// 2. ���� ������ 
				// 1. �����»���� �������� 
			MimeMessage message = new MimeMessage(session);
				// 2. �����»�� �����ּ� ���� 
			message.setFrom( new InternetAddress(fromemail) );
				// 3. �޴� ��� �����ּ� ����
			message.addRecipient( Message.RecipientType.TO , new InternetAddress(tomail) );
			
			// * type ���� 
			if( type == 1 ) {
				// 4. ���� ���� 
				message.setSubject("java console( forgot ID ) ");
				// 5. ���� ����
				message.setText(" ȸ������ ���̵� : " + contents );
			}
			if( type == 2 ) {
				message.setSubject("java console( forgot Password ) ");
				message.setText(" ȸ������ ��й�ȣ : " + contents );
			}
			if( type == 3 ) {
				message.setSubject("java console( Member Signup ) ");
				message.setText(" java console�� �������ּż� �����մϴ� ~~ ");
			}
				// 6. ���� ���� 
			Transport.send(message);
			
		}
		catch (Exception e) {
			System.err.println(" [�˸�] : �������� ���� [ �����ڿ��� ���� ]"+e);
		}
	}		
	

}



























