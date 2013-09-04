<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ok</title>
</head>
<body>
<h1>Welcome "<s:property value="name"/> <s:property value="surname"/>"</h1>
Utenti registrati <a href="registeredusers.action"><img src="images/arrow_right_small.gif" /></a>
<p>
<i>La pagina d&agrave; il benvenuto all'utente.</i>
<ol>
	<li>il nome e cognome sono prelevati dal database</li>
	<li>cliccando sulla freccia viene eseguita una query che preleva tutti i dati degli utenti nel database</li>
	<li>verr&agrave; implementata un pulsante per eliminarli singolarmente</li>
</ol>
</body>
</html>