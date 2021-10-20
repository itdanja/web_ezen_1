package 개인복습;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class test {
	
	public static void main(String[] args) {

		

		Scanner scanner= new Scanner(System.in);

		String[][] 학생목록 = new String[100][8]; // 무한 대 대입,,

		

		

		while(true) {

				System.out.printf("\n\n-------------------------------------------------\n\n");

				System.out.printf("\n\t\t\t성적표\n");

				System.out.println("\n-------------------------------------------------\n");

				System.out.printf(" %2s \t %4s  %3s  %3s %3s %3s%3s\n","번호","이름","국어","영어","총점","평균","석차");

				System.out.println("\n-------------------------------------------------\n");

				for (int i = 0; i < 학생목록.length; i++) {

					if (학생목록[i][0] !=null) {

						System.out.printf(" %2s \t %4s  %3s  %3s %3s %3s%3s\n",

								i,학생목록[i][0],학생목록[i][1],학생목록[i][2],학생목록[i][3],학생목록[i][4],학생목록[i][5]);

						

					}

					

				}

				

				System.out.println("1.성적등록하기 >>>>선택:");int ch =scanner.nextInt(); // 선택문 넣어 서 해두 되는건지

				

				if(ch==1) {

					scanner.nextLine();

					System.out.println("이름 :"); String name=scanner.nextLine();

					System.out.println("국어점수:"); String Kor =scanner.nextLine();

					System.out.println("영어점수 :"); String Eng =scanner.nextLine();

					System.out.println("수학점수 :"); String Math =scanner.nextLine();

					

					int total = ( Integer.parseInt(Kor) + Integer.parseInt(Eng) + Integer.parseInt(Math) ) ;

					System.out.println("총합 :"+total);

					float ave = ( total )/3; 	// 질문 총점 평균 어떻게 대입해서 한번에 출력할것인지 


					for (int j = 0; j < 학생목록.length; j++) {

						if (학생목록[j][0] ==null) {

							학생목록[j][0] = name; 학생목록[j][1] = Kor;학생목록[j][2] = Eng;

							학생목록[j][3] = Math; 학생목록[j][4]= String.valueOf(total);

							break;

						}

						

					}

					

					

				}


		}

		}
}

			

