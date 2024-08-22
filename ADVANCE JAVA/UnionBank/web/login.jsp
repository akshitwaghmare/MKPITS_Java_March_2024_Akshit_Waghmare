<%-- 
    Document   : login
    Created on : 30-Jul-2024, 3:43:44 pm
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="a" class="bankPackage.userDetails" scope="application"/>
        <jsp:setProperty name="a" property="email" param="email"/>
        <jsp:setProperty name="a" property="password" param="password"/>
        <%
        if (a.authenticateUser()) {
        session.setAttribute("accno", a.getAccno());
        session.setAttribute("name", a.getName());
        response.sendRedirect("Welcome.jsp");
    } else {
        out.println("<h1>Login Failed</h1>");
        out.println("<p>Incorrect username or password. Please try again.</p>");
        out.println("<p><a href='index.html'>Back to Login</a></p>");
    }
%>
    </body>
</html>
