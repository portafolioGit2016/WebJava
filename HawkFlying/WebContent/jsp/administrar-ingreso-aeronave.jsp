<!DOCTYPE html>
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
  <link rel="stylesheet" type="text/css" href="css/admin-usuario.css">
  <link rel="stylesheet" type="text/css" href="css/admin-ingreso-aeronave.css">
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
  <div class="container-administracion">
    <div class="login-page">
      <h2>Ingreso de una nueva aeronave</h2>
      <div class="form">
        <form class="login-form">
          <div class="input-field col s12">
            <select class="browser-default">
              <option value="" disabled selected>Tipo aeronave</option>
              <option value="Avion">Avion</option>
              <option value="Helicoptero">Helicoptero</option>
            </select>
          </div>
          <br>
          <input type="text" placeholder="Matricula"/>
          <input type="text" placeholder="Cantidad de horas"/>
          <input type="date" class="datepicker" placeholder="Fecha de inspeccion">
          <input type="text" placeholder="Año fabricacion"/>
          <input type="date" class="datepicker" placeholder="Fecha DGAC">
          <input type="text" placeholder="Tipo modelo"/>
          <input type="text" placeholder="Capacidad"/>
          <input type="text" placeholder="HR AUTONOMIA"/>
          <input type="text" placeholder="Marca"/>
          <input type="text" placeholder="Estado"/>
          <input type="date" class="datepicker" placeholder="Fecha de vencimiento">
          <input type="text" placeholder="ID Aerodromo"/>
          <input type="text" placeholder="Estructura id"/>
          <button>Ingresar aeronave</button>
        </form>
      </div>
    </div>
  </div>
  <script>
   $('.datepicker').pickadate({
    selectMonths: true, // Creates a dropdown to control month
    selectYears: 15 // Creates a dropdown of 15 years to control year
   });
   $(document).ready(function() {
    $('select').material_select();
   });
        
  </script>
</body>
</html>
