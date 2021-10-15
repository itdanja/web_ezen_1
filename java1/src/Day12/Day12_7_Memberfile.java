package Day12;

import java.util.Scanner;

public class Day12_7_Memberfile {

	/* 회원제 프로그램 ( 파일처리 ) 
	 *  로그인/회원가입 프로그램 [ 파일처리 ]
			// [조건] : 회원가입시 회원정보 파일에 저장 
				// [회원클래스] : 아이디 , 비밀번호 , 성명 , 연락처
			// [조건] : 로그인시 파일내 회원정보가 존재하면 로그인 성공
	 */
	
	// 1. 입력받기 -> 2.객체생성 -> 3.파일쓰기[out] : 필드
	// * 주의점 : 1.회원구분 2.회원당 필드구분
	
	// 0.설정 [ main 메소드 밖에 선언하는 이유 : 다른 클래스나 메소드가 접근할수 있도록 ] 
	public static Scanner scanner = new Scanner(System.in);
		// [ static 사용하는이유 : main 메소드처럼 메모리 우선 할당 ] 
	
	public static void main(String[] args) {
		
		while(true) {
			Member temp = new Member();
			temp.signup();
		}
		
	}
}










