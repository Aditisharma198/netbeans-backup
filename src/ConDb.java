  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.sql.*;

public class ConDb {
   
    
    public static Connection getcon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/myschema","root","root");
            return conn;
        }catch(Exception e){
           return null;
        }
        
    }
}
