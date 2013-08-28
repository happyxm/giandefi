<%@taglib prefix="s" uri="/struts-tags" %>
<s:form action="register" namespace="/">
	<s:textfield label="Login ID" key="userId" />
	<s:password label="Password" key="password" />
	<br>
	<s:textfield label="Nome" key="name"/>
	<s:textfield label="cognome" key="surname"/>
	<s:hidden key="joinDate"/>
	<s:textfield label="email" key="email"/>
	<s:submit align="center" value="register"/>
</s:form>