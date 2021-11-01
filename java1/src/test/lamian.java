package test;

import java.util.Iterator;

import java.util.Random;

import java.util.Scanner;

 

public class lamian {
	
	 

		public static void main(String[] args) {

	 

			Scanner scanner = new Scanner(System.in);

			String wi = null;

			

	 

			String[] 게임판 = {	 "[]", "[]", "[]",

								"[]", "[]", "[]", 

								"[]", "[]", "[]",

	 

			};

			String winner = "";

			int count = 0;

	 

			while (true) {

	 

				for (int i = 0; i < 게임판.length; i++) {

					System.out.print(게임판[i]);// printin 으로하면 가로로나옴 근데 t 로바꾸었더니 잘

					if (i%3 == 2) 

						System.out.println();

	 

					

	 

				}

	 

				if (winner.equals("[O]")) {

					System.out.println("플레이어 승리");

					break;

	 

				}

				if (winner.equals("[x]")) {

					System.out.println("컴퓨터 승리");

					break;

				}

			

	 

			while (true) {

				System.out.println("=========틱택톡게임===========");

				System.out.println("플레이어위치선택  :");

				int index = scanner.nextInt();

	 

				if (게임판[index].equals("[]")) {

					게임판[index] = "[O]";

					count++;

					break;

				} else {

					System.out.println("이미둔자리입니다");

	 

				}

	 

			}

	 

			if (count == 9) {

				for (int i = 0; i < 게임판.length; i++) {

					System.out.println(게임판[i]);

					if (i % 3 == 2) {

						System.out.println("무승부 입니다");

					}break;

				}

	 

			}

			System.out.println("컴퓨터위치선택:");

			while(true) {

				Random random = new Random();

				int index = random.nextInt(9);

				if (게임판[index].equals("[]"))

						 {게임판[index]="[X]";

						 count++;

						 break;

					

				}

			}

			

			/////////승리자 구하는법

			/*

			 *  이기는방법 012

			 * 			345

			 * 			678

			 */

			//가로

			for (int i = 0 ; i<=6 ; i+=2 ) {// 선생님거랑 어떤차이가있는지

				if (게임판[i].equals(게임판[i+1])&& 게임판[i+1].equals(게임판[i+2])) {

					if(!게임판[i].equals("[]")) {

						winner= 게임판[i];

					}

				}

			}

			//세로

			for (int i = 0; i <=2; i+=3) { // 선생님거랑 어떤차이가있는지

				if (게임판[i].equals(게임판[i+3])&&게임판[i+3].equals(게임판[i+6])) {

					if(!게임판[i].equals("[]")) {

						winner=  게임판[i];	

					}

					

				}

				

			}

			// 대각선 인데 왼쪽에서 아래로

			

				if (게임판[0].equals(게임판[4])&&게임판[4].equals(게임판[8])) {

					if(!게임판[0].equals("[]")) {

						winner=  게임판[0];	

					

					

				}

				

			}

			// 대각선인데 오른쪽아래에서 위로 가게하는것

			

			

				if (게임판[2].equals(게임판[4])&&게임판[4].equals(게임판[6])) {

					if(!게임판[2].equals("[]")) {

						winner=  게임판[2];	

					

					

				}

				

			}

			

			} // we

		}//me
}
