package Bankpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserDetails {
    private String name;
    private String address;
    private String city;
    private String email;        
    private String phone;
    private String password;
    private int accno;
    
    Connection connection;
    PreparedStatement preparedStatement;
    String DB_URL = "jdbc:mysql://localhost:3306/bank_db";
    String DB_USER = "root";
    String DB_PASSWORD = "Akshit@2001";
    
    public UserDetails() {   
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Getters and setters...

    public void insertUser() {
        try {
            String sql = "INSERT INTO users (name, address, city, email, phone, password) VALUES (?, ?, ?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, address);
            preparedStatement.setString(3, city);
            preparedStatement.setString(4, email);
            preparedStatement.setString(5, phone);
            preparedStatement.setString(6, password);
            preparedStatement.executeUpdate();
            System.out.println("Registration Successful");
        } catch (SQLException ex) {
            Logger.getLogger(UserDetails.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (preparedStatement != null) preparedStatement.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public boolean authenticateUser() {
        boolean isAuthenticated = false;
        try {
            String sql = "SELECT accno, name FROM users WHERE email = ? AND password = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                accno = rs.getInt("accno");
                name = rs.getString("name");
                isAuthenticated = true;
            }
            rs.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error in database connection: " + e);
        }
        return isAuthenticated;
    }
}
