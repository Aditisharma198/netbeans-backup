<%-- 
    Document   : form
    Created on : 13 May, 2020, 8:26:49 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    <h1> <center>REGISTRATION FORM</center> </h1>
    </head>
    <body>
        <form action="form" method="post">
			<table style="with: 50%" align='center'>
				<tr>
					<td>Student_ID</td>
					<td><input type="text" name="Student_ID" /></td>
				</tr>
				<tr>
					<td>Student_Name</td>
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
            <center> <input type="submit" value="submit" >
        <input type="submit" value="Insert" name="submit">
        <input type="submit" value="Delete" name="submit">
        <input type="submit" value="Update" name="submit">
        <input type="submit" value="Delete table" name="submit">
        <input type="submit" value="Delete database" name="submit">

</form>
</center>

    
    </body>
</html>
