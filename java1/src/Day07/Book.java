package Day07;

public class Book {
	
	// 1. �ʵ� [ ISBN , ������ , �뿩���� , �뿩�� ȸ�����̵� �� ]
	private String b_ISBN;
	private String b_name;
	private boolean b_rental;
	private String m_id;
	
	// 2. ������
		// 1. ������� [ ��� �ʵ� ]
	public Book(String b_ISBN, String b_name, boolean b_rental, String m_id) {
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
		// 1. �Է¹ޱ� 
		System.out.println("------------------���� ��� ������ ----------------");
		System.out.println(" �����ڵ� : ");	String b_ISBN = BookApplication.scanner.next();
			// �����ڵ� �ߺ�üũ 
			boolean check = bookcheck(b_ISBN);
			if( check ) {
				System.out.println(" [[ �˸� ]] : ������ �����ڵ尡 �����մϴ� ");
				return false;
			}
		System.out.println(" ������ : ");		String b_name = BookApplication.scanner.next();
		// 2. ��ü ����		// �����뿩���� �ʱⰪ => true 		// �뿩�� ȸ�� �ʱⰪ => null
		Book book = new Book(b_ISBN, b_name, true , null);
		// 3. ��ü �迭���� 
		for( int i = 0 ; i< BookApplication.books.length ; i++ ) {
			if( BookApplication.books[i] == null ) { 
				BookApplication.books[i] = book ; return true; }
		}
		return false;
	}
	// 6. ISBN üũ �޼ҵ� [ üũ�� ����� �μ��� �޾Ƽ� �迭�� �����ϸ� true �ƴϸ� false ]
	public boolean bookcheck( String check_isbn ) {
		for( int i = 0 ; i< BookApplication.books.length ; i++ ) {
			if( BookApplication.books[i] != null && 
					BookApplication.books[i].getB_ISBN().equals(check_isbn) ) {
				return true;
			}
		}
		return false;
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
	public boolean getB_rental() {
		return b_rental;
	}
	public void setB_rental(boolean b_rental) {
		this.b_rental = b_rental;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

}
