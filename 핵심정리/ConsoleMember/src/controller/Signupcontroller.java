package controller;


import model.MemberDao;
import model.MemberDto;
import view.Mainpage;
import view.Signuppage;

public class Signupcontroller {
	
	public static void signup( String id , String password , String name ) {
		
		boolean result2 = MemberDao.getmemberDao().idcheck(id);
		if(result2) {
			System.out.println("�ߺ��Ǵ� ���̵� �ֽ��ϴ�");
			Signuppage.Signupview();
		} else {
			System.out.println("�ߺ��Ǵ� ���̵� �����ϴ�.");
			
			MemberDto memberDto = new MemberDto(id,password,name);
			boolean result =  MemberDao.getmemberDao().signup(memberDto);
			
			if( result ) {
				System.out.println("ȸ������ ����");
				Mainpage.start();
			}else {
				System.out.println("ȸ������ ����");
				Signuppage.Signupview();
			}
		}
	}
}
