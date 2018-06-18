<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css"
	integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4"
	crossorigin="anonymous">

<title>Unit Details</title>
</head>
<body>
	<c:choose>
		<c:when test="${unit != null }">
			<%-- <c:forEach items="${units}" var="unit"> --%>
				<h2>${unit.name}</h2>
				<table>
					<tr>
						<td>Country: ${unit.country }</td>
					</tr>
					<tr>
						<td>Headquarters: ${unit.headquarters }</td>
					</tr>
					<tr>
						<td>Founding Date: <fmt:formatDate pattern="yyyy-MM-dd"
								value="${unit.foundingDate }" /></td>
					</tr>
					<tr>
						<td>Size: ${unit.size }</td>
					</tr>
					<tr>
						<td>Specializations: ${unit.specializations }</td>
					</tr>

				</table>
				<form action="editUnit.do" method="GET">
					<input type="hidden" name="id" value="${unit.id }"> <input
						type="submit" value="Edit Unit" />
				</form>
				<form action="deleteUnit.do" method="GET">
					<input type="hidden" name="id" value="${unit.id }"> <input
						type="submit" value="Delete Unit" />
				</form>
			<%-- </c:forEach> --%>
		</c:when>
		<c:when test="${film == null }">
			<p>There is no unit with that ID in the database.</p>
		</c:when>
	</c:choose>
	<h3>
		<a href="index.do">Main menu</a>
	</h3>
</body>
</html>