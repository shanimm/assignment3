  import java.sql.*;
   import java.util.*;
// this page is to get a connection to our java derby database

/**
 *
 * @author shani
 */
public class connectionmanager {
    
 static Connection con;
      static String url;
            
    /**
     *
     * @return
     */
    public static Connection getConnection() throws ClassNotFoundException, InstantiationException, IllegalAccessException
      {
      
          String url = "jdbc:derby://localhost:1527/Shanim";
          try
          {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
              con = DriverManager.getConnection(url,"a","A");
              
              
              
          }
          
          catch (SQLException exc)
          {
              System.out.println("Connect failed ! ");
          }

      return con;
}
}