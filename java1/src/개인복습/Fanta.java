package 개인복습;

public class Fanta extends Payment{
	
	 //필드
	static int fantaStock = 10; //환타 재고
	static int fantaPurchase = 0; //환타 구매 수

	public static void fantaBuy() {
		Cart a = new Cart();
		
		if(fantaStock == 0) {System.out.println("환타 재고가 없습니다.");}
		else {System.out.println("환타를 담았습니다.");}
		fantaStock--;
		fantaPurchase++;
		a.cart();
	
	}

}
