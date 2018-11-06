package newpackage;

import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  // this page is for welcoming user once logged in
public class Welcomepage extends HttpServlet {  
@Override
public void doPost(HttpServletRequest request, HttpServletResponse response)  
    throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    try (PrintWriter out = response.getWriter()) {
        String abc=request.getParameter("username");
        out.print("Hi"+abc);
        out.close();
    }  
    }  
  
} 