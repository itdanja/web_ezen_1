package view;

import java.util.Scanner;

public class Mainpage {
	
	
	public static void main(String[] args) {
	
		start();
	}
	
	public static void start() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("쇼핑몰 메인페이지 입니다");
		// 메뉴 
		System.out.println("1.로그인 2.회원가입");
		// 입력 
		int 메뉴선택 = scanner.nextInt();
		if( 메뉴선택 == 1 ) {
			Loginpage.Loginview();
		}else if(메뉴선택 == 2 ){
			Signuppage.Signupview();
		}
		
	
	}
}
