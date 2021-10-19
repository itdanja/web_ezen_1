package Day14;

import java.util.ArrayList;
import java.util.Scanner;

public class Day14_4_회원제_List {

	// 회원제 프로그램 
		// 1. 리스트를 이용한 회원가입 , 로그인 , 회원정보 , 회원수정 , 회원탈퇴 
	public static void main(String[] args) {
		
		// 0.설정  [ 입력객체 ]
		Scanner scanner = new Scanner(System.in);
		// 0.설정 [ 리스트 선언 : User 클래스만 담을수 있는 클래스 ( User클래스의 하위도 가능) ] 
		ArrayList<Object> users = new ArrayList<>();
		
		
		
		// 1. 메뉴 
		while(true) {
			
			System.out.println("1.회원가입 2.로그인 ");
			int ch = scanner.nextInt();
			if( ch == 1 ) {
				// 1. 입력받기 
				System.out.println(" 아이디 : ");		String id = scanner.next();
				System.out.println(" 비밀번호 : ");	String password = scanner.next();
				System.out.println(" 성명 : ");		String name = scanner.next();
				
				// 2. 입력받은 데이터를 객체화 [ 3개 변수를 하나의 객체로 ]
				User user = new User(id,password,name);
				
				// 3. 리스트에 저장 
				users.add( user );
				
			}
		}
	}
}
