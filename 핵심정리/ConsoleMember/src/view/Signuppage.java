package view;

import java.util.Scanner;

import controller.Signupcontroller;
import model.MemberDto;

public class Signuppage {
	
	public static void Signupview() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" ȸ������ ȭ���Դϴ� ");
		System.out.println(" ���̵� : "); String id = scanner.next();
		System.out.println(" ��й�ȣ : ");String password = scanner.next();
		System.out.println(" �̸� : ");String name = scanner.next();
		
		Signupcontroller.signup( id , password , name );
		
	}
	
}
