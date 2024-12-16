<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<head>
	<title>Student Management System</title>
	<style type="text/css">
		<%@ include file="/views/css/style.css"%>
	</style>
</head>
<body><br>
	<center><div class="image"></div></center>
	<div class="container">
	<img style="width: 300px; height:40px; "src="https://www.tesdbacademy.com/heme_files/logob.png">
		<marquee><h1 class="heading">Student Management System</h1></marquee>
		<ul class="nav">
			<li><a href="addStudent">Register Student</a></li>
			<li><a href="deleteStudent">Delete Student</a></li>
			<li><a href="updateStudent">Update Student</a></li>
			<li><a href="viewAllStudent">Display All Student</a></li>
		</ul>
		<p>Welcome to Student Management System. This website is to manage the Student Registeration
		purposes with CRUD operation</p>
		<p><ul>
		    <li>Registering the data
		    <li>Updating the data
		    <li>Deleting the data
		    <li>Displaying the data
		</ul></p>

	</div>
	<div>${PrintSwal}</div>
</body>
</html>
