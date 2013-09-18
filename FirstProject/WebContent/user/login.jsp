<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/style.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
</head>
<body>
	<h1>Login Form</h1>
	<jsp:include page="/user/includes/login.html.jsp" />
	<div id="container"><p>
		<i>La pagina propone un login ad un'applicazione.</i>
	<ol>
		<li>Se i campi sono vuoti, l'utente viene notificato dell'errore</li>
		<li>Se l'utente inserisce userid e password presenti nel database
			viene indirizzato alla pagina successiva</li>
		<li>Se l'utente inserisce dati non esistenti nel database gli
			viene notificato e può registrarsi</li>
		<li>Si può provare a loggarsi come user=test pass=test oppure ci si può registrare</li>
	</ol>
	</div>
</body>
</html>