import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servletLife")
/*
*
* Do only one thing either
* 1. register servlet into xml file
* 2. mark it as @WebServlet
*
* */




public class servletLifecycle extends HttpServlet {

    //Life Cycle of Servlet in java
    //1. Load
    //2. Object created
    //3. Initialized
    //4. service method -> no. of times it invoked=no. of times u requested



    static {
        System.out.println("Servlet is loaded...");
    }

    public servletLifecycle() {
        System.out.println("Servlet object is created");
    }

    public void init(ServletConfig config) throws ServletException {
        System.out.println("Servlet initialized!");
    }

    public void destroy(){

    }

    public void service(HttpServletRequest request,
                        HttpServletResponse response) throws IOException {
        PrintWriter writer=response.getWriter();
        writer.println("doing smtg");
        System.out.println("service method to handle http request and to response back");
    }


}
