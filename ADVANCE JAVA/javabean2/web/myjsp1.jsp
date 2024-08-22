<%-- 
    Document   : myjsp1
    Created on : 26-Jul-2024, 1:01:57 pm
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JP Page</title>
    </head>
    <body>
        <jsp:useBean id="s" class="mybean.Mystudent" scope="application"></jsp:useBean>
        <jsp:setProperty name="s" property="nameString" value="akshit" ></jsp:setProperty>
        <jsp:getProperty name="s" property="nameString" ></jsp:getProperty>
    </body>
</html>
