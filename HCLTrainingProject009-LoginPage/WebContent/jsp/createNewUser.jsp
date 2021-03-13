<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Create New User</h1>

<form action="createUser" method="post">

Enter Username: <input type="text" name="username"><br/><br/>
Enter Email: <input type="text" name="email"><br/><br/>
Enter Password: <input type="password" name="password"><br/><br/>
Confirm Password: <input type="password" name="password2"><br/><br/>

<input type="submit" name="register" style="width:100px" value="submit"/><br/><br/>




</form>


</body>
</html>