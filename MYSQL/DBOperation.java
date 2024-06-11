package MyDBProject;

import java.sql.*;

public class DBOperation {
    public static void displayAllData(String table){
        Connection connection = DBConnection.connect();
        if (connection != null) {
            try (Statement statement = connection.createStatement()) {
                String sqlQuery = "SELECT * FROM " + table;
                ResultSet resultSet = statement.executeQuery(sqlQuery);
                ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
                int columnCount = resultSetMetaData.getColumnCount();

                // Print column names
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(resultSetMetaData.getColumnName(i) + "\t");
                }
                System.out.println();

                // Print rows of data
                while (resultSet.next()) {
                    for (int i = 1; i <= columnCount; i++) {
                        System.out.print(resultSet.getString(i) + "\t");
                    }
                    System.out.println();
                }
            } catch (SQLException e) {
                System.out.println("SQL Exception: " + e.getMessage());
            } finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.out.println("Failed to close connection: " + e.getMessage());
                }
            }
        } else {
            System.out.println("Failed to establish a database connection.");
        }
    }
    public static void displayFilmbyId(int id){
        Connection connection = DBConnection.connect();
        try {
            Statement statement = connection.createStatement();
            String sqlQuery = "select * from film where film_id = "+id;
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            int count = resultSetMetaData.getColumnCount();
            if(resultSet.next()){
                for (int i=1; i<=count; i++){
                    System.out.println(resultSetMetaData.getColumnName(i)+" : "+resultSet.getString(i));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
