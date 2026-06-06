package com.telusko.jdbcLearning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//Better Way to write


public class LaunchApp6 {
    static void main() {
        Connection connection=null;
        Statement statement=null;

        try {
            //1. Load and Register the Driver
            //write down in util class


            //2. Establish the connection
            //write in the util class
            connection=jdbcUtil.getConnection();


            //3. Create the statement
            statement = connection.createStatement();

            //4. Execute the Query
            String sql = """

INSERT INTO studentInfo(id,sname,sage,scity) VALUES(3,"C",21,"Ahmedabad");
""";
        //process the result
        int rowAffected =statement.executeUpdate(sql);//no. of rows affected
        if(rowAffected==0 ){
            System.out.println("unable to insert the data"); }else {
            System.
                out.println("data inserted successfully");
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
                jdbcUtil.closeConnection(connection,statement);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }

}
