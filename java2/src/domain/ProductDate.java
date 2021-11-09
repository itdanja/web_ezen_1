package domain;

public class ProductDate {
	
	private String date; // xÃà
	private int count;	// yÃà 
	
	public ProductDate() {
	}

	public ProductDate(String date, int count) {
		this.date = date;
		this.count = count;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}
