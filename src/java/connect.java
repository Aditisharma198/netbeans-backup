import java.sql.*;
public class connect {
     public static void main(String args[]){
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/myschema","root","root");
            System.out.println("Connection Established Successfully!!");
            Statement st=con.createStatement();
            
        
            con.close();
}  catch(Exception e){
            e.printStackTrace();
        }
     }
}
