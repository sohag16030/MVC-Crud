<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
   <title>Employee Management System</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" 
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
   <hr>
<div class="container">
    <h3>Create New Employee</h3>
     <form action="saveEmployee" method="POST">
    <div class="row">
            <div class="form-group col-lg-6">
                <label >Employee Id</label>
                <input type="text" placeholder="Employee Id" class="form-control" value="${employee.id}" name="id" >
            </div>
        </div>
        <div class="row">
            <div class="form-group col-lg-6">
                <label >First Name</label>
                <input type="text" placeholder="Employee First Name" class="form-control"  value="${employee.firstName}" name="firstName">
            </div>
        </div>
        <div class="row">
            <div class="form-group col-lg-6">
                <label >Last Name</label>
                <input type="text" placeholder="Employee Last Name" class="form-control" value="${employee.lastName}" name="lastName" >
            </div>
        </div>
        <div class="row">
            <div class="form-group col-lg-6">
                <label >Designation</label>
                <input type="text" placeholder="Employee Designation" class="form-control" value="${employee.designation}" name="designation">
            </div>
        </div>
        <button type="submit" class="btn btn-primary" >Submit</button>
    </form>
</div>
</body>
</body>
</html>