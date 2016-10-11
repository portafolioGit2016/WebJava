<%@include file="include.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<c:set var="req" value="${pageContext.request}" />
<c:set var="uri" value="${req.requestURI}" />
<c:set var="url">${req.requestURL}</c:set>
<!DOCTYPE html>
<html>
<head>
  <title>Portafolio</title>
  <!-- Latest compiled and minified CSS -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<spring:url value="/css/style.css" var="mainCss" />
	<link href="${mainCss}" rel="stylesheet" />
	<script src="https://use.fontawesome.com/9def2d878d.js"></script>
	<meta charset="UTF-8">
</head>
<body>
	<div class="container">
		<i class="fa fa-plane fa-5x"></i>
		<form:form id="loginForm" method="post" action="login" modelAttribute="loginBean">
			<div class="form-input">
				<form:input id="username" name="username" path="username" placeholder="Nombre de usuario"/><br>
			</div>
			<div class="form-input">
				<form:password id="password" name="password" path="password" placeholder="Contraseña"/><br>
			</div>
			<input type="submit" name="submit" value="Iniciar sesión" class="btn-login">
			<br>
			<a href="#">¿Olvidaste tu contraseña?</a>
		</form:form>
	</div>
</body>
</html>
