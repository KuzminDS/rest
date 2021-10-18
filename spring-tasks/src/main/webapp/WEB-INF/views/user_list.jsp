<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User list</title>
</head>
<body>

<h1>Users</h1>

<table border="1" cellpadding="2" cellspacing="2">
    <tr>
        <th>Id</th>
        <th>FirstName</th>
        <th>LastName</th>
        <th>Patronymic</th>
        <th>Email</th>
        <th>Number</th>
        <th>Password</th>
    </tr>
    <c:forEach var="user" items="${userList}">
        <tr>
            <td>${user.id}</td>
            <td>${user.getFirstName()}</td>
            <td>${user.getLastName()}</td>
            <td>${user.getPatronymic()}</td>
            <td>${user.getEmail()}</td>
            <td>${user.getNumber()}</td>
            <td>${user.getPassword()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>