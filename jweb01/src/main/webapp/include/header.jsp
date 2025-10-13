<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<body>
	<!-- header 영역 -->
	<%!
	//
	int pageCount = 0; // 변수선언
	
	//메서드 정의
	void addCount(){
		pageCount++;
	}
	%>
	
	<%
		addCount();
	%>
	
	
	<p>이 사이트 방문은 <%= pageCount %> 번째 입니다.<p>
</body>
