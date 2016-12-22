<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Welcome to projecttraining</title>
    <link rel="stylesheet" href="<c:url value="/static/projecttraining-webapp.css"/>" type="text/css"
          media="screen, projection"/>
</head>
<body>
<table>

	<tr>
		<td>Project Name</td>
		<td>Client Name</td>
		<td>Duration</td>
		<td>Domain</td>
	</tr>
	<c:forEach items="${projects}" var="proj">
	<tr>
		<td>${proj.name}</td>
		<td>${proj.clientName}</td>
		<td>${proj.duration}</td>
		<td>${proj.domain}</td>
		<td>
			<form>
				<button formaction="/projecttraining/editProject" value="${proj.projectId}" name="id">Edit
				</button>
				</form>
			</td>
	</tr>
</c:forEach>

<form:form modelAttribute="matchrecord" method="POST" action="/projecttraining/editProject">

<c:if test="${matchrecord != null }">
<table>

	<tr>
		<td>ID</td>
		<td><form:input path="projectId" readonly="true"/><br></td>
	</tr>
	
	<tr>
		<td>Name</td>
		<td><form:input path="name"/><br></td>
	</tr>
	
	<tr>
		<td>Client Name</td>
		<td><form:input path="clientName"/><br></td>
	</tr>
	
	<tr>
		<td>Duration</td>
		<td><form:input path="duration"/><br></td>
	</tr>
	
	<tr>
		<td>Domain</td>
		<td><form:input path="domain"/><br></td>
	</tr>
	
	<tr>
		<td></td>
		<td><input type="submit" value="EDIT"> </td>
	</tr>
	
</table>
</c:if>

</form:form>

</table>

	
</body>

</html>