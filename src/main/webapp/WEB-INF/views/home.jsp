<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome to Spring</title>
</head>
<body>
	<h1>Hello World!</h1>


	<!-- this is an expressions language tag (EL) that
	we use to pass java code from the controller into our views,
	 it uses the second parameter from the ModelAndView object-->
	<h1>${hello}</h1>

	<!-- We can add multiple tags in a page from our controller methods -->
	${sumOfNums }

	<h1>${nick }</h1>

	<!-- Post will hide the data from the URL -->
	<form action="forminfo" method="POST">
	<!-- the name attribute allows us to send values from the form back to the 
	controller, the name assigned in quotes should match exactly to the @RequestParam in 
	the controller method -->
		First Name: <input type="text" name="first"> 
		Last Name: <input type="text" name="last"> 
		<input type="submit" value="add user">
	</form>

	<h1>Checkbox Example</h1>
	<form action="checkbox">
		<input type="checkbox" name="bootcamp" value="JAVA" checked> Java <br> 
		<input type="checkbox" name="bootcamp" value="FRONT-END"> FE <br> 
		<input type="checkbox" name="bootcamp" value="C#"> C# <br> 
		<input type="submit" value="Submit">
	</form>

	<h1>Dropdown Example</h1>
	<form action="checkbox">
		<select name="bootcamp">
			<option value="volvo">Volvo</option>
			<option value="saab">Saab</option>
			<option value="opel">Opel</option>
			<option value="audi">Audi</option>
		</select>
		<input type="submit" value="Submit">
	</form>
	
	<h1>Radio Example</h1>
	<form action="checkbox">
		<input type="radio" name="bootcamp" value="JAVA" checked> Java <br> 
		<input type="radio" name="bootcamp" value="FRONT-END"> FE <br> 
		<input type="radio" name="bootcamp" value="C#"> C# <br> 
		<input type="submit" value="Submit">
	</form>
</body>
</html>