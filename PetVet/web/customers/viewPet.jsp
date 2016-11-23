<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Pet</title>
</head>
<body>
    View Pet
    <br><br>
    <table>
        <tr>
            <td>ID:</td>
            <td><c:out value="${pet.petId}" /></td>
        </tr>
        <tr>
            <td>Name:</td>
            <td><c:out value="${pet.name}" /></td>
        </tr>
        <tr>
            <td>Pet Type:</td>
            <td><c:out value="${pet.petType}" /></td>
        </tr>
        <tr>
            <td>Owner ID:</td>
            <td><c:out value="${pet.ownerId}" /></td>
        </tr>
    </table>
    <br><br>
    <a href="/">HOME</a>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <a href="/mvc_cust/viewAllPets">All Pets</a>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <a href="/mvc_cust/addNewPet">Add New Pet</a>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <a href="/mvc_cust/editPet">Edit Pet</a>
</body>
</html>
