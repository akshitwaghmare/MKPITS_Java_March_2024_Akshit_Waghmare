<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
        <form method="post" action="showBalanceResult.jsp">
            <label for="accno">Account Number</label>
            <input type="text" id="accno" name="accno" placeholder="Enter your account number" required>
            <input type="submit" value="Show Balance">
        </form>
    </div>
</body>
</html>
