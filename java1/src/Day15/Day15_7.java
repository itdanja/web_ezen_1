package Day15;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Day15_7 {

	// ����Ʈ�� :  �ϳ��� ��� �������� ���� / ������ �ڽ� ��� ����
		// �θ� ��� �������� ���� ���� ���� / ū���� ������ 
		// 
			// 1. Ʈ����.first() : ���� ���� ��� [ ���� ���� �� ] 
			// 2. Ʈ����.last() : ���� ������ ���[ ���� ���� �� ] 
	
	
	public static void main(String[] args) {
		
		// 1. ����Ʈ�� ��ü ����
		TreeSet<Integer> scores = new TreeSet<>();
		
		// 2. ����Ʈ���� ��ü �ֱ� 
		scores.add( 87 );
		scores.add( 98 );
		scores.add( 75 );
		scores.add( 95 );
		scores.add( 80 );
		
		// 3. 
		System.out.println(" ���� ���� ���� : " + scores.first() );
		System.out.println(" ���� ���� ���� : " + scores.last() );
		System.out.println(" 95�� �Ʒ� ���� : " + scores.lower( 95 ) );
		System.out.println(" 95�� �� ���� : " + scores.higher(95) ); 
		System.out.println(" 93�� �̰ų� �ٷ� �Ʒ� ���� : " + scores.floor(93) );
		System.out.println(" 85�� �̰ų� �ٷ� �� ���� : " + scores.ceiling(85) );
		
		// 4. �������� 
		NavigableSet< Integer > decendingSet = scores.descendingSet();
		for( int score : decendingSet ) {
			System.out.print( score +"   " );
		}
		
		System.out.println();
		
		// 4. �������� [ ��������+�������� => �������� ]
		NavigableSet< Integer > ascendingSet = decendingSet.descendingSet();
		for( int score : ascendingSet ) {
			System.out.print( score +"   " );
		}
		
		System.out.println();
		
		
		while( !scores.isEmpty() ) {
			scores.pollFirst(); // ���� ���� ���� ���� 
			System.out.println(" ���� ��ü�� : " + scores.size() );
		}
		
		
		
	}
	
}
