package ���κ���;

public class Fanta extends Payment{
	
	 //�ʵ�
	static int fantaStock = 10; //ȯŸ ���
	static int fantaPurchase = 0; //ȯŸ ���� ��

	public static void fantaBuy() {
		Cart a = new Cart();
		
		if(fantaStock == 0) {System.out.println("ȯŸ ��� �����ϴ�.");}
		else {System.out.println("ȯŸ�� ��ҽ��ϴ�.");}
		fantaStock--;
		fantaPurchase++;
		a.cart();
	
	}

}
