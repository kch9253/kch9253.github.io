<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>C</h1>
	

<!--  public static String getrndnum(int loopcount){ -->
<!--    String str = ""; -->
<!--    int d = 0; -->
<!--    for (int i = 1; i <= loopcount; i++){ -->
<!--      Random r = new Random(); -->
<!--      d = r.nextInt(9); -->
<!--      str = str + Integer.toString(d); -->
<!--    } -->
<!--    return str; -->
<!--  } -->

<!--  String imsinum = getrndnum(1); -->
<!--  out.print(imsinum+"<br />"); -->


<% Object result = request.getAttribute("result"); %>
<p><%= result %> 
<!-- result 값을 똑같이 지정하고 출력할꺼임 -->

</body>
</html>