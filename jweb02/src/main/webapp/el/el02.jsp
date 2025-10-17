<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.time.LocalDateTime, java.util.*, java.util.HashMap" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터 저장 - Model</title>
</head>
<body>
	<%
	LocalDateTime datetime = LocalDateTime.now();
	%>
	
	<p>스크립트 출력 : <%=datetime %>
	
	<jsp:useBean id="now" class="java.time.LocalDateTime" />
	<p>출력 : ${now}</p>
	
	<%
	request.setAttribute("name","한강");
	request.setAttribute("age", 25);
	%>
	<p>이름: ${name}</p>
	<p>나이: ${age}</p>
	
	<!-- 배열 저장 -->
	
	<%
	String[] fruits = {"사과","딸기","바나나"};
	//"fruits"를 뷰에 보내줌
	request.setAttribute("fruits", fruits);
	%>
	
	<p>${fruits[0]}</p>
	
	<!-- Map 자료 저장 -->
	<%
	Map<String, String> map = new HashMap<>();
	map.put("k1","korea");
	map.put("j1","japan");
	
	//화면(view)
	request.setAttribute("maps", map);
	%>
	<p>${maps.k1}</p>
	<p>${maps.j1}</p>
	
</body>
</html>