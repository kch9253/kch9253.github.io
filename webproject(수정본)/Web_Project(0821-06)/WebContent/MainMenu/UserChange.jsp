<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="USER.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="USER.UserDAO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보변경</title>
<link rel="stylesheet" href="../css/SingUp.css">

<script type="text/javascript">
function checkValue() {
	var form = document.userInfo;
	
	if(!form.userid.value) {
		alert("아이디를 입력하세요.");
		return false;
	} 		
	if(!form.userpassword.value) {
		alert("비밀번호를 입력하세요.");
		return false;
	}
	if(!form.username.value) {
		alert("이름을 입력하세요.");
		return false;
	}
	if(!form.userbirwrap.value) {
		alert("생년월일을 입력하세요.");
		return false;
	}
	if(!form.usernumber.value) {
		alert("전화번호를 입력하세요.");
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

final String DRIVER = "com.mysql.cj.jdbc.Driver";
final String DBURL = "jdbc:mysql://localhost:3306/webproject";
final String DBID = "root";
final String DBPW = "0000";

Class.forName(DRIVER);
Connection con = DriverManager.getConnection(DBURL, DBID, DBPW);
System.out.println("디비 연결성공");

String sql = "select * from user where userid=?";
PreparedStatement pstmt = con.prepareStatement(sql);
pstmt.setString(1, id);

ResultSet rs = pstmt.executeQuery();

String username = "";
String userbirwrap = "";
String usernumber = "";
String usergender = "";

if(rs.next()) {
	username = rs.getString("username");
	userbirwrap = rs.getString("userbirwrap");
	usernumber = rs.getString("usernumber");
	usergender = rs.getString("usergender");
}




%>

		<form method="post" action="./UserUpdate.jsp"
			name="userInfo" onsubmit="return checkValue()"
		>
		  <!-- header -->
        <div id="header">
            <img src="NAVER_CI_Green.png" id="logo">
        </div>

        <!-- wrapper -->
        <div id="wrapper">

            <!-- content-->
            <div id="content">

                <!-- ID -->
                <div>
                    <h3 class="join_title">
                        <label for="id">아이디</label>
                    </h3>
                    <span class="box int_id">
                        <input type="text" id="id" class="int" name ="userid" maxlength="20" value="<%= id%>" disabled>
                        <span class="step_url"></span>
                    </span>
                   
                    <span class="error_next_box"></span>
                </div>
                <!-- PW1 -->
                <div>
                    <h3 class="join_title"><label for="pswd1">비밀번호</label></h3>
                    <span class="box int_pass">
                        <input type="password" id="pswd1" class="int" name="userpassword" maxlength="20" >
                        <span id="alertTxt">사용불가</span>
                        <img src="img/락.png" id="pswd1_img1" class="pswdImg">
                    </span>
                    <span class="error_next_box"></span>
                </div>

                <!-- PW2 -->
<!--                 <div> -->
<!--                     <h3 class="join_title"><label for="pswd2">비밀번호 재확인</label></h3> -->
<!--                     <span class="box int_pass_check"> -->
<!--                         <input type="password" id="pswd2" class="int" name="userpassword" maxlength="20" > -->
<!--                         <img src="img/락.png" id="pswd2_img1" class="pswdImg"> -->
<!--                     </span> -->
<!--                     <span class="error_next_box"></span> -->
<!--                 </div> -->

                <!-- NAME -->
                <div>
                    <h3 class="join_title"><label for="name">이름</label></h3>
                    <span class="box int_name">
                        <input type="text" id="name" class="int" name="username" maxlength="20" value="<%=username%>" >
                    </span>
                    <span class="error_next_box"></span>
                </div>

                <!-- BIRTH -->
                <div>
                    <h3 class="join_title"><label for="yy">생년월일</label></h3>

                    <div id="bir_wrap"> <!--  bir_wrap 생년월일 전체임 -->
                        <!-- BIRTH_YY -->
                        <div id="bir_yy"> <!--  bir_yy 생년월일 앞에 4자입력란 -->
                            <span class="box">
                                <input type="text" id="yy" class="int"  placeholder="ex) 2022-00-00 " name="userbirwrap" maxlength="12" value="<%=userbirwrap%>">
                            </span>
                        </div>


                    </div>
                    <span class="error_next_box"></span>    
                </div>
                
                <div>
                    <h3 class="join_title"><label for="phoneNo">휴대전화</label></h3>
                    <span class="box int_mobile">
                        <input type="tel" id="mobile" class="int" maxlength="11" placeholder="전화번호 입력"
                        name="usernumber" value="<%=usernumber%>">
                    </span>
                    <span class="error_next_box"></span>    
                </div>
						
						<div class="join_title" style="text-align: center;">
				<div>
                    <h3 class="join_title"><label for="gender">성별</label></h3>
                    <span class="box gender_code">
                        <select id="gender" class="sel" name="usergender" value="<%=usergender%>">
<!--                             <option>선택</option> -->
                            <option value="<%=usergender%>">남자</option>
                            <option value="<%=usergender%>">여자</option>
                        </select>                            
                    </span>
                    <span class="error_next_box">필수 정보입니다.</span>
                </div>
</div>
                <!-- JOIN BTN-->
                <div class="btn_area">
					
				<input type="submit" class="btn btn-primary form-control" value="변경하기">
				<input type="button" value="돌아가기" onclick="location.href='../Signup&Login/MapMain.jsp'">
                </div>

            </div> 
	
        </div> 
        <!-- wrapper -->
    <script src="../js/userUpdateJs.js">signup</script>
    </form>
    
</body>
</html>