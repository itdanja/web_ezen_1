package view;

import java.util.Scanner;

public class Mainpage {
	
	
	public static void main(String[] args) {
	
		start();
	}
	
	public static void start() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("���θ� ���������� �Դϴ�");
		// �޴� 
		System.out.println("1.�α��� 2.ȸ������");
		// �Է� 
		int �޴����� = scanner.nextInt();
		if( �޴����� == 1 ) {
			Loginpage.Loginview();
		}else if(�޴����� == 2 ){
			Signuppage.Signupview();
		}
		
	
	}
}
