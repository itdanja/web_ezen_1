package ���κ���;

public class Soda extends Payment{

	//�ʵ�
	static int sodaStock = 10; //���̴� ���
	static int sodaPurchase = 0; //���̴� ���� ��
	
	public static void sodaBuy() {
		Cart a = new Cart();
		if(sodaStock == 0) {System.out.println("���̴� ��� �����ϴ�.");}
		else {System.out.println("���̴ٸ� ��ҽ��ϴ�.");}
		sodaStock--;
		sodaPurchase++; 
		a.cart();
	}
}
