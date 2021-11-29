
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="./demo.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Employee Management System</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
</head>
<body>
	<div class="container my-2">
		<h1>Employee List</h1>
		<button class="btn btn-primary btn-sm mb-3"
			onclick="window.location.href='showNewEmployeeForm'" type="button">Add
			Employee</button>
		<hr>
		<table border="1" class="table table-striped table-responsive-md">
			<thead>
				<tr>
					<th>Employee Id</th>
					<th>Employee First Name</th>
					<th>Employee Last Name</th>
					<th>Employee Designation</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="employee" items="${employeeList}">
					<tr>
						<td>${employee.id}</td>
						<td>${employee.firstName}</td>
						<td>${employee.lastName}</td>
						<td>${employee.designation}</td>
						<td><a href="deleteEmployee/${employee.id}"><i
								class="far fa-trash-alt text-danger" style="font-size: 20px"></i></a>
							<a href="updateEmployee/${employee.id}"><i class="fas fa-pencil-alt"
								" style="font-size: 20px"></i></a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
