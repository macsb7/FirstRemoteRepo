<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%> <!-- tag lib  -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>EntryPage</title>
		<script src="jsLib/jquery-1.12.3.js" type="text/javascript"></script>
		<script src="jsLib/MyJsLib.js" type="text/javascript"></script>
	</head>
	<body>
	
	<sf:form method="post" modelAttribute="Trainee" action="submitTraineeDetails.do">  <!--  modelAttribute is what mentioned in the method invoking this jsp -->
		<label for="traineeID">Trainee ID :</label>
		<sf:input path="traineeID" for="traineeID" type="text"/><br>  <!-- path means property name of setter method of object (getEmpNm to empNm)-->
		
		<label for="traineeName">Trainee Name:</label>
		<sf:input path="traineeName" for="traineeName" type="text"/><br>  	 
	
		<label for="traineeLocation">Trainee Location:</label><br>
		<sf:radiobutton path="traineeLocation" for="traineeLocation" value="Chennai" label="Chennai" /><br>  
		<sf:radiobutton path="traineeLocation" for="traineeLocation" value="Pune" label="Pune" /><br>  
		<sf:radiobutton path="traineeLocation" for="traineeLocation" value="Mumbai" label="Mumbai" /><br>  
		<sf:radiobutton path="traineeLocation" for="traineeLocation" value="Delhi" label="Delhi" /><br>  
		
		<label for="traineeDomain">Trainee Domain:</label>
		<sf:select path="traineeDomain" id="traineeDomain">
			<sf:option value="JEE" path="traineeDomain" for="traineeDomain">JEE</sf:option>
			<sf:option value=".Net" path="traineeDomain" for="traineeDomain">.Net</sf:option>
			<sf:option value="MainFrame" path="traineeDomain" for="traineeDomain">MainFrame</sf:option>
		</sf:select>
	  <input type="submit" value="Add Trainee"/>
	  <a href="getHomePage.do">HomePage</a>
	</sf:form>
	
	</body>
</html>