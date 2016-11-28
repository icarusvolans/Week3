<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Holiday Movie</title>
</head>
<body>
View Movie Lover
<br><br>
<table>
    <tr>
        <td>ID:</td>
        <td><c:out value="${movieLover.movieLoverId}" /></td>
    </tr>
    <tr>
        <td>First Name:</td>
        <td><c:out value="${movieLover.title}" /></td>
    </tr>
    <tr>
        <td>Last Name:</td>
        <td><c:out value="${movieLover.year}" /></td>
    </tr>
    <tr>
        <td>Phone:</td>
        <td><c:out value="${movieLover.holiday}" /></td>
    </tr>

</table>
<br><br>
<a href="/">HOME</a>
&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/mvc_cust/viewAllMovieLovers">All Holiday Movies</a>
&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/mvc_cust/addMovie">Add Holiday Movie</a>
&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/mvc_cust/editMovie?movieLoverid=<c:out value="${movieLover.movieLoverId}" />">Edit Holiday Movie</a>
</body>
</html>
