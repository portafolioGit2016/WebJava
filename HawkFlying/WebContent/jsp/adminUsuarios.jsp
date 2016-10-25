<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	<nav>
    <div class="nav-wrapper">
      <a href="index-intra.html" class="brand-logo"><i class="fa fa-plane fa-2x"></i></a>
      <ul id="nav-mobile" class="right hide-on-med-and-down">
        <li><a href="sass.html">Opción 1</a></li>
        <li><a href="badges.html">Opción 2</a></li>
        <li><a href="collapsible.html">Opción 3</a></li>
      </ul>
    </div>
  </nav>
  <nav class="main-menu">
    <ul>
      <li>
        <a href="#">
          <i class="fa fa-home fa-2x"></i>
          <span class="nav-text">
            Ver perfil
          </span>
        </a>
      </li>
      <li class="has-subnav">
        <a href="perfil.html">
          <i class="fa fa-child fa-2x"></i>
          <span class="nav-text">
            Ver perfil
          </span>
        </a>
      </li>
      <li class="has-subnav">
        <a href="menu.html">
          <i class="fa fa-plane fa-2x"></i>
          <span class="nav-text">
            Menú de vuelo
          </span>
        </a>
      </li>
      <li class="has-subnav">
          <a href="menu-aeronave.html">
            <i class="fa fa-fighter-jet fa-2x"></i>
            <span class="nav-text">
              Menú de aeronaves
            </span>
          </a>
      </li>
      <li>
        <a href="alertas.html">
          <i class="fa fa-exclamation-triangle fa-2x"></i>
          <span class="nav-text">
            Alertas
          </span>
        </a>
      </li>
      <li>
        <a href="#">
          <i class="fa fa-book fa-2x"></i>
          <span class="nav-text">
            Historial personal
          </span>
        </a>
      </li>
      <li>
        <a href="general.html">
          <i class="fa fa-users fa-2x"></i>
          <span class="nav-text">
            Registros generales
          </span>
        </a>
      </li>
      <li>
        <a href="alumnos.html">
          <i class="fa fa-user-plus fa-2x"></i>
          <span class="nav-text">
            Mis alumnos
          </span>
        </a>
      </li>
    </ul>
    <ul class="logout">
      <li>
       <a href="#">
          <i class="fa fa-power-off fa-2x"></i>
          <span class="nav-text">
            Desconectarse
          </span>
        </a>
      </li>
    </ul>
  </nav>
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
    <form class="col s12">
      <div class="modal-content">
        <h4>Crear usuario</h4>
        <div class="row">
            <input type="text" placeholder="Username"/>
        	<input type="password" placeholder="Password"/>
        	<input type="text" placeholder="Nombre"/>
        	<input type="text" placeholder="Apellido"/>
        	<input type="text" placeholder="Email"/>
        	<input type="date" class="datepicker" placeholder="Fecha de nacimiento">
        </div>
      </div>
      <div class="modal-footer">
      	<button type="submit" class=" modal-action modal-close waves-effect waves-green btn-flat">Crear</button>
      </div>
     </form>
    </div>

<script type="text/javascript">
    $(document).ready(function(){
      $('.modal-trigger').leanModal();
    });
</script>
</body>
</html>
