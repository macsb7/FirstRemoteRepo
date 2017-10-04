<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>UpdateNamePage</title>
		<script src="jsLib/jquery-1.12.3.js" type="text/javascript"></script>
		<script src="jsLib/MyJsLib.js" type="text/javascript"></script>
	</head>
	<body>
			<h1>Capgemini India</h1>
			<h3>${pageHead}</h3>
	
		<form action="submitNewEmpName.do" method="get">
			
			<label for="empNo"></label>
			<select name="empNo" id="empNo" >
				<c:forEach items="${idList}" var="empNo">		
				<option value="${empNo}">${empNo}</option>
				</c:forEach>	
			</select>
			
			<label for="newName"></label>
			<input type="text" name="newName" id="newName"/>	
				
			<input type="submit" value="Update"/>
		</form>
		<a href="getHomePage.do">HomePage</a>
	</body>
</html>