<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<title>Welcome ${loggedInUser}</title>
<!-- Latest compiled and minified CSS -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://use.fontawesome.com/9def2d878d.js"></script>
<meta charset="UTF-8">
<!-- Compiled and minified CSS -->
<!-- Compiled and minified JavaScript -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.7/js/materialize.min.js"></script>
<spring:url value="/css/style-intra-index.css" var="mainCss" />
<link href="${mainCss}" rel="stylesheet" />
<spring:url value="/css/materialize.min.css" var="mainCss2" />
<link href="${mainCss2}" rel="stylesheet" />
</head>
<body>
	<%@include file="MenuInclude.jsp"%>

	<h3>Escuela de Aviación</h3>
	<h4>"Escuadrilla Halcón"</h4>


	<div class="row" style="margin-left: 50px; margin-top: 50px;">

		<div class="col s4">
			<div class="card">
				<div class="card-image">
					<img
					src="http://e02-elmundo.uecdn.es/assets/multimedia/imagenes/2014/02/21/13929817861333.jpg">
						
					<span class="card-title">Noticia 1</span>
				</div>
				<div class="card-content" height: 200px; overflow-x:hidden;">
					<p>Encontrará toda la informacion sobre los Aeródromos y
						Aeropuertos Año 2016 en la tabla de CCCM - FCCV.</p>
					
				</div>
				<div class="card-action">
					<a
						href="https://www.aipchile.gob.cl/dasa/aip_chile_con_contenido/ais/CCCM-FCCV/CCCM-FCCV.xls">Ver
						link</a>
				</div>
			</div>
		</div>
		<div class="col s4">
			<div class="card">
				<div class="card-image">
					<img
					src="http://www.futureplatone.com/img/simulador-vuelo-valencia.png">
						
					<span class="card-title">Noticia 2</span>
				</div>
				<div class="card-content" height: 200px; overflow-x:hidden;">
					<p>EXAMENES EN PROVINCIA</p>
					<p>A partir del 26 de Noviembre y hasta el 24 de Enero, la DGAC
						tomará los exámenes orales y practicos IFR en Provincia</p>
				</div>
				<div class="card-action">
					<a
						href="https://www.dgac.gob.cl/portalweb/rest-portalweb/jcr/repository/collaboration/sites%20content/live/dgac/documents/examenesProvincia.pdf">Ver
						link</a>
				</div>
			</div>
		</div>
		<div class="col s4">
			<div class="card">
				<div class="card-image">
					<img
						src="http://1.bp.blogspot.com/-a_Ik8wXWJwU/VSnlt1li5AI/AAAAAAAAEH4/xQ7YGHqVAXE/s1600/Wallpaper-Avion-Caza.jpg">
					<span class="card-title">Noticia 3</span>
				</div>
				<div class="card-content" height: 200px; overflow-x:hidden;">
					<p>Pagina Dirección General de Aeronáutica Civil  DGAC Chile</p>
				</div>
				<div class="card-action">
					<a href="https://www.dgac.gob.cl/portalweb/dgac/">Ver
						link</a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
