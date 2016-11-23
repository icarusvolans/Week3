<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Owner</title>
</head>
<body>
    Add Owner
    <br><br>
    <form name="newOwnerForm" method="POST" action="/mvc_cust/saveNewOwner">
        First Name: <input type="text" name="firstname" /><br>
        Last Name: <input type="text" name="lastname" /><br>
        Phone: <input type="text" name="phone" /><br>
        Address: <input type="text" name="address" /><br>
        <input type="submit">
    </form>
</body>
</html>
