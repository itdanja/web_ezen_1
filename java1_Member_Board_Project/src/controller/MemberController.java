package controller;

import java.util.ArrayList;

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
	public boolean forgotid( String name , String email ) {
		return true; // 아이디찾기 성공시  
	}
	// 4. 비밀번호찾기[ 아이디 , 이메일 인수로 받아 해당 메일에 비밀번호 전송 ] 
	public boolean forgotpassword( String id , String email ) {
		return true; // 비밀번호찾기 성공시 
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
}
