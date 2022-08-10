package hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	private int some = 10; // 서블릿같은경우 값을 가진 상태를 만들면 안된다.
						   // 변경한값들이 유저들이 접속할때마다 변경되어 유지되는게아닌 접속할때마다 계속해서 변수가 발생하거나 값이 변경될수있다
	
	public HelloServlet() {
		super();
		System.out.println("헬로 서블릿 생성자는 언제 호출되나요?");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		some++;
		PrintWriter pw = resp.getWriter();
		pw.println(req.getRequestURI());
		pw.flush();
		System.out.println("필드값:" + some);
	}
}
