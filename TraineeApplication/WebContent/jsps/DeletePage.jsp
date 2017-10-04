<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Delete</title>
		</head>
	<body>
		<h1>Delete Operation</h1>
		<form  action="getTraineeDel.do">
		Please enter Trainee Id : <input type="text" name="traineeId" required/><input type="submit" value="delete"/>	
		</form>
		
		<form action="getDelete.do?traineeId=${trainee.traineeID}" method="post">
		<h3>Trainee Info</h3>
		<table border="1">
			<tr>
				<th> Trainee ID</th>
				<th> Trainee Name</th>
				<th> Trainee Location</th>
				<th> Trainee Domain</th>
			</tr>
			
			
				<tr>
					<td>${trainee.traineeID}</td>
					<td>${trainee.traineeName }</td>
					<td>${trainee.traineeDomain }</td>
					<td>${trainee.traineeLocation }</td>
				</tr>			
		</table>
		<input type="submit" value="delete" >
		<a href="getHomePage.do">HomePage</a>
		</form>
	</body>
</html>