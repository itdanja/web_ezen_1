package Day02;

import java.util.Scanner;
import java.util.TreeSet;

public class Evaluation_1 {
	
	public static void main(String[] args) {
		TreeSet<Student> set = new TreeSet<>();
		while( true ) {
			Scanner scanner = new Scanner(System.in);
			try {
				System.out.print("1.등록 2.출력  선택 : ");
				int ch = scanner.nextInt();
				if( ch == 1 ) {
					System.out.print(" 성명 : ");	String name = scanner.next();
					System.out.print(" 국어 : ");	int kor = scanner.nextInt();
					System.out.print(" 영어 : ");	int eng = scanner.nextInt();
					System.out.print(" 수학 : ");	int math = scanner.nextInt();
					Student student = new Student(name, kor, eng, math);
					set.add(student);
				}
				else if (ch == 2 ) {
					
					System.out.println("---------------------------------------------------------------");
					System.out.println("\t\t\t성\t적\t표");
					System.out.println("---------------------------------------------------------------");
					System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
					System.out.println("---------------------------------------------------------------");
					int i = 1;
					for( Student student : set ) {
						System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
								i,student.getName(),student.getKor(),student.getEng(),student.getMath(),
								student.getTotal(),student.getAvg(),i);
						i++;
					}
					System.out.println("---------------------------------------------------------------");
				}
			}
			catch (Exception e) {
				System.out.println(" 오류 발생 [관리자에게 문의] ");
			}
		}
	}
}
