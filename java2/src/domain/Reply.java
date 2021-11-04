package domain;

public class Reply {
		
	private int r_no;			// ´ñ±Û ¹øÈ£ 
	private String r_contents;	// ´ñ±Û ³»¿ë 
	private String r_write;		// ´ñ±Û ÀÛ¼ºÀÚ 
	private String r_date;		// ´ñ±Û ÀÛ¼ºÀÏ 
	private int b_no;			// °Ô½Ã¹° ¹øÈ£ 
	   
	public Reply() { }

	public Reply(int r_no, String r_contents, String r_write, String r_date, int b_no) {

		this.r_no = r_no;
		this.r_contents = r_contents;
		this.r_write = r_write;
		this.r_date = r_date;
		this.b_no = b_no;
	}
	// ´ñ±Û µî·Ï »ý¼ºÀÚ 
	public Reply(String r_contents, String r_write, int b_no) {
		this.r_contents = r_contents;
		this.r_write = r_write;
		this.b_no = b_no;
	}
	// get , set 
	public int getR_no() {
		return r_no;
	}

	public void setR_no(int r_no) {
		this.r_no = r_no;
	}

	public String getR_contents() {
		return r_contents;
	}

	public void setR_contents(String r_contents) {
		this.r_contents = r_contents;
	}

	public String getR_write() {
		return r_write;
	}

	public void setR_write(String r_write) {
		this.r_write = r_write;
	}

	public String getR_date() {
		return r_date;
	}

	public void setR_date(String r_date) {
		this.r_date = r_date;
	}

	public int getB_no() {
		return b_no;
	}

	public void setB_no(int b_no) {
		this.b_no = b_no;
	}
	
}
