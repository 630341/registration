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
String fname=(String)request.getAttribute("fname");
UserBean ub = (UserBean)application.getAttribute("ubean");
out.println("page belongs to User:" + fname + "<br>");

%>
<form action="update" method="post">
Address:<input type="text" name="addr" value="<%=ub.getAddr() %>"><br>
MailId:<input type="text" name="mid" value="<%=ub.getmId() %>"><br>
PhoneNo:<input type="text" name="phno" value="<%=ub.getphNo() %>"><br>
<input type="submit" value="UpdateProfile">

</form>
</body>
</html>