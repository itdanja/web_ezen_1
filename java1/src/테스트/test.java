package 테스트;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class test {
	
	

	public static void main(String[] args) {

	

	String[][]boards =new String[100][5]; //배열설정 100개의 세로와 5개의 가로칸

	Scanner scanner=new Scanner(System.in); //입력객체

	while(true) {//무한 으로 돌리는것

		System.out.printf("=========계시판=============\n");

		System.out.printf(" %2s \t %10s \t %5s \t %5s %3s\n","번호","제목","작성자","날짜","조회수");

		// 메뉴판 만들고 printf 로하는이유는 서식을 사용하기위함 %5s: 만큼 칸만들기 \n:한줄내리기 \t : 들여쓰기

		for (int i = 0; i < boards.length; i++) {// 배열선언 i는 배열보다작게 1증가

			if (boards[i][0]!=null) System.out.printf(" %2s \t %10s \t %5s \t %5s %3s\n",

				i , boards[i][0] , boards[i][2],boards[i][3],boards[i][4]);

				//  외웠는데 왜 이렇게 되는 지설명 듣기

			}

	 	System.out.println("==============================");

	 	System.out.println("1.글쓰기2.글상세보기 >>>선택 :"); int ch = scanner.nextInt();//입력할수있게 만들기

	 	if(ch==1) {//1선택

	 		System.out.println("==================글쓰기==========");

	 		scanner.nextLine();// 오류날수있는 부분 처리

	 		System.out.println("1.제목 :");  String title = scanner.nextLine();// 

	 		System.out.println("2.작성자 :");String writer = scanner.nextLine();

	 		System.out.println("3.내용 :");String content = scanner.nextLine();

	 		

	 		Date now = new Date();//날짜 입력할수있게 선언

	 		SimpleDateFormat dateFormat = new SimpleDateFormat("mm_dd");

	 		String date = dateFormat.format(now);

	 		

	 		String count = "1";// 조회수 입력할수있게 선언

	 		for (int i = 0; i < boards.length; i++) {

	 			if (boards[i][0]==null) {

	 				boards[i][0]=title;boards[i][1]=writer;boards[i][2]=content;

	 				boards[i][3]=date;boards[i][4]=count;break;// break안누르면 100개한번에나옴

				}

			}

	

	 	}

	 	if (ch==2) {System.out.println("글 목록 선택하기 >>>:"); 
	 	
	 			int ch2 = scanner.nextInt();// 2번눌렀을떄 

	 			int count = Integer.parseInt(boards[ch2][4]);// 조회수 할수있게 저장??

	 			boards[ch2][4]= Integer.toString(++count);

	 			System.out.println("=============계시물 상세 페이지=============");

	 			System.out.println("제목 :"+boards[ch2][0]);

	 			System.out.println("작성자 :"+boards[ch2][1]);

	 			System.out.println("내용 :"+boards[ch2][2]);

		}

	 	

	 	

	}

	

	

	

	}

	

}
