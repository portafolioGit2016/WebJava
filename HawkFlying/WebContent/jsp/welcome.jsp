<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
  <title>Welcome ${loggedInUser}</title>
  <!-- Latest compiled and minified CSS -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script src="https://use.fontawesome.com/9def2d878d.js"></script>
	<meta charset="UTF-8">
	<!-- Compiled and minified CSS -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.7/css/materialize.min.css">
  <!-- Compiled and minified JavaScript -->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.7/js/materialize.min.js"></script>
  	<spring:url value="/css/style-intra-index.css" var="mainCss" />
	<link href="${mainCss}" rel="stylesheet" />
</head>
<body>
	<nav>
    <div class="nav-wrapper">
      <a href="index-intra.html" class="brand-logo"><i class="fa fa-plane fa-2x"></i></a>
      <ul id="nav-mobile" class="right hide-on-med-and-down">
        <li><a href="${contextPath}/adminUsuarios">Usuarios</a></li>
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
          <a href="#">
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
  <div class="row" style="margin-left: 60px; margin-top: 50px;">
    <div class="col s4">
      <div class="card">
        <div class="card-image">
          <img src="http://www.aerotendencias.com/wp-content/uploads/2016/10/european_edificio.jpg">
          <span class="card-title">Noticia 1</span>
        </div>
        <div class="card-content" style="overflow: scroll; height: 200px; overflow-x: hidden;">
          <p>El consejo de administración de Aena, dentro de su plan de calidad de servicio, ha aprobado en su ultima reunión inversiones para el campo de vuelo del Aeropuerto de Tenerife Sur por importe de 37,5 millones de euros.</p>
        </div>
        <div class="card-action">
          <a href="#">Este es un link</a>
        </div>
      </div>
    </div>
    <div class="col s4">
      <div class="card">
        <div class="card-image">
          <img src="http://www.aerotendencias.com/wp-content/uploads/2016/10/european_edificio.jpg">
          <span class="card-title">Noticia 2</span>
        </div>
        <div class="card-content" style="overflow: scroll; height: 200px; overflow-x: hidden;">
          <p>Boeing ha entregado durante el tercer trimestre de 2016 un total de 188 aviones. En el conjunto del año son 563.</p>
        </div>
        <div class="card-action">
          <a href="#">Este es un link</a>
        </div>
      </div>
    </div>
    <div class="col s4">
      <div class="card">
        <div class="card-image">
          <img src="http://www.aerotendencias.com/wp-content/uploads/2016/10/european_edificio.jpg">
          <span class="card-title">Noticia 3</span>
        </div>
        <div class="card-content" style="overflow: scroll; height: 200px; overflow-x: hidden;">
          <p>La Escuela de Pilotos European Flyers, con una tradición de más de 25 años en la formación de pilotos, es miembro de IAAPS (International Association of Aviation Personnel Schools), asociación que engloba a diferentes organizaciones dedicadas a la formación de pilotos de avión.</p>
        </div>
        <div class="card-action">
          <a href="#">Este es un link</a>
        </div>
      </div>
    </div>
  </div>
</body>
</html>
