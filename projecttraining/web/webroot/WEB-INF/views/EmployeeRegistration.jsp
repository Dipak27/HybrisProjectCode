<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Welcome to projecttraining</title>
    <link rel="stylesheet" href="<c:url value="/static/projecttraining-webapp.css"/>" type="text/css"
          media="screen, projection"/>
</head>
<body>
	<table>
 <form:form method="POST"  action="createEmployee" commandName="CreateEmployeeFormObj">		
			<tr>
				<td>First Name:</td>
				<td><input type="text" name="firstName">
				</td>	
			</tr>
			<tr>			
				<td>Last Name:</td>
				<td><input type="text" name="lastName">
				</td>
			</tr>										
			<tr>
				<td>Employee ID:</td>
				<td><input type="text" name="empId">
				</td>
			</tr>
			<tr>
				<td>Password:</td>
				<td>
				<input type="text" name="empPassword">
				</td>
			</tr>
			<tr>
				<td>Is Manager:</td>
				<td><input type="radio" value="true" name="isManageer">Yes
					<input type="radio" value="false" name="isManageer">No
				</td>
			</tr>
			<tr>
				<td>Manager:</td>
				<td><input type="text" name="manager">
				</td>
			</tr>			
			<tr>
				<td>Project:</td>
				<td><input type="text" name="empProject">
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