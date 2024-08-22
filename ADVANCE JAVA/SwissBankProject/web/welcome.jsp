<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="Bankpackage.UserDetails" %>
<%
    UserDetails user = (UserDetails) session.getAttribute("user");
    if (user == null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome</title>
</head>
<body>
    <h2>Welcome, <%= user.getName() %></h2>
    <p>Your account number is <%= user.getAccno() %></p>
    <a href="index.jsp">Logout</a>
</body>
</html>
