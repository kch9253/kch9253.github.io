<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> <%-- 사용할 라이브러리를 사용하기위해 설정 prefix 를 통해 사용할 라이브러리 이름을 c 라고정해줌--%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="i" begin="1" end="10"> <%-- 반복할꺼임 begin(시작) end(끝) i값안에 1~10까지 반복하라고 값을 넣어줬음 --%>
		<c:if test="${ i % 2 == 0 }"> <%-- if test 를 통해 조건을 걸어준다 el 표현방법도 가능 --%>
		<p>${ i }</p>
		</c:if>
	</c:forEach>
	
	<c:choose> <%-- if else 를 대신해서 사용할수있음 --%>
		<c:when test="true"> <%-- 첫번째 조건이 참이면 나머지값들이 전부 참이여도 첫번째값만 나온다 --%>
			<p>첫번째 조건이 참일때</p>
		</c:when>
		<c:when test="false">
			<p>두번째 조건이 참일때</p>
		</c:when>
		<c:otherwise> <%-- c:otherwise = swich 케이스의 임폴트랑 비슷한역활이다 --%>
			<p>모든 조건이 참일때</p> <%-- 위 조건값들이 전부 거짓일경우 얘가 출력됨 --%>
		</c:otherwise>
	</c:choose>
</body>
</html>