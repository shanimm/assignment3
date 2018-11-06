import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  
/**
 *
 * @author shani
 */
public class Failedlogin extends HttpServlet {  
  
    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response)  
    throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    try (PrintWriter out = response.getWriter()) {
        
        out.print("Hi You are not authorized . Please try again");
        out.close();
    }  
    }  
  
} 