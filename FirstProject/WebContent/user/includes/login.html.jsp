<%@taglib prefix="s" uri="/struts-tags" %>
<s:form action="login">
		<s:textfield label="Login ID" key="userId" />
		<s:password label="Password" key="password" />
		<s:submit align="center" value="login"/>
</s:form>
<br>
non sei registrato? clicca <a href="user/register.jsp">qui</a>!
