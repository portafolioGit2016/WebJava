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
	<%@include file="MenuInclude.jsp"%>
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
