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
@WebServlet(urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {

  @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
response.setContentType("text/html;charset=UTF-8");{
        String button = request.getParameter("submit");


if (button.equals("Insert")) {//INSERT OPERATION
try {
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/myschema","root","root");
String Student_ID = request.getParameter("Student_ID");
String Student_Name = request.getParameter("Student_Name");
String Age = request.getParameter("Age");
String Address= request.getParameter("Address");
String Branch= request.getParameter("Branch");
PreparedStatement pst = con.prepareStatement("INSERT INTO student(Student_ID, Student_Name,Age,Address,Branch) VALUES(?, ?, ?,?,?)");
pst.setString(1, Student_ID);
pst.setString(2, Student_Name);
pst.setString(3, Age);
pst.setString(4, Address);
pst.setString(5, Branch);
pst.executeUpdate();
PrintWriter writer = response.getWriter();
Statement stmt = con.createStatement();
ResultSet rs=stmt.executeQuery("select * from student");
writer.println("<h1>User Registered Successfully!</h1>");writer.println("<table border=1 width=50% height=50%>");
writer.println("<tr><th>Student_ID</th><th>Student_Name</th><th>Age</th><th>Address</th><th>Branch</th><tr>");
while (rs.next())
{
String id = rs.getString("Student_ID");
String name = rs.getString("Student_Name");
int age = rs.getInt("Age");
String add = rs.getString("Address");
String br = rs.getString("Branch");
writer.println("<tr><td>" + id + "</td><td>" + name + "</td><td>" + age + "</td><td>" +add+ "</td><td>" +br+ "</td></tr>");
}
writer.println("</table>");
writer.close();
}catch (Exception e1) {
PrintWriter writer = response.getWriter();
writer.println("Error: "+e1);
}}


else if (button.equals("Delete")) {//DELETE OPERATION
try {
Class.forName("com.mysql.jdbc.Driver");
Connection con= DriverManager.getConnection("jdbc:mysql://localhost/myschema","root","root");
String Student_ID = request.getParameter("Student_ID");
PreparedStatement pst = con.prepareStatement("DELETE from student where Student_ID = ?");
pst.setString(1, Student_ID);
pst.executeUpdate();
PrintWriter writer = response.getWriter();
Statement stmt = con.createStatement();
ResultSet rs=stmt.executeQuery("select * from student");
writer.println("<h1>Record Deleted Successfully!</h1>"); writer.println("<table border=1 width=50% height=50%>");
writer.println("<tr><th>Student_ID</th><th>Student_Name</th><th>Age</th><th>Address</th><th>Branch</th><tr>");
while (rs.next())
{
String id = rs.getString("Student_ID");
String name = rs.getString("Student_Name");
int age = rs.getInt("Age");
String add = rs.getString("Address");
String br = rs.getString("Branch"); 
writer.println("<tr><td>" + id + "</td><td>" + name + "</td><td>" + age + "</td><td>" +add+ "</td><td>" +br+ "</td></tr>");
}
writer.println("</table>");
writer.close();
}catch (Exception e1) {
PrintWriter writer = response.getWriter();
writer.println("Error occured -: "+e1);
}}


if (button.equals("Update")) {//UPDATE OPERATION
try {
Class.forName("com.mysql.jdbc.Driver");
Connection con= DriverManager.getConnection("jdbc:mysql://localhost/myschema","root","root");
String Student_ID = request.getParameter("Student_ID");
String Student_Name = request.getParameter("Student_Name");
String Age = request.getParameter("Age");
String Address= request.getParameter("Address");
String Branch= request.getParameter("Branch");
PreparedStatement pst = con.prepareStatement("UPDATE student SET Student_ID = ?, Student_Name = ?, Age = ? , Address = ?, Branch = ? WHERE Student_ID= ? ");
pst.setString(1, Student_ID);
pst.setString(2, Student_Name);
pst.setString(3, Age);
pst.setString(4, Address);
pst.setString(5, Branch);
pst.setString(6, Student_ID);
pst.executeUpdate();
PrintWriter writer = response.getWriter();
Statement stmt = con.createStatement();
ResultSet rs=stmt.executeQuery("select * from student");
writer.println("<h1>Record Updated Successfully!</h1>"); writer.println("<table border=1 width=50% height=50%>");
writer.println("<tr><th>Student_ID</th><th>Student_Name</th><th>Age</th><th>Address</th><th>Branch</th><tr>");
while (rs.next())
{
String id = rs.getString("Student_ID");
String name = rs.getString("Student_Name");
int age = rs.getInt("Age");
String add = rs.getString("Address");
String br = rs.getString("Branch"); 
writer.println("<tr><td>" + id + "</td><td>" + name + "</td><td>" + age + "</td><td>" +add+ "</td><td>" +br+ "</td></tr>");
}
writer.println("</table>");
writer.close();
}catch (Exception e1) {
PrintWriter writer = response.getWriter();
writer.println("Error occured -: "+e1);
}
}
if (button.equals("Create table")) {//CREATE TABLE OPERATION
try {
    String tablenam = request.getParameter("tabl");
String dbname = request.getParameter("dbname");
String DB_URL = "jdbc:mysql://localhost/"+dbname;
Class.forName("com.mysql.jdbc.Driver");
Connection con= DriverManager.getConnection(DB_URL,"root","pass");
PreparedStatement pst = con.prepareStatement("Create Table "+tablenam+";");
pst.executeUpdate();
PrintWriter writer = response.getWriter();
writer.println("<h1>Table Created Successfully!</h1>");
writer.close();
}catch (Exception e1) {
PrintWriter writer = response.getWriter();
writer.println("Error occured: "+e1); }
}


if (button.equals("Create database")) {//CREATE DATABASE OPERATION
try {
    String tablenam = request.getParameter("tabl");
String dbname = request.getParameter("dbname");
String DB_URL = "jdbc:mysql://localhost/";
Class.forName("com.mysql.jdbc.Driver");
Connection con= DriverManager.getConnection(DB_URL,"root","root");
PreparedStatement pst = con.prepareStatement("Create DATABASE "+dbname+";");
pst.executeUpdate();
PrintWriter writer = response.getWriter();
writer.println("<h1>Database Created Successfully!</h1>");

writer.close();
}catch (Exception e1) {
PrintWriter writer = response.getWriter();
writer.println("Error occured: "+e1); }}


if (button.equals("Delete table")) {//DELETE TABLE OPERATION
try { 
    String tablenam = request.getParameter("tabl");
Class.forName("com.mysql.jdbc.Driver");
Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/myschema","root","root");
PreparedStatement pst = con.prepareStatement("DROP Table "+tablenam+";");
pst.executeUpdate();
PrintWriter writer = response.getWriter();
writer.println("<h1>Table Deleted Successfully!</h1>");
writer.close();
}catch (Exception e1) {
PrintWriter writer = response.getWriter();
writer.println("Error occured: "+e1); }


 if (button.equals("Delete database")) {//DELETE DATABASE OPERATION
try {
    String dbname = request.getParameter("dbname");
Class.forName("com.mysql.jdbc.Driver");
Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/myschema","root","root");
PreparedStatement pst = con.prepareStatement("DROP DATABASE"+dbname+";");
pst.executeUpdate();
PrintWriter writer = response.getWriter();
writer.println("<h1>Database Deleted Successfully!</h1>");
writer.close();
}catch (Exception e1) {
PrintWriter writer = response.getWriter();
writer.println("Error occured -: "+e1);
}}}}}}


        
    
