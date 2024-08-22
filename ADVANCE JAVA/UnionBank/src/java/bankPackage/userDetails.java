package bankPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

public class userDetails {
    
    private String name;
    private String address;
    private String city;
    private String email;        
    private String phone;
    private String password;
    private double balance;
    private int accno;
    private Connection connection;
    private PreparedStatement preparedStatement;
    private final String DB_URL = "jdbc:mysql://localhost:3306/bank_db";
    private final String DB_USER = "root";
    private final String DB_PASSWORD = "Akshit@2001";

    public userDetails() {   
        
    }

    public userDetails(String name, String address, String city, String email, String phone, String password) {
        this();
        this.name = name;
        this.address = address;
        this.city = city;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public int insertUser() throws ClassNotFoundException {
        int rows=0;
        String insertSql = "insert into accountholdermaster (name, address, city, phone_number, balance, email, password) values (?, ?, ?, ?, ?, ?, ?)";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            
	            PreparedStatement insertStatement = connection.prepareStatement(insertSql);
	            insertStatement.setString(1, name);
	            insertStatement.setString(2, address);
	            insertStatement.setString(3, city);
	            insertStatement.setString(4, phone);
                    
	            insertStatement.setDouble(5, 0.0);
	            insertStatement.setString(6, email);
                    insertStatement.setString(7, password);
	            rows = insertStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(userDetails.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println(ex);
        } 
        return rows;
    }

    public int getAccno() {
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }
    
    public boolean authenticateUser() {
        boolean isAuthenticated = false;
        String sql = "SELECT accno, name FROM accountholdermaster WHERE email = ? AND password = ?";
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                accno = rs.getInt("accno");
                name = rs.getString("name");
                isAuthenticated = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(userDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        return isAuthenticated;
    }

    private void closeResources() {
        try {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(userDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
