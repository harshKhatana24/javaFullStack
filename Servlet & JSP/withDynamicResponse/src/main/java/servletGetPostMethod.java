import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/getPostServlet")
public class servletGetPostMethod extends HttpServlet {



    //url -> http://localhost:8086/withDynamicResponse/getPostServlet?name=harsh&city=Noida

//    @Override
//    //doGet method (default)
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
//            throws ServletException, IOException {
//
//        String name = req.getParameter("uname");
//        String city = req.getParameter("ucity");
//
//        // First visit: no form submitted yet
//        if (name == null || city == null) {
//            req.getRequestDispatcher("/getPost.html")
//                    .forward(req, resp);
//            return;
//        }
//
//        // Form submitted
//        if ("Samrat".equals(name) && "Noida".equals(city)) {
//            System.out.println("Data Matched...");
//            resp.getWriter().println("Data Matched you can now login...");
//        } else {
//            System.out.println("Data not Matched...");
//            resp.getWriter().println("Data not matched u can't login!");
//        }
//    }









    //url -> http://localhost:8086/withDynamicResponse/getPostServlet

    @Override
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse resp)
            throws ServletException, IOException {

        req.getRequestDispatcher("/getPost.html")
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req,
                          HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("uname");
        String city = req.getParameter("ucity");

        // Form submitted
        if ("Samrat".equals(name) && "Noida".equals(city)) {
            System.out.println("Data Matched...");
            resp.getWriter().println("Data Matched you can now login...");
        } else {
            System.out.println("Data not Matched...");
            resp.getWriter().println("Data not matched u can't login!");
        }
    }









}


