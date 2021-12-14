package dto;

public class Cart {
	
	private int p_num;
	private String p_size;
	private int p_count;
	
	public Cart() {}
	public Cart(int p_num, String p_size, int p_count) {
		super();
		this.p_num = p_num;
		this.p_size = p_size;
		this.p_count = p_count;
	}
	public int getP_num() {
		return p_num;
	}
	public void setP_num(int p_num) {
		this.p_num = p_num;
	}
	public String getP_size() {
		return p_size;
	}
	public void setP_size(String p_size) {
		this.p_size = p_size;
	}
	public int getP_count() {
		return p_count;
	}
	public void setP_count(int p_count) {
		this.p_count = p_count;
	}
	
	
	
	
}
