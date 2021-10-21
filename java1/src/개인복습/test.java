package 개인복습;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class test {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" 이름 : "); String name = scanner.next();
		System.out.println(" 국어 : "); int kor = scanner.nextInt();
		System.out.println(" 영어 : "); int eng = scanner.nextInt();
		System.out.println(" 수학 : "); int math = scanner.nextInt();
		
		Student student = new Student(name, kor, eng, math);
		
		Student[] students = new Student[10];
		
		students[0] = student;
		
		
		
		
				
		
	}

}

			

