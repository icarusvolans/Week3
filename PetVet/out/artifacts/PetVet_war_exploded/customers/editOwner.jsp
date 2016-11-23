<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Owner</title>
</head>
<body>
Edit Owner
<br><br>
    <form name="updateOwnerForm" method="POST" action="/mvc_cust/updateOwner">
        Owner ID: <input type="text" name="ownerid" value="<c:out value="${owner.ownerId}" />" readonly /><br>
        First Name: <input type="text" name="firstname" value="<c:out value="${owner.firstName}" />" /><br>
        Last Name: <input type="text" name="lastname" value="<c:out value="${owner.lastName}" />" /><br>
        Phone: <input type="text" name="phone" value="<c:out value="${owner.phone}" />" /><br>
        Address: <input type="text" name="address" value="<c:out value="${owner.address}" />" /><br>
        <input type="submit">
    </form>
</body>
</html>
