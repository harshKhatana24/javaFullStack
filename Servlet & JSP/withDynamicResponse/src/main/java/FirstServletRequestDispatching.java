import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/FirstServlet")
public class FirstServletRequestDispatching
        extends HttpServlet {




    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("control in the first servlet");

        String n1= req.getParameter("noA");
        String  n2= req.getParameter("noB");

        System.out.println(n1+" "+n2);

        //how to give data to second servlet
        HttpSession session=req.getSession();





        session.setAttribute("noA",n1);
        session.setAttribute("noB",n2);


        session.setMaxInactiveInterval(1000);


        System.out.println(n1+ " "+n2);

        RequestDispatcher rd=req.getRequestDispatcher("/SecondServlet");
        rd.forward(req,resp);
//        rd.include(req,resp);





        System.out.println("Control again in first servlet");

    }


}
