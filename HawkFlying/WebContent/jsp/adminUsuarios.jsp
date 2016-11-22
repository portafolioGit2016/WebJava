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
	<div class="create-new-user-link"
		style="float: right; margin-top: 10px; margin-bottom: 10px; margin-right: 10px;">

		<a class="waves-effect waves-light btn modal-trigger" href="#modal2">Crear
			Usuario</a>
	</div>
	<div class="container-alumnos">
		<table>
			<thead>
				<tr>
					<th data-field="id">Usuario</th>
					<th data-field="name">Nombre</th>
					<th data-field="price">Apellido</th>
					<th data-field="price">Email</th>
					<th data-field="price">Fecha nacimiento</th>
					<th data-field="price">Rut</th>
					<th data-field="price">Editar</th>
					<th data-field="price">Eliminar</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach var="usuario" items="${listaUsuarios}" varStatus="status">
					<tr>
						<td>${usuario.username}</td>
						<td>${usuario.nombre}</td>
						<td>${usuario.apellido}</td>
						<td>${usuario.email}</td>
						<td>${usuario.fechaNac}</td>
						<td>${usuario.rut}</td>
						<td><a rel="updateUsuario"
							onclick="updateUser(${usuario.idUsuario})"
							class="btn-floating waves-effect waves-light red btn tooltipped"
							data-position="left" data-delay="50" data-tooltip="Editar"><i
								class="fa fa-pencil fa-2x"></i></a></td>
						<td><a
							href="${contextPath}/deleteUser?id=${usuario.idUsuario}"
							class="btn-floating waves-effect waves-light red btn tooltipped modal-trigger"
							data-position="left" data-delay="50" data-tooltip="Eliminar"><i
								class="fa fa-trash fa-2x"></i></a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<div id="modal1" class="newModal">
		<form:form id="formUpdate" class="col s12" method="post"
			action="updateUser" modelAttribute="registroBean">
			<div class="new-modal-content">
				<h4>Editar Usuario</h4>
				<div class="row">
					<form:hidden id="idUser" path="id" />
					<label for="username">USERNAME</label>
					<form:input type="text" id="usernameUpd" path="username"
						placeholder="Username" />
					<label for="first_name">PASSWORD</label>
					<form:password id="passwordUpd" path="password"
						placeholder="Password" />
					<label for="first_name">NOMBRE</label>
					<form:input id="nombreUpd" type="text" path="nombre"
						placeholder="Nombre" />
					<label for="first_name">APELLIDO</label>
					<form:input id="apellidoUpd" type="text" path="apellido"
						placeholder="Apellido" />
					<label for="first_name">EMAIL</label>
					<form:input id="emailUpd" type="text" path="email"
						placeholder="Email" />
					<label for="first_name">FECHA DE NACIMIENTO</label>
					<form:input id="fecNacUpd" type="text" path="fecha_Nacimiento"
						placeholder="Fecha de nacimiento" />
					<label for="first_name">SELECCIONE PERFIL</label>
					<form:select id="tipoPerfilUpd" path="tipoPerfil"
						style="display:block!important">
						<form:option value="" label="--- Seleccione Perfil ---" />
						<form:options items="${listaPerfiles}" itemValue="idPerfil"
							itemLabel="perfil" />

					</form:select>
					<label for="first_name">SELECCIONE INSTRUCTOR</label>
					<form:select id="licenciaUpd" path="licencia_piloto"
						style="display:block!important">
						<form:option value="" label="--- Seleccione Piloto ---" />
						<form:options items="${listaPilotos}" itemValue="idPiloto"
							itemLabel="usuarioVO.nombre" />

					</form:select>
					<label for="first_name">RUT</label>
					<form:input id="rutUpd" type="text" path="rut"
						placeholder="Rut a valido, ej: 11111111-1" />
				</div>
				<div>
					<button type="button" onclick="validaUpd();">Actualizar</button>
				</div>
			</div>
		</form:form>
	</div>

	<div id="modal2" class="modal">
		<form:form id="formCrear" class="col s12" method="post"
			action="adminUsuarios" modelAttribute="registroBean">
			<div class="modal-content">
				<h4>Crear usuario</h4>
				<div class="row">
					<form:input type="text" path="username" placeholder="Username" />
					<form:password path="password" placeholder="Password" />
					<form:input type="text" path="nombre" placeholder="Nombre" />
					<form:input type="text" path="apellido" placeholder="Apellido" />
					<form:input type="text" path="email" id="email" placeholder="Email" />
					<form:input type="text" id="fecNacCreate" path="fecha_Nacimiento"
						placeholder="Fecha de nacimiento" />
					<form:select id="perfilCreate" path="tipoPerfil"
						style="display:block!important" onchange="validateTipoPerfil();">
						<form:option value="" label="--- Seleccione Perfil ---" />
						<form:options items="${listaPerfiles}" itemValue="idPerfil"
							itemLabel="perfil" />

					</form:select>
					<form:input type="text" id="fecVencMae" path="fecVencMae"
						placeholder="Fecha Vencimiento MAE" />
					<form:select path="licencia_piloto" style="display:block!important">
						<form:option value="" label="--- Seleccione Piloto ---" />
						<form:options items="${listaPilotos}" itemValue="idPiloto"
							itemLabel="usuarioVO.nombre" />

					</form:select>

					<form:input type="text" path="rut" id="rut"
						placeholder="Rut ej: 11111111-1" />

				</div>
			</div>

			<div class="modal-footer">
				<button type="button" onclick="validaCrear();"
					class=" modal-action waves-effect waves-green btn-flat">Crear</button>
			</div>
		</form:form>
	</div>

	<script type="text/javascript">
    $(document).ready(function(){
      $('.modal-trigger').leanModal();
      $( "#fecNacUpd" ).datepicker({
		  dateFormat: "yy-mm-dd"
		});
	$( "#fecNacCreate" ).datepicker({
		  dateFormat: "yy-mm-dd"
		});
	$( "#fecVencMae" ).datepicker({
		  dateFormat: "yy-mm-dd"
		});
	$("#fecVencMae").prop('disabled', true);
  });
    function validateTipoPerfil(){
    	var conceptVal = $("#perfilCreate option:selected").val();
    	if (conceptVal=="2" || conceptVal=="5"|| conceptVal=="6"){
    		$("#fecVencMae").prop('disabled', false);
    		$("#fecVencMae").attr('required', 'required');
    	}else{
    		$("#fecVencMae").prop('disabled', true);
    		$("#fecVencMae").removeAttr('required');
    	}
    }
    function updateUser(id){
    	$.getJSON("${contextPath}/getUser", { "id": id }, function(registro) {
			document.getElementById("idUser").value=registro.id;
			document.getElementById("usernameUpd").value=registro.username;
			document.getElementById("passwordUpd").value=registro.password;
			document.getElementById("nombreUpd").value=registro.nombre;
			document.getElementById("apellidoUpd").value=registro.apellido;
			document.getElementById("emailUpd").value=registro.email;
			document.getElementById("fecNacUpd").value=registro.fecha_Nacimiento;
			document.getElementById("tipoPerfilUpd").value=registro.tipoPerfil;
			document.getElementById("licenciaUpd").value=registro.licencia_piloto;
			document.getElementById("rutUpd").value=registro.rut;
    		$("#modal1").modal('show');
    	});
    }
    
    var Fn = {
    		// Valida el rut con su cadena completa "XXXXXXXX-X"
    		validaRut : function (rutCompleto) {
    			if (!/^[0-9]+-[0-9kK]{1}$/.test( rutCompleto ))
    				return false;
    			var tmp 	= rutCompleto.split('-');
    			var digv	= tmp[1]; 
    			var rut 	= tmp[0];
    			if ( digv == 'K' ) digv = 'k' ;
    			return (Fn.dv(rut) == digv );
    		},
    		dv : function(T){
    			var M=0,S=1;
    			for(;T;T=Math.floor(T/10))
    				S=(S+T%10*(9-M++%6))%11;
    			return S?S-1:'k';
    		}
    	}
		function validaUpd(){
    	if(!Fn.validaRut(document.getElementById("rutUpd").value)){
    		alert('Ingrese rut valido');	
    	}
    	else
    		{
	    		if (!validateEmail(document.getElementById("emailUpd").value)){
	    			alert('Ingrese Email valido');
	    		}
	    		else
		    		{
		    			document.getElementById("formUpdate").submit();
		    		}
    		}
    }
    
    function validaCrear(){
    	var conceptVal = $("#perfilCreate option:selected").val();
    	
    	if(!Fn.validaRut(document.getElementById("rut").value)){
    		alert('Ingrese rut valido');
    	}
    	else
    		{
    		if (!validateEmail(document.getElementById("email").value)){
    			alert('Ingrese Email valido');
    		}
    		else
    			{
    			if (conceptVal=="2" || conceptVal=="5"|| conceptVal=="6"){
    	    		if (document.getElementById("fecVencMae").value==""){
    	    			alert("Debe ingresar fecha Vencimiento MAE");
    	    		}else{
    	    			document.getElementById("formCrear").submit();
        	    	}
    	    	}else{
    			document.getElementById("formCrear").submit();
    	    	}
    			}
    		
    		}
    }
    function validateEmail(email) {
        var re = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
        return re.test(email);
    }
</script>
</body>
</html>
