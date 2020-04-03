<%-- 
    Document   : _ownerdetails
    Created on : Mar 24, 2020, 11:40:00 AM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h1>Enter-Owner-Details</h1>
        <pre>
        <form action="AddOwner" method="post" enctype="multipart/form-data">
            Enter owner name::<input type="text" name="o_name"/>
            Enter owner email::<input type="email" name="o_email"/>
            Enter owner address::<input type="text" name="o_address"/>
            Enter owner conatct::<input type="text" name="o_contact"/>
            Enter owner image::<input type="file" name="o_image"/>
            <input type="submit" vale="Save"/>
        </form>
        </pre>
    </center>   
    </body>
</html>
