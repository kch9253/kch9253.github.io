<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link rel="stylesheet" href="../css/SingUp.css">

<script type="text/javascript">
function checkValue() {
	var form = document.userInfo;
	
	if(!form.userid.value) {
		alert("아이디를 입력하세요.");
		return false;
	} 		
	if(!form.userpassword1.value) {
		alert("비밀번호를 입력하세요.");
		return false;
	}
	if(!form.userpassword.value) {
		alert("비밀번호를 입력하세요.");
		return false;
	}
	if(form.userpassword1.value != form.userpassword.value) {
		alert("비밀번호가 맞지않습니다.");
		return false;
	}
	if(!form.userpassword1.value) {
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
		<form method="post" action="./joinAction.jsp"
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
                        <input type="text" id="id" class="int" name ="userid" maxlength="20" onkeydown="inputIdChk()">
                        <span class="step_url"></span>
                    </span>
                   
                   
<!--    					 <input type="button" id="check_button" value="ID 중복검사" onclick="openIdChk()"> -->
<!--    					 <input type="hidden" name="idDuplication" value="idUncheck" > -->
                   
                   
                    <span class="error_next_box"></span>
                    
                </div>

                <!-- PW1 -->
                <div>
                    <h3 class="join_title"><label for="pswd1">비밀번호</label></h3>
                    <span class="box int_pass">
                        <input type="password" id="pswd1" class="int" name="userpassword1" maxlength="20" >
                        <span id="alertTxt">사용불가</span>
                        <img src="img/락.png" id="pswd1_img1" class="pswdImg">
                    </span>
                    <span class="error_next_box"></span>
                </div>

                <!-- PW2 -->
                <div>
                    <h3 class="join_title"><label for="pswd2">비밀번호 확인</label></h3>
                    <span class="box int_pass_check">
                        <input type="password" id="pswd2" class="int" name="userpassword" maxlength="20" >
                        <img src="img/락.png" id="pswd2_img1" class="pswdImg">
                    </span>
                    <span class="error_next_box"></span>
                </div>

                <!-- NAME -->
                <div>
                    <h3 class="join_title"><label for="name">이름</label></h3>
                    <span class="box int_name">
                        <input type="text" id="name" class="int" name="username" maxlength="10" >
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
                                <input type="text" id="yy" class="int"  placeholder="ex) 2022-00-00 " name="userbirwrap" maxlength="12">
                            </span>
                        </div>


                    </div>
                    <span class="error_next_box"></span>    
                </div>
                
                <div>
                    <h3 class="join_title"><label for="phoneNo">휴대전화</label></h3>
                    <span class="box int_mobile">
                        <input type="tel" id="mobile" class="int" maxlength="11" placeholder="전화번호 입력"
                        name="usernumber">
                    </span>
                    <span class="error_next_box"></span>    
                </div>
						
						<div class="join_title" style="text-align: center;">
	 			
	 			<div>
                    <h3 class="join_title"><label for="gender">성별</label></h3>
                    <span class="box gender_code">
                        <select id="gender" class="sel" name="usergender">
<!--                             <option>선택</option> -->
                            <option value="남자">남자</option>
                            <option value="여자">여자</option>
                        </select>                            
                    </span>
                    <span class="error_next_box">필수 정보입니다.</span>
                </div>
	
	
</div>
						
                <!-- JOIN BTN-->
                <div class="btn_area">
					
				<input type="submit" class="btn btn-primary form-control" value="회원가입">
<!-- 				<div class="btn_area"> -->
<!--                     <button type="button" id="btnJoin" onclick="check_ok()" onkeyup="len_chk()"> -->
<!--                         <span>가입하기</span> -->
<!--                     </button> -->
<!--                 </div> -->
				
				<input type="reset" name="reset" value="다시입력">
				<input type="button" value="돌아가기" onclick="location.href='Login.jsp'">

                </div>

            </div> 
	
        </div> 
        
        
                
        <!-- wrapper -->
    <script src="../js/SignUpJs.js">signup</script>
    
    
    
    
    </form>
    

    
    
    
    
</body>
</html>