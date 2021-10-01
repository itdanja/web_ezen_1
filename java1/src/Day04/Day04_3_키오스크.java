package Day04;

import java.util.Scanner;

public class Day04_3_키오스크 {
	
	// console용 키오스크 [ 자판기 ]
		// 1. 메뉴판 [ 1.콜라[300] 2.환타[200] 3.사이다[100] 4.결제 ]
			// 메뉴판 아래에 선택한 제품들 목록 [ 제품 수량 / 총 결제 예정 금액 ]
		// 2. 초기 재고 [ 10개씩 ] 팔렸을때 재고 감소 // 재고가 없으면 구매불가
		// 3. 결제를 금액을 입력받아서 결제액 만큼 차감후 잔돈 출력 
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// 재고 변수[지역변수 : 선언된 괄호 안에서만 사용 가능하다]  
		int 콜라재고 = 10 ; int 환타재고 = 10 ; int 사이다재고 = 10;
		
		// 장바구니 변수
		int 콜라구매수 = 0 ; int 환타구매수 = 0 ; int 사이다구매수 = 0;
		
		// 1. 무한루프 
		while(true) {
			System.out.println("-------------------- 메뉴 ------------------- ");
			System.out.println("1.콜라[300] 2.환타[200] 3.사이다[100] 4.결제");
			System.out.print(">>>>>> 선택 : "); int ch = scanner.nextInt();
			
			if( ch == 1 ) {  // 1번 콜라를 선택했을때 
				// 재고가 없을경우 구매 불가
				if( 콜라재고 == 0 ) { System.out.println(" [[ 콜라 재고가 없습니다 : 제품 준비중 ]] "); }
				else {
					System.out.println(" [[ 콜라 담았습니다 ]] "); 
					콜라구매수++;
					콜라재고--;
				}
			}
			if( ch == 2 ) {  // 2번 환타를 선택했을때 
				// 재고가 없을경우 구매 불가
				if( 환타재고 == 0 ) { System.out.println(" [[ 환타 재고가 없습니다 : 제품 준비중 ]] "); }
				else {
					System.out.println(" [[ 환타 담았습니다 ]] "); 
					환타구매수++;
					환타재고--;
				}
			}
			if( ch == 3 ) {  // 3번 사이다를 선택했을때 
				// 재고가 없을경우 구매 불가
				if( 사이다재고 == 0 ) { System.out.println(" [[ 사이다 재고가 없습니다 : 제품 준비중 ]] "); }
				else {
					System.out.println(" [[ 사이다 담았습니다 ]] "); 
					사이다구매수++;
					사이다재고--;
				}
			}
			///////////////////////////// 장바구니 목록 ////////////////////////////
			System.out.println(" ------------- 장바구니 ---------------- ");
			System.out.println(" 제품명\t제품수량\t결제액");
			if( 콜라구매수 > 0 ) { System.out.println(" 콜라\t"+콜라구매수+"\t"+콜라구매수*300); }
			if( 환타구매수 > 0 ) { System.out.println(" 환타\t"+환타구매수+"\t"+환타구매수*200); }
			if( 사이다구매수 > 0 ) { System.out.println(" 사이다\t"+사이다구매수+"\t"+사이다구매수*100); }
			System.out.println(" >>>>>> 총 결제액 " + ( (콜라구매수*300) + (환타구매수*200) + (사이다구매수*100) ) );
			System.out.println(" --------------------------------------\n");
			
			if( ch == 4 ) { 
				if( 콜라구매수 ==0 && 환타구매수 ==0 && 사이다구매수 ==0 ) { System.out.println("[알림] 결제할 제품이 없습니다 ");}
				else{
					while(true) {
						System.out.print(" >>>>> 결제 하시겠습니까? [y] [n] : "); String ch2 = scanner.next();
						if( ch2.equals("y") ) {
							
							while(true) {
								System.out.print(" >>>>> 금액 투여 : "); int money = scanner.nextInt();
								int totalpay = (콜라구매수*300) + (환타구매수*200) + (사이다구매수*100) ;
								if( money < totalpay ) { 
									System.out.println(" [알림] 금액이 부족합니다 ");
								}
								else {
									System.out.println(" [결제완료] : 잔돈 : " + ( money - totalpay ));
									// 장바구니 초기화 
									콜라구매수 = 0 ; 환타구매수 = 0 ; 사이다구매수 = 0 ; break;
								}
							}
							break;
						}else if( ch2.equals("n") ) {
							// 장바구니 초기화 
							콜라구매수 = 0 ; 환타구매수 = 0 ; 사이다구매수 = 0 ;
							break;
						}else {
							System.out.println("[알림] :  알수 없는 행동 입니다 ");
						}
					}
				}
			}
			
			
		} // while end 
	} // main end 
	
} // class end 







