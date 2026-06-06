package com.telusko.jdbcLearning;

import java.sql.*;
import java.util.Scanner;

//Better Way to write


public class LaunchApp10 {
    static void main() {
        Connection connection=null;
        PreparedStatement psmt=null;
        ResultSet rs;

        try {

            //1. load and register the driver
            connection=jdbcUtil.getConnection();
            //2,3. establish the connection & Execute Query
            psmt=connection.prepareStatement("""

SELECT * FROM studentInfo WHERE id=?

""");
            Scanner sc=new Scanner(System.in);

            System.out.println("enter the id: ");
            int id=sc.nextInt();
            psmt.setInt(1,id);

            //prepare result
            rs=psmt.executeQuery();//it will return RS elemt

            if (rs.next()){
                System.out.println(rs.getInt("id")+" "+rs.getString("sname")+" "
                        +rs.getInt("sage")+" "+rs.getString("scity"));
            } else{
                System.out.println("data not found!!!");
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
