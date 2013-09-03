<jsp:include page="success.jsp"></jsp:include>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="s" uri="/struts-tags" %>

<table border="1">
	<tr>
		<th>ID</th>
		<th>UserId</th>
		<th>Password</th>
		<th>Nome</th>
		<th>Cognome</th>
		<th>email</th>
		<th>Registrato il</th>
		
	</tr>
    <c:forEach items="${list}" var="user">
        <tr>
            <td>${user.id}</td>
            <td><c:out value="${user.userId}" /></td>
            <td><c:out value="${user.password}" /></td>
            <td><c:out value="${user.name}" /></td>
            <td><c:out value="${user.surname}" /></td>
            <td><c:out value="${user.email}" /></td>
            <td><fmt:formatDate value="${user.joinDate}" pattern="yyyy-MM-dd" /></td>
        </tr>
    </c:forEach>
</table>