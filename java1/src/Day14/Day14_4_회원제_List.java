package Day14;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Day14_4_회원제_List {

	// 회원제 프로그램 
		// 1. 리스트를 이용한 회원가입 , 로그인 , 회원정보 , 회원수정 , 회원탈퇴 
	public static void main(String[] args) {
		
		// 0.설정  [ 입력객체 ]
		Scanner scanner = new Scanner(System.in);
		// 0.설정 [ 리스트 선언 : User 클래스만 담을수 있는 클래스 ( User클래스의 하위도 가능) ] 
		ArrayList<User> users = new ArrayList<>();
		// 0.설정 [ 파일 읽어오기 : 파일에 있는 회원들을 리스트에 저장 ]
		
		
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
				
					// * 아이디 중복체크 [ 리스트내 객체 하나씩 temp에 대입 ] 
					boolean idcheck = true;
					for( User temp : users ) {
						if( temp.getId().equals(id) ) {
							System.out.println(" [[ 중복된 아이디 입니다 ]]");
							idcheck=false;	 break;
						}
					}
				// 3. 리스트에 저장 [ 만약에 중복값이 없으면 ]
				if( idcheck ) {users.add( user ); System.out.println(" [[ 회원가입 성공 ]]");}
				// 4. 파일처리 
					// 1. 파일출력 클래스
							// new FileOutputStream("파일경로/파일명.확장자" );  새로쓰기 
							// new FileOutputStream("파일경로/파일명.확장자" , true );  이어쓰기 
					try {
						
						FileOutputStream fileOutputStream = 
							new FileOutputStream("C:/Users/505-t/git/web_ezen_1/java1/src/Day14/userlist.txt" , true );
						
						// 2. 필드간 구분 [ , ]  // 회원간 구분 [ \n ]
						String outstring = user.getId()+","+user.getPassword()+","+user.getName()+"\n";
						
						// 3. String ---> bytes 내보내기 [ write( 바이트열 ) ]
						fileOutputStream.write( outstring.getBytes() );
					
						System.out.println(" [[ 파일 처리 성공 ]]");
				
					}
					catch (Exception e) {
						System.out.println(" [[ 파일 처리 실패 ]]");
					}
				
			}
			else if( ch == 2  ) {
				// 1. 입력받기 
				System.out.println(" 아이디 : ");		String id = scanner.next();
				System.out.println(" 비밀번호 : ");	String password = scanner.next();
				// 2. 리스트내 객체와 비교 하기 
				
				boolean logincheck = true;
				for( User temp : users ) {
					if( temp.getId().equals(id) && temp.getPassword().equals(password) ) {
						System.out.println(" [[ 로그인 성공 ]]"); 
						logincheck = false; break;
					}
				}
				if( logincheck ) { System.out.println(" [[ 동일한 회원정보가 없습니다 ]]  "); }
			}
		}
	}
}







