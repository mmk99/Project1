<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>

<title>Spring Web MVC Hello World Application</title>
</head>
<body>
<h2>All Employees in System</h2>

	<table border="1">
		<tr>
			<th>Employee Id</th>
			<th>First Name</th>
			<th>Last Name</th>
		</tr>
		<c:forEach items="${empl}" var="empl">
			<tr>
				<td>${empl.id}</td>
				<td>${empl.firstName}</td>
				<td>${empl.lastName}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>