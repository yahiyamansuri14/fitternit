<%-- 
    Document   : _studiorequest
    Created on : Mar 14, 2020, 10:35:33 AM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css"> 
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Allerta+Stencil">
        <style>
            *{font-family: "Allerta Stencil", Sans-serif;}
            .w3-allerta {font-family: "Allerta Stencil", Sans-serif;}
            <!--.w3-panel{padding-top:16px;padding-bottom:16px;}-->
        </style>
    </head>
    <body background-color="golden">
        <div class="w3-container w3-center w3-card-4">
            <div class="w3-panel w3-blue">
                <p class="w3-allerta w3-xlarge">Studio-Request-Page</p>
            </div>
            <div class="w3-container w3-center w3-card-4" width="50%">
                <div class="w3-container w3-green">
                    <h2 class="w3-allerta">Enter Details</h2>
                </div>
                <div>
                    <form action="studiorequest" method="post" class="w3-container" enctype="multipart/form-data" >
                        <div class="w3-half w3-row-padding">
                            <label>Enter Owner Name</label>
                            <input class="w3-input w3-border w3-round-large" type="text" name="o_name" required/>
                        </div>
                        <div class="w3-half w3-row-padding">
                            <label>Enter Owner Contact</label>
                            <input class="w3-input w3-border w3-round-large" type="text" name="o_con" required/>
                        </div>
                        <div class="w3-half w3-row-padding">
                            <label>Enter Owner Email</label>
                            <input class="w3-input w3-border w3-round-large" type="email" name="o_email" required/>
                        </div>
                        <div class="w3-half w3-row-padding">
                            <label>Enter Studio Name</label>
                            <input class="w3-input w3-border w3-round-large" type="text" name="s_name" required multiple="true"/>
                        </div>

                        <div class="w3-row-padding">
                            <label>Enter Studio Address</label>
                            <input class="w3-input w3-border w3-round-large" type="text" name="s_address" required/>
                        </div>
                        <div class="w3-row-padding">
                            <label>Add Some Images</label>
                            <input class="w3-input w3-border w3-round-large" type="file" name="s_image" required/>
                        </div><br>
                        <input type="submit" value="Send-Request" class="w3-btn w3-blue w3-border w3-round-large"/>

                    </form>
                </div>
            </div>
        </div>
    </body>
</html>