<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
</head>
<body>
	<jsp:include page="/user/includes/register.html.jsp"/>

	<p>
	<i>Form di registrazione utente. I dati saranno scritti in un database (attualmente MySQL)</i>
	<ol>
		<li>Se i campi sono vuoti, l'utente viene notificato dell'errore</li>
		<li>L'utente deve inserire una email in formato corretto</li>
		<li>Da implementare un controllo per verificare l'univocita' dell'email di registrazione</li>
	</ol>
</body>
</html>