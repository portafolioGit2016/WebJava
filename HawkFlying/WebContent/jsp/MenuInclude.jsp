<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav>
    <div class="nav-wrapper">
      <a href="${contextPath}/welcome" class="brand-logo"><i class="fa fa-plane fa-2x"></i></a>
      <ul id="nav-mobile" class="right hide-on-med-and-down">
		<c:if test="${sessionScope.usuarioLogeado.tipoPerfil=='1'}">
       	 <li><a href="${contextPath}/adminUsuarios">Usuarios</a></li>
        </c:if>
        <li><a href="badges.html">Opción 2</a></li>
        <li><a href="collapsible.html">Opción 3</a></li>
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
      </c:if>
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
        <a href="${contextPath}/consultaPlanMantenimiento">
          <i class="fa fa-users fa-2x"></i>
          <span class="nav-text">
            Consultar Mantenimiento
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