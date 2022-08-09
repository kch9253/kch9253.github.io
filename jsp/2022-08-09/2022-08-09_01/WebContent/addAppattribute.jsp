<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--  	어플리케이션 기본객체를 통해서 설정을할수있다 -->

<!-- 해당 페이지를 실행시킨후에야 지정해둔값이 전달하고자하는 파일에 전달된다. -->
<!-- 만약 전달후 톰캣을 정지시키면 전달된값은 사라지고 null 값으로 표기된다  -->
<!-- 톰캣을 재가동후에 설정한 페이지를 실행한후 전달받고자하는 페이지를 실행시키면 다시 전달받고자하는 값들이 전달된다 -->

<p>어플리케이션 기본 객체에 이름-값 설정하는 페이지</p>
	<%
		application.setAttribute("myStr", "string-obj");
		application.setAttribute("myInt", Integer.valueOf(10));
	
	%>
</body>
</html>