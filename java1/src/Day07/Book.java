package Day07;

public class Book {
	
	// 1. �ʵ� [ ISBN , ������ , �뿩���� , �뿩�� ȸ�����̵� �� ]
	private String b_ISBN;
	private String b_name;
	private String b_rental;
	private String m_id;
	
	// 2. ������
		// 1. ������� [ ��� �ʵ� ]
	public Book(String b_ISBN, String b_name, String b_rental, String m_id) {
		this.b_ISBN = b_ISBN;
		this.b_name = b_name;
		this.b_rental = b_rental;
		this.m_id = m_id;
	}
		// 2. ������� [ �ʵ�X ]
	public Book() {
	}
	// 3. �޼ҵ�
		// 2. ������� �޼ҵ� 
	public boolean book_add() {
		return true;
	}
		// 3. ������� �޼ҵ� 
	public void book_list() {
		return;
	}
		// 4. �����뿩 �޼ҵ� 
	public boolean book_rental() {
		return true;
	}
		// 5. �����ݳ� �޼ҵ� 
	public boolean book_return() {
		return true;
	}
		// 6. ISBN üũ �޼ҵ� 
	public boolean bookcheck() {
		return true;
	}
	
		// 1. �ʵ尡 private ���� => get ,set �޼ҵ� 
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
