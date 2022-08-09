<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>환영인사</title>
</head>
<body>
	<%
		String name = request.getParameter("name");
		name = name.trim();
		
		String ageStr = request.getParameter("age");
		
		if (ageStr == null || ageStr.trim().length() == 0) {
			response.setStatus(400);
			out.println("잘못된 입력");
		} else {
			int age = Integer.valueOf(ageStr);
			
			if(name.length() == 0){
				response.sendRedirect("./person.jsp");
			} else {
				out.print("(" + name + ", " + age + ") 님 환영합니다.");
			}
		}
	%>
</body>
</html>


