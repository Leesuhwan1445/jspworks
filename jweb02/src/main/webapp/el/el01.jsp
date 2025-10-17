<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>문자,숫자 데이터 표기</h3>
	${300}<br>
	${"감사합니다."}<br>
	${12 * 2}<br>
	${12 / 2}<br> 
	
<h3>비교, 논리 연산자</h3>
${10 == 11}<br>
${10 eq 11}<br>
${10 != 11}<br>

${10 < 11} <br>
${10 lt 11} <br>
${10 > 11} <br>
${10 gt 11} <br>

${ (10 < 11) and (10 eq 10) } <br> 
${ (10 < 11) or (10 eq 11) } <br> 

</body>
</html>