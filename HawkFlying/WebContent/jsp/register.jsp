<%@include file="include.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro de Usuario</title>
</head>
<body>
	<div class="container">
		<i class="fa fa-plane fa-5x"></i>
		<form:form id="registroForm" method="post" action="register" modelAttribute="registroBean">
			<div class="form-input">
				<form:input id="username" name="username" path="username" placeholder="Nombre de usuario"/><br>
			</div>
			<div class="form-input">
				<form:password id="password" name="password" path="password" placeholder="Contraseña"/><br>
			</div>
			<div class="form-input">
				<form:input id="nombre" name="nombre" path="nombre" placeholder="Nombre de usuario"/><br>
			</div>
			<div class="form-input">
				<form:input id="apelllido" name="apelllido" path="apelllido" placeholder="Apellido de usuario"/><br>
			</div>
			<div class="form-input">
				<form:input id="email" name="email" path="email" placeholder="ingrese email de usuario"/><br>
			</div>
			<div class="form-input">
				<form:input id="fechaNacimiento" name="fechaNacimiento" path="fechaNacimiento" /><br>
			</div>
			<div class="form-input">
				<form:input id="rut" name="rut" path="rut" placeholder="ingrese rut de usuario"/><br>
			</div>
			<input type="submit" name="submit" value="Crear Usuario" class="btn-login">
			<br>
			<span>${message}</span><br>
			
		</form:form>
	</div>
</body>
</html>