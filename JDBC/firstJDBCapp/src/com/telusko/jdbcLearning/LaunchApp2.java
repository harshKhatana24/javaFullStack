package com.telusko.jdbcLearning;
import java.sql.*;

public class LaunchApp2 {

    static void main() throws ClassNotFoundException, SQLException {

        //1. Load and Register the Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2. Establish the connection
        String url="jdbc:mysql://127.0.0.1:3306/jdbcLearning";
        String user="root";
        String password="Root@123";
        Connection connection=DriverManager.getConnection(url,user,password);

        //3. Creating Statement
        Statement statement=connection.createStatement();

        //4. execute query
        //process the result
        String sql= """
UPDATE studentInfo set sage=24 where id=2;
""";
        int rowAffected=statement.executeUpdate(sql);
        if(rowAffected==0)
            System.out.println("Updation Failed");
        else
            System.out.println("Updation Successful!");

        //5. close the resources
        statement.close();
        connection.close();


    }


}
