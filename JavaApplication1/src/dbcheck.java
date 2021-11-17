import java.sql.*;
public class dbcheck {
    public static void main(String args[]){  
     try{  
           Class.forName("com.mysql.jdbc.Driver");  
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myschema","root","root");  

           Statement stmt=con.createStatement();  
           ResultSet rs=stmt.executeQuery("select * from aditi");  
           while(rs.next()) { 
                       System.out.println(rs.getInt(1)+"  "+rs.getString(2)); } 
           con.close();  
        }
     catch(ClassNotFoundException e)
     { 
         System.out.println(e);    
     }  
     catch(SQLException e)
     {
         System.out.print(e);
     }
 
 } 
}
