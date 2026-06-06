package com.telusko.jdbcLearning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcUtil {

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://127.0.0.1:3306/jdbcLearning";
        String user = "root";
        String password = "Root@123";
        return DriverManager.getConnection(url, user, password);

    }


    public static void closeConnection(Connection connection, Statement statement) throws SQLException {
        //throw kar do exc jo call karega vo handle karega
        connection.close();
//        statement.close();
        statement.close();
    }

}
