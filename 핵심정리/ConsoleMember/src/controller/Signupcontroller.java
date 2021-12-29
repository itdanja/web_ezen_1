package controller;


import model.MemberDao;
import model.MemberDto;
import view.Mainpage;
import view.Signuppage;

public class Signupcontroller {
	
	public static void signup( String id , String password , String name ) {
		
		boolean result2 = MemberDao.getmemberDao().idcheck(id);
		if(result2) {
			System.out.println("중복되는 아이디가 있습니다");
			Signuppage.Signupview();
		} else {
			System.out.println("중복되는 아이디가 없습니다.");
			
			MemberDto memberDto = new MemberDto(id,password,name);
			boolean result =  MemberDao.getmemberDao().signup(memberDto);
			
			if( result ) {
				System.out.println("회원가입 성공");
				Mainpage.start();
			}else {
				System.out.println("회원가입 실패");
				Signuppage.Signupview();
			}
		}
	}
}
