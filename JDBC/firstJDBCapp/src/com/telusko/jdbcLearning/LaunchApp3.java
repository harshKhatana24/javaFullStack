package com.telusko.jdbcLearning;

import java.sql.*;

public class LaunchApp3 {

    static void main() throws ClassNotFoundException, SQLException {
        //1. Load and Register the Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2. Establish the connection
        String url="jdbc:mysql://127.0.0.1:3306/jdbcLearning";
        String user="root";
        String password="Root@123";
        Connection connection=DriverManager.getConnection(url,user,password);

        //3. Creating the Statement
        Statement statement=connection.createStatement();

        //4. Execute the Query
        //process the result
        ResultSet rs=statement.executeQuery("""
SELECT * FROM  studentInfo;
""");

        while (rs.next()){
            //int id=rs.getInt(1);
            /*
            System.out.println(rs.getInt(1) + " " +
                    rs.getString(2) +" " +
                    rs.getInt(3) +" "+rs.getString(4));//column wise
                    */


            System.out.println(rs.getInt("id") + " " +
                    rs.getString("sname") +" " +
                    rs.getInt("sage") +" "+rs.getString("scity"));

        }

        //5. Close the Resources
        statement.close();
        connection.close();
        rs.close();

    }

}
