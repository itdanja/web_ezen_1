package controller;

import java.util.ArrayList;

import model.Member;

public class MemberController {
	
	//1. �ʵ� [ ��� ȸ���� ��� �ִ� ��ü = �÷��� �����ӿ�ũ vs �迭 ] 
	public static ArrayList<Member> memberlist = new ArrayList<>();

	//2. �޼ҵ� 
	// 1. ȸ������ 
	public boolean signup( Member member) {
		// ��ȯŸ�� : 
		return true; // ȸ������ ������ 
	}
	// 2. �α��� 
	public boolean login( String id , String password ) {
		return true; // �α��� ������ 
	}
	// 3. ���̵�ã��[ �̸� , �̸��� �μ��� �޾� �ش� ���Ͽ� ���̵� ���� ]
	public boolean forgotid( String name , String email ) {
		return true; // ���̵�ã�� ������  
	}
	// 4. ��й�ȣã��[ ���̵� , �̸��� �μ��� �޾� �ش� ���Ͽ� ��й�ȣ ���� ] 
	public boolean forgotpassword( String id , String email ) {
		return true; // ��й�ȣã�� ������ 
	}
	// 5. ȸ������[ ���̵� �μ��� �޾� �ش� ���̵��� ��� ���� ��ȯ ] 
	public Member info( String loginid ) {
		Member member = null;
		return member;
	}
	// 6. ȸ����������[ ���̵�� ���������� �޾Ƽ� ������Ʈ ó���� �������� ��ȯ
	public boolean info ( String loginid , Member updatemember) {
		return true;
	}
	// 7. ȸ��Ż�� [ ���̵� �μ��� �޾� �ش� ���̵� ���� �� �������� ��ȯ
	public boolean delete( String loginid ) {
		return true;
	}
}
