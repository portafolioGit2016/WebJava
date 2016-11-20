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
<link rel="stylesheet" type="text/css" href="css/alertas.css">

</head>
<body>
	<c:set var="contextPath" value="${pageContext.request.contextPath}" />
	<%@include file="MenuInclude.jsp"%>

	<div class="container">
		<h3>Mis Alertas</h3>
	</div>
	<div class="container-alertas">
		<c:choose>
			<c:when test="${fn:length(listaAlerta) gt 0}">

				<c:forEach var="alerta" items="${listaAlerta}" varStatus="status">
					<div class="notifBad">
						<div class="lateral-ad">
							<div class="show-icon">
								<i class="fa fa-thumbs-o-down fa-5x"></i>
							</div>
						</div>
						<div class="content-info">
							<h3>${alerta.mensaje}</h3>
						</div>
					</div>
				</c:forEach>
			</c:when>
			<c:otherwise>
				<div class="notif">
						<div class="lateral-ad">
							<div class="show-icon">
								<i class="fa fa-thumbs-o-up fa-5x"></i>
							</div>
						</div>
						<div class="content-info">
							<h3>No Existen Alertas Para Piloto </h3>
						</div>
					</div>
			</c:otherwise>
		</c:choose>
	</div>

</body>
</html>
