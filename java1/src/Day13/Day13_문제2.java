package Day13;

import java.util.Scanner;

public class Day13_����2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean sw = true; // ���� ��� ���� Ȯ�� ���� 
		boolean sw2 = true; // true�̸� ��������  false : �������
		
		while(true) {
			System.out.println("1.������� 2.��ȭ���");
			int ch =scanner.nextInt();
			
			if( ch == 1 ) {
				Thread thread = new Music();
				if( sw ) {
					Music.musicstop( sw );
					thread.start();
					sw = false;
				}else {
					Music.musicstop( sw );
					sw = true;
				}
			}else if( ch == 2 ) {
				// 1. �����屸�� ��ü ���� 
				Thread thread = new Movie();
				
				if( sw2 ) {
					Movie.moviestop(sw2); // ��ȭ���� 
					thread.start();
					sw2 = false;
				}else {
					Movie.moviestop(sw2);
					sw2= true;
				}
				
			}
			
		}
		
	}
	

}
