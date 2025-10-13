package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/register2") //http://localhost:8080
public class RegisterServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//요청 입력값 받기
		String name = request.getParameter("uname");
		String email = request.getParameter("email");
		String[] subjects = request.getParameterValues("subject");
		
		System.out.println("이름: " + name);
		System.out.println("이메일: " + email);
		
		
		//응답 설정
		response.setContentType("text/html; charset=utf-8");
		
		
		//출력 스트림
		PrintWriter out = response.getWriter();
		
		//http 에 응답
		out.println("<!DOCTYPE html><html><head><meta charset='UTF-8'><title>회원가입 결과</title></head>");
		out.println("<body>");
		out.println("<p>이름: "  + name + "</p>");
		out.println("<p>이메일: "  + email + "</p>");
		for(String subject : subjects) {
			out.println("<p>선택한 과목:" + subject + "</p>");
		}
		out.println("<a href = '/jweb01/servlet/register.jsp'>다시입력</a>");
		out.println("</body></html>");
		
	}

}
