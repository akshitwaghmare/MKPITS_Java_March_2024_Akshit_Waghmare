package bankPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Transaction {
    private Date date;
    private int accno;
    private int id;
    private int amount;
    private String transaction_typeString;

    private Connection connection;
    private PreparedStatement preparedStatement;
    private final String DB_URL = "jdbc:mysql://localhost:3306/bank_db";
    private final String DB_USER = "root";
    private final String DB_PASSWORD = "Akshit@2001";

    public String getTransaction_typeString() {
        return transaction_typeString;
    }

    public void setTransaction_typeString(String transaction_typeString) {
        this.transaction_typeString = transaction_typeString;
    }

    public Transaction() {
        this.date = new Date(System.currentTimeMillis()); // Set the current date
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getAccno() {
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Boolean deposite() {
        boolean flag = false;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            String sql = "INSERT INTO transactions (date, accno, amount, transaction_type) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setDate(1, this.date);
            statement.setInt(2, accno);
            statement.setDouble(3, amount);
            statement.setString(4, "deposit");
            int rows = statement.executeUpdate();
            if (rows > 0) {
                String sql1 = "UPDATE accountholdermaster SET balance = balance + ? WHERE accno = ?";
                statement = connection.prepareStatement(sql1);
                statement.setDouble(1, amount);
                statement.setInt(2, accno);
                statement.executeUpdate();
                flag = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public boolean withdraw() {
        boolean flag = false;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            String sql = "INSERT INTO transactions (date, accno, amount, transaction_type) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setDate(1, this.date);
            statement.setInt(2, accno);
            statement.setDouble(3, amount);
            statement.setString(4, "withdrawal");
            int rows = statement.executeUpdate();
            if (rows > 0) {
                String sql2 = "UPDATE accountholdermaster SET balance = balance - ? WHERE accno = ?";
                statement = connection.prepareStatement(sql2);
                statement.setDouble(1, amount);
                statement.setInt(2, accno);
                statement.executeUpdate();
                flag = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public double showBalance() {
        double balance = 0.0;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            String sql = "SELECT balance FROM accountholdermaster WHERE accno = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, accno);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                balance = resultSet.getDouble("balance");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return balance;
    }

    public List<Transaction> getStatement() {
        List<Transaction> transactions = new ArrayList<>();
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            String sql = "SELECT * FROM transactions WHERE accno = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, accno);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Transaction transaction = new Transaction();
                transaction.setId(resultSet.getInt("id"));
                transaction.setDate(resultSet.getDate("date"));
                transaction.setAccno(resultSet.getInt("accno"));
                transaction.setAmount(resultSet.getInt("amount"));
                transaction.setTransaction_typeString(resultSet.getString("transaction_type"));
                transactions.add(transaction);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return transactions;
    }
}
