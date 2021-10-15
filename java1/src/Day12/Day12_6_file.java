package Day12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Day12_6_file {
	
	// 메모리[주기억장치=RAM] : 변수 , 배열 , 객체 등등 : 프로그램 종료시 다 초기화 
		// 주기억장치 : 현재 실행중인 프로그램[ 명령어집합 ] 기억 
			// 전기X 저장X => 휘발성 메모리
		// 보조기억장치 : [ C , USB , 파일 , DB 등 ]
			// 전기X 저장O => 비휘발성 메모리 
	
	// 파일 <------ 스트림(단위:바이트)-------> JAVA프로그램

	public static void main(String[] args) throws Exception {
		// 파일처리 클래스 
			// 1. FileOutputStream : 파일출력 스트림
		FileOutputStream fileOutputStream = new FileOutputStream("C:/java/test.txt");
			// 입출력 관련된 클래스 => 무조건 예외처리발생
		String 문자열 ="이클립스에서 작성된 문서입니다";
		fileOutputStream.write( 문자열.getBytes() );
	}
}







