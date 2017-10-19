<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel = "stylesheet"type = "text/css"href = "styleSheet2.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <% String table = (String) request.getAttribute("table"); %>
    
    <body>
        <div class="wrap"> 
            
            <%@include file="Includes/Header.jsp" %>
            
            <%@include file="Includes/Menu.jsp" %>
        
        
        <div class="main">
        <h1> UI Women's Golfers</h1>
        <%=table %>
        
       
        
        </div>


        <%@include file="Includes/Footer.jsp" %>

        </div>
    </body>
</html>
