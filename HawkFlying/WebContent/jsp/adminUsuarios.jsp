<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="include.jsp"%>
<html>
<head>
  <title>Portafolio</title>
  <!-- Latest compiled and minified CSS -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script src="https://use.fontawesome.com/9def2d878d.js"></script>
	<meta charset="UTF-8">
	<!-- Compiled and minified CSS -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.7/css/materialize.min.css">
  <!-- Compiled and minified JavaScript -->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.7/js/materialize.min.js"></script>
  <link rel="stylesheet" type="text/css" href="css/style-intra-index.css">
  <link rel="stylesheet" type="text/css" href="css/alumnos.css">
</head>
<body>
	<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
	<%@include file="MenuInclude.jsp" %>
  <div class="center"><span>${message}</span><br></div>
  <div class="create-new-user-link" style="float:right;margin-top:10px;margin-bottom:10px;margin-right:10px;">
  	
  	<a class="waves-effect waves-light btn modal-trigger" href="#modal2">Crear Usuario</a>
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
            <td><a href="${contextPath}/editUser?id=${usuario.idUsuario}" class="btn-floating waves-effect waves-light red btn tooltipped modal-trigger" href="#modal1" data-position="left" data-delay="50" data-tooltip="Editar"><i class="fa fa-pencil fa-2x"></i></a></td>
          	<td><a href="${contextPath}/deleteUser?id=${usuario.idUsuario}" class="btn-floating waves-effect waves-light red btn tooltipped modal-trigger" data-position="left" data-delay="50" data-tooltip="Eliminar"><i class="fa fa-trash fa-2x"></i></a></td>
          </tr>
          </c:forEach>
        </tbody>
      </table>
  </div>
  <div id="modal1" class="modal">
      <div class="modal-content">
        <h4>Información del usuario</h4>
        <div class="row">
          <form class="col s12">
            <div class="row">
              
            </div>
            <div class="row">
              
            </div>
            <div class="row">
              
            </div>
          </form>
        </div>
      </div>
      <div class="modal-footer">
        <a href="#!" class=" modal-action modal-close waves-effect waves-green btn-flat">Cerrar</a>
      </div>
    </div>
    <div id="modal2" class="modal">
    <form:form class="col s12" method="post" action="adminUsuarios" modelAttribute="registroBean">
      <div class="modal-content">
        <h4>Crear usuario</h4>
        <div class="row">
            <form:input type="text" path="username" placeholder="Username"/>
        	<form:password  path="password" placeholder="Password"/>
        	<form:input type="text" path="nombre" placeholder="Nombre"/>
        	<form:input type="text" path="apellido" placeholder="Apellido"/>
        	<form:input type="text" path="email" placeholder="Email"/>
        	<form:input type="date" path="fecha_Nacimiento" class="datepicker" placeholder="Fecha de nacimiento" />
        	<form:input type="text" path="rut" placeholder="rut"/>
        </div>
      </div>
      <div class="modal-footer">
      	<button type="submit" class=" modal-action modal-close waves-effect waves-green btn-flat">Crear</button>
      </div>
     </form:form>
    </div>

<script type="text/javascript">
    $(document).ready(function(){
      $('.modal-trigger').leanModal();
    });
</script>
</body>
</html>
