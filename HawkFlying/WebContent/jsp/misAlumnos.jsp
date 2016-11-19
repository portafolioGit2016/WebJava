<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="include.jsp"%>
<html>
<head>
<title>Portafolio</title>
<!-- Latest compiled and minified CSS -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script src="js/bootstrap.js"></script>
<script src="https://use.fontawesome.com/9def2d878d.js"></script>
<meta charset="UTF-8">
<!-- Compiled and minified CSS -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.7/css/materialize.min.css">
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<!-- Compiled and minified JavaScript -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.7/js/materialize.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/style-intra-index.css">
<link rel="stylesheet" type="text/css" href="css/alumnos.css">

</head>
<body>
	<c:set var="contextPath" value="${pageContext.request.contextPath}" />
	<%@include file="MenuInclude.jsp"%>

	<div class="container">
		<h3>Mis Alumnos</h3>
	</div>
	<div class="container-alumnos">
		<table>
			<thead>
				<tr>
					<th data-field="id">Nombre</th>
					<th data-field="name">Apellido</th>
					<th data-field="price">Rut</th>
					<th data-field="price">Fecha Nacimiento</th>
					<th data-field="price">E-mail</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach var="alumno" items="${listaAlumnos}" varStatus="status">
					<tr>
						<td>${alumno.nombre}</td>
						<td>${alumno.apellido}</td>
						<td>${alumno.rut}</td>
						<td>${alumno.fechaNac}</td>
						<td>${alumno.email}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>
