<%-- 
    Document   : _allrequestpage
    Created on : Mar 15, 2020, 12:07:28 AM
    Author     : yahiya_mansuri
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="entity.StudioRequest"%>
<%@page import="java.util.ArrayList"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>_AllRequestPage</title>
    </head>
    
        <h1>All-Requests-By-Id</h1>
        
        <table border="2ps solid black">
            <tr>
                <th>RequestId</th>
                <th>view</th>
                <th>delete</th>
                <th>confirm</th>
            </tr>
            
            <% 
                session=request.getSession(false);
                if(session!=null){
                ArrayList<StudioRequest> studioRequest=(ArrayList<StudioRequest>)session.getAttribute("studioRequest");
                ArrayList<String> ids=new ArrayList<String>();
                for(int i=0;i<studioRequest.size();i++){
                    ids.add(studioRequest.get(i).getRequest_id());
                }
               for(String sr:ids){
                   
                
            %>
            
            <!-- Arranging Data in tabular format-->
            <tr>
                <th><%=sr%></th>
                <th>view</th>
                <th>delete</th>
                <th>confirm</th>
            </tr>
            <%  }
            }else{
                    out.println("session is destroyed");
                }
            %>
                
        </table>
        
    
</html>
