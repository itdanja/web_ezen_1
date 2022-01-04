package controller;


import model.MemberDao;
import model.MemberDto;
import view.Loginpage;
import view.Mainpage;

public class Logincontroller {
	
	public static void login(String id, String password) {
		
		MemberDto memberDto = new MemberDto(id, password);
		
		boolean result = MemberDao.getmemberDao().login(memberDto);
		if(result) {
			System.out.println("로그인 성공");
			Mainpage.start();
		}else {
			System.out.println("로그인 실패 ");
			Loginpage.Loginview();
		}
	}

}
