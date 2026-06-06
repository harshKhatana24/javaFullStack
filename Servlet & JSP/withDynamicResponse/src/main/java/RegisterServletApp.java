import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Register")
public class RegisterServletApp extends HttpServlet {

    public RegisterServletApp(){
        System.out.println("servlet obj is created internally by container");
    }


    @Override
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse resp)
            throws ServletException, IOException {

        req.getRequestDispatcher("/register.html")
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name=req.getParameter("uname");
        String city=req.getParameter("ucity");

        PrintWriter writer=resp.getWriter();

//        writer.println("<html> <h1>Welcome to our dynamic app</h1> </html>");
//        writer.println("<body>");
//        writer.println("<table>");
//        writer.println("<tr> <th>NAME</th> <th>CITY</th> </tr>");
//        writer.println("<tr><td>"+name+"</td> <td>"+city+"</td></tr>");
//
//        writer.println("</table></body>");
//        writer.println("</html>");
//
//        writer.close();









        //the part u can do in jsp but not in html


        System.out.println(name +" "+city);
        resp.sendRedirect("/withDynamicResponse/success.jsp");



    }



}
