import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcUtilClass {

    static {
        try{
            //1. Load and Register the Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }


        System.out.println("Driver is Registered");
    }

    public static Connection getDBConnection() throws SQLException {

        //2. Establish the connection
        String url="jdbc:mysql://127.0.0.1:3306/jdbcLearning";
        String user="root";
        String password="Root@123";
        Connection connection= DriverManager.getConnection(url,user,password);


        return connection;

    }


    public static void closeResource(Connection connection, PreparedStatement pstmt) {
        try {
            connection.close();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
