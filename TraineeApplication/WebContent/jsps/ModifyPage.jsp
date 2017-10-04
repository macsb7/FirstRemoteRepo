<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>ModifyPage</title>
	</head>
	<body>
	
	<h1>Modify Operation</h1>
		<form  action="getModifyDetail.do">
			Please enter Trainee Id : <input type="text" name="traineeId" required/><input type="submit" value="modify"/>	
		</form>
	
		<form action="getUpdate.do" method="post">
		<h3>Trainee Info</h3>
		<table border="1">
			<tr>
				<th> Trainee ID</th>
				<th> Trainee Name</th>
				<th> Trainee Location</th>
				<th> Trainee Domain</th>
			</tr>
			
			
				<tr>
					<td><input type="text" name="traineeID" id="traineeID" value="${trainee.traineeID}" readonly/></td>
					<td><input type="text" name="traineeName" id="traineeName" value="${trainee.traineeName }"/></td>
					<td><input type="text" name="traineeDomain" id="traineeDomain" value="${trainee.traineeDomain }"/></td>
					<td><input type="text" name="traineeLocation" id="traineeLocation" value="${trainee.traineeLocation }"/></td>
				</tr>			
		</table>
		<input type="submit" value="update" >
		<a href="getHomePage.do">HomePage</a>
		</form>
	
	</body>
</html>