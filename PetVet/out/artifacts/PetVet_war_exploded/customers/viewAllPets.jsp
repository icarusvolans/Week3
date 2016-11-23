<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View All Pets</title>
</head>
<body>
    View All Pets
    <br><br>
    <table>
        <tr>
            <th>Pet Id</th>
            <th>Name</th>
            <th>Pet Type</th>
            <th>Owner ID</th>
        </tr>
        <c:forEach var="pet" items="${pets}">
            <tr>
                <td>
                    <a href="/mvc_cust/viewPet?petid=${pet.pet}">
                        <c:out value="${pet.petId}" />
                    </a>
                </td>
                <td><c:out value="${pet.name}" /></td>
                <td><c:out value="${pet.petType}" /></td>
                <td>
                    <a href="/mvc_cust/viewOwner?ownerid=${owner.ownerId}">
                        <c:out value="${owner.ownerId}" />
                    </a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <br><br>
    <a href="/">HOME</a>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <a href="/mvc_cust/addNewPet">Add New Pet</a>
</body>
</html>
