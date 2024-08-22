<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration Success</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }
        .container {
            max-width: 600px;
            margin: auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 10px;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }
        table, th, td {
            border: 1px solid black;
        }
        th, td {
            padding: 10px;
            text-align: left;
        }
    </style>
</head>
    <jsp:useBean id="user" class="bankPackage.userDetails" scope="application"/>
    <jsp:setProperty name="user" property="name" param="name"/>
    <jsp:setProperty name="user" property="address" param="address"/>
    <jsp:setProperty name="user" property="city" param="city"/>
    <jsp:setProperty name="user" property="email" param="email"/>
    <jsp:setProperty name="user" property="phone" param="phone"/>
    <jsp:setProperty name="user" property="password" param="password"/>
    <%
        if(user.insertUser()>0){
            out.println("Signup Successfull");
            out.println("<p>Your account has been created successfully.</p>");
            out.println("<p><a href='index.html'>Back to Login</a></p>");
        }
        else{
            out.println("SignUp Failed");
        }
    %>
<body>
</body>
</html>
