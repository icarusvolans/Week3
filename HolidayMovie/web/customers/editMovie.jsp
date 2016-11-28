<%--
  Created by IntelliJ IDEA.
  User: icarusvolans
  Date: 11/23/16
  Time: 4:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Holiday Movie</title>
</head>
<body>
Changed your mind? Edit your holiday movie here.
    <br><br>
    <form name="updateMovieForm" method="POST" action="/mvc_cust/updateMovie">
        ID: <input type="text" name="movieLoverid" value="<c:out value="${movieLover.movieLoverId}" />" readonly /><br>
        Title: <input type="text" name="title" value="<c:out value="${movieLover.title}" />" /><br>
        Year: <input type="text" name="year" value="<c:out value="${movieLover.year}" />" /><br>
        Holiday: <input type="text" name="holiday" value="<c:out value="${movieLover.holiday}" />" /><br>
        <input type="submit">
    </form>
</body>
</html>