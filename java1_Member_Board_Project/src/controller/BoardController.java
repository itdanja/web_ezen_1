package controller;

import java.util.ArrayList;

import model.Board;

public class BoardController {

	// 1. �ʵ�
	public static ArrayList<Board> boards = new ArrayList<>();
		// static ������쿡 �ش� �ʵ� ȣ��� [ BoardController ��ü ���� ]
		// static ������� �ش� �ʵ� �ٷ�ȣ�� ���� 
	
	// 2. �޼ҵ� 
	// �Խù� ��� �޼ҵ� 
	public static boolean add( Board board ) {
		
		return true; // ��� ������ 
	}
	// �Խù� ��������[��ȸ] �޼ҵ� 
	public static Board detail( int index ) {
		
		Board board = null;
		return board; // �˻��� �Խù� ��ȯ
	}
	// �Խù� ���� �޼ҵ� 
	public static boolean delete( int index ) {
		return true;
	}
	// �Խù� ���� �޼ҵ� 
	public static boolean update( int index , String title , String contents ) {
		return true;
	}
	
	
	
	
	
	
	
}
