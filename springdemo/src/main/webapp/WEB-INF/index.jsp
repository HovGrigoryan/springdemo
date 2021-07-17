<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<span>${message}</span>

<ul>
    <c:forEach items="${users}" var="user">
        <li>${user.name} ${user.surname }</li>
    </c:forEach>
</ul>
</body>
</html>
