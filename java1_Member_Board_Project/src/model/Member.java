package model;

public class Member {

	// 1. �ʵ� 
	private String id;
		// private : 
	private String password;
	private String name;
	private String email;
	private int point;
	
	// 2. ������ : �����ڸ� ����ϴ� ����?? 
	public Member() {
	
	}
	public Member(String id, String password, String name, String email, int point) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.point = point;
	}
	
	// 3. �޼ҵ� [ get , set ����ϴ� ���� ?? 
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
}
