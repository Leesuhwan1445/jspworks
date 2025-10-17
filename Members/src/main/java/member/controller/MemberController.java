package member.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import member.model.Member;
import service.MemberService;

import java.io.IOException;
import java.util.List;

@WebServlet("/member")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	MemberService service = new MemberService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		if(action.equals("memberList")) {
			List<Member> memberList = service.getMemberList();
			
			request.setAttribute("memberList", memberList);
		}
		RequestDispatcher rd = request.getRequestDispatcher("/member/memberList.jsp");
		rd.forward(request, response);

	}

}
