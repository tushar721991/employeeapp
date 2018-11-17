<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Employees</title>
</head>
<body>
	<h1>Employee App</h1>
	<br>

	<table border="1" cellspacing="5" cellpadding="5">
		<thead>
			<tr>
				<th>Employee Id</th>
				<th>Employee Name</th>
				<th>Employee Department</th>
				<th>Employee Salary</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="employee" items="${employees}">
				<tr>
					<td>${employee.employeeId}</td>
					<td>${employee.employeeName}</td>
					<td>${employee.employeeDepartment}</td>
					<td>${employee.employeeSalary}</td>
					<td><a href="updateEmployeeForm/${employee.employeeId}">Edit</a></td>
					<td><a href="deleteEmployee/${employee.employeeId}">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br><br>
	<a href="addEmployeeForm">Add Employee</a>

</body>
</html>