<%@page import="java.util.Random"%>
<%@page import="java.time.LocalDate"%>
<%@page import="java.time.LocalTime"%>
<%
	String alphabet = request.getParameter("alphabet"); // 파라미터값으로 사용고자하는 애를 불러올거임
	
// 	if (alphabet.equals("a")) {
// 		response.sendRedirect("A.jsp");
// 	}else if (alphabet.equals("b")) {
// 		response.sendRedirect("B.jsp");
// 	}else if (alphabet.equals("c")) {
// 		response.sendRedirect("C.jsp");
// 	}
	
	if (alphabet.equals("a")) {
		request.setAttribute("result", LocalTime.now());
		request.getRequestDispatcher("A.jsp").forward(request, response);
	} else if (alphabet.equals("b")) {
		request.setAttribute("result", LocalDate.now());
		request.getRequestDispatcher("B.jsp").forward(request, response);
	} else if (alphabet.equals("c")) {
		Random r = new Random();
		request.setAttribute("result", r.nextInt());
		request.getRequestDispatcher("C.jsp").forward(request, response);
	}
	
// 	request.getRequestDispatcher(".jsp").forward(request, response);
// 	위 값을 통해 연결이 끊기지않고 계속해서 연결해서 호출할수있다
%>
