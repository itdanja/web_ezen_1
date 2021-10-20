package Day15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Day15_6 {
	
	// 컬렉션 프레임워크 중첩 ( 여러개 컬렉션 을 하나의 컬렉션 관리 )
	public static void main(String[] args) {
		// 중첩  map< 키 , arraylist >
		HashMap< String , ArrayList<String> > 관리명단 = new HashMap<>();
			ArrayList<String> 의류명단 = new ArrayList<>();
			ArrayList<String> 신발명단 = new ArrayList<>();
		관리명단.put( "의류", 의류명단 );
		관리명단.put( "신발", 신발명단);
		
		Scanner scanner = new Scanner(System.in);
		while( true ) {
			
			System.out.println("------------ 제품 현황 --------------");
			for( int i = 0 ; i<의류명단.size(); i++ ) {
				System.out.println( 관리명단.get("의류").get(i) );
			}
			
			System.out.println(" 제품등록 : 1.의류 2.신발");		int ch = scanner.nextInt();
			if( ch== 1 ) {
				System.out.println(" 제품명 : ");	String 제품명 = scanner.next();
				의류명단.add(제품명);
			}
		}
	}
}
