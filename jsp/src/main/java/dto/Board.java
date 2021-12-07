package dto;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import dao.MemberDao;

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
	private String b_writer; // 작성자
	
	// 생성자 [ 1.빈생성자 2.전체생성자 3.등록생성자 4.수정생성자 ]
	
	public Board() {}
	public Board(int b_num, String b_title, String b_contents, String b_file) {
		this.b_num = b_num;
		this.b_title = b_title;
		this.b_contents = b_contents;
		this.b_file = b_file;
	}
	public Board(int b_num, String b_title, String b_contents, int m_num, String b_date, String b_file, int b_view,
			int b_activation) {
		super();
		this.b_num = b_num;
		this.b_title = b_title;
		this.b_contents = b_contents;
		this.m_num = m_num;
		// 1. 작성자 = 회원번호를 이용한 아이디 찾아서 대입
		this.b_writer = MemberDao.getmemberDao().getmemberid(m_num);
		// 2. 등록날짜와 오늘날짜와 동일하면 시간 아니면 날짜 표시
		Date today = new Date(); // 1. 오늘날짜 
		SimpleDateFormat datetimeformat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");	// 날짜,시간형식
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");				// 날짜 형식
		SimpleDateFormat timeformat = new SimpleDateFormat("a hh:mm");					// 시간 형식
		try {
			Date date =  datetimeformat.parse( b_date );						// [문자열]DB -> 날짜/시간 형식 변환
			if( dateFormat.format( date ).equals(  dateFormat.format( today ) ) ) {	// 등록날짜 = 오늘날짜 비교
				this.b_date = timeformat.format(date);		// 날짜가 동일하면 시간형식 적용
			}else {
				this.b_date = dateFormat.format(date);		// 날짜가 동일하지 않으면 날짜형식 적용
			}
		}
		catch (Exception e) {}
		
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
	public String getB_writer() {
		return b_writer;
	}
	public void setB_writer(String b_writer) {
		this.b_writer = b_writer;
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
