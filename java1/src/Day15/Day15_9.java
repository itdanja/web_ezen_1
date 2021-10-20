package Day15;

import java.util.Iterator;
import java.util.TreeSet;

public class Day15_9 {

	
	public static void main(String[] args) {
		
		// 1. tree �÷��� ���� 
		TreeSet< Person > treeSet = new TreeSet<>();
		
		// 2. tree ��ü �ֱ� 
		treeSet.add( new Person("ȫ�浿", 45) );
		treeSet.add( new Person("���ڹ�", 25) );
		treeSet.add( new Person("������", 31) );
			// tree -> compareTo �ڵ����� --> ��ü ( �ʵ� 1, �ʵ�2 , �ʵ�3 )  : ���� ���� ������ ��
				// tree -> compareTo -> ���� ����
		
		// 3. ���� �������� �������� 
		Iterator<Person> iterator = treeSet.iterator();
		while( iterator.hasNext() ) {
						// hasNext() : ���� ��ü�� �ִ��� Ȯ�� 
			Person person = iterator.next();
						// next() : ��ü ��������
			System.out.println( person.name +" \t "+person.age );
		}
		// 3. 
		for( Person person : treeSet ) {
			System.out.println( person.name +" \t "+person.age );
		}
		
		
		
		
		
		
		
		
		
		
	}
	
}
