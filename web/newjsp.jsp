<%-- 
    Document   : newjsp
    Created on : 15 May, 2020, 2:27:57 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
<h1><center>REGISTRATION FORM</center></h1>
</head>
<body>
<form action="NewServlet" method="post">
<table style="with: 50%" align='center'>
<tr>
<td>Enrollment No.</td>
<td><input type="text" name="Student_ID" /></td>
</tr>
<tr>
<td>Name</td>
<td><input type="text" name="Student_Name" /></td>
</tr>
<tr>
<td>Age</td>
<td><input type="text" name="Age" /></td>
</tr>
<tr>
<td>Address</td>
<td><input type="text" name="Address" /></td>
</tr>
<tr>
<td>Branch</td>
<td><input type="text" name="Branch" /></td>
</tr></table>
<center>
<input type="submit" value="Insert" name="submit">
<input type="submit" value="Delete" name="submit">
<input type="submit" value="Update" name="submit">
<br>
<br>
<tr>
<td>Table name</td>
<td><input type="text" name="tabl" /></td>
</tr>
<tr>
<td>Database name</td>
<td><input type="text" name="dbname" /></td>
</tr>
<br>
<br>
<input type="submit" value="Create table" name="submit">
<input type="submit" value="Delete table" name="submit">
<input type="submit" value="Create database" name="submit">
<input type="submit" value="Delete database" name="submit">
</form>
</center>
</body>
</html>



