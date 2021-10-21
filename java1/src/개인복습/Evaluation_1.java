package Day02;

import java.util.Scanner;
import java.util.TreeSet;

public class Evaluation_1 {
	
	public static void main(String[] args) {
		TreeSet<Student> set = new TreeSet<>();
		while( true ) {
			Scanner scanner = new Scanner(System.in);
			try {
				System.out.print("1.��� 2.���  ���� : ");
				int ch = scanner.nextInt();
				if( ch == 1 ) {
					System.out.print(" ���� : ");	String name = scanner.next();
					System.out.print(" ���� : ");	int kor = scanner.nextInt();
					System.out.print(" ���� : ");	int eng = scanner.nextInt();
					System.out.print(" ���� : ");	int math = scanner.nextInt();
					Student student = new Student(name, kor, eng, math);
					set.add(student);
				}
				else if (ch == 2 ) {
					
					System.out.println("---------------------------------------------------------------");
					System.out.println("\t\t\t��\t��\tǥ");
					System.out.println("---------------------------------------------------------------");
					System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
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
				System.out.println(" ���� �߻� [�����ڿ��� ����] ");
			}
		}
	}
}
