<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file='css/styles.css'%>

<html>
<head>
    <title>TestTask</title>
</head>

<body>
    <table align = "center" class="table" cellspacing='0'>
    <tr><th valign = "top">List of Employees</th>
    <th valign = "top">Department</th>
    <th valign = "top">Address</th>
    <th valign = "top">Phone</th>
    <th valign = "top">Salary</th>
    <th valign = "top"> </th>
    <th valign = "top"> </th></tr>
    <c:forEach items="${employees}" var="employee">
    <c:url var="edit" value="/edit/${employee.id}" />
    <c:url var="remove" value="/remove/${employee.id}" />
    <tr><td><c:out value="${employee.name}" /></td>
    <td><c:out value="${employee.department.name}" /></td>
    <td><c:out value="${employee.address}" /></td>
    <td><c:out value="${employee.phone}" /></td>
    <td><c:out value="${employee.salary}" /></td>
    <td valign = "top"><a href="${edit}">Edit</a></td>
    <td valign = "top"><a href="${remove}">Remove</a></td></tr>
    </c:forEach>
    </table>

    <table align = "center" class="table" cellspacing='0'>
    <tr><c:url var="add" value="/add"/>
    <td><a href="${add}">Add</a> an employee</td></tr>
    </table>
    <br>
</body>
</html>
