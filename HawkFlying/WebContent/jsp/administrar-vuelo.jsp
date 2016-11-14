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
	 <div style="width: 90%; height: 300px; margin-left: 100px; margin-top: 10px;">
	    <h2> Menu de vuelo </h2>
	    <a class="waves-effect waves-light btn modal-trigger" href="#modal1">Nuevo Vuelo</a>
	
	    <!-- Modal Structure -->
	    <div id="modal1" class="modal">
	      <div class="modal-content">
	        <h4>Crear nuevo vuelo</h4>
	        <div class="row">
	          <form:form class="col s12" method="post" action="createVuelo"
			modelAttribute="vueloBean">
	            <div class="row">
	              <div class="input-field col s12">
	                <form:input type="text" path="nro_vuelo" placeholder="Numero vuelo"/>
	                <label for="first_name">Numero vuelo</label>
	              </div>
	            </div>
	            <div class="row">
	              <div class="input-field col s12">
	                <form:input type="text" path="condicion" placeholder="Condicion"/>
	                <label for="condicion">Condicion De Vuelo (IFR o VFR)</label>
	              </div>
	            </div>
	            <div class="row">
	              <div class="input-field col s12">
	                <input type="text" path="total_tv" placeholder="Total tv"/>
	                <label for="totaltv">Total Tiempo de Vuelo</label>
	              </div>
	            </div>
	            <div class="row">
	              <div class="input-field col s12">
	                <div class="input-field col s12">
	                  <form:select id="origen" path="origen"
						style="display:block!important">
						<form:option value="" label="--- Seleccione Origen ---" />
						<form:options items="${listaAerodromos}" itemValue="idAerodromo"
							itemLabel="nombre" />

					</form:select>
	                </div>
	              </div>
	            </div>
	            <div class="row">
	              <div class="input-field col s12">
	                <div class="input-field col s12">
	                  <form:select id="destino" path="destino"
						style="display:block!important">
						<form:option value="" label="--- Seleccione Destino ---" />
						<form:options items="${listaAerodromos}" itemValue="idAerodromo"
							itemLabel="nombre" />

					</form:select>
	                </div>
	              </div>
	            </div>
	            <div class="row">
	              <div class="input-field col s12">
	                <input type="date" class="datepicker" path="fecha" placeholder="Fecha">
	                <label for="fecha">Fecha Vuelo</label>
	              </div>
	            </div>
	            <div class="row">
	              <div class="input-field col s12">
	                <input type="text" placeholder="Mision"/>
	                <label for="email">Mision</label>
	              </div>
	            </div>
	          </form:form>
	        </div>
	      </div>
	      <div class="modal-footer">
				<button type="submit"
					class=" modal-action modal-close waves-effect waves-green btn-flat">Crear vuelo</button>
		  </div>
	    </div>


	<script type="text/javascript">
    $(document).ready(function(){
      $('.modal-trigger').leanModal();
    });
      </script>
</body>
</html>