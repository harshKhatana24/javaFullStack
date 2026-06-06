import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class firstServlet extends HttpServlet {

    public void doPost(HttpServletRequest request,//take something from client
                          HttpServletResponse response) throws IOException {//back to client

            String n=request.getParameter("name");
            String e=request.getParameter("email");
            String p=request.getParameter("phone");

            System.out.println(n+" "+e+" "+p);


            PrintWriter writer=response.getWriter();
            writer.println("<html><h1>please check if details are correct</h1></html>");
            writer.println(n);
            writer.println(e);
            writer.println(p);

            writer.close();

    }

}
