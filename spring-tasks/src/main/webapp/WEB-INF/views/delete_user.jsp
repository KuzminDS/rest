<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Delete user</title>
</head>
<body>
<h1>Delete user</h1>
<form action = "delete-user-post" method="POST">
  <label>Id:
    <input type="number" name="id"><br />
  </label>
  <button type="submit">Delete</button>
</form>
</body>
</html>
