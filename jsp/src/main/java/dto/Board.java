package dto;

public class Board {
	// 필드 
	private int b_num;
	private String b_title;
	private String b_contents;
	private int m_num;
	private String b_date;
	private String b_file;
	private int b_view;
	private int b_activation;
	// 생성자 [ 1.빈생성자 2.전체생성자 3.등록생성자 ]
	public Board() {}
	public Board(int b_num, String b_title, String b_contents, int m_num, String b_date, String b_file, int b_view,
			int b_activation) {
		super();
		this.b_num = b_num;
		this.b_title = b_title;
		this.b_contents = b_contents;
		this.m_num = m_num;
		this.b_date = b_date;
		this.b_file = b_file;
		this.b_view = b_view;
		this.b_activation = b_activation;
	}
	public Board(String b_title, String b_contents, int m_num, String b_file) {
		this.b_title = b_title;
		this.b_contents = b_contents;
		this.m_num = m_num;
		this.b_file = b_file;
	}
	// get , set 
	public int getB_num() {
		return b_num;
	}
	public void setB_num(int b_num) {
		this.b_num = b_num;
	}
	public String getB_title() {
		return b_title;
	}
	public void setB_title(String b_title) {
		this.b_title = b_title;
	}
	public String getB_contents() {
		return b_contents;
	}
	public void setB_contents(String b_contents) {
		this.b_contents = b_contents;
	}
	public int getM_num() {
		return m_num;
	}
	public void setM_num(int m_num) {
		this.m_num = m_num;
	}
	public String getB_date() {
		return b_date;
	}
	public void setB_date(String b_date) {
		this.b_date = b_date;
	}
	public String getB_file() {
		return b_file;
	}
	public void setB_file(String b_file) {
		this.b_file = b_file;
	}
	public int getB_view() {
		return b_view;
	}
	public void setB_view(int b_view) {
		this.b_view = b_view;
	}
	public int getB_activation() {
		return b_activation;
	}
	public void setB_activation(int b_activation) {
		this.b_activation = b_activation;
	}
	
}
