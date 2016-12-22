<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Project</title>
</head>
<body>
<table>
 <form:form method="POST"  action="CreateProject" commandName="ProjectReg">		
			<tr>
				<td>Project Id:</td>
				<td><input name="projectId" type="text" />
				</td>	
			</tr>
			<tr>			
				<td>Project Name:</td>
				<td><input type="text" name="name" />
				</td>
			</tr>										
			<tr>
				<td>Client Name:</td>
				<td><input type="text" name="clientName" />
				</td>
			</tr>
			<tr>
				<td>Project Duration:</td>
				<td><input type="text"  name="duration" />
				</td>
			</tr>
		
			<tr>
				<td>Project Domain</td>
				<td><input name="domain" type="text"/>
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