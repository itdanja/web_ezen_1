package view;

import java.util.Scanner;

import controller.Logincontroller;


public class Loginpage {
	
	public static void Loginview() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" �α��� ȭ���Դϴ�"); 
		System.out.println(" ���̵� : "); String id = scanner.next();
		System.out.println(" ��й�ȣ : "); String password = scanner.next();
		
		
		Logincontroller.login(id, password);
		
	}
	
}
