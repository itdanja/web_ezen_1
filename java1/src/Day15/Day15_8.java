package Day15;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Day15_8 {

	
	// p.761
	
	public static void main(String[] args) {
		// 1. map컬렉션 객체 선언 
		TreeMap< Integer , String  > scores = new TreeMap<>();
			//   키=integer , 값=string
		
		// 2. map에 객체 넣기 [ 자동 정렬 => 이진트리 ]
		scores.put( 87 , "홍길동" );
		scores.put( 98 , "이동수" );
		scores.put( 75 , "박길순" );
		scores.put( 95 , "신용권" );
		scores.put( 80 , "김자바" );
		
		// 3. 내림차순 [ scores.descendingMap() 인터페이스에 연결 ]
		NavigableMap< Integer, String > desc = scores.descendingMap();
			
		for( Map.Entry<Integer, String> entry : desc.entrySet() ) {
			// 					엔트리 자료형	  :	정렬된 엔트리 
			System.out.print( entry.getKey()+"-"+entry.getValue() +"    " );
		}
		System.out.println(); 
		// 3. 오름차순
		NavigableMap< Integer , String > asc = desc.descendingMap();
		
		for( Map.Entry<Integer, String> entry : asc.entrySet() ) {
			System.out.print( entry.getKey()+"-"+entry.getValue() +"    " );
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
