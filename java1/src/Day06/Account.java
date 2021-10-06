package Day06;

public class Account { // ���� ���� 
	
	// 1. �ʵ� [ private : �ʵ� ��ȣ�� ���� ���������� ]
		// ���� Ŭ������������ ��� ���� 
		// �ܺη� ���ٺҰ� [ ���� ���� : get , set �޼ҵ� ]
	private String ano; // ���¹�ȣ 
	private String owner; // ������
	private int balance; // ���� ���ݾ� 

	// 2. ������ // �ڵ��ϼ� : ���콺 ������Ŭ�� => source 
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	// 3. �޼ҵ� // �ڵ��ϼ�
	public String getAno() {return ano;}
	public void setAno(String ano) {this.ano = ano;}
	public String getOwner() {return owner;}
	public void setOwner(String owner) {this.owner = owner;}
	public int getBalance() {return balance;}
	public void setBalance(int balance) {this.balance = balance;}
	
}
