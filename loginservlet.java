
package newpackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.Serializable;
import java.lang.Object;
import javax.servlet.RequestDispatcher;


/**
 *
 * @author shani
 */
public class loginservlet extends HttpServlet {

    
   
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) 
			           throws ServletException,java.io.IOException {

try
{	    

     UserBean user = new UserBean();
     user.setUserName(request.getParameter("un"));
     user.setPassword(request.getParameter("pw"));

     user = Userdb.login(user);
	   		    
     if (user.isValid())
     {
	        
          HttpSession session = request.getSession(true);	    
          session.setAttribute("currentSessionUser",user); 
          response.sendRedirect("Welcomepage"); //logged-in page      		
     }
	        
     else {
         response.sendRedirect("Failedlogin"); 
     }
          //error page 
} 
		
		
catch (IOException theException) 	    
{
     System.out.println(theException); 
}
       }
	}

