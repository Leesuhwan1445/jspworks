package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//응답 콘텐츠 타입 설정(url이 /hello 요청이 오면 html로 응답한다.)
		response.setContentType("text/html; charset=utf-8");
		
		//출력 스트림
		PrintWriter out = response.getWriter();
		
		//http에 응답
		out.println("<!DOCTYPE html><html><head><meta charset='UTF-8'><title>서블릿</title></head>");
		out.println("<body>");
		out.println("<h1>Hello Servlet!</h1><p>이 페이지는 서블릿에서 출력된 HTML입니다.</p>");
		out.println("</body></html>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
