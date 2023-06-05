<%-- 
    Document   : Login
    Created on : Jun 4, 2023, 10:10:06 PM
    Author     : Tung
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login Page</h1>
      <form name="input" action="Demo1" method="get">
	<table>
		<tr>
		   <td>User name:</td><td><input type="text" name="user"/></td>
		</tr>
		<tr>
		   <td>Password:</td><td><input type="password" name="pass"/></td>
		</tr>
		<tr>
		   <td></td><td><input type="submit" value="Login"/></td>
		</tr>
	</table>
	</form>
    </body>
</html>
