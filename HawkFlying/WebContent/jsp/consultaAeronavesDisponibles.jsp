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
		<form:form action="consultaAeronavesDisponibles" method="post" modelAttribute="consultaBean">
			<form:select id="tipoBusqueda" name="tipoBusqueda" path="tipoBusqueda" style="display:block!important">
				<form:option value="1">Helicoptero</form:option>
				<form:option value="2">Avión</form:option>
			</form:select>
			<button type="submit">Consultar</button>
		</form:form>
	</div>
	<div class="container-alumnos">
		<table>
			<thead>
				<tr>
					<th data-field="id">Matricula</th>
					<th data-field="name">Marca</th>
					<th data-field="price">Modelo</th>
					<th data-field="price">capacidad</th>
					<th data-field="price">Estado</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach var="aeronave" items="${listaAeronaves}" varStatus="status">
					<tr>
						<td>${aeronave.matricula}</td>
						<td>${aeronave.marca}</td>
						<td>${aeronave.tipoModelo}</td>
						<td>${aeronave.capacidad}</td>
						<td>${aeronave.estado}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>
