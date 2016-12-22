<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show Employee</title>
</head>
<body>
	<table border="1">
		<c:forTokens items="Empid,firstName,LastName,Manager,Project,UPDATE,DELETE" delims="," var="ColumnName">			
			<td>
			<c:out value="${ColumnName}"/><p>
			</td>
			</c:forTokens>					
	</table>
	<table  border="1">
		<c:forEach var="employee" items="${employeeList}">
			<form:form>
			<input type="hidden" name="eid" value="${employee.cybempId}" >
			<tr>			
				<td><c:out value="${employee.cybempId}" /></td>
				<td><c:out value="  ${employee.firstName}" /></td>
				<td><c:out value="  ${employee.lastName}" /></td>
				<td><c:out value="  ${employee.managers}" /></td>
				<td><c:out value="  ${employee.project}" /></td>	
				<td colspan="3"><button type="submit"  formaction="editEmployee" >UPDATE</button>
				<td colspan="3"><button type="submit"  formaction="deleteEmployee" >DELETE</button>			
			</tr>
			<c:out value="  ${employee.managers}" />
			<c:out value="  ${employee.project}" />
			</form:form>
		</c:forEach>
	</table>

</body>
</html>