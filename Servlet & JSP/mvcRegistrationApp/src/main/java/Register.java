import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.util.Random;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

@WebServlet("/registerUser")
public class Register extends HttpServlet {

//    Random random=new Random();


    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String uname=req.getParameter("uname");
        String emailId=req.getParameter("email");
        String password=req.getParameter("password");


//        int num=random.nextInt(1000);

        Model model=new Model();
        model.setName(uname);
        model.setEmail(emailId);
        model.setPassword(password);

        HttpSession session=req.getSession();
        session.setAttribute("name_",uname);
        session.setAttribute("email_",emailId);
        session.setAttribute("pass",password);



        int rowAffected=model.register();

        if (rowAffected==0){
            System.out.println("data insertion failed!!!");
            resp.sendRedirect("/mvcRegistrationApp/failure.jsp");
        }
        else {
            System.out.println("data insertion is successful...");
            resp.sendRedirect("/mvcRegistrationApp/success.jsp");
        }

    }


}
