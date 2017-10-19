
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add a Golfer</title>
        <link rel = "stylesheet"type = "text/css"href = "styleSheet2.css" />
    </head>
    <h1> Add a Golfer </h1>
    <body>

        <div class="wrap"> 

            <%@include file="Includes/Header.jsp" %>

            <%@include file="Includes/Menu.jsp" %>


            <div class="main">
                <form name="addForm" action="addGolfer" method="get"/>
                    <table class="addGolfer">
                        <tr>
                            <td> Golfer Name: </td>
                            <td><input type="text" name="name" value=""></td>
                        </tr>
                        <tr>
                            <td> Age:</td>
                            <td><input type="text" name="age" value="" > </td>
                        <tr>
                        <tr>
                            <td> Handicap: </td>
                            <td><input type="text" name="handicap" value="" ></td>
                        </tr>
                        <tr>
                            <td> Club Brand: </td>
                            <td><input type="text" name="clubBrand" value="" > </td>
                        </tr>
                    </table>
                    <input type="submit" name="Submit" value="Submit" >

                    </div>


                    <%@include file="Includes/Footer.jsp" %>

                    </div>
                    </body>
                </form>
                </html>
