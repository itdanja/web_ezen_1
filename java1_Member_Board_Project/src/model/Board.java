package model;

import java.util.ArrayList;
import java.util.Date;

public class Board {

	// 1. �ʵ� 
	private String title;
	private String contents;
	private String writer;
	private Date date;
	private int view;
	// �ϳ��� �Խù��� ������ ��� �����ϱ� ���� 
	private ArrayList<Reply> replylist;  // ��� ����Ʈ �޸��Ҵ�
	
	// 2. ������ 
	public Board() { // ������� : 1.�޼ҵ�ȣ���� 2. �� ��ü ������ ���Ŀ� �ʵ� �� ���� 
		
	}
	// �Խù� ��Ͻ� ���Ǵ� ������ 
	public Board(String title, String contents, String writer) {
		
		this.title = title;
		this.contents = contents;
		this.writer = writer;
		
		Date date = new Date(); // ����ð� Ŭ����
		this.date = date;
		
		this.view = 1;
		this.replylist = new ArrayList<>(); 
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getView() {
		return view;
	}
	public void setView(int view) {
		this.view = view;
	}
	public ArrayList<Reply> getReplylist() {
		return replylist;
	}
	public void setReplylist(ArrayList<Reply> replylist) {
		this.replylist = replylist;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
