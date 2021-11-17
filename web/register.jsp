<%-- 
    Document   : register
    Created on : 14 May, 2020, 11:24:28 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <body>

      <form action="jdbcoperation" method="post">
			<table style="with: 50%" align='center'>
				<tr>
					<td>Enrollment_num</td>
					<td><input type="text" name="Enrollment_num" /></td>
				</tr>
				<tr>
					<td>Name</td>
					<td><input type="text" name="Name" /></td>
				</tr>
									
				
				<tr>
					<td>Branch</td>
					<td><input type="text" name="Branch" /></td>
				</tr>
                        
                                <tr>
					<td>Age</td>
					<td><input type="text" name="age" /></td>
				</tr></table>
            <center> <input type="submit" value="submit" >
</form>
</center>

    
    </body>
</html>
