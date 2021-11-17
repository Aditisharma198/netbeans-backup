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
@WebServlet(urlPatterns = {"/table"})
public class table extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            Class.forName("com.mysql.jdbc.Driver"); 
Connection con= DriverManager.getConnection("jdbc:mysql://localhost/STUDENTS","root","root");
String sqll = "CREATE TABLE DATA " +
                   "(Enrollment_num INTEGER not NULL, " +
                   " Name VARCHAR(255), " + 
                   " Branch VARCHAR(255), " + 
                   " age INTEGER, " + 
                   " PRIMARY KEY ( Enrollment_num ))";
           

   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }
}//end main
}//end JDBCExample
   


