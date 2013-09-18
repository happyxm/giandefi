<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="${fn:substring(url, 0, fn:length(url) - fn:length(pageContext.request.requestURI))}${pageContext.request.contextPath}/" />
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Registrazione</title>
</head>
<body>
	<h1>Registrazione</h1>
	<jsp:include page="/user/includes/register.html.jsp" />

	<div id="container"><p>
		<i>Form di registrazione utente. I dati saranno scritti in un
			database (attualmente MySQL)</i>
	<ol>
		<li>Se i campi sono vuoti, l'utente viene notificato dell'errore</li>
		<li>L'utente deve inserire una email in formato corretto</li>
		<li><del>Da implementare un controllo per verificare l'univocita'
			dell'email di registrazione</del></li>
	</ol>
	</div>
</body>
</html>