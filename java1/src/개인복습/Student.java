package 개인복습;

public class Student {

	
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	double avg;

	public Student(String name, int kor, int eng, int math ) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = (kor+eng+math) ;
		this.avg = sum/3;
		
	}
	
	
}
