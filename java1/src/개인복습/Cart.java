package ���κ���;



public class Cart extends Payment{
	public void cart() {
		System.out.println("----------------------------------------------");
		System.out.println("\t\t��ٱ���");
		System.out.println("----------------------------------------------");
		System.out.println("\tǰ��\t����\t����\t");
		
		//��ٱ��ϸ� ����ϴ� ���� �� �� ���Ƽ� �غ��� �;��µ�,
		// ���� ���� 10���� �Ѿ�� �� ��� �����ϴ�. ��� ����� �ȵǰ� ����ؼ� ������ �� �ִ� ������ �ֽ��ϴ�.
		//boolean flag = true;
		if(Coke.cokePurchase>0) {System.out.println("\t�ݶ�\t"+Coke.cokePurchase+"\t"+(Coke.cokePurchase*300));}
		if(Fanta.fantaPurchase>0) {System.out.println("\tȯŸ\t"+Fanta.fantaPurchase+"\t"+(Fanta.fantaPurchase*200));}
		if(Soda.sodaPurchase>0) {System.out.println("\t���̴�\t"+Soda.sodaPurchase+"\t"+(Soda.sodaPurchase*100));} // 
		System.out.println("----------------------------------------------");
		System.out.println("�� ���� �ݾ� : " + ((Coke.cokePurchase*300)+(Fanta.fantaPurchase*200)+(Soda.sodaPurchase*100)));
		//"�ݶ� ���� O ȯŸ&&���̴� ����X"�� ��, �Ѱ����ݾ� : [�ݶ� 300 ȯŸ0 ���̴�0]�̷��� ǥ�õ��� �ʴ� ���� �𸣰ڽ��ϴ�.
	
		totalPay = ((Coke.cokePurchase*300)+(Fanta.fantaPurchase*200)+(Soda.sodaPurchase*100)); 
		//�����ؾ��� �� �׼�
	}
}
