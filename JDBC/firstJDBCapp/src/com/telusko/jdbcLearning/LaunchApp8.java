package com.telusko.jdbcLearning;

import java.sql.*;
import java.util.Scanner;

//Better Way to write


public class LaunchApp8 {
    static void main() {
        Connection connection=null;
        PreparedStatement psmt=null;

        try {

            //1. load and register the driver
            connection=jdbcUtil.getConnection();
            //2,3. establish the connection & Execute Query
            psmt=connection.prepareStatement("""

UPDATE  studentInfo set sname=? where id=?;

""");
            Scanner sc=new Scanner(System.in);

            System.out.println("enter your name: ");
            String sname=sc.next();
            System.out.println("enter the id: ");
            int id=sc.nextInt();
            psmt.setString(1,sname);
            psmt.setInt(2, id);

            //prepare result
            int rowsAffected=psmt.executeUpdate();
            if (rowsAffected==0)
                System.out.println("unable to update data");
            else
                System.out.println("data updated successfully");




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
