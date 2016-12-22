<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>

<head>
    <title>Welcome to cybage</title>
   
</head>
<div class="container">
   		 	<h2>Welcome to "cybage" </h2>   
   
   	 <form:form method="POST"  action="" commandName="CreateEmployeeFormObj">		
			
			<tr>
				<td>Employee Id:</td>
				<td><form:input path="eid" />
				</td>				
				<td>Employee Password:</td>
				<td><form:input path="empPassword" />
				</td>				
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="Submit" />
				</td>
			</tr>
		
	</form:form>
</div>
</html>