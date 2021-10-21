package database;

import java.io.FileOutputStream;

import controller.MemberController;
import model.Member;

public class File {
	
	// 필드
		// 1. 회원정보를 저장하는 파일의 경로 
	private static String memberpath = 
			"C:/Users/505-t/git/web_ezen_1/"
			+ "java1_Member_Board_Project/"
			+ "src/database/memberlist.txt";
	
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
	
		}catch (Exception e) {
			System.out.println(" [알림] : 파일 저장 오류 발생 [ 관리자에게 문의 ]");
		}
		return false; // 파일처리 실패
	}
	
	// 불러오기 메소드
	public boolean fileload( int type ) {
		return true; // 파일 블러오기 성공시
	}
	

	
}
