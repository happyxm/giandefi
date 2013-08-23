<%@taglib prefix="s" uri="/struts-tags" %>
<s:form action="login" namespace="/">
		<s:textfield label="Login ID" key="userId" />
		<s:password label="Password" key="password" />
		<s:submit align="center" value="login"/>
</s:form>
not registered? click <s:a href="/FirstProject/register.jsp">here</s:a>!