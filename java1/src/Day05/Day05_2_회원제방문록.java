package Day05;

import java.util.Scanner;

public class Day05_2_회원제방문록 {
	
	public static void main(String[] args) {
		
		// 0.입력 객체
		Scanner scanner = new Scanner(System.in);
		
		// 1. 회원 100명[id,pw] 저장하는 방법 선언 
		String[][] 회원목록 = new String[100][2]; // 100행 * 2열 => 200칸 
		
		// 2. 메뉴 => 메뉴는 계속 반복실행  : 무한루프 [ while ] 
		while(true) {
			System.out.println("\n\n\t - 회원제 방문록 - ");
			System.out.println("-------------------------------");
			System.out.print(" [[ 1.회원가입 2.로그인  선택 : ");
			int ch = scanner.nextInt(); 
			// 3. 입력에 따른 값 제어 
			switch(ch) {
				case 1 : 
					System.out.println(" - 회원가입 페이지 "); 
					System.out.println(" Id : ");	String id = scanner.next();
					System.out.println(" Password : "); String pw = scanner.next();
					
					// id 중복체크 [ 배열내 모든 인덱스에 접근해서 동일한 아이디가 있는지 체크 ]
					boolean idcheck = true; // 중복체크 변수 
					for( int i = 0  ;  i<회원목록.length ; i++ ) {  // 회원목록.length : 배열의 가로길이 => 100
						if( 회원목록[i][0] != null && 회원목록[i][0].equals(id) ) { // i번째 id와 동일하면 
							System.out.println("[[알림]] : 중복된 아이디가 존재합니다 ");
							idcheck = false;
							break; // 중복찾기 for 종료 
						}
					}
					// 중복체크 변수가 true이면 배열내 빈 공간을 찾아서 저장 
					if( idcheck ) {
						for( int i = 0 ; i<회원목록.length ; i++ ) {
							if( 회원목록[i][0] == null ) { // i번째가 공백이면 
								회원목록[i][0] = id ; 회원목록[i][1] = pw;
								System.out.println("[[알림]] : 회원가입이 되었습니다");
								break; // 저장하기 for 종료 
							}
						}
					}
					break;
				
				case 2 :
					System.out.println(" - 로그인 페이지 "); break;
				default :
					System.out.println("[[알림]] : 알수 없는 번호 입니다 ");
			}
		}
		
		
		
		
		
	}

}
