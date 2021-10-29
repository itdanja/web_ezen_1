package domain;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Member {

	// 1. �ʵ� 
	private String m_id; 
	private String m_password; 
	private String m_name; 
	private String m_email; 
	private int m_point; 
	
	// 2. ������ 
		// 1. �� ������ 
	public Member() {}
		// 2. ��� �ʵ带 �޴� ������ [ DB/FILE ���� �����ö� ���Ǵ� ������ ]
	public Member(String m_id, String m_password, String m_name, String m_email, int m_point) {
		this.m_id = m_id;
		this.m_password = m_password;
		this.m_name = m_name;
		this.m_email = m_email;
		this.m_point = m_point;
	}
	// 3. ȸ�����Խ� ���Ǵ� ������ [ ����Ʈ�� ���� => �ʱⰪ ] 
	public Member(String m_id, String m_password, String m_name, String m_email) {
		this.m_id = m_id;
		this.m_password = m_password;
		this.m_name = m_name;
		this.m_email = m_email;
		this.m_point = 1000;
	}
	// 4. ȸ�������� ���Ǵ� ������ 
	public Member(String m_name, String m_email) {
		this.m_name = m_name;
		this.m_email = m_email;
	}
	

	// 3. �޼ҵ�
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getM_password() {
		return m_password;
	}
	public void setM_password(String m_password) {
		this.m_password = m_password;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_email() {
		return m_email;
	}
	public void setM_email(String m_email) {
		this.m_email = m_email;
	}
	public int getM_point() {
		return m_point;
	}
	public void setM_point(int m_point) {
		this.m_point = m_point;
	}
	
	
	// Email ���� �޼ҵ�			
	public static void sendmail(String tomail , String msg , int type ) {
								// �޴»�� // ���� ���� // ���� Ÿ��
		// ������ ��� ����
		String fromemail = "kgs2072@naver.com";
		String frompassword = "�н�����";
		
		// ���̹�,����,īī�� ȣ��Ʈ ���� 
		Properties properties = new Properties();
		properties.put("mail.smtp.host", "smtp.naver.com"); // host : ȣ��Ʈ �ּ� 
		properties.put("mail.smtp.port", 587 );		// post : ȣ��Ʈ�� �����ϴ� ��ȣ 
		properties.put("mail.smtp.auth", true );	// auth : ���� 
		
		// ���� 
		Session session = Session.getDefaultInstance(properties , new Authenticator() {
			// �͸� ���� ��ü 
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromemail, frompassword);
			}
		}); // ���� �� 
		
		// ���� ������
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom( new InternetAddress(fromemail) );
			message.addRecipient( Message.RecipientType.TO, new InternetAddress(tomail));
			
			if( type == 2 ) { // ��й�ȣ ã�� Ÿ�� 
				message.setSubject("Nike community ȸ������ �н����� ��� ");
				message.setText(" ȸ������ ��й�ȣ : "+ msg );
			}
			Transport.send(message);
		}
		catch (Exception e) {}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}






























