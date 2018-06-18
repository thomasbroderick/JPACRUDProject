<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">

<title>Update Unit</title>
</head>
<body>
<form:form action="updateUnit.do" method="POST" modelAttribute="unit">
		
		<form:label path="name">Name:</form:label>
		<form:input path="name" />
		<br />
		<form:label path="country">Country:</form:label>
		<form:input path="country" />
		<br />
		<form:label path="headquarters">Headquarters:</form:label>
		<form:input path="headquarters" />
		<br />
		<%-- <form:label path="foundingDate">Founding Date:</form:label>
		<form:input type="date" path="foundingDate" />
		<br /> --%>
		<form:label path="size">Size:</form:label>
		<form:input type="number" path="size" />
		<br />
		<form:label path="specializations">Specializations:</form:label>
		<form:input path="specializations" />
		<br />
		<input type="hidden" name="id" value="${unit.id }">
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>