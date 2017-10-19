
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search UIGolfers</title>
        <link rel = "stylesheet"type = "text/css"href = "styleSheet2.css" />
    </head>
    <body>
        <div class="wrap"> 

            <%@include file="Includes/Header.jsp" %>

            <%@include file="Includes/Menu.jsp" %>


            <div class="main">
                <h1>Search Golfers</h1>
                <form name="searchForm" action="search" method="get">

                    <input type="text" name="searchVal" value="" />

                    <br>

                    <input type="submit" name="submit" value="Search" />

                </form>
            </div>


            <%@include file="Includes/Footer.jsp" %>

        </div>

    </body>
</html>
