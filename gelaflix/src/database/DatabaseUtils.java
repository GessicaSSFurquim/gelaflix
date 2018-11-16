package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtils {

    public static final String HOSTNAME = "localhost";
    public static final String DB_NAME = "testing";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";


    public static void loadDriver() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
    }

    public static Connection getConnection() throws SQLException {
        Connection conn = null;

        conn = DriverManager.getConnection("jdbc:mysql://"
                + HOSTNAME + "/"
                + DB_NAME + "?user="
                + USERNAME + "&password="
                + PASSWORD);

        return conn;
    }

}
