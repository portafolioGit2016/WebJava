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
	href="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap-theme.min.css">
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
		<h3>Reporte Consulta Horas De Vuelo</h3>
		<form:form class="col s12" method="post" action="ConsultaHrsVuelo"
			modelAttribute="chsBean">
			<form:hidden path="idPiloto"></form:hidden>
			<form:select path="tipoConsulta" style="display:block!important" cssClass="label label-info" cssStyle="font-size:100%" required="required">
				<form:option value="" cssStyle="font-size:100%" label="--- Seleccione Tipo Consulta ---" />
				<form:options items="${listaLicencias}" itemValue="id"
					itemLabel="tipo" />
			</form:select>
			<br>
			<br>
			<br>
			<br>
			<div class="text-info">
				<button type="submit">Consultar Hrs</button>
			</div>
		</form:form>
	</div>

	<div class="container">
		<form class="col s12">
			<div class="row">
				<div class="alert alert-info">
					<label for="first_name" class="text-info">Nro.Licencia</label> <input
						disabled id="first_name" type="text" class="validate"
						value="<c:out value='${usuario.numLicencia}'> </c:out>">
				</div>
				<div class="alert alert-info">
					<label for="first_name" class="text-info">Nombre Piloto</label> <input
						disabled id="first_name" type="text" class="validate"
						value="<c:out value='${usuario.nombre}'> </c:out>">
				</div>
			</div>
			<div class="row">
				<div class="alert alert-info">
					<label for="first_name" class="text-info">Fecha De Medicina Aeroespacial (MAE) </label> <input
						disabled id="first_name" type="text" class="validate"
						value="<c:out value='${usuario.fechamae}'> </c:out>">
				</div>
				<div class="alert alert-info">
					<label for="first_name" class="text-info">Fecha De Ultimo
						Vuelo</label> <input disabled id="first_name" type="text" class="validate"
						value="<c:out value='${usuario.ultimovuelo}'> </c:out>">
				</div>
				<div class="alert alert-info">
					<label for="first_name" class="text-info">Horas Vuelo
						</label> <input disabled id="first_name" type="text" class="validate"
						value="<c:out value='${usuario.totalhrs}'> </c:out>">
				</div>
			</div>
		</form>
	</div>


</body>
</html>