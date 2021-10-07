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
		System.out.println("------------------���� ��� ������ ----------------");
		System.out.println("�����ڵ�\t������\t�뿩����\t�뿩ȸ��");
		
		for( int i = 0 ; i< BookApplication.books.length ; i++ ) {
			if( BookApplication.books[i] == null ) return;
			
			Book book = BookApplication.books[i];
			System.out.println( book.getB_ISBN()+"\t"+book.getB_name()
								+"\t"+book.getB_rental()+"\t"+book.m_id );
		}
		return;
	}
		// 4. �����뿩 �޼ҵ� [ �����ڵ带 �Է¹޾� �뿩���ΰ� TRUE�̸� �뿩�ϱ� ]  
	public boolean book_rental( String loginid ) {
		System.out.println("------------------���� �뿩 ������ ----------------");
		System.out.println(" �뿩�� �����ڵ� : ");	String b_ISBN = BookApplication.scanner.next();
			// ISBN ���翩�� üũ 
		boolean check = bookcheck(b_ISBN);
		if( check ) {
			
			for( int i = 0 ; i<BookApplication.books.length ;i++ ) {
				if( BookApplication.books[i] != null && 
						BookApplication.books[i].getB_ISBN().equals(b_ISBN)) { // ������ ������ �����ϸ�
					// �뿩���� Ȯ�� 
					if( BookApplication.books[i].getB_rental() ) {
						System.out.println(" [[ �˸� ]] : ���� ���� �뿩 �մϴ�. �뿩����!!! ");
						// 1. �뿩������ �뿩���� true => false
						BookApplication.books[i].setB_rental(false);
						// 2. �뿩������ �뿩ȸ���� ���� �α��ε� ���̵� ���� 
						BookApplication.books[i].setM_id(loginid);
						
						return true;
					}
					else { System.out.println(" [[ �˸� ]] : ���� �뿩���� ���� �Դϴ�. �뿩�Ұ�!!!"); return false; }
				}
			}	
		}else {
			System.out.println("[[�˸�]] : �ش� �����ڵ尡 �������� �ʽ��ϴ�");
			return false;
		}
		return false;
	}
		// 5. �����ݳ� �޼ҵ� 
	public boolean book_return( String loginid ) {
	
		System.out.println("------------------���� �ݳ� ������ ----------------");
		System.out.println(" �ݳ� �����ڵ� : ");	String b_ISBN = BookApplication.scanner.next();
		
		// 1.�뿩���� å�� ã�� 
		for( int i = 0 ; i< BookApplication.books.length ; i++) {
			if( BookApplication.books[i] !=null && !BookApplication.books[i].getB_rental() ) {
				// ! : ���� ( true => false )
				// 2.�Է¹��� �����ڵ� 
				if( BookApplication.books[i].getB_ISBN().equals(b_ISBN) ) {
					// 3.�α��ε� ȸ�� == �뿩ȸ��
					if( BookApplication.books[i].getM_id().equals( loginid ) ) {
						System.out.println(" [[ �˸� ]] : ���� �ݳ� ���� !!! ");
						BookApplication.books[i].setM_id(null); // 1.�ݳ������� �뿩ȸ�� => null
						BookApplication.books[i].setB_rental(true); // 2.�뿩���� => true
						return true;
					}
				}
			}
		}
		System.out.println(" [[ �˸� ]] : ȸ������ �뿩���� ������ �ƴմϴ�");
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
