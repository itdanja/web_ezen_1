package Day07;

public class Book {
	
	// 1. 필드 [ ISBN , 도서명 , 대여여부 , 대여한 회원아이디 등 ]
	private String b_ISBN;
	private String b_name;
	private String b_rental;
	private String m_id;
	
	// 2. 생성자
		// 1. 도서등록 [ 모든 필드 ]
	public Book(String b_ISBN, String b_name, String b_rental, String m_id) {
		this.b_ISBN = b_ISBN;
		this.b_name = b_name;
		this.b_rental = b_rental;
		this.m_id = m_id;
	}
		// 2. 빈생성자 [ 필드X ]
	public Book() {
	}
	// 3. 메소드
		// 2. 도서등록 메소드 
	public boolean book_add() {
		return true;
	}
		// 3. 도서목록 메소드 
	public void book_list() {
		return;
	}
		// 4. 도서대여 메소드 
	public boolean book_rental() {
		return true;
	}
		// 5. 도서반납 메소드 
	public boolean book_return() {
		return true;
	}
		// 6. ISBN 체크 메소드 
	public boolean bookcheck() {
		return true;
	}
	
		// 1. 필드가 private 사용시 => get ,set 메소드 
	public String getB_ISBN() {
		return b_ISBN;
	}
	public void setB_ISBN(String b_ISBN) {
		this.b_ISBN = b_ISBN;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public String getB_rental() {
		return b_rental;
	}
	public void setB_rental(String b_rental) {
		this.b_rental = b_rental;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

}
