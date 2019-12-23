package sample;
import java.sql.*;
public class SqliteConnection {
    public static Connection getConnection() {
        Connection conn ;
        try {
            // db parameters
            String url = "jdbc:sqlite:C:/sqlite/inventory.sqlite";
            // create a connection to the database
            conn = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");
            return conn;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}
