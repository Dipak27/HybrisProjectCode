<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Welcome to projecttraining</title>
    <link rel="stylesheet" href="<c:url value="/static/projecttraining-webapp.css"/>" type="text/css"
          media="screen, projection"/>
</head>
<body>
<h1>Employee Operation</h1>
	<a href="CreateEmplyee">Create Employee</a>
	<a href="DisplayEmplyee">View All Employee</a>
<h1>Project Operation</h1>
	<a href="CreateProject">Create Project</a>
	<a href="EditProject">Edit Project</a>
	<a href="DeleteProject">Delete Project</a>
	<a href="DisplayProject">View All Project</a>
</body>

</html>