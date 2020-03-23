<%-- 
    Document   : _studiorequest
    Created on : Mar 14, 2020, 10:35:33 AM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>_StudioRequestPage</title>
    </head>
    <body>
    <center>
        <pr>
            <h1>StudioRequestForm</h1>
            <form action="studiorequest" method="post" enctype="multipart/form-data">
                Enter owner name::<input type="text" name="o_name"/><br>
                Enter owner contact::<input type="text" name="o_con" size="10" max="10" min="10"/><br>
                Enter email::<input type="email" name="o_email"/><br>
                Enter studio name::<input type="text" name="s_name"/><br>
                Enter Address::<input type="text" name="s_address"/><br>
                Add image::<input type="file" name="s_image"/><br>
                <input type="submit" value="SendRequest"/><br>
            </form>
        </pr>
    </center>
    </body>
</html>
