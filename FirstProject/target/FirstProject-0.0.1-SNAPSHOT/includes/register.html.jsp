<%@taglib prefix="s" uri="/struts-tags" %>
<s:form action="register" namespace="/">
		<s:textfield label="Login ID" key="userId" />
		<s:password label="Password" key="password" />
		<s:submit align="center" value="register"/>
</s:form>