package ���κ���;

public class Payment{

	
	//1. �ʵ�
	//int money; //�մ� �� �ʿ���� �ʵ�
	int totalPay; //�����ؾ��� �� �׼�
	
	//2. ������
	
	// �� ������
	public Payment() {}
	
	public Payment(int totalPay) {
		this.totalPay = totalPay;
	}

	//3. �޼ҵ�

	public static boolean order() {
		
		Cart c2= new Cart();
		int c = c2.totalPay;
		System.out.println("-----------���� ȭ���Դϴ�.------------");
		
		if(Coke.cokePurchase == 0 && Fanta.fantaPurchase == 0 && Soda.sodaPurchase == 0) { 
			System.out.println("   [�˸�] ��ٱ��Ͽ� ��� ��ǰ�� �����ϴ�."); return false;	
		}else {System.out.print("������ �����Ͻðڽ��ϱ�? [y] [n] : "); String ch2 = Kiosk_Main.scanner.next();
			if(ch2.equals("y")) {
				System.out.println(" [�˸�] ������ �����մϴ�.");
				System.out.println("�Ա��� �ݾ��� �Է��� �ּ��� : "); int inputMoney = Kiosk_Main.scanner.nextInt();
								
				//(�Է¹��� �� > �����ؾߵǴ� ���ᰪ) = ���� ���� �ܵ�ȯ��.
				// ���� ��(inputMoney)�� ��� totalpay�� ���ؾ����� �𸣰ڽ��ϴ�.
				if(inputMoney>=c) {
					System.out.println("�����Ϸ�.");
					System.out.println("�ܵ� : " + (inputMoney-c)+"��");
					Coke.cokePurchase = 0; Fanta.fantaPurchase = 0; Soda.sodaPurchase = 0;
					Coke.cokeStock = 0; Fanta.fantaStock=0; Soda.sodaStock=0;
					return false;
				}else {System.out.println("[�˸�] �ݾ��� �����մϴ�.");}
			
				//�ݴ��� ��� ���� �Ұ���. ��� ��ȯ.
				
			}else if(ch2.equals("n")) {
				System.out.println(" [�˸�] ������ ����մϴ�.");
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
