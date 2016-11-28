<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>View All Holiday Movies</title>
</head>
<body>
View All Holiday Movies
<br><br>
<table>
    <tr>
        <th>Movie Lover Id</th>
        <th>Title</th>movieLover
        <th>Year</th>
        <th>Holiday</th>
    </tr>
    <c:forEach var="movieLover" items="${movieLovers}">
        <tr>
            <td>
                <a href="/mvc_cust/viewMovie?movieLoverid=${movieLover.movieLoverId}">
                    <c:out value="${movieLover.movieLoverId}" />
                </a>
            </td>
            <td><c:out value="${movieLover.title}" /></td>
            <td><c:out value="${movieLover.year}" /></td>
            <td><c:out value="${movieLover.holiday}" /></td>
        </tr>
    </c:forEach>
</table>
<br><br>
<a href="/">HOME</a>
&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/mvc_cust/addMovie">Add Holiday Movie</a>
</body>
</html>