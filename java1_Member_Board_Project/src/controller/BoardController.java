package controller;

import java.util.ArrayList;

import database.File;
import model.Board;

public class BoardController {

	// 1. �ʵ�
	public static ArrayList<Board> boardlist = new ArrayList<>();
		// static ������쿡 �ش� �ʵ� ȣ��� [ BoardController ��ü ���� ]
		// static ������� �ش� �ʵ� �ٷ�ȣ�� ���� 
	
	// 2. �޼ҵ� 
	// �Խù� ��� �޼ҵ� 
	public static boolean add( Board board ) {
		
		// 1. ��ȿ���˻�[ x ]	// 2. �ߺ�üũ [ x ]
		// 3. ����Ʈ����
		boardlist.add(board);
		// 4. ����ó�� 
		File.filesave(2); // 2:�Խù�����
		
		return true; // ��� ������ 
	}
	// �Խù� ��������[��ȸ] �޼ҵ� 
	public static Board detail( int index ) {
		
		try {
			Board board = boardlist.get(index);
			return board; // �˻��� �Խù� ��ȯ
		}
		catch (Exception e) {
			return null; // �˻��� �Խù� �������
		}
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
