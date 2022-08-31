<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="dao" class="FAVORITE.favoriteDAO" /> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   
    <%     
        //넘어온 ID값 받아서 삭제하는 메소드 호출
   
        int result = dao.delfavoritelist(request.getParameter("latclick"));
       
        String message="삭제되지 않았습니다.";
        if(result > 0 ){
                       
            message = "삭제되었습니다.";
        }
    %> 
    
      <script>   
        alert("<%=message%>");
        location.href="FavoriteSearch.jsp";  
    </script>
</body>
</html>