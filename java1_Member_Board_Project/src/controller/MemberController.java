package controller;

import java.util.ArrayList;

import model.Member;

public class MemberController {
	
	//1. 필드 [ 모든 회원을 담고 있는 객체 = 컬렉션 프레임워크 vs 배열 ] 
	public static ArrayList<Member> memberlist = new ArrayList<>();

	//2. 메소드 
	// 1. 회원가입 
	public boolean signup( Member member) {
		// 반환타입 : 
		return true; // 회원가입 성공시 
	}
	// 2. 로그인 
	public boolean login( String id , String password ) {
		return true; // 로그인 성공시 
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
