package database;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;

import controller.BoardController;
import controller.MemberController;
import model.Board;
import model.Member;

public class File {
	
	// 필드
		// 1. 회원정보를 저장하는 파일의 경로 
	private static String memberpath = 
			"C:/Users/505-t/git/web_ezen_1/"
			+ "java1_Member_Board_Project/"
			+ "src/database/memberlist.txt";
		// 2. 게시물를 저장하는 파일의 경로 
	private static String boardpath = 
			"C:/Users/505-t/git/web_ezen_1/"
			+ "java1_Member_Board_Project/"
			+ "src/database/boardlist.txt";
	
	
	// 저장 메소드 
	public static boolean filesave( int type ) {
							// type : 1:회원저장 2:게시물저장 3:댓글저장
		try {				
			FileOutputStream fileOutputStream = null; //ㄴ선언만
			if( type == 1 ) { // 회원저장 
				// 1. 파일객체에 경로 설정 
				fileOutputStream = new FileOutputStream( memberpath );
				// 2. 반복문을 이용한 회원리스트에서 하나씩 회원 가져오기
				for( Member member : MemberController.memberlist ) {
					// 3. 각 회원마다 필드[,]와 회원[/n] 구분
					String outstring = member.getId()+","+member.getPassword()+","+
										member.getName()+","+member.getEmail()+","+
										member.getPoint()+"\n";
					// 4. 바이트로 내보내기 
					fileOutputStream.write( outstring.getBytes() );
				}
				// 5. 스트림 사용후 초기화
				fileOutputStream.flush(); // 파일스트림내 존재하는 바이트 제거 
				fileOutputStream.close(); // 파일스트림 닫기
				
				return true; // 파일처리 성공
			}
			if( type == 2 ) {
				
				fileOutputStream = new FileOutputStream( boardpath );
				for( Board board : BoardController.boardlist ) {
					String outstring = board.getTitle()+","+board.getContents()+","+
										board.getWriter()+","+board.getDate()+","+
										board.getView()+"\n";
					fileOutputStream.write( outstring.getBytes() );
				}
				fileOutputStream.flush();
				fileOutputStream.close(); 
				return true;
		
			}
			if( type == 3 ) {}
			
	
		}catch (Exception e) {
			System.out.println(" [알림] : 파일 저장 오류 발생 [ 관리자에게 문의 ]");
		}
		return false; // 파일처리 실패
	}
	
	// 불러오기 메소드
	public static boolean fileload( int type ) {
		try { // 예외처리 하는이유 ?? 
			FileInputStream fileInputStream = null;
			if( type == 1 ) {
				// 1. 입력스트림 경로 설정 
				fileInputStream = new FileInputStream(memberpath);
				// 2. 스트림(단위:바이트) 바이트배열 선언 
				byte[] bytes = new byte[10000]; // 10kb 정도
				// 3. 입력스트림에서 바이트 읽어와서 배열에 저장 
				fileInputStream.read( bytes );
				// 4. 바이트배열 -> 문자열 변환
				String instring = new String(bytes);
				// 5. 회원 분리하기 \n
				String[] members = instring.split("\n"); // \n 구분시 공백회원 추가 
				// 6. 반복문을 이용한 회원별 필드 분리하기 ,
				for( int i = 0 ; i<members.length-1 ;i++ ) { // -1 : 공백회원 제외
					// 7. 회원별 필드 분리 	
					String[] field = members[i].split(",");
					// 8. 분리된 필드를 객체화 [ point필드는 int형으로 변환 : String -> Int ( Integer.parseInt )  ] 
					Member member = new Member( field[0] , field[1] ,  
									field[2], field[3],  
									Integer.parseInt(field[4] ));
					// 9. 각 객체를 리스트에 저장
					MemberController.memberlist.add(member);
				}
				fileInputStream.close(); // 스트림 닫기 
				return true; // 파일 불러오기 성공
			}
			if( type == 2 ) {
			
				fileInputStream = new FileInputStream(boardpath); // 1. 파일경로 
				byte[] bytes = new byte[10000]; // 10kb 정도 // 2. 파일용량 
				fileInputStream.read( bytes );	// 3. 파일 읽기 
				String instring = new String(bytes); // 4. 문자열 변환 
				String[] boards = instring.split("\n"); // 5. 게시물 \n 구분 
				
				for( int i = 0 ; i<boards.length-1 ;i++ ) { //6.  -1 : 마지막 게시물 제외
					String[] field = boards[i].split(",");
					Board board = new Board( field[0] , field[1] , field[2], 
									field[3]  , Integer.parseInt(field[4]));
					BoardController.boardlist.add(board);
				}
				
				fileInputStream.close(); // 스트림 닫기 
				return true; // 파일 불러오기 성공
			}
			if( type == 3 ) {}
		}
		catch (Exception e) {
			System.out.println(" [알림] : 파일 불러오기 오류 발생 [ 관리자에게 문의 ]");
		}
		return false; // 파일 블러오기 실패시
	}
	

	
}








