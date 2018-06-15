<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Unit</title>
</head>
<body>

<h2>Add Unit</h2>
<form:form action="addUnit.do" method="POST" modelAttribute="unit">
		
		<form:label path="name">Name:</form:label>
		<form:input path="name" />
		<br />
		<form:label path="country">Country:</form:label>
		<form:input path="country" />
		<br />
		<form:label path="headquarters">Headquarters:</form:label>
		<form:input path="headquarters" />
		<br />
		<form:label path="foundingDate">Founding Date:</form:label>
		<form:input type="date" path="foundingDate" />
		<br />
		<form:label path="size">Size:</form:label>
		<form:input type="number" path="size" />
		<br />
		<form:label path="specializations">Specializations:</form:label>
		<form:input path="specializations" />
		<br />
		
		<input type="submit" value="Submit" />
	</form:form>
	
	<h3>
		<a href="index.do">Main menu</a>
	</h3>
</body>
</html>