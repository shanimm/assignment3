package newpackage;
      
import java.text.*;
   import java.util.*;
   import java.sql.*;




/**
 *
 * @author shani
 */

/**
 *
 * @author shani
 */
// this page tries to search database for users and password match 
public class Userdb {
     static Connection currentCon = null;
      static ResultSet rs = null;  

    public static UserBean login(UserBean bean) {
	
         //preparing some objects for connection 
         Statement stmt = null;    
	
         String username = bean.getUserName();    
         String password = bean.getPassword();   
	    
         String searchQuery = "select * from users where username='"
                        +username
                        + "' AND password='"
                        +password
                        + "'";

      try 
      {
         //connect to DB 
         currentCon = connectionmanager.getConnection();
         stmt=currentCon.createStatement();
         rs = stmt.executeQuery(searchQuery);	        
         boolean more = rs.next();
	       
         // if user does not exist set the isValid variable to false
         if (!more) 
         {
            System.out.println("Sorry, you are not a registered user! Please sign up first");
            bean.setValid(false);
         } 
	        
         //if user exists set the isValid variable to true
         else if (more) 
         {
           
	     	
            System.out.println("Welcome " + username);
     
            bean.setValid(true);
         }
      } 

      catch (Exception ex) 
      {
         System.out.println("Log In failed: An Exception has occurred! " + ex);
      } 
	    
     

return bean;
	
      }	
   }


