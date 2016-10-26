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
				<form:input id="nombre" name="nombre" path="nombre" placeholder="Ingrese Nombre "/><br>
			</div>
			<div class="form-input">
				<form:input id="apellido" name="apellido" path="apellido" placeholder="ingrese Apellido "/><br>
			</div>
			<div class="form-input">
				<form:input id="email" name="email" path="email" placeholder="ingrese email de usuario"/><br>
			</div>
			<div class="form-input">
				<form:input id="fecha_Nacimiento" name="fecha_Nacimiento" path="fecha_Nacimiento" placeholder="fech nac" /><br>
			</div>
			<div class="form-input">
				<form:input id="tipoPerfil" name="tipoPerfil" path="tipoPerfil" placeholder="seleccione tipo perfil"/><br>
			</div>
			<div class="form-input">
				<form:input id="licencia_piloto" name="licencia_piloto" path="licencia_piloto" placeholder="seleccione profe piloto"/><br>
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