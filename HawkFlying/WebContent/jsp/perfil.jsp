<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<c:set var="req" value="${pageContext.request}" />
<c:set var="uri" value="${req.requestURI}" />
<c:set var="url">${req.requestURL}</c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="include.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://use.fontawesome.com/9def2d878d.js"></script>
<meta charset="UTF-8">
<!-- Compiled and minified CSS -->
<link rel="stylesheet"
	href="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap-theme.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.7/css/materialize.min.css">

<!-- Compiled and minified JavaScript -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.7/js/materialize.min.js"></script>
<spring:url value="/css/style-intra-index.css" var="mainCss" />
<link href="${mainCss}" rel="stylesheet" />
<spring:url value="/css/perfil.css" var="perfilCss" />
<link href="${perfilCss}" rel="stylesheet" />
</head>
<body>
	<c:set var="contextPath" value="${pageContext.request.contextPath}" />
	<%@include file="MenuInclude.jsp"%>
	<div class="container-perfil">
		<h3>Datos</h3>
		<div class="row">
			<form class="col s12">
				<div class="row">

					<div class="alert alert-info">
						<label for="first_name" class="text-info">Nombre</label> <input
							disabled id="first_name" type="text" class="text-info"
							value="<c:out value='${usuario.nombre}'> </c:out>">

					</div>
					<div class="alert alert-info">
						<label for="first_name" class="text-primary">Apellido</label> <input
							disabled id="first_name" type="text" class="validate"
							value="<c:out value='${usuario.apellido}'> </c:out>">

					</div>

				</div>
				<div class="row">
					<div class="alert alert-info">
						<label for="first_name" class="text-info">Rut</label> <input
							disabled id="first_name" type="text" class="validate"
							value="<c:out value='${usuario.rut}'> </c:out>">
					</div>
					<div class="alert alert-info">
						<label for="first_name" class="text-info">fecha Nacimiento</label>
						<input disabled id="first_name" type="text" class="validate"
							value="<c:out value='${usuario.fechaNac}'> </c:out>">
					</div>
				</div>
				<div class="row">

					<div class="alert alert-info">
						<label for="first_name" class="text-info">Email</label> <input disabled
							id="first_name" type="text" class="validate"
							value="<c:out value='${usuario.email}'> </c:out>">
					</div>

					<div class="row">
						<div class="alert alert-info">
							<label for="first_name" class="text-info">Instructor a
								Cargo</label> <input disabled id="first_name" type="text"
								class="validate"
								value="<c:out value='${usuarioPiloto.nombre }'> </c:out> <c:out value='${usuarioPiloto.apellido }'> </c:out>">

						</div>
						<div class="alert alert-info">
							<label for="first_name" class="text-info">Tipo Perfil</label> <input
								disabled id="first_name" type="text" class="validate"
								value="<c:out value='${perfil.perfil}'> </c:out>">

						</div>
					</div>
				</div>
			</form>
		</div>
	</div>
</body>
</html>