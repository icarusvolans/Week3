<%--
  Created by IntelliJ IDEA.
  User: icarusvolans
  Date: 11/23/16
  Time: 4:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Favorite Holiday Movie</title>
</head>
<body>
What is your favorite holiday movie?
    <br><br>
    <form name="newMovieForm" method="POST" action="/mvc_cust/saveNewMovie">
        Title: <input type="text" name="title" /><br>
        Year: <input type="text" name="year" /><br>
        Holiday: <input type="text" name="holiday" /><br>
        <input type="submit">
    </form>
</body>
</html>