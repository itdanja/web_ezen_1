package Day15;

public class Person implements Comparable<Person> {
					// Comparable<정렬대상> : 정렬 인터페이스 
	// 필드 
	String name;
	int age;
	
	// 생성자 
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override // 오름차순
	public int compareTo(Person o) {
		if( age < o.age ) return -1;
		else if( age == o.age) return 0;
		else return 1;
	}
	
//	@Override // 내림차순 
//	public int compareTo(Person o) {
//		if( age < o.age ) return 1;
//		else if( age == o.age) return 0;
//		else return -1;
//	}
//	
}
