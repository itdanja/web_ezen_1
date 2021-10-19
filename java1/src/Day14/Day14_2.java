package Day14;

import java.util.Arrays;

public class Day14_2 {
	
	// p.666
	public static void main(String[] args) {
		
		// 제네릭
			// 1. 자체적으로 new 연산자 불가 
		
		// 19번줄 
		Course<Person> personCourse = new Course<>("일반인과정", 5);
		
			personCourse.add( new Person("일반인") );
			personCourse.add( new Worker("직장인"));
			personCourse.add( new Student("학생"));
			personCourse.add( new HighStudent("고등학생"));
				// Person 클래스로 배열이 생성 
				// 해당 배열에 add는 일반인, 직장인 , 학생 , 고등학생 
		
		Course<Worker> workerCourse = new Course<>("직장인과정", 5);
			//workerCourse.add( new Person("일반인") );
			workerCourse.add( new Worker("직장인") );
			//workerCourse.add( new Student("학생"));
			//workerCourse.add( new HighStudent("고등학생"));
				// Worker 클래스로 배열이 생성 
				// 해당 배열에 add는 직장인
		
		Course<Student> studentCourse = new Course<>("학생과정", 5);
			//studentCourse.add( new Person("일반인") );
			//studentCourse.add( new Worker("직장인") );
			studentCourse.add( new Student("학생"));
			studentCourse.add( new HighStudent("고등학생"));
				// Student 클래스로 배열이 생성 
				// 해당 배열에 add는 학생 , 고등학생 
			
		Course<HighStudent>  highStundentCourse = new Course<>("고등학생과정",5);
			//highStundentCourse.add( new Person("일반인") );
			//highStundentCourse.add( new Worker("직장인") );
			//highStundentCourse.add( new Student("학생"));
			highStundentCourse.add( new HighStudent("고등학생"));
				// highStudent 클래스로 배열이 생성 
				// 해당 배열에 add는 고등학생 
	
		System.out.println("********  Course<?> : 모든 코스 가능 ******* ");
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStundentCourse);
		System.out.println();
		
		System.out.println("********  Course< ? extends 클래스> : 클래스로부터 자식클래스만 가능 ******* ");
			//registerCourseStudnet(personCourse);
			//registerCourseStudnet(workerCourse);
		registerCourseStudnet(studentCourse);
		registerCourseStudnet(highStundentCourse);
		System.out.println();
		
		System.out.println("********  Course< ? super 클래스> : 클래스로부터 부모클래스만 가능 ******* ");
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
			//registerCourseWorker(studentCourse);
			//registerCourseWorker(highStundentCourse);
		
	} // main 끝 
	// 코스 인원 명단 출력 메소드 // ? : 와일드카드 [ 모든 클래스 대응 ]
	public static void registerCourse( Course<?> course ) {
		System.out.println( course.getName()+" 수강생명단 : "+ 
					Arrays.toString( course.getStudents() ));
	}									// 코스내 배열 호출
	
	// 학생 목록 출력 메소드 //   ? extends 학생 [ 학생 클래스로부터 상속받은 클래스만 가능(본인포함) ] 
	public static void registerCourseStudnet( Course<? extends Student > course ) {
		System.out.println( course.getName()+" 수강생명단 : " +
					Arrays.toString( course.getStudents() ));
	}
	// 직장인 목록 출력 메소드 //    ? super 직장인 [ 직장인 클래스의 부모클래스 만 가능 ( 본인 모함 ) ] 
	public static void registerCourseWorker( Course< ? super Worker> course ) {
		System.out.println( course.getName()+" 수강생명단 : " +
				Arrays.toString( course.getStudents() ));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
