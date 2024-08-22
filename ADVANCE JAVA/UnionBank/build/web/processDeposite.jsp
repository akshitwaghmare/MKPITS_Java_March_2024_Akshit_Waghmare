<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Deposit Success</title>
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
<body>
    <div class="container">
        <jsp:useBean id="transaction" class="bankPackage.Transaction" scope="request" />
        <jsp:setProperty name="transaction" property="accno" param="accno" />
        <jsp:setProperty name="transaction" property="amount" param="amount" />
        <%
            boolean success = transaction.deposite();
            if (success) {
        %>
        <h2>Deposit Successful</h2>
        <p>Amount of <%= transaction.getAmount() %> has been successfully deposited to account number <%= transaction.getAccno() %>.</p>
        <a href="Welcome.jsp">Go back to home</a>
        <%
            } else {
        %>
        <h2>Deposit Failed</h2>
        <p>There was an issue processing your deposit. Please try again.</p>
        <a href="deposite.jsp">Go back to deposit</a>
        <%
            }
        %>
    </div>
</body>
</html>
