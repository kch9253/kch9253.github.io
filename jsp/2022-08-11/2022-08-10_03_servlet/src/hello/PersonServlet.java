package hello;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import person.Person;
import person.PersonDAO;
import person.PersonValidator;

// 자바 값을 html 에 활용하기위한 서블릿생성
public class PersonServlet extends HttpServlet{
// index , form 파일 한몸임
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 한글깨짐?
		req.setCharacterEncoding("utf-8");
		
		System.out.println("사용자 요청발생");
		String firstName =req.getParameter("firstname");
		String lastName =req.getParameter("listname");
		String age =req.getParameter("age");
		String email =req.getParameter("email");
		
		PersonValidator validator = new PersonValidator();
		Map<String, String> errors = new HashMap<String, String>();
		errors.putAll(validator.isValidName(firstName));
		errors.putAll(validator.isValidName(lastName));
		errors.putAll(validator.isValidAge(age));
		errors.putAll(validator.isValidEmail(email));
		
		// 그러면 잘못된 값일때 사용자에게 뭐라하지?
		if (errors.size() > 0) {
			req.setAttribute("errors", errors);
			req.getRequestDispatcher("form.jsp").forward(req, resp);
		}
		
		PersonDAO dao = new PersonDAO();
		try {
			dao.insert(new Person(firstName, lastName, Integer.valueOf(age), email));
		} catch (NumberFormatException | SQLException e) {
			e.printStackTrace();
		}
		
		// 나중에 목록페이지에 보내자
		resp.sendRedirect(req.getContextPath() + "/list");
	}
}
