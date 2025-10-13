<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
//request 는 저장기능을 갖고 있다(폼에서 입력된 값)

String id = request.getParameter("id");
String pw = request.getParameter("password");

/* out.println("아이디: " + id + "<br>");
out.println("비밀번호: " + pw + "<br>"); */

//회원이 가입되었다고가정하고 id : space, pw : 1234
if(id.equals("space") && pw.equals("1234")){
	/* out.println("로그인 성공!"); */
	session.setAttribute("userId", id); //userId 이름으로 세션 발급
}else{
	out.println("<script>");
	out.println("alert('아이디나 비밀번호가 일치하지 않습니다.')");
	out.println("history.back()");
	out.println("</script>");
}
%>

<p><%=session.getAttribute("userId")%> 님이 로그인 했습니다</p>