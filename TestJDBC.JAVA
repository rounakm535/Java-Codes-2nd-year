import java.sql.*;

   public class TestJDBC
   {
       public static void main (String[] args)
       {
           System.out.println("\n\n***** MySQL JDBC Connection Testing *****");
		   Connection conn = null;
           try
           {
			   Class.forName ("com.mysql.cj.jdbc.Driver");
               String userName = "root";
               String password = "123456789";
               String url = "jdbc:mysql://localhost:3306/CSE_28";        
               conn = DriverManager.getConnection (url, userName, password);
               System.out.println ("\nDatabase Connection Established...");
			   Statement stmt  = conn.createStatement();
			   String sql = "select * from STUDENTS";
			   ResultSet rs = stmt.executeQuery(sql);
			   while (rs.next()) 
			   {
					System.out.println(rs.getInt("ROLL_NO") + "\t" + rs.getString("NAME"));       
			   }
			   System.out.println("\n***** Let terminate the Connection *****");
			   conn.close();
			   System.out.println("\nDatabase connection Closed...");
           }
          catch (Exception ex)
           {
		       System.err.println ("Cannot connect to database server");
			   ex.printStackTrace();
           }        
       }
   }