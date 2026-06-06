package com.telusko.jdbcLearning;

import java.sql.*;
import java.util.Scanner;

//Better Way to write


public class LaunchApp7 {
     static void main() {
        Connection connection=null;
//        Statement statement=null;
        PreparedStatement psmt=null;

        try {

//            connection=jdbcUtil.getConnection();
//            statement = connection.createStatement();






            //4. Execute the Query
            String query = "INSERT INTO studentInfo(id,sname,sage,scity) VALUES(?,?,?,?)";



            connection=jdbcUtil.getConnection();
            psmt=connection.prepareStatement(query); // step 2,3


            System.out.println("Please enter the following details to be stored in DB");
            Scanner sc=new Scanner(System.in);
            System.out.println("enter your id: ");
            Integer id= sc.nextInt();

            System.out.println("enter your name: ");
            String sname=sc.next();

            System.out.println("enter your age: ");
            Integer sage=sc.nextInt();

            System.out.println("enter your city: ");
            String scity=sc.next();

            psmt.setInt(1,id);
            psmt.setString(2,sname);
            psmt.setInt(3,sage);
            psmt.setString(4,scity);

            //process the result
            int rowAffected =psmt.executeUpdate();//no. of rows affected
            //make sure to not use query inseide method above else will give u error
            if(rowAffected==0){
                System.out.println("unable to insert the data");
            }
            else{
                System.out.println("data inserted successfully");
            }


        }
        catch (SQLException sqlException){
            sqlException.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            //it will get executed doesn't matter what
            //5. Close the Resources
            try {
                jdbcUtil.closeConnection(connection,psmt);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }

}
