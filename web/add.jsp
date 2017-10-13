
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add a Golfer</title>
        <link rel = "stylesheet"type = "text/css"href = "styleSheet2.css" />
    </head>
    <h1> Add a Golfer </h1>
    
    <form name="addForm" action="addGolfer" method="get">
        <div class="addGolfer">
        <label> Golfer Name: </label>
        <input type="text" name="name" value="">
        <br>
        <label> Age:</label>
        <input type="text" name="age" value="" >
        <br>
        <label> Handicap: </label>
        <input type="text" name="handicap" value="" >
        <br>
        <label> Club Brand: </label>
        <input type="text" name="clubBrand" value="" >
        <br>
        <input type="submit" name="Submit" value="Submit" >
        </div>
    </form>
</html>
