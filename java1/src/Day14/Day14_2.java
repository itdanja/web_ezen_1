package Day14;

import java.util.Arrays;

public class Day14_2 {
	
	// p.666
	public static void main(String[] args) {
		
		// ���׸�
			// 1. ��ü������ new ������ �Ұ� 
		
		// 19���� 
		Course<Person> personCourse = new Course<>("�Ϲ��ΰ���", 5);
		
			personCourse.add( new Person("�Ϲ���") );
			personCourse.add( new Worker("������"));
			personCourse.add( new Student("�л�"));
			personCourse.add( new HighStudent("����л�"));
				// Person Ŭ������ �迭�� ���� 
				// �ش� �迭�� add�� �Ϲ���, ������ , �л� , ����л� 
		
		Course<Worker> workerCourse = new Course<>("�����ΰ���", 5);
			//workerCourse.add( new Person("�Ϲ���") );
			workerCourse.add( new Worker("������") );
			//workerCourse.add( new Student("�л�"));
			//workerCourse.add( new HighStudent("����л�"));
				// Worker Ŭ������ �迭�� ���� 
				// �ش� �迭�� add�� ������
		
		Course<Student> studentCourse = new Course<>("�л�����", 5);
			//studentCourse.add( new Person("�Ϲ���") );
			//studentCourse.add( new Worker("������") );
			studentCourse.add( new Student("�л�"));
			studentCourse.add( new HighStudent("����л�"));
				// Student Ŭ������ �迭�� ���� 
				// �ش� �迭�� add�� �л� , ����л� 
			
		Course<HighStudent>  highStundentCourse = new Course<>("����л�����",5);
			//highStundentCourse.add( new Person("�Ϲ���") );
			//highStundentCourse.add( new Worker("������") );
			//highStundentCourse.add( new Student("�л�"));
			highStundentCourse.add( new HighStudent("����л�"));
				// highStudent Ŭ������ �迭�� ���� 
				// �ش� �迭�� add�� ����л� 
	
		System.out.println("********  Course<?> : ��� �ڽ� ���� ******* ");
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStundentCourse);
		System.out.println();
		
		System.out.println("********  Course< ? extends Ŭ����> : Ŭ�����κ��� �ڽ�Ŭ������ ���� ******* ");
			//registerCourseStudnet(personCourse);
			//registerCourseStudnet(workerCourse);
		registerCourseStudnet(studentCourse);
		registerCourseStudnet(highStundentCourse);
		System.out.println();
		
		System.out.println("********  Course< ? super Ŭ����> : Ŭ�����κ��� �θ�Ŭ������ ���� ******* ");
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
			//registerCourseWorker(studentCourse);
			//registerCourseWorker(highStundentCourse);
		
	} // main �� 
	// �ڽ� �ο� ��� ��� �޼ҵ� // ? : ���ϵ�ī�� [ ��� Ŭ���� ���� ]
	public static void registerCourse( Course<?> course ) {
		System.out.println( course.getName()+" ��������� : "+ 
					Arrays.toString( course.getStudents() ));
	}									// �ڽ��� �迭 ȣ��
	
	// �л� ��� ��� �޼ҵ� //   ? extends �л� [ �л� Ŭ�����κ��� ��ӹ��� Ŭ������ ����(��������) ] 
	public static void registerCourseStudnet( Course<? extends Student > course ) {
		System.out.println( course.getName()+" ��������� : " +
					Arrays.toString( course.getStudents() ));
	}
	// ������ ��� ��� �޼ҵ� //    ? super ������ [ ������ Ŭ������ �θ�Ŭ���� �� ���� ( ���� ���� ) ] 
	public static void registerCourseWorker( Course< ? super Worker> course ) {
		System.out.println( course.getName()+" ��������� : " +
				Arrays.toString( course.getStudents() ));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
