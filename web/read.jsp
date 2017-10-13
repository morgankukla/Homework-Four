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
        <h1> UI Women's Golfers</h1>
        <%=table %>
        
        <br><br>
        <a href="add"> Add a Golfer </a>
    </body>
</html>
