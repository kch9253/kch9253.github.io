package kr.co.greenart;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// HttpServlet 를 상속하게 만들고 xml의 값을 요청하여 나타내준다.
// 쉽게 생각해서 xml 에서 주소이름을 설정해서 호출하는 형식이라 생각하면된다.
public class CountryServlet extends HttpServlet {
	@Override
	// HttpServlet = 서비스 오버라이드
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// req = 리퀘스트 , resp = 리스폰스
		// 요청주소에 요청 흐름제어
//		req.setAttribute("title", "서블릿에서 설정한 제목");
//		req.setAttribute("message", "서블릿에서 설정한 메세지");
//		req.getRequestDispatcher("messageoutput.jsp").forward(req, resp);
		
		String continent = req.getParameter("continent");
		CountryDAO dao = new CountryDAO();
		List<Country> list = null;
		try {
			list = dao.getCountryByContinent("Asia");
		} catch (Exception e) {
			e.printStackTrace();
		}
		req.setAttribute("list", list);
		req.getRequestDispatcher("result.jsp").forward(req, resp);
	}
}
