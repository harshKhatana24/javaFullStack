package com.telusko.jdbcLearning;

import java.sql.*;
import java.util.Arrays;
import java.util.Scanner;

//how i can update using group of more than one query
//BATCH UPDATE



public class LaunchApp11 {
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




            psmt.setString(1,"Abhi Bhai");
            psmt.setInt(2, 1);
psmt.addBatch();
            psmt.setString(1,"Sumit Bhai");
            psmt.setInt(2, 2);
psmt.addBatch();
            psmt.setString(1,"Samrat Harsh Gujjar");
            psmt.setInt(2, 3);
psmt.addBatch();






            int[] arr=psmt.executeBatch();
            System.out.println(Arrays.toString(arr));
            System.out.println("Updation Done in all the rows");




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

