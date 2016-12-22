<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html ">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Employee</title>
</head>
<body>
	<form:form method="POST"  action="updateEmployee" >		
			
		<table>
				<tr>
					<td>First Name:</td>
					<td><input name="fname"  value=" ${employee.firstName}" />
					</td>				
					<td>Last Name:</td>
					<td><input  name="laname" value=" ${employee.lastName}" />
					</td>								
				</tr>
				<tr>
					<td>Employee ID:</td>
					<td><input name="eid"  value=" ${employee.cybempId}"/>
					</td>
				</tr>
				<tr>
					<td>Is Manager:</td>
					<td><input name="is_Manager" value=" ${employee.isManager}"/>
					</td>
				</tr>
				<tr>
					<td colspan="3"><input type="submit" value="Submit" />
					</td>				
				</tr>		
		</table>
	</form:form>
</body>
</html>