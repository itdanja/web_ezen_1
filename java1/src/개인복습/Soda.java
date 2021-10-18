package 개인복습;

public class Soda extends Payment{

	//필드
	static int sodaStock = 10; //사이다 재고
	static int sodaPurchase = 0; //사이다 구매 수
	
	public static void sodaBuy() {
		Cart a = new Cart();
		if(sodaStock == 0) {System.out.println("사이다 재고가 없습니다.");}
		else {System.out.println("사이다를 담았습니다.");}
		sodaStock--;
		sodaPurchase++; 
		a.cart();
	}
}
