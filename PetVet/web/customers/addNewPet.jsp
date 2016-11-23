<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Pet</title>
</head>
<body>
Add Pet
<br><br>
<form name="newOwnerForm" method="POST" action="/mvc_cust/saveNewPet">
    Name: <input type="text" name="name" /><br>
    Pet Type: <select name="pettype">
    <c:forEach var="ptype" items="${petTypes}">
        <option value="<c:out value="${ptype}"/>"><c:out value="${ptype}"/></option>
    </c:forEach>
</select><br>
    Owner Id: <input type="text" name="ownerid" /><br>
    <input type="submit">
</form>
</body>
</html>
