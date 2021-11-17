/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 *
 * @author User
 */
@WebServlet(urlPatterns = {"/jdbcoperation"})
public class jdbcoperation extends HttpServlet {
static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/STUDENTS";
static final String USER = "root";
   static final String PASS = "root";
               Connection conn = null;
   Statement stmt = null;
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
   
        try (PrintWriter out = response.getWriter()) {
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);

      //STEP 4: Execute a query
      System.out.println("Creating database...");
      stmt = conn.createStatement();
      
      String sql = "CREATE DATABASE STUDENTS";
        
      stmt.executeUpdate(sql);
      Class.forName("com.mysql.jdbc.Driver"); 
Connection con= DriverManager.getConnection("jdbc:mysql://localhost/STUDENTS","root","root");
String sqll = "CREATE TABLE DATA " +
                   "(Enrollment_num INTEGER not NULL, " +
                   " Name VARCHAR(255), " + 
                   " Branch VARCHAR(255), " + 
                   " age INTEGER, " + 
                   " PRIMARY KEY ( Enrollment_num ))";
      stmt.executeUpdate(sqll);
      System.out.println("Database created successfully...");
     /* stmt.executeUpdate("INSERT INTO DATA " + 
                "VALUES (101, 'Faraz', 'Mechanical', 19)"); 
            stmt.executeUpdate("INSERT INTO DATA " + 
                "VALUES (102, 'Huma', 'Civil', 20)"); 
            stmt.executeUpdate("INSERT INTO DATA " + 
                "VALUES (103, 'Yash', 'Textile', 21)"); */
 /*String sql = "UPDATE DATA " +
                   "SET age = 22 WHERE Enrollment_num in (103)";
      stmt.executeUpdate(sql);*/
      
      /*String sql = "DELETE FROM DATA " +
                   "WHERE Enrollment_num = 101";
      stmt.executeUpdate(sql);

    /*stmt.executeUpdate("Update DATA Set Age='22' Where Enrollment_num=103");*/
      
     /* String sql = "INSERT INTO DATA " +
                   "VALUES (100, 'Avi', 'CS', 18)";
      stmt.executeUpdate(sql);*/
    
   }catch(SQLException se){      

      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            stmt.close();
      }catch(SQLException se2){
      }// nothing we can do
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   System.out.println("Goodbye!");
}//end main
}//end JDBCExample
          
        
    

    


