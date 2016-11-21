<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav>
    <div class="nav-wrapper">
      <a href="${contextPath}/welcome" class="brand-logo"><i class="fa fa-plane fa-2x"></i></a>
      <ul id="nav-mobile" class="right hide-on-med-and-down">
		<c:if test="${sessionScope.usuarioLogeado.tipoPerfil=='1'}">
       	 <li><a href="${contextPath}/adminUsuarios">Usuarios</a></li>
        </c:if>
        
      </ul>
    </div>
  </nav>
  <nav class="main-menu">
    <ul>
      <li class="has-subnav">
        <a href="${contextPath}/verPerfil">
          <i class="fa fa-child fa-2x"></i>
          <span class="nav-text">
            Ver perfil
          </span>
        </a>
      </li>
      <li class="has-subnav">
        <a href="${contextPath}/verPerfil">
          <i class="fa fa-child fa-2x"></i>
          <span class="nav-text">
            Ver perfil
          </span>
        </a>
      </li>
      <c:if test="${sessionScope.usuarioLogeado.tipoPerfil=='2' || sessionScope.usuarioLogeado.tipoPerfil=='5'}">
      <li class="has-subnav">
        <a href="${contextPath}/administrar-vuelo">
          <i class="fa fa-plane fa-2x"></i>
          <span class="nav-text">
            Menú de vuelo
          </span>
        </a>
      </li>
    
      <li class="has-subnav">
          <a href="${contextPath}/consultaAeronavesDisponibles">
            <i class="fa fa-fighter-jet fa-2x"></i>
            <span class="nav-text">
             Aeronaves disponibles
            </span>
          </a>
      </li>
      <li>
        <a href="${contextPath}/misAlertas">
          <i class="fa fa-exclamation-triangle fa-2x"></i>
          <span class="nav-text">
            Alertas
          </span>
        </a>
      </li>
      <li>
        <a href="${contextPath}/ConsultaHrsVuelo">
          <i class="fa fa-book fa-2x"></i>
          <span class="nav-text">
            Consultar Hrs Vuelo
          </span>
        </a>
      </li>
      <li>
        <a href="${contextPath}/consultaPlanMantenimiento">
          <i class="fa fa-users fa-2x"></i>
          <span class="nav-text">
            Consultar Mantenimiento
          </span>
        </a>
      </li>
      <li>
        <a href="${contextPath}/misAlumnos">
          <i class="fa fa-user-plus fa-2x"></i>
          <span class="nav-text">
            Mis alumnos
          </span>
        </a>
      </li>
    </c:if>
    </ul>
    <ul class="logout">
      <li>
       <a href="${contextPath}/logout">
          <i class="fa fa-power-off fa-2x"></i>
          <span class="nav-text">
            Desconectarse
          </span>
        </a>
      </li>
    </ul>
  </nav>