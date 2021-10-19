package 개인복습;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class test {
	
	public static void main(String[] args) {

		// while 밖에 사용하는 이유?? :  while 안에서 선언시 선언이 반복된다 x
		Scanner scanner = new Scanner(System.in);
		String[][] 회원목록 = new String[100][2];
		String[][] 방문록 = new String[100][3];
		
		while(true) {
			
			System.out.println("==========회원방문록=============");
			System.out.println(" 1.회원가입 2.로그인 >>>>>선택 :");int ch = scanner.nextInt();
			
			switch(ch) { // 어떤 변수의 값에 따라서 문장을 실행할수있도록 도와주는 제어문~!  
					// if  switch 차이 
						// if( TRUE/FALSE )		// if(  age>11 )	// if ( >= <= > == != )
						// switch( 검색대상 )  	// case 검색값  break;
			case 1 :

				System.out.printf("===========회원가입===========\n\n");
	
				System.out.println("ID :"); String id = scanner.next();
	
				System.out.println("PW :"); String pw = scanner.next();

				boolean idcheck = true; // boolean 은  참 거짓을 판단한다
	
				for (int i = 0; i < 회원목록.length; i++) {
	
					if (회원목록[i][0] !=null && 회원목록[i][0].equals(id)) {//회원목록에 존재하지않거나  회원목록에있는 아이디가 동일하면 걸리는것
	
						System.out.println("동일한 ID 가 존재합니다");
	
						idcheck =false;
	
						break;// 아이디중복체크를 알리고 멈춤
	
					}
	
				}

					if(idcheck) {// if 가 두번들어간거 형식상 왜 문제가없는 지 물어보기

						for (int i = 0; i < 회원목록.length; i++) {

							if (회원목록[i][0]==null) { 회원목록[i][0]=id ;회원목록[i][1]=pw;

							System.out.println("회원가입이 완료되었습니다");

							break;

								

							}

							

						}

					}

					break;// 여기 왜 들어갔는지 물어보기!!
						// 안쓰면 case1 실행후 -> case2 
					

		case 2 :

			System.out.println("=========로그인=========");

			System.out.println("ID 입력 :");String id2 =scanner.next();

			System.out.println("PW 입력 :");String pw2 = scanner.next();

			

			boolean id2check=true;

			for (int i = 0; i < 회원목록.length; i++) {

				if (회원목록[i][0] !=null&&회원목록[i][0].equals(id2)&&회원목록[i][1].equals(pw2)) {// 위에 입력한 아이디 비번이 같으면 로그인성공

					System.out.println("로그인성공");

					id2check = false;

					while(true) {

					System.out.println("1. 방문록 작성 2. 방문록상세 보기");
					int ch3 = scanner.nextInt();


					if (ch3==1) {

						System.out.println("=======방문록 작성하기===========");

						scanner.nextLine();

						System.out.println("제목 :");String title = scanner.nextLine();

						System.out.println("작성자 :");String writer = scanner.nextLine();

						System.out.println("내용 :");String contents = scanner.nextLine();

					

					for (int j = 0; j < 방문록.length; j++) {

						if (방문록[j][0]==null) {

							방문록[j][0]=title;방문록[j][1]=writer;방문록[j][2]=contents;

							break;

						}

						}
					}
					
					
					if(ch3==2) {

						System.out.println("=====방문록 상세 보기========");
						System.out.println("제목\t작성자\t내용");
						
						for( int j = 0 ; j<방문록.length; j++ ) {
							if( 방문록[j][0] !=null ) {
								System.out.println(방문록[j][0] +"\t"+ 방문록[j][1] +"\t"+ 방문록[j][2] );
							}
						}
					}
					// 글작성후 상세 보기에 서 막힘,,


							

				}
			}
			if( id2check ) {
				System.out.println("로그인 실패 [ 올바른 정보가 없습니다]");
			}

							

					

				}

				

			}

		

			

			

			

			

		}

	}
}

			

