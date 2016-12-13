<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file='css/styles.css'%>

<html>
<head>
    <title>TestTask</title>
</head>

<body>
    <table align = "center" class="table" cellspacing='0'>
    <tr><th valign = "top">Edit an employee</th></tr>

    <form method="POST">
    <tr><td>Name:</td>
    <td><input type="text" name="name" value="${employee.name}" /></td></tr>
    <tr><td> Department : </td>

    <td><select name="department.id" >
    <option value="${employee.department.id}">${employee.department.name}</option>
    <c:forEach var="department" items="${departments}">
    <option value="${department.id}">${department.name}</option>
    </c:forEach>
    </select></td></tr>

    <tr><td>Address:</td>
    <td><input type="text" name="address" value="${employee.address}" /></td></tr>
    <tr><td>Phone:</td>
    <td><input type="text" name="phone" value="${employee.phone}" /></td></tr>
    <tr><td>Salary:</td>
    <td><input type="number" name="salary" value="${employee.salary}" /></td></tr>
    </table>
    <table align = "center" class="table" cellspacing='0'>
    <tr><c:url var="add" value="/add"/>
    <td><a href="/"><button>Cancel</button></a></td>
    <td><input type="reset" value="Reset" /a></td>
    <td><input type="submit" value="Submit"/a></td></tr>
    </form>
    </table>
</body>
</html>


