<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="bankPackage.Transaction" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Account Statement</title>
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
        <h2>Account Statement</h2>
        <jsp:useBean id="transaction" class="bankPackage.Transaction" scope="request" />
        <jsp:setProperty name="transaction" property="accno" param="accno" />
        <%
            List<Transaction> transactions = transaction.getStatement();
        %>
        <table>
            <tr>
                <th>ID</th>
                <th>Date</th>
                <th>Account Number</th>
                <th>Amount</th>
                <th>Transaction Type</th>
            </tr>
            <%
                for (Transaction trans : transactions) {
            %>
            <tr>
                <td><%= trans.getId() %></td>
                <td><%= trans.getDate() %></td>
                <td><%= trans.getAccno() %></td>
                <td><%= trans.getAmount() %></td>
                <td><%= trans.getTransaction_typeString() %></td>
            </tr>
            <%
                }
            %>
        </table>
        <a href="Welcome.jsp">Go back to home</a>
    </div>
</body>
</html>
