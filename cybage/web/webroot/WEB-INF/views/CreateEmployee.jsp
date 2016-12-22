<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Employee</title>
</head>
<body>
<table>
 <form:form method="POST"  action="createEmployee" commandName="CreateEmployeeFormObj">		
			<tr>
				<td>First Name:</td>
				<td><form:input path="fname" />
				</td>	
			</tr>
			<tr>			
				<td>Last Name:</td>
				<td><form:input path="laname" />
				</td>
			</tr>										
			<tr>
				<td>Employee ID:</td>
				<td><form:input path="eid" />
				</td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><form:input  path="empPassword" />
				</td>
			</tr>
			<tr>
				<td>Is Manager:</td>
				<td><form:input path="is_Manager" />True if Manager if Not False
				</td>
			</tr>
			<tr>
				<td>Manager:</td>
				<td><form:input path="manager" />
				</td>
			</tr>			
			<tr>
				<td>Project:</td>
				<td><form:input path="project" />
				</td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="Submit" />
				</td>				
			</tr>		
		
	</form:form>
</table>
</body>
</html>