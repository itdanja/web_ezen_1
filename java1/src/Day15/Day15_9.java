package Day15;

import java.util.Iterator;
import java.util.TreeSet;

public class Day15_9 {

	
	public static void main(String[] args) {
		
		// 1. tree 컬렉션 선언 
		TreeSet< Person > treeSet = new TreeSet<>();
		
		// 2. tree 객체 넣기 
		treeSet.add( new Person("홍길동", 45) );
		treeSet.add( new Person("감자바", 25) );
		treeSet.add( new Person("박지원", 31) );
			// tree -> compareTo 자동정렬 --> 객체 ( 필드 1, 필드2 , 필드3 )  : 기준 없기 때문에 정
				// tree -> compareTo -> 나이 정렬
		
		// 3. 나이 기준으로 오름차순 
		Iterator<Person> iterator = treeSet.iterator();
		while( iterator.hasNext() ) {
						// hasNext() : 다음 객체가 있는지 확인 
			Person person = iterator.next();
						// next() : 객체 가져오기
			System.out.println( person.name +" \t "+person.age );
		}
		// 3. 
		for( Person person : treeSet ) {
			System.out.println( person.name +" \t "+person.age );
		}
		
		
		
		
		
		
		
		
		
		
	}
	
}
