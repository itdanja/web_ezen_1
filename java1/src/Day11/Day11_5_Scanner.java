package Day11;

import java.util.Scanner;

public class Day11_5_Scanner {

	
	public static void main(String[] args) {

		//0.준비물
		String[] 도서목록 = {	"된다! 네이버 블로그&포스트","스프링 부트 실전 활용 마스터","Tucker의 Go 언어 프로그래밍","혼자 공부하는 C 언어"};
		Scanner scanner = new Scanner(System.in);
		
		// 1.메뉴 
		while(true) {
			System.out.print("1.검색 2.수정   선택 : ");
			int ch = scanner.nextInt();
			if( ch==1 ) { System.out.println("---------검색창---------");}
			if( ch==2 ) { System.out.println("---------수정창---------");}
		}
		
	}
}
