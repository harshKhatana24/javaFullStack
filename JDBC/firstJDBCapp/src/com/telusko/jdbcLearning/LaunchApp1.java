package com.telusko.jdbcLearning;
import java.sql.*;

public class LaunchApp1 {

    static void main() throws ClassNotFoundException, SQLException {

        //1. Load and Register the Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2. Establish the connection
        String url="jdbc:mysql://localhost:3306/jdbclearning"; //?user=root -> can change -> eg. jdbclearning
        String user="root";
        String password="Root@123";
        Connection connection= DriverManager
                .getConnection(url,user,password);//url,user,password


        //3. Creating the Statement
        Statement statement=connection.createStatement();

        //4. Execute the Query
        //process the result
        String sql= """
INSERT INTO studentInfo(id,sname,sage,scity) VALUES(2,"B",21,"Greater Noida");
""";
        int rowAffected=statement.executeUpdate(sql);//no. of rows affected
        if(rowAffected==0){
            System.out.println("unable to insert the data");
        }else {
            System.out.println("data inserted successfully");
        }



        //5. Close the Resources
        statement.close();
        connection.close();

    }

}
