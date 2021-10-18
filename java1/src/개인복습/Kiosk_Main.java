package 개인복습;

import java.util.Scanner;

public class Kiosk_Main {//class start
	//console 키오스크 [ 자판기 ] 문제
	
	// 1. 메뉴판 [ 1. 콜라 [300] 2.환타 [200] 3. 사이다[100] 4.결제 ]
		// 메뉴판 아래에 선택한 제품들 목록 [ 제품 수량 / 총 결제 예정 금액 출력 ]
	// 2. 초기 재고 [10개씩] 팔렸을때 재고 감소 	// 재고가 없으면 구매 불가
	// 3. 결제를 금액을 입력받아서 결제액 만큼 차감 후 잔돈 출력
	
	//클래스형 //배열형[i][j]
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {//main start
		while(true) {
			System.out.println("\t  [  메인 메뉴입니다.  ]");
			System.out.println("[ 1. 콜라 [300] 2.환타 [200] 3. 사이다[100] 4.결제 ]");
			System.out.print("선택 > :"); int ch =  Kiosk_Main.scanner.nextInt();
			
			if(ch == 1) {Coke.cokeBuy();} //콜라 구매하기
			else if(ch == 2) {Fanta.fantaBuy();} //환타 구매하기
			else if(ch == 3) {Soda.sodaBuy();} //사이다 구매하기
			else if(ch == 4) {Payment.order();} //결제 하기
			else {System.out.println("[알림] 잘못된 입력입니다.");}
			//문자열 발생 시 예외 발생 -> 처리방법 -> try catch -> 어떻게 넣어야 될지...
	

	
		}
	}//main end
}//class end
