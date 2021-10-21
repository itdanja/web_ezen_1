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
	
	//1. 필드 [ 모든 회원을 담고 있는 객체 = 컬렉션 프레임워크 vs 배열 ] 
	public static ArrayList<Member> memberlist = new ArrayList<>();

	//2. 메소드 
	// 1. 회원가입 
	public static boolean signup( Member member) {
		// 반환타입 : 
		// 1. 유효성검사 
		if( member.getId().length()<4 ){ 
			System.out.println(" [알림] : ID는 4글자이상 가능 합니다"); 
			return false; 
		}
		if( member.getPassword().length() != 4 ) { 
			System.out.println(" [알림] : Password는 4글자만 입니다"); 
			return false;  
		}
		if( member.getName().length() < 2 ) { 
			System.out.println(" [알림] : Name는 2글자이상 가능 입니다"); 
			return false; 
		}
		if( !member.getEmail().contains("@") ) { 
			System.out.println(" [알림] : Email @ 포함 가능 합니다"); 
			return false; 
		}
		// 2. ID 중복체크 [ 리스트내 동일한 아이디가 있는지 확인 ]
		for( Member temp : memberlist ) {
			if( temp.getId().equals( member.getId()) ) {
				System.out.println(" [알림] : 이미 사용중인 아이디 입니다");
				return false;
			}
		}
		// 3. 리스트 저장 
		memberlist.add(member);
		// 4. 파일 처리 
		File.filesave(1);
		//File file = new File();
		//file.filesave(1);
		
		// 5. 가입메일 전송 
		sendmail(member.getEmail(), 3, "" );
		
		return true; // 회원가입 성공시 
		
	}
	// 2. 로그인 
	public static boolean login( String id , String password ) {
		for( Member member : memberlist ) {
			if( member.getId().equals(id) && 
					member.getPassword().equals(password) ) {
				return true; // 로그인 성공시 
			}
		}
		return false; // 로그인 실패시
	}
	// 3. 아이디찾기[ 이름 , 이메일 인수로 받아 해당 메일에 아이디 전송 ]
	public static boolean forgotid( String name , String email ) {
		for( Member member : memberlist ) {
			if( member.getName().equals(name) &&
					member.getEmail().equals(email) ) {
				
				// 메일 메소드 호출 [  받는사람이메일  , 1(아이디찾기) , 정보(찾은아이디)
				sendmail(member.getEmail(), 1, member.getId() );
				
				return true; // 아이디찾기 성공시  
			}
		}
		return false; // 아이디찾기 실패  
	}
	// 4. 비밀번호찾기[ 아이디 , 이메일 인수로 받아 해당 메일에 비밀번호 전송 ] 
	public static boolean forgotpassword( String id , String email ) {
		for( Member member : memberlist ) {
			if( member.getId().equals(id) && 
					member.getEmail().equals(email) ) {
				
				sendmail(member.getEmail(), 2, member.getPassword() );
				
				return true; // 비밀번호찾기 성공시 
			}
		}
		return false; // 비밀번호찾기 실패시 
	}
	// 5. 회원정보[ 아이디를 인수로 받아 해당 아이디의 모든 정보 반환 ] 
	public Member info( String loginid ) {
		Member member = null;
		return member;
	}
	// 6. 회원정보수정[ 아이디와 수정정보를 받아서 업데이트 처리후 성공여부 반환
	public boolean info ( String loginid , Member updatemember) {
		return true;
	}
	// 7. 회원탈퇴 [ 아이디를 인수로 받아 해당 아이디 삭제 후 성공여부 반환
	public boolean delete( String loginid ) {
		return true;
	}
	
	// 8. 메일전송 메소드 
	public static void sendmail( String tomail , int type , String contents ) {
							// tomail : 받는사람 이메일 	// type : 아이디찾기(1),비밀번호찾기(2),가입메일(3)
							// contents : 메일에 넣을 정보
		
		// SMTP : 간이 우편 전송 프로토콜
			// 프로토콜 : 통신 규약 [ 약속 ] 
		
		// 1. API 라이브러리 다운 [ activation.jar , mail.jar ] 
		// 2. 현재 프로젝트에 라이브러리 등록 
		
		// 0. 설정 [ 보내는사람의 아이디 , 비밀번호 , 메일회사의 호스트 ]
		String fromemail = "관리자ID@naver.com";
		String frompassword = "관리자ID의 비밀번호";
		
		Properties properties = new Properties(); // 설정 컬렉션 map 프레임워크
		properties.put("mail.smtp.host", "smtp.naver.com"); // host : 호스트 주소 
		properties.put("mail.smtp.port" , 587 ); // port : 호스트의 접속하는 번호 
		properties.put("mail.smtp.auth" , true ); // auth : 회원인증 
		
		// 1. 인증 
		//Session session = Session.getDefaultInstance( properties , new Authenticator() {  코드  } );
		
		Session session = Session.getDefaultInstance( properties , new Authenticator() {
			
			// 익명 구현 객체 : 일회성 객체
			@Override //패스워드 인증 메소드 
			protected PasswordAuthentication getPasswordAuthentication() { 	
				return new PasswordAuthentication(fromemail, frompassword);		
			}									// 인증할 이메일 , 인증할 패스워드 
		}); // 인증 끝 
		
		try {
			// 2. 메일 보내기 
				// 1. 보내는사람의 인증정보 
			MimeMessage message = new MimeMessage(session);
				// 2. 보내는사람 메일주소 설정 
			message.setFrom( new InternetAddress(fromemail) );
				// 3. 받는 사람 메일주소 설정
			message.addRecipient( Message.RecipientType.TO , new InternetAddress(tomail) );
			
			// * type 구분 
			if( type == 1 ) {
				// 4. 메일 제목 
				message.setSubject("java console( forgot ID ) ");
				// 5. 메일 내용
				message.setText(" 회원님의 아이디 : " + contents );
			}
			if( type == 2 ) {
				message.setSubject("java console( forgot Password ) ");
				message.setText(" 회원님의 비밀번호 : " + contents );
			}
			if( type == 3 ) {
				message.setSubject("java console( Member Signup ) ");
				message.setText(" java console에 가입해주셔서 감사합니다 ~~ ");
			}
				// 6. 메일 전송 
			Transport.send(message);
			
		}
		catch (Exception e) {
			System.err.println(" [알림] : 메일전송 실패 [ 관리자에게 문의 ]"+e);
		}
	}		
	

}



























