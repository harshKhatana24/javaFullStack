import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/registerData")
public class registerUser extends HttpServlet {


    @Override
    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("control in the servlet....");

        String name1=req.getParameter("name");
        String email1=req.getParameter("email");
        String pass=req.getParameter("password");
try{
    //1. Load and Register the Driver
    Class.forName("com.mysql.cj.jdbc.Driver");

    //2. Establish the connection
    String url="jdbc:mysql://127.0.0.1:3306/jdbcLearning";
    String user="root";
    String password="Root@123";
    Connection connection=DriverManager.getConnection(url,user,password);

    int idx=(int)(Math.random() * 10000);


    //3. Creating the Statement
    String sql= """
INSERT INTO userRegister(id,name,email,password) VALUES(?,?,?,?);
""";
    PreparedStatement ps=connection.prepareStatement(sql);
    ps.setInt(1,idx);
    ps.setString(2,name1);
    ps.setString(3,email1);
    ps.setString(4,pass);



    //4. execute the query
    int rowAffected=ps.executeUpdate();
    if (rowAffected==0){
        System.out.println("data insertion failed!");
    }else{
        System.out.println("data inserted successfully...");
    }



    PrintWriter pw=resp.getWriter();
    pw.println("<h1>details of registered user: </h1>");
    pw.println("Id: "+idx+" "+"Name: "+name1+" "+"Email: "+email1+" "+"Password: "+password);

    System.out.println("done with insertion");
    System.out.println(idx+" "+name1+" "+email1+" "+pass);
    connection.close();
    ps.close();

}
catch (Exception e){
    e.printStackTrace();
}



    }
}


