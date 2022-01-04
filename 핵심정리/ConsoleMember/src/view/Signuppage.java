package view;

import java.util.Scanner;

import controller.Signupcontroller;
import model.MemberDto;

public class Signuppage {
	
	public static void Signupview() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" 회원가입 화면입니다 ");
		System.out.println(" 아이디 : "); String id = scanner.next();
		System.out.println(" 비밀번호 : ");String password = scanner.next();
		System.out.println(" 이름 : ");String name = scanner.next();
		
		Signupcontroller.signup( id , password , name );
		
	}
	
}
