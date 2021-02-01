<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h1>calcolatrice</h1>
		<form id="Somma" action="Somma" method="post">
    <p>
        <input name="valore1">
        <input name="valore2">
        <input type="submit" id="reg" value="+" onclick="form.action='Somma';">
        <input type="submit" id="reg" value="-" onclick="form.action='Sottrazione';">
        <input type="submit" id="reg" value="/" onclick="form.action='Divisione';">
        <input type="submit" id="reg" value="*" onclick="form.action='Moltiplicazione';">
    </p>
    <p>Result: <span id="result">${result}</span></p>
</form>


</body>
</html>