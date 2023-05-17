package JDBC_Intro;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    static String userName = "root";
    static String password = "12345";
    static String dbUrl = "jdbc:mysql://localhost:3306";

    public java.sql.Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl, userName, password);
    }
    
    public void showErrorMessage(SQLException exception) {
        System.out.println("Error: "+ exception.getMessage());
        System.out.println("Error code: "+ exception.getErrorCode());
    }
}
