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
			System.out.println("�α��� ����");
			Mainpage.start();
		}else {
			System.out.println("�α��� ���� ");
			Loginpage.Loginview();
		}
	}

}
