<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<c:set var="req" value="${pageContext.request}" />
<c:set var="uri" value="${req.requestURI}" />
<c:set var="url">${req.requestURL}</c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="include.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script src="https://use.fontawesome.com/9def2d878d.js"></script>
	<meta charset="UTF-8">
	<!-- Compiled and minified CSS -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.7/css/materialize.min.css">
  <!-- Compiled and minified JavaScript -->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.7/js/materialize.min.js"></script>
  	<spring:url value="/css/style-intra-index.css" var="mainCss" />
	<link href="${mainCss}" rel="stylesheet" />
	  	<spring:url value="/css/perfil.css" var="perfilCss" />
	<link href="${perfilCss}" rel="stylesheet" />
</head>
<body>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<%@include file="MenuInclude.jsp"%>
  <div class="container-perfil">
    <h3> Datos </h3>
    <div class="row">
    <form class="col s12">
      <div class="row">
      
	        <div class="input-field col s6">
	          <input disabled  id="first_name" type="text" class="validate" value="<c:out value='${usuario.nombre}'> </c:out>">
	          <label for="first_name">Nombre</label>
	        </div>
	        <div class="input-field col s6">
	          <input disabled id="first_name" type="text" class="validate" value="<c:out value='${usuario.apellido}'> </c:out>">
	          <label for="first_name">Apellido</label>
	        </div>
        
      </div>
      <div class="row">
	      	<div class="input-field col s6">
	          <input disabled id="first_name" type="text" class="validate" value="<c:out value='${usuario.rut}'> </c:out>">
	          <label for="first_name">Rut</label>
	        </div>
      		<div class="input-field col s6">
	          <input disabled placeholder="Calle falsa 123" id="first_name" type="text" class="validate" value="<c:out value='${usuario.fechaNac}'> </c:out>">
	          <label for="first_name">fecha Nacimiento</label>
	        </div>
      </div>
      <div class="row">
      
	        <div class="input-field col s6">
	          <input disabled id="first_name" type="text" class="validate" value="<c:out value='${usuario.email}'> </c:out>" >
	          <label for="first_name">Email</label>
	        </div>
	        
      <div class="row">
	        <div class="input-field col s6">
	          <input disabled  id="first_name" type="text" class="validate" value="<c:out value='${usuario.licenciaPiloto}'> </c:out>">
	          <label for="first_name">Instructor a Cargo</label>
	        </div>
	        <div class="input-field col s6">
	          <input disabled id="first_name" type="text" class="validate" value="<c:out value='${usuario.tipoperfil}'> </c:out>">
	          <label for="first_name">Tipo Perfil</label>
	        </div>
      </div>
      </div>
    </form>
  </div>
  </div>
</body>
</html>