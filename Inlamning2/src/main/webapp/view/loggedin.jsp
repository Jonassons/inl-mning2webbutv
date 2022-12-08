<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "model.Bean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
if(session.getAttribute("LoggedIn") !=null) {
	Bean user = (Bean)session.getAttribute("LoggedIn");
	out.print("<h1> Wow, du kan ditt password " + user.getUsername() +"</h1>");
	out.print("<form action=\"RemoveServlet\" method=\"POST\">");
	out.print("<input type=\"submit\" value=\"Log out\" />");
	out.print("</form>");
}else{
	response.sendRedirect("view/index.jsp");
	
}







%>
</body>
</html>