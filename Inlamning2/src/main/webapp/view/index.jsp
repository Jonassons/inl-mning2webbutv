<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/Servlet1" method="POST">
<input type="text" name="username" placeholder="Enter name">
<input type="password" name="password" placeholder="Enter password">
<input type="submit" value="Log in">




</form>

${Wrong}
</body>
</html>