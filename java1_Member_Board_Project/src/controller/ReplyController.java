package controller;

import model.Reply;

public class ReplyController {

	
	// 메소드 
	
	// 1. 댓글 저장 
	public static boolean add( int index , Reply reply ) {
						// 게시물 번호 , 댓글객체
						// 어떤 게시물에 댓글을 추가할껀지
		try {
			BoardController.boardlist.get(index).getReplylist().add(reply);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	
}
