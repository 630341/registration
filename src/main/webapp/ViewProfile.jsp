<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String fname = (String)request.getAttribute("fname");
UserBean ub = (UserBean)application.getAttribute("ubean");
out.println(ub.getfname()+"&nbsp&nbsp"+ub.getlname()+"nbsp&nbsp"+ub.getmId()
         +"nbsp&nbsp"+ub.getphNo()+"nbsp&nbsp"+"<a href='edit'>Edit</a>"+"<br>");
%>
<a href="logout">Logout</a>
</body>
</html>