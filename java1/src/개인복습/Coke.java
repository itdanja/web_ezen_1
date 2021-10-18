package 개인복습;

public class Coke extends Payment{
	
	//1. 필드
	static int cokeStock = 10; //콜라 재고 
	static int cokePurchase = 0; // 콜라 구매 수
	
	/*필드와 메소드가 static이 아닐때 메소드에서 cokeStock이 하나씩 줄어들게 하고
	cokePurchase가 하나씩 늘어나게 하는 법을 모르겠습니다.*/
	
	//static이 아닌 메소드를 다른 클래스에서 호출하는 방법은 알고 있습니다. (new 생성자 이용)

	//생성자
	public Coke() {}
	

	//메소드
	public static void cokeBuy() {
		Cart a = new Cart();
		
			if(cokeStock == 0) {System.out.println("콜라 재고가 없습니다.");}
			else {System.out.println("콜라를 담았습니다.");}
			cokeStock--;
			cokePurchase++;  
			a.cart(); // 장바구니
		
	}
}//class end
