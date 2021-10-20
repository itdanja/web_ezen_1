package Day15;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Day15_7 {

	// 이진트리 :  하나의 노드 기준으로 왼쪽 / 오른쪽 자식 노드 가짐
		// 부모 노드 기준으로 낮은 값은 왼쪽 / 큰값은 오른쪽 
		// 
			// 1. 트리명.first() : 가장 왼쪽 노드 [ 가장 작은 값 ] 
			// 2. 트리명.last() : 가장 오른쪽 노드[ 가장 높은 값 ] 
	
	
	public static void main(String[] args) {
		
		// 1. 이진트리 객체 선언
		TreeSet<Integer> scores = new TreeSet<>();
		
		// 2. 이진트리에 객체 넣기 
		scores.add( 87 );
		scores.add( 98 );
		scores.add( 75 );
		scores.add( 95 );
		scores.add( 80 );
		
		// 3. 
		System.out.println(" 가장 낮은 점수 : " + scores.first() );
		System.out.println(" 가장 높은 점수 : " + scores.last() );
		System.out.println(" 95점 아래 점수 : " + scores.lower( 95 ) );
		System.out.println(" 95점 위 점수 : " + scores.higher(95) ); 
		System.out.println(" 93점 이거나 바로 아래 점수 : " + scores.floor(93) );
		System.out.println(" 85점 이거나 바로 위 점수 : " + scores.ceiling(85) );
		
		// 4. 내림차순 
		NavigableSet< Integer > decendingSet = scores.descendingSet();
		for( int score : decendingSet ) {
			System.out.print( score +"   " );
		}
		
		System.out.println();
		
		// 4. 오름차순 [ 내림차순+내림차순 => 오름차순 ]
		NavigableSet< Integer > ascendingSet = decendingSet.descendingSet();
		for( int score : ascendingSet ) {
			System.out.print( score +"   " );
		}
		
		System.out.println();
		
		
		while( !scores.isEmpty() ) {
			scores.pollFirst(); // 가장 낮은 점수 삭제 
			System.out.println(" 남은 객체수 : " + scores.size() );
		}
		
		
		
	}
	
}
