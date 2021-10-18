package 개인복습;

public class Payment{

	
	//1. 필드
	//int money; //손님 돈 필요없는 필드
	int totalPay; //지불해야할 총 액수
	
	//2. 생성자
	
	// 빈 생성자
	public Payment() {}
	
	public Payment(int totalPay) {
		this.totalPay = totalPay;
	}

	//3. 메소드

	public static boolean order() {
		
		Cart c2= new Cart();
		int c = c2.totalPay;
		System.out.println("-----------결제 화면입니다.------------");
		
		if(Coke.cokePurchase == 0 && Fanta.fantaPurchase == 0 && Soda.sodaPurchase == 0) { 
			System.out.println("   [알림] 장바구니에 담긴 제품이 없습니다."); return false;	
		}else {System.out.print("결제를 진행하시겠습니까? [y] [n] : "); String ch2 = Kiosk_Main.scanner.next();
			if(ch2.equals("y")) {
				System.out.println(" [알림] 결제를 진행합니다.");
				System.out.println("입금할 금액을 입력해 주세요 : "); int inputMoney = Kiosk_Main.scanner.nextInt();
								
				//(입력받은 값 > 지불해야되는 음료값) = 지불 가능 잔돈환불.
				// 받은 값(inputMoney)을 어떻게 totalpay와 비교해야할지 모르겠습니다.
				if(inputMoney>=c) {
					System.out.println("결제완료.");
					System.out.println("잔돈 : " + (inputMoney-c)+"원");
					Coke.cokePurchase = 0; Fanta.fantaPurchase = 0; Soda.sodaPurchase = 0;
					Coke.cokeStock = 0; Fanta.fantaStock=0; Soda.sodaStock=0;
					return false;
				}else {System.out.println("[알림] 금액이 부족합니다.");}
			
				//반대의 경우 지불 불가능. 재고 반환.
				
			}else if(ch2.equals("n")) {
				System.out.println(" [알림] 결제를 취소합니다.");
				Coke.cokePurchase = 0; Fanta.fantaPurchase = 0; Soda.sodaPurchase = 0;
				Coke.cokeStock = 0; Fanta.fantaStock=0; Soda.sodaStock=0;
				return false;
			}
		}
		return false;
	}//order() end
	
	
	
	
	//getter setter

	

	public int getTotalPay() {
		return totalPay;
	}

	public void setTotalPay(int totalPay) {
		this.totalPay = totalPay;
	}

	

}
