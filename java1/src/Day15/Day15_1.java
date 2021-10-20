package Day15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Day15_1 {
	
		
	// 컬렉션 : [배열 문제 보완] 자료구조 바탕으로 객체를 추가,삭제,검색  
		//1. List : 순서(인덱스)를 유지하고 저장 // 배열과 유사 // 중복 저장 가능 
			// 1. ArrayList 2.Vector 3.LinkedList
				// 1. 리스트명.add(객체명) : 해당 객체를 리스트에 저장 
						// * 리스트명.add( 인덱스 , 객체명) : 해당 인덱스에 객체를 저장 
				// 2. 리스트명.contains(객체명) : 해당 객체가 리스트에 존재 여부 ( true , false )
				// 3. 리스트명.indexOf( 객체명 ) : 해당 객체의 인덱스 번호 
				// 4. 리스트명.get(인덱스) : 해당 인덱스의 객체 호출 
				// 5. 리스트명.isEmpty() : 리스트가 비어 있는지 확인 ( true , false )
				// 6. 리스트명.size() : 리스트내 객체수 
				// 7. 리스트명.clear() : 리스트 초기화 [ 모든 객체 삭제 ] 
				// 8. 리스트명.remove( 인덱스 or 객체명 ) : 해당 인덱스 혹은 객체 삭제 
			// 2. 차이 
				// ArrayList : 단일스레드(동기화x) , 검색 용이
				// Vector : 멀티스레드(동기화)
				// LinkedList : 중간에 삽입/삭제 용이 
	
		//2. Set : 순서를 유지하지 않고 저장 // 중복 저장 불가 
			// 1. HashSet 2.TreeSet
				// 1. set명.add(객체명) : 해당 객체를 set에 저장 
				// 2. set명.contains( 객체명 ) : 해당 객체가 set에 존재 여부 확인 ( true , false )
				// 3. set명.isEmpty() : set가 비어 있는지 확인 ( true , false )
				// *4. set명.iterator() : 저장된 객체를 하나씩 가져오는 반복자 리턴 
						// 1. hashNext() : 다음 객체가 존재하면 true 없으면 false
						// 2. next() : 객체 가져오기 
						// 3. remove() : 객체 삭제
				// 5. set명.size() : set내 객체수 
				// 6. set명.clear() : set 초기화 
				// 7. set명.remove( 객체 ) : 해당 인덱스 객체 삭제 
	
		//3. Map : 키·값 한쌍으로 저장 // 키는 중복 저장 불가 
			// 1. HashMap 2. Hashtable 3.TreeMap 4.Properties
				// 1. map명.put( 키 , 값 )  : 키와 값으로 이루어진 엔트리 추가 
				// 2. map명.containsKey( 키 ) : 키 존재 여부 확인 
				// 3. map명.containsValue( 값 ) : 값 존재 여부 확인 
				// 4. map명.entryset() :해당 엔트리 set에 저장 
				// 5. map명.get( 키 ) : 해당 키의 값을 호출 
				// 6. map명.isEmpty() : map이 비어 있는지 확인 
				// 7. map명.keyset() : 해당 키를 set에 저장 
				// 8. map명.size() : map내 키의 수 
	
	public static void main(String[] args) {
		
		// p.729
			// ArrayList : 동기화x --> 단일스레드
			// Vector : 동기화o --> 멀티스레드 ( 멀티미디어 프로그래밍 )
		
		// 1. 리스트 선언 [ 리스트 안에 넣을 자료형 선언(제네릭) ]
		Vector<Board> boards = new Vector<>(); 
			// <제네릭> : 리스트 안에 들어갈 자료형 
		// 2. 리스트 객체 넣기 
			// 1. 
		boards.add( new Board("제목1", "내용1", "글쓴이1") );
			// 2. 
			Board board = new Board("제목2", "내용2", "글쓴이2");
		boards.add( board );
		boards.add( new Board("제목3", "내용3", "글쓴이3") );
		boards.add( new Board("제목4", "내용4", "글쓴이4") );
		boards.add( new Board("제목5", "내용5", "글쓴이5") );
		
		System.out.println( boards );
		// 삭제 
		boards.remove(2); // 2번 객체 삭제시 => 2번 뒤로 한칸씩 당겨짐
		boards.remove(3); // 3번 객체 삭제시 => 3번 뒤로 한칸씩
		
		// 출력
		for( Board temp : boards ) {
			// 리스트내 객체를 하나씩 왼쪽에 대입
			System.out.println( temp.subject );
			System.out.println( temp.content );
			System.out.println( temp.writer );
		}
		
		// p.732
			// ArrayList : 추가, 검색 용이
			// Linkedlist : 삽입, 삭제 용이
		
		ArrayList<String> list1 = new ArrayList<>();
		LinkedList<String> list2 = new LinkedList<>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		//1. arraylist에 i를 0번 인덱스에 10000 개 삽입
		for( int i = 0 ; i<10000 ;i++) {
			list1.add( 0 , String.valueOf(i) );
		}
		endTime = System.nanoTime();
		System.out.println(" arraylist 10000개 삽입 시간 : " + (endTime-startTime) + "ns");
	////////////////////////////////////////////////////////////////////////////////////////////////////	
		startTime = System.nanoTime();
		//2. Linkedlist에 i를 0번 인덱스에 10000 개 삽입 
		for( int i = 0 ; i<10000 ;i++) {
			list2.add(0 , String.valueOf(i) );
		}
		endTime = System.nanoTime();
		System.out.println("Linkedlist 10000개 삽입 시간 : " + (endTime-startTime) + "ns");
		
	}
}





