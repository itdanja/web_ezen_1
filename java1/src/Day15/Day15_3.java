package Day15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Day15_3 {
	
	public static void main(String[] args) {
		
		// Map : 키(key) · 값(value) = 엔트리(Entry)
		
		// p.743 HashMap
		
		//1. map 객체 선언 
		HashMap<String, Integer> map = new HashMap<>();
			// Map< 키 , 값 > : 제네릭 2개
		
		// 2. map에 객체( 엔트리{키=값} )  추가
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);	// 키 중복 => 중복 불가
		System.out.println( map );
		System.out.println( map.size());
		
		// 3. 객체 검색 [ get("키") => 값 ]
		System.out.println(map.get("홍길동"));
		
		// 4. 
		Set<String> set =  map.keySet(); 
			// map에 있는 key를 set에 저장 
		Iterator< String > iterator = set.iterator();
		while( iterator.hasNext() ) {
					// hasNext() : 다음 객체가 존재하는 여부 확인
			String key = iterator.next();
			System.out.println( map.get(key) );
		}
		// 4.
		for( String key : map.keySet() ) {
			System.out.println( map.get(key) );
		}
		// 4.
		Set< Map.Entry<String, Integer>  > entryset = map.entrySet();
		
		// 5. 삭제 
		map.remove("홍길동"); // 해당 키의 엔트리 삭제 
		System.out.println( map );
		map.clear(); // 모든 엔트리 삭제 
		System.out.println( map );
	}
	

}
