package com.telusko.jdbcLearning;

import java.sql.*;

public class LaunchApp4 {

    static void main() throws ClassNotFoundException, SQLException {

        //1. Load and Register the Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2. Establish the Connection
        String url="jdbc:mysql://127.0.0.1:3306/jdbcLearning";
        String user="root";
        String password="Root@123";
        Connection connection=DriverManager.getConnection(url,user,password);


        //3. Create the Statement
        Statement statement=connection.createStatement();

        //4. Execute the Query
        int affectedRow=statement.executeUpdate("""

DELETE FROM studentInfo where id=2;

""");
        //process the result

        if (affectedRow==0)
            System.out.println("deletion not done");
        else
            System.out.println("deletion done successfully");


        //5. Close the resource
        connection.close();
        statement.close();



    }


}
