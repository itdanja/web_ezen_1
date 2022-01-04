package view;

import java.util.Scanner;

import controller.Logincontroller;


public class Loginpage {
	
	public static void Loginview() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" 로그인 화면입니다"); 
		System.out.println(" 아이디 : "); String id = scanner.next();
		System.out.println(" 비밀번호 : "); String password = scanner.next();
		
		
		Logincontroller.login(id, password);
		
	}
	
}
