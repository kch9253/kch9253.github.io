package kr.co.greenart;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/editcookie")
public class EditCookieServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie c = new Cookie("yourname" , "edit");
		resp.addCookie(c);
		
		Cookie c2 = new Cookie("korname" , "");
		c2.setMaxAge(0); // 0을 주면 삭제 그 이상의 값을 주면 쿠키 만료기간단위를 설정해줌 (초단위) ex) = 3600 이면 1시간
		
		resp.addCookie(c2);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
