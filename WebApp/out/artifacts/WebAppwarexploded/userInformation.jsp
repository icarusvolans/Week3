<%--
  Created by IntelliJ IDEA.
  User: icarusvolans
  Date: 11/23/16
  Time: 10:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Stuff</title>
</head>
<body>
Name: <%=request.getAttribute("name")%>
<br>
Special Message: <%=request.getAttribute("message")%>
<br>
Is First Times: <%=request.getAttribute("firstTime")%>
</body>
</html>
