package MyDBProject;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        DBOperation.displayAllData("film");
        DBOperation.displayFilmbyId(5);
    }
}
