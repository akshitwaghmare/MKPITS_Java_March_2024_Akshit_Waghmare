<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="bankPackage.Transaction" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Account Balance</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }
        .container {
            max-width: 400px;
            margin: auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 10px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Account Balance</h2>
        <jsp:useBean id="transaction" class="bankPackage.Transaction" scope="request" />
        <jsp:setProperty name="transaction" property="accno" param="accno" />
        <%
            double balance = transaction.showBalance();
        %>
        <p>Current Balance: <%= balance %></p>
        <a href="Welcome.jsp">Go back to home</a>
    </div>
</body>
</html>
