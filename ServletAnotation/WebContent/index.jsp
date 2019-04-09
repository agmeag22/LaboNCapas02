<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form action="${pageContext.request.contextPath}/AnotacionServlet" method="post">
		<label>Ingrese Usuario: </label><input name="user" type="text">
		<label>Ingrese Clave: </label><input name="password" type="password">
		<input type = "submit" value = "Login">
	</form>
</body>
</html>