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
		// 배열 vs 리스트 
		ArrayList<Member> arrayList = new ArrayList<Member>();
		
			String name = scanner.next();
			int kor = scanner.nextInt();
			int eng = scanner.nextInt();
			int math = scanner.nextInt();
			int total = kor+eng+math;
			double avg = total/3;
			Member member = new Member(name, kor, eng, math, total, avg, 0);
			
				arrayList.add(member);
		
		System.out.println(name +"\t"+ kor +"\t"+ eng +"\t"+ math);
		
	}

}

			

