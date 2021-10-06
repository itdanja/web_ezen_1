package Day06;

public class Account { // 계좌 설계 
	
	// 1. 필드 [ private : 필드 보호을 위한 접근제한자 ]
		// 현재 클래스내에서만 사용 가능 
		// 외부로 접근불가 [ 간접 접근 : get , set 메소드 ]
	private String ano; // 계좌번호 
	private String owner; // 계좌주
	private int balance; // 계좌 예금액 

	// 2. 생성자 // 자동완성 : 마우스 오른쪽클릭 => source 
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	// 3. 메소드 // 자동완성
	public String getAno() {return ano;}
	public void setAno(String ano) {this.ano = ano;}
	public String getOwner() {return owner;}
	public void setOwner(String owner) {this.owner = owner;}
	public int getBalance() {return balance;}
	public void setBalance(int balance) {this.balance = balance;}

}
