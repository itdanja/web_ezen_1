package ���κ���;

public class Coke extends Payment{
	
	//1. �ʵ�
	static int cokeStock = 10; //�ݶ� ��� 
	static int cokePurchase = 0; // �ݶ� ���� ��
	
	/*�ʵ�� �޼ҵ尡 static�� �ƴҶ� �޼ҵ忡�� cokeStock�� �ϳ��� �پ��� �ϰ�
	cokePurchase�� �ϳ��� �þ�� �ϴ� ���� �𸣰ڽ��ϴ�.*/
	
	//static�� �ƴ� �޼ҵ带 �ٸ� Ŭ�������� ȣ���ϴ� ����� �˰� �ֽ��ϴ�. (new ������ �̿�)

	//������
	public Coke() {}
	

	//�޼ҵ�
	public static void cokeBuy() {
		Cart a = new Cart();
		
			if(cokeStock == 0) {System.out.println("�ݶ� ��� �����ϴ�.");}
			else {System.out.println("�ݶ� ��ҽ��ϴ�.");}
			cokeStock--;
			cokePurchase++;  
			a.cart(); // ��ٱ���
		
	}
}//class end
