
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import= "model.UIGolfers" %>
<% UIGolfers uigolfers = (UIGolfers) request.getAttribute("uigolfers");%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update A Golfer</title>
        <link rel = "stylesheet"type = "text/css"href = "styleSheet2.css" />
    </head>
    <body>
        <div class="wrap"> 

            <%@include file="Includes/Header.jsp" %>

            <%@include file="Includes/Menu.jsp" %>


            <div class="main">
                <h1>Update A Golfer Record</h1>

                <form name="updateForm" action="updateUIGolfers" method="get">
                    <table class="update">
                        <tr class="updateTr">
                            <td> Golfer ID: </td>
                            <td> <input type="text" name="id" value="<%=uigolfers.getGolferID()%>" readonly /> </td>
                        </tr>
                        <tr>
                            <td> Golfer Name: </td>
                            <td> <input type="text" name="name" value="<%=uigolfers.getGolferName()%>" /> </td>
                        </tr>
                        <tr class="updateTr">
                            <td> Age: </td>
                            <td> <input type="text" name="age" value="<%=uigolfers.getAge()%>" /> </td>
                        </tr>
                        <tr>
                            <td> Handicap: </td>
                            <td> <input type="text" name="handicap" value="<%=uigolfers.getHandicap()%>" /> </td>
                        </tr>
                        <tr class="updateTr">
                            <td> Club Brand:</td>
                            <td> <input type="text" name="clubBrand" value="<%=uigolfers.getClubBrand()%>" /> </td>
                        </tr>
                    </table>
                    <br>
                    <input type="reset" name="reset" value="Clear" />
                    <input type="submit" name="Submit" value="Update" />
                </form>
            </div>


            <%@include file="Includes/Footer.jsp" %>

        </div>
    </body>
</html>
