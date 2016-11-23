<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Pet</title>
</head>
<body>
    Edit Pet
    <br><br>
    <form name="updatePetForm" method="POST" action="/mvc_cust/updatePet">
        Pet ID: <input type="text" name="petid" value="<c:out value="${pet.petId}" />" readonly /><br>
        Name: <input type="text" name="name" value="<c:out value="${pet.name}" />" /><br>
        Pet Type: <input type="text" name="pettype" value="<c:out value="${pet.petType}" />" /><br>
        Owner ID: <input type="text" name="ownerid" value="<c:out value="${pet.ownerId}" />" /><br>
        <input type="submit">
    </form>
</body>
</html>
