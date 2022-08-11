<!--  
	페이지 이동을 제공하는 index.html 작성
	
	a. 사람 등록 페이지(입력 양식제공) 
	-> action = mapping 된 servlet
	-> service 메소드 {
		db 행추가
		redirect 응답 (사람 목록페이지)
		}
	b. 사람목록
		-> mapping 된 servlet
		-> service 메소드 {
			db 목록읽기
			forward 사람 목록을 보여주는 (view) jsp로
		}
-->				

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="./form.jsp">사람등록</a>
	<a href="./list">사람목록</a>
</body>
</html>