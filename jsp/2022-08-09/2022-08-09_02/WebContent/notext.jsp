<!-- 지정값을 정해두고 전달하는중 --> 
<!-- 	viewPage.jsp 연결 -->

<%
	int result = 1 + 1;
	request.setAttribute("result", result); // request 는 한번사용하면 소멸되기때문에
	request.getRequestDispatcher("/WEB-INF/viewPage.jsp").forward(request, response);
// WEB-INF 안에 파일을 넣으면 해당 페이지를 사용자가 볼수없다. 그리고 요청을 하기위해 WEB-INF 를 통해 경로를 따로 설정해준다.
// 	forward =응답을 만 들지않고 흐름을 request response 요청,응답 객체들을 이동시켜준다
// getRequestDispatcher =해당 요청페이지로 이동하라는 객체
// 페이지를 켜보면 notext 주소가뜬다 요청을 한 파일은 viewPage 인데 notext 가뜨는이유는 여기서 요청값들을 처리하기때문에
	

// 	response.sendRedirect("./viewPage.jsp?result=" + result);  = 첫번째 사용법
	
// 	response.sendRedirect("./viewPage.jsp");  = 두번째 사용법
%>