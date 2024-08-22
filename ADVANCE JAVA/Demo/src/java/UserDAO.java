
import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class UserDAO {
    
    private final String DB_URL = "jdbc:mysql://localhost:3306/bank_db";
    private final String DB_USER = "root";
    private final String DB_PASSWORD = "Akshit@2001";
    
    private static final String INSERT_USERS_SQL = "INSERT INTO users" + "  (name, email, country) VALUES " +
        " (?, ?, ?);";

    private static final String SELECT_USER_BY_ID = "select id,name,email,country from users where id =?";
    private static final String SELECT_ALL_USERS = "select * from users";
    private static final String DELETE_USERS_SQL = "delete from users where id = ?;";
    private static final String UPDATE_USERS_SQL = "update users set name = ?,email= ?, country =? where id = ?;";
    
    public UserDAO() {}

    public Connection getConnection() throws ClassNotFoundException {
        Connection connection = null;
        Class.forName("com.mysql.jdbc.Driver");
        try {
            connection = (Connection) DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
    
    public void insertUser(User user){
        System.out.println(INSERT_USERS_SQL);
        Connection connection;
        try {
            connection = getConnection();
            PreparedStatement preparedStatement = connection.preparedStatement(INSERT_USERS_SQL);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
