<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<form action="/board/confirmId">

<input type="text" id="id" value="1">
<input type="text" id="pw" value="2">
<input type="text" id="name" value="3">
<input type="text" id="email" value="4">
<input type="submit" value="이동">

</form>

</body>
</html>
