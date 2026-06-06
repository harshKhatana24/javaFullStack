import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/SecondServlet")
public class SecondServletRequestDispatching
        extends HttpServlet {

    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("control in the second servlet");

//        RequestDispatcher rd=req.getRequestDispatcher("/SecondServlet");
//        rd.forward(req,resp);



        HttpSession session=req.getSession();
        System.out.println("getting input");
        String n1 = req.getParameter("noA");
        String n2 = req.getParameter("noB");

        System.out.println(n1+" "+n2);

        int a=Integer.parseInt(n1);
        int b=Integer.parseInt(n2);
        int ans=addKardo(a,b);



//        RequestDispatcher rd=req.getRequestDispatcher("/SecondServlet");
//        rd.forward(req,resp);


        session.setAttribute("ans", ans);
        session.setAttribute("a", n1);
        session.setAttribute("b", n2);


        resp.sendRedirect("secondServlet.jsp");


    }

    private int addKardo(int n1, int n2) {
        return n1+n2;
    }


}
