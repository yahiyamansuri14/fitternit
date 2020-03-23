<%-- 
    Document   : admin
    Created on : Feb 25, 2020, 9:37:26 PM
    Author     : yahiya 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin-Panel-Login</title>
    </head>
    <body>
    <center>
        <form action="adminlogin" method="get">
            Enter Email::<input type="text" name="email"/>
            Enter Password::<input type="text" name="pwd"/>
            <input type="submit" value="login"/>
        </form>
    </center>
    </body>
</html>
