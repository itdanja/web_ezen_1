package Day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Day12_6_file {
	
	// 메모리[주기억장치=RAM] : 변수 , 배열 , 객체 등등 : 프로그램 종료시 다 초기화 
		// 주기억장치 : 현재 실행중인 프로그램[ 명령어집합 ] 기억 
			// 전기X 저장X => 휘발성 메모리
		// 보조기억장치 : [ C , USB , 파일 , DB 등 ]
			// 전기X 저장O => 비휘발성 메모리 
	
	// 파일 <------ 스트림(단위:바이트)-------> JAVA프로그램

	public static void main(String[] args) throws Exception {
		// 파일처리 클래스 
			// 1. FileOutputStream : 파일출력 스트림 [ 해당 파일이 없으면 파일 생성 ] 
				// FileOutputStream 객체명 = new FileOutputStream("파일경로/파일명.확장자");
					//   / : 경로 
				// 1. write( 바이트형 ) : 해당 파일에 쓰기 
		//FileOutputStream fileOutputStream = new FileOutputStream("C:/java/test.txt");
		FileOutputStream fileOutputStream = 
				new FileOutputStream("C:/Users/505-t/git/web_ezen_1/java1/src/Day12/test.txt");
			// 입출력 관련된 클래스 => 무조건 예외처리발생
		String 문자열 ="이클립스에서 작성된 문서입니다"; // 한글14 * 2 => 28 + 2(sp) => 30
		fileOutputStream.write( 문자열.getBytes() );
		
			// 2. FileInputStream : 파일입력 스트림 
				// FileInputStream 객체명 = new FileInputStream("파일경로/파일명.확장자");
				// 1. read( 바이트배열 ) : 해당 파일을 바이트배열에 읽기 
		//FileInputStream fileInputStream = new FileInputStream("C:/java/test.txt");
		FileInputStream fileInputStream = 
				new FileInputStream("C:/Users/505-t/git/web_ezen_1/java1/src/Day12/test.txt");
			// 읽어온 바이트를 저장할 배열 
		byte[] 바이트배열 = new byte[1024]; // 1bit[0,1] -> 8bit[ 1byte ] -> 1024byte[ 1kb ]
		fileInputStream.read( 바이트배열 ); // 파일 읽어오기 
			//System.in.read(); // 키보드 읽어오기 
			// 바이트 -> 문자열 변환 
		String strread = new String( 바이트배열 );
		System.out.println(" 현재 파일의 내용은 : " + strread );
		
		///////////////////// 
		// 키보드에 입력된 변수를 메모장 누적 저장 
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("메모장 입력할 데이터 : ");
			String outstr = scanner.next();
			outstr = outstr +"\n";
			fileOutputStream.write( outstr.getBytes() );
		}
		
	}
}







