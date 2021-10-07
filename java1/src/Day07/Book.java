package Day07;

public class Book {
	
	// 1. 필드 [ ISBN , 도서명 , 대여여부 , 대여한 회원아이디 등 ]
	private String b_ISBN;
	private String b_name;
	private boolean b_rental;
	private String m_id;
	
	// 2. 생성자
		// 1. 도서등록 [ 모든 필드 ]
	public Book(String b_ISBN, String b_name, boolean b_rental, String m_id) {
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
		// 1. 입력받기 
		System.out.println("------------------도서 등록 페이지 ----------------");
		System.out.println(" 도서코드 : ");	String b_ISBN = BookApplication.scanner.next();
			// 도서코드 중복체크 
			boolean check = bookcheck(b_ISBN);
			if( check ) {
				System.out.println(" [[ 알림 ]] : 동일한 도서코드가 존재합니다 ");
				return false;
			}
		System.out.println(" 도서명 : ");		String b_name = BookApplication.scanner.next();
		// 2. 객체 생성		// 도서대여여부 초기값 => true 		// 대여한 회원 초기값 => null
		Book book = new Book(b_ISBN, b_name, true , null);
		// 3. 객체 배열저장 
		for( int i = 0 ; i< BookApplication.books.length ; i++ ) {
			if( BookApplication.books[i] == null ) { 
				BookApplication.books[i] = book ; return true; }
		}
		return false;
	}
	// 6. ISBN 체크 메소드 [ 체크할 대상을 인수로 받아서 배열내 존재하면 true 아니면 false ]
	public boolean bookcheck( String check_isbn ) {
		for( int i = 0 ; i< BookApplication.books.length ; i++ ) {
			if( BookApplication.books[i] != null && 
					BookApplication.books[i].getB_ISBN().equals(check_isbn) ) {
				return true;
			}
		}
		return false;
	}
	
		// 3. 도서목록 메소드 
	public void book_list() {
		System.out.println("------------------도서 목록 페이지 ----------------");
		System.out.println("도서코드\t도서명\t대여여부\t대여회원");
		
		for( int i = 0 ; i< BookApplication.books.length ; i++ ) {
			if( BookApplication.books[i] == null ) return;
			
			Book book = BookApplication.books[i];
			System.out.println( book.getB_ISBN()+"\t"+book.getB_name()
								+"\t"+book.getB_rental()+"\t"+book.m_id );
		}
		return;
	}
		// 4. 도서대여 메소드 [ 도서코드를 입력받아 대여여부가 TRUE이면 대여하기 ]  
	public boolean book_rental() {
		System.out.println("------------------도서 대여 페이지 ----------------");
		System.out.println(" 대여할 도서코드 : ");	String b_ISBN = BookApplication.scanner.next();
			// ISBN 존재여부 체크 
		boolean check = bookcheck(b_ISBN);
		if( check ) {
			
			for( int i = 0 ; i<BookApplication.books.length ;i++ ) {
				if( BookApplication.books[i] != null && 
						BookApplication.books[i].getB_ISBN().equals(b_ISBN)) { // 동일한 도서가 존재하면
					// 대여여부 확인 
					if( BookApplication.books[i].getB_rental() ) {
						System.out.println(" [[ 알림 ]] : 현재 도서 대여 합니다. 대여성공!!! ");
						// 1. 대여성공시 대여여부 true => false
						BookApplication.books[i].setB_rental(false);
						// 2. 대여성공시 대여회원에 현재 로그인된 아이디 대입 
						return true;
					}
					else { System.out.println(" [[ 알림 ]] : 현재 대여중인 도서 입니다. 대여불가!!!"); return false; }
				}
			}	
		}else {
			System.out.println("[[알림]] : 해당 도서코드가 존재하지 않습니다");
			return false;
		}
		return false;
	}
		// 5. 도서반납 메소드 
	public boolean book_return() {
	
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
