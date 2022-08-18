<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>회원가입</title>
<link rel="stylesheet" href="SingUpcss.css">
</head>

<body>
	<!-- header -->
<!--         <div id="header"> -->
<!-- <!--             <a href="https://nid.naver.com/user2/V2Join.nhn?m=agree#agreeBottom" target="_blank" title="네이버 회원가입 페이지 보러가기"> --> -->
<!--             <img src="img/회원가입사진.png" id="logo"></a> -->
<!--         </div> -->


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
                        <input type="text" id="id" class="int" maxlength="20" name ="UserID">
                        <span class="step_url"></span>
                    </span>
                    <span class="error_next_box"></span>
                </div>

                <!-- PW1 -->
                <div>
                    <h3 class="join_title"><label for="pswd1">비밀번호</label></h3>
                    <span class="box int_pass">
                        <input type="password" id="pswd1" class="int" maxlength="20">
                        <span id="alertTxt">사용불가</span>
                        <img src="img/락.png" id="pswd1_img1" class="pswdImg">
                    </span>
                    <span class="error_next_box"></span>
                </div>

                <!-- PW2 -->
                <div>
                    <h3 class="join_title"><label for="pswd2">비밀번호 재확인</label></h3>
                    <span class="box int_pass_check">
                        <input type="password" id="pswd2" class="int" maxlength="20" name="userPassword">
                        <img src="img/락.png" id="pswd2_img1" class="pswdImg">
                    </span>
                    <span class="error_next_box"></span>
                </div>

                <!-- NAME -->
                <div>
                    <h3 class="join_title"><label for="name">이름</label></h3>
                    <span class="box int_name">
                        <input type="text" id="name" class="int" maxlength="20" name="Username">
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
                                <input type="text" id="yy" class="int" maxlength="4" placeholder="년(4자)" name="Userbir_wrap">
                            </span>
                        </div>

                        <!-- BIRTH_MM -->
                        <div id="bir_mm"> <!-- bir_mm 이건 월  -->
                            <span class="box">
                                <select id="mm" class="sel" name="Userbir_wrap">
                                    <option>월</option>
                                    <option value="01">1</option>
                                    <option value="02">2</option>
                                    <option value="03">3</option>
                                    <option value="04">4</option>
                                    <option value="05">5</option>
                                    <option value="06">6</option>
                                    <option value="07">7</option>
                                    <option value="08">8</option>
                                    <option value="09">9</option>                                    
                                    <option value="10">10</option>
                                    <option value="11">11</option>
                                    <option value="12">12</option>
                                </select>
                            </span>
                        </div>

                        <!-- BIRTH_DD -->
                        <div id="bir_dd"> <!-- "bir_dd" 이건 일수  -->
                            <span class="box">
                                <input type="text" id="dd" class="int" maxlength="2" placeholder="일" name="Userbir_wrap">
                            </span>
                        </div>

                    </div>
                    <span class="error_next_box"></span>    
                </div>

                <!-- GENDER -->
                <div>
                    <h3 class="join_title"><label for="gender">성별</label></h3>
                    <span class="box gender_code">
                        <select id="gender" class="sel" name="Usergender"> <!-- gender -->
                            <option>성별</option>
                            <option value="M">남자</option>
                            <option value="F">여자</option>
                        </select>                            
                    </span>
                    <span class="error_next_box">필수 정보입니다.</span>
                </div>

                <!-- EMAIL -->
<!--                 <div> -->
<!--                     <h3 class="join_title"><label for="email">본인확인 이메일<span class="optional">(선택)</span></label></h3> -->
<!--                     <span class="box int_email"> -->
<!--                         <input type="text" id="email" class="int" maxlength="100" placeholder="선택입력"> -->
<!--                     </span> -->
<!--                     <span class="error_next_box">이메일 주소를 다시 확인해주세요.</span>     -->
<!--                 </div> -->

                <!-- MOBILE -->
<!--                 <div> -->
<!--                     <h3 class="join_title"><label for="phoneNo">휴대전화</label></h3> -->
<!--                     <span class="box int_mobile"> -->
<!--                         <input type="tel" id="mobile" class="int" maxlength="16" placeholder="전화번호 입력"> -->
<!--                     </span> -->
<!--                     <span class="error_next_box"></span>     -->
<!--                 </div> -->


                <!-- JOIN BTN-->
                <div class="btn_area">
                    <button type="button" id="btnJoin" onclick="location.href='Login.jsp'">
                        <span>가입하기</span>
                    </button>
                </div>

            </div> 
            <!-- content-->

        </div> 
        <!-- wrapper -->
    <script src="SignUpJs.js">signup</script>
</body>
</html>