<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<p> Jsp( java server pases ) : �ڹ� ���� ������ </p>	
	<ul>
		<li> 1. HTML + JAVA �ڵ带 �����Ҽ� �ִ� ������
		<li> 2. java -> �����α׷���[ ���� : java,html ���� ] -> jsp[ java + html ]
		<li> 3. jsp���ϳ� java+html+css+js �ۼ� ����
		<li> 4. jsp ���������� -> ����[java] �� ��ȯ!!!! 
		<li> 5. ����� : java ���� �±� �ȿ��� �ۼ� 
	</ul>
	
		<!-- html ���� -->
	<h1> ��ũ��Ʈ �� </h1> 
	
		<!-- jsp ���� (���� �±� : 1.��������o[��������] 2.�޼ҵ弱��o 3.���x ) -->
	<%! String ���ڿ� = "jsp ����"; %>
	<%! public String �޼ҵ�(){ return "jsp �޼ҵ弱��";} %>	
	
		<!-- jsp ���� ( ��ũ��Ʈ �±� : 1.��������o[��������] 2.�޼ҵ弱��x 2.���o) -->
	<% 
		String ��ũ��Ʈ ="jsp ��ũ��Ʈ";
		String ���� = "jsp �Դϴ�.";
		System.out.print("�ֿܼ� ����ϴ� �޼ҵ�");	// �ܼ� ��� 
		out.print("Html ����ϴ� �޼ҵ�");			// out : ��ũ��Ʈ �±� ������ -> html
	%>
		<!-- html ���� -->
	<br> ���� ��� : <%=���ڿ� %>	<!-- ǥ���� �±� : ����,�޼ҵ� ȣ�� -->
	<br> �޼ҵ� ��� : <%=�޼ҵ�() %>
	<br> ��ũ��Ʈ ��� : <%=��ũ��Ʈ %>
	
		<!-- �ּ� -->
	<br> html : <!-- HTML �ּ� --> 
	<br> css : /* CSS �ּ� */
	<br> jsp : <%-- jsp �ּ� --%>
	<br> jsp : <% /*������ �ּ�*/	// �����ּ� %>
	
	
	
	
	
	
	

</body>
</html>

