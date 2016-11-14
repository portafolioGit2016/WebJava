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
		<div class="center">
		<span>${message}</span><br>
	</div>
	<div
		style="width: 90%; height: 300px; margin-left: 100px; margin-top: 10px;">
		<h2>Menu de vuelo</h2>
		<a class="waves-effect waves-light btn modal-trigger" href="#modal1">Nuevo
			Vuelo</a>

		<!-- Modal Structure -->
		<div id="modal1" class="modal">
			<div class="modal-content">
				<form:form class="col s12" method="post" action="administrar-vuelo"
					modelAttribute="vueloBean">
					<h4>Crear nuevo vuelo</h4>
					<div class="row">

						<div class="row">
							<div class="input-field col s12">
								<form:input type="text" path="nro_vuelo"
									placeholder="Numero vuelo" />
								<label for="first_name">Numero vuelo</label>
							</div>
						</div>
						<div class="row">
							<div class="input-field col s12">
								<form:input type="text" path="condicion"
									placeholder="Condición vuelo" />
								<label class="" for="condicion">Condicion De Vuelo (IFR o VFR)</label>
							</div>
						</div>
						<div class="row">
							<div class="input-field col s12">
								<form:input type="text" path="total_tv" placeholder="Total tv" />
								<label for="totaltv">Total Tiempo de Vuelo</label>
							</div>
						</div>
						<div class="row">
							<div class="input-field col s12">
								<form:input id="fechaVuelo" type="text" path="fecha"
									placeholder="Fecha" />
								<label for="fecha">Fecha Vuelo</label>
							</div>
						</div>
						<div class="row">
							<div class="input-field col s12">
								<form:select id="mision" path="id_mision"
									style="display:block!important">
									<form:option value="" label="--- Seleccione Misión ---" />
									<form:options items="${listaPlanesDeVuelo}"
										itemValue="idMision" itemLabel="nombre" />

								</form:select>
								<label class="labelSelect" for="email">Mision</label>
							</div>
						</div>
						<div class="row">
							<div class="input-field col s12">
								<form:select id="idAeronave" path="idAeronave"
									style="display:block!important">
									<form:option value="" label="--- Seleccione Aeronave ---" />
									<c:forEach var="aeronave" items="${listaAeronaves}">
										<form:option value="${aeronave.idAeronave}">
											<c:out
												value="${aeronave.tipo} ${aeronave.marca} ${aeronave.matricula}" />
										</form:option>
									</c:forEach>

								</form:select>
							</div>
						</div>
					</div>
					<div class="modal-footer">
						<button type="submit"
							class=" modal-action modal-close waves-effect waves-green btn-flat">Crear
							vuelo</button>
					</div>
				</form:form>
			</div>

		</div>
	</div>

	<script type="text/javascript">
		$(document).ready(function() {
			$('.modal-trigger').leanModal();
			$("#fechaVuelo").datepicker({
				dateFormat : "yy-mm-dd"
			});
		});
	</script>
</body>
</html>