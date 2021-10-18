<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add user</title>
</head>
<body>
<h1>Add user</h1>
<form action = "add-user-post" method="POST">
    <label>First name:
        <input type="text" name="firstName"><br />
    </label>

    <label>Last name:
        <input type="text" name="lastName"><br />
    </label>

    <label>Patronymic:
        <input type="text" name="patronymic"><br />
    </label>

    <label>Phone number:
        <input type="text" name="number"><br />
    </label>

    <label>Email:
    <input type="text" name="email"><br />
    </label>

    <label>Password:
        <input type="password" name="password"><br />
    </label>

    <button type="submit">Add</button>
</form>
</body>
</html>
