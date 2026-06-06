package com.telusko.jdbcLearning;

import java.sql.*;

public class LaunchApp5 {
    static void main() throws ClassNotFoundException, SQLException {

        //1. Load and Register the Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2. Establish the connection
        String url="jdbc:mysql://127.0.0.1:3306/jdbcLearning";
        String user="root";
        String password="Root@123";
        Connection connection=DriverManager.getConnection(url,user,password);

        //3. Create the Statement
        Statement statement=connection.createStatement();

        //4. Execute the Query
        String sql= """
UPDATE studentInfo set sage=23 where id=1;
""";
        boolean status=statement.execute(sql);
        //process the result

        System.out.println(status);

        if (status) {
            System.out.println("If block");



            ResultSet rs=statement.getResultSet();
            while (rs.next()){
                                    System.out.println(rs.getInt("id") + " " +
                                            rs.getString("sname") +" " +
                                            rs.getInt("sage") +" "+rs.getString("scity"));

                                }


        }
        else{
            System.out.println("else block");


            int rowsAffected=statement.getUpdateCount();
            if(rowsAffected==0)
                System.out.println("operation failed!");
            else
                System.out.println("operation successful!");

        }



        //5. Close the Resources
        connection.close();
        statement.close();



    }



}
