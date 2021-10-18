package 개인복습;



public class Cart extends Payment{
	public void cart() {
		System.out.println("----------------------------------------------");
		System.out.println("\t\t장바구니");
		System.out.println("----------------------------------------------");
		System.out.println("\t품목\t개수\t가격\t");
		
		//장바구니를 출력하는 것을 한 데 몰아서 해보고 싶었는데,
		// 구매 수가 10개가 넘어갔을 때 재고가 없습니다. 라고 출력이 안되고 계속해서 구매할 수 있는 문제가 있습니다.
		//boolean flag = true;
		if(Coke.cokePurchase>0) {System.out.println("\t콜라\t"+Coke.cokePurchase+"\t"+(Coke.cokePurchase*300));}
		if(Fanta.fantaPurchase>0) {System.out.println("\t환타\t"+Fanta.fantaPurchase+"\t"+(Fanta.fantaPurchase*200));}
		if(Soda.sodaPurchase>0) {System.out.println("\t사이다\t"+Soda.sodaPurchase+"\t"+(Soda.sodaPurchase*100));} // 
		System.out.println("----------------------------------------------");
		System.out.println("총 결제 금액 : " + ((Coke.cokePurchase*300)+(Fanta.fantaPurchase*200)+(Soda.sodaPurchase*100)));
		//"콜라 구매 O 환타&&사이다 구매X"일 시, 총결제금액 : [콜라 300 환타0 사이다0]이렇게 표시되지 않는 법을 모르겠습니다.
	
		totalPay = ((Coke.cokePurchase*300)+(Fanta.fantaPurchase*200)+(Soda.sodaPurchase*100)); 
		//지불해야할 총 액수
	}
}
