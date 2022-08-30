<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="USER.UserDAO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호변경</title>
<script type="text/javascript">
function checkValue() {
	var form = document.userInfo;
	
	if(!form.userid.value) {
		alert(" 아이디를 입력하세요.");
		return false;
	}
	if(!form.userpassword.value) {
		alert(" 현재비밀번호를 입력하세요.");
		return false;
	}
	if(!form.passwd1.value) {
		alert("새 비밀번호를 입력하세요.");
		return false;
	}
	if(!form.passwd2.value) {
		alert("새 비밀번호 확인을 입력하세요.");
		return false;
	}
	if(form.passwd1.value != form.passwd2.value) {
		alert("변경할 비밀번호가 맞지않습니다.");
		return false;
	}
}

	
</script>

</head>
<body>

<%
request.setCharacterEncoding("UTF-8");
String id = (String) session.getAttribute("userid");


if(id == null) {
	// 로그인페이지 이동
	response.sendRedirect("../Signup&Login/Login.jsp");
}

String userpassword = request.getParameter("userpassword");

final String DRIVER = "com.mysql.cj.jdbc.Driver";
final String DBURL = "jdbc:mysql://localhost:3306/webproject";
final String DBID = "kch9253";
final String DBPW = "ckdgmlek1";

Class.forName(DRIVER);
Connection con = DriverManager.getConnection(DBURL, DBID, DBPW);
System.out.println("디비 연결성공");

String sql = "select * from user where userid=?";
PreparedStatement pstmt = con.prepareStatement(sql);
pstmt.setString(1, id);

ResultSet rs = pstmt.executeQuery();

%>




	<table cellspacing=0 cellpadding=0 border=0>
		<tr>
			<td height=1><spacer type=BLOCK height=10 width=100%></td>
		</tr>
	</table>	
			
	<form action="UserpasswordchangeAction.jsp" method="post" name="userInfo" onsubmit="return checkValue()">
		<table width="300" cellspacing="0" bordercolordark="white"
			bordercolorlight="black" cellpadding="0" align="center">
				<tr bgcolor="008baf" valign="middle">
					<td height="25" class="t1" align="center"><b>
						<font color="#FFFFFF" size="2">:::비밀번호 변경:::</font></b></td>
						
					</tr>
					
					<tr>
						<td height="1" background="./images/line.gif" bgcolor="e5e5e5">
						<img src="./imges/blank.gif" width="10" height="1"></td>
						
					</tr>
					
					
					<tr>
						<td height="20" calss="t1">
							<table width="100%" border="1" cellspacing="0"
								bordercolordark="white" bordercolorlight="0CA5A5">
							<tr>
								<td width="50%" class="t1" bgcolor="bddee8" align="center">
								
								아이디
								<td width="50%" class="t1" align="center">
								<input type="text" name="userid" maxlength="20" size="13" class="TXTFLD" value="<%=id%>" disabled>
								
								</td>
							</tr>					
						</table>
					</td>
				</tr>
					
					
					
					
					
					
					
					
					<tr>
						<td height="20" calss="t1">
							<table width="100%" border="1" cellspacing="0"
								bordercolordark="white" bordercolorlight="0CA5A5">
							<tr>
								<td width="50%" class="t1" bgcolor="bddee8" align="center">
								
								현재비밀번호
								<td width="50%" class="t1" align="center">
								<input type="password" name="userpassword" maxlength="20" size="13" class="TXTFLD">
								
								</td>
							</tr>					
						</table>
					</td>
				</tr>
				
				
				<tr>
						<td height="20" calss="t1">
							<table width="100%" border="1" cellspacing="0"
								bordercolordark="white" bordercolorlight="0CA5A5">
							<tr>
								<td width="50%" class="t1" bgcolor="bddee8" align="center">
								
								새 비밀번호
								<td width="50%" class="t1" align="center">
								<input type="password" name="passwd1" maxlength="20" size="13" class="TXTFLD">
								
								</td>
							</tr>					
						</table>
					</td>
				</tr>
				
				
				<tr>
						<td height="20" calss="t1">
							<table width="100%" border="1" cellspacing="0"
								bordercolordark="white" bordercolorlight="0CA5A5">
							<tr>
								<td width="50%" class="t1" bgcolor="bddee8" align="center">
								
								새 비밀번호확인
								<td width="50%" class="t1" align="center">
								<input type="password" name="passwd2" maxlength="20" size="13" class="TXTFLD">
								
								</td>
							</tr>					
						</table>
					</td>
				</tr>

				
				<tr>
					<td height="30" class="t1" align="center">
						<input type="submit" value="변경하기">
						
						<button type="button" onclick="location.href='../Manager/MapUser.jsp'">변경취소</button>
						</td>
					</tr>	
					
					
					<tr>
						<td height="1" background="./images/line.gif">
						<img src="./images/blank.gif" width="10" height="1"></td>
					</tr>
						
			</table>
		</form>
		
		
		<table cellspacing=0 cellpadding=0 border=0 align="center">
			<tr>
				<td height=20 class="t1">
				<font color="red">&nbsp;</font>
				</td>
			</tr>
		</table>				



</body>
</html>