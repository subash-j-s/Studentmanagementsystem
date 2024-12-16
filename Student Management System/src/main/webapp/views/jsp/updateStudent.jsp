<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Update Student</title>
	<style type="text/css">
		<%@ include file="/views/css/style.css"%>
	</style>
 <!-- 	<link rel="stylesheet" href="css/style.css" />  -->
</head>
<body>

	<div class="container">
		<h1 class="heading">Student Management System</h1>
		<ul class="nav">
			<li><a href="viewAllStudent">Display All Student</a></li>
			<li><a href="/">Home</a></li>
		</ul>
		<h2 class="heading">Update Student</h2>
        <div class="add-form">
          <form action="updateStud" method="post">
             <table>
                 <tr>
                    <th>
                         <label for="sno">Student No. : </label>
                    </th>
                    <td>
                         <input type="number" name="studNo" class="input-field" id="sno" maxlength="10" value="${Sno}"  required>
                    </td>
                 </tr>
                 <tr>
                    <th>
                         <label for="sname">Student Name : </label>
                    </th>
                    <td>
                         <input type="text" name="studName" class="input-field" id="sname" maxlength="40" value="${Sname}" required>
                    </td>
                 </tr>
                 <tr>
                     <th>
                         <label for="smobno">Mobile No : </label>
                     </th>
                     <td>
                         <input type="text" name="studMobile" class="input-field" id="smobno" minlength="10" maxlength="10" value="${Smobno}" required>
                     </td>
                 </tr>

                 <tr>
                     <th>
                         <label for="scourse">Course Name : </label>
                     </th>
                     <td>
                         <input type="text" name="studCourse" class="input-field" id="scourse" maxlength="40" value="${SCOURSE}" required>
                     </td>
                 </tr>
                 <tr>
                    <th>
                         <label for="sdob">Date of Birth : </label>
                    </th>
                    <td>
                        <input type="date" name="studDOB" class="input-field" id="sdob" value="${SDOB}" required>
                    </td>
                 </tr>
                 <tr>
                    <th>
                        <label for="sdoj">Date of Joining : </label>
                    </th>
                    <td>
                        <input type="date" name="studDOJ" class="input-field" id="sdoj" value="${SDOJ}" required>
                    </td>
                 </tr>
                 <tr>
                     <th>
                         <label for="semail">Email : </label>
                     </th>
                     <td>
                         <input type="text" name="studEmail" class="input-field" id="semail" value="${SEmail}" required>
                     </td>
                 </tr>
                 <tr>
                     <th>
                         <label for="stime">Class Time : </label>
                     </th>
                     <td>
                         <input type="text" name="studTime" class="input-field" id="stime" value="${STime}" required>
                     </td>
                 </tr><tr>
                 <th>
                     <label for="strainer">Trainer Name: </label>
                 </th>
                 <td>
                     <input type="text" name="studTrainer" class="input-field" id="strainer" value="${STrainer}" required>
                 </td>
             </tr>

                 <tr >
                    <td colspan="2">
                    <input type="submit" class="btn btn-edit" value="Edit"/>
                        <input type="submit" class="input-field" value="Update Student">
                    </td>
                 </tr>
            </table>
         </form>
       </div>
	</div>
	<div>${PrintSwal}</div>
</body>
</html>