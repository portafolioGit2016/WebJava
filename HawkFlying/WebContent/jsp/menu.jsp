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
  <div style="width: 90%; height: 300px; margin-left: 100px; margin-top: 10px;">
    <h2> Tomar hora de vuelo </h2>
    <a class="waves-effect waves-light btn modal-trigger" href="#modal1">Nuevo vuelo</a>

    <!-- Modal Structure -->
    <div id="modal1" class="modal">
      <div class="modal-content">
        <h4>Registro de un nuevo vuelo</h4>
        <div class="row">
          <form class="col s12">
            <div class="row">
              <div class="input-field col s12">
                <input type="text" placeholder="Numero vuelo"/>
                <label for="first_name">Numero vuelo</label>
              </div>
            </div>
            <div class="row">
              <div class="input-field col s12">
                <input type="text" placeholder="Condicion"/>
                <label for="password">Condicion</label>
              </div>
            </div>
            <div class="row">
              <div class="input-field col s12">
                <input type="text" placeholder="Total tv"/>
                <label for="email">Total tv</label>
              </div>
            </div>
            <div class="row">
              <div class="input-field col s12">
                <div class="input-field col s12">
                  <select class="browser-default">
                    <option value="" disabled selected>Seleccione origen</option>
                    <option value="Avion">Origen 1</option>
                    <option value="Helicoptero">Origen 2</option>
                    <option value="Helicoptero">Origen 3</option>
                    <option value="Helicoptero">Origen 4</option>
                  </select>
                </div>
              </div>
            </div>
            <div class="row">
              <div class="input-field col s12">
                <div class="input-field col s12">
                  <select class="browser-default">
                    <option value="" disabled selected>Seleccione destino</option>
                    <option value="Avion">Destino 1</option>
                    <option value="Helicoptero">Destino 2</option>
                    <option value="Helicoptero">Destino 3</option>
                    <option value="Helicoptero">Destino 4</option>
                  </select>
                </div>
              </div>
            </div>
            <div class="row">
              <div class="input-field col s12">
                <input type="date" class="datepicker" placeholder="Fecha">
                <label for="email">Fecha</label>
              </div>
            </div>
            <div class="row">
              <div class="input-field col s12">
                <input type="text" placeholder="Mision"/>
                <label for="email">Mision</label>
              </div>
            </div>
          </form>
        </div>
      </div>
      <div class="modal-footer">
        <a href="#!" class=" modal-action modal-close waves-effect waves-green btn-flat">Registrar vuelo</a>
      </div>
    </div>

    <!-- Modal Trigger -->
    <a class="waves-effect waves-light btn modal-trigger" href="#modal2">Ver tus proximos vuelos</a>

    <!-- Modal Structure -->
    <div id="modal2" class="modal bottom-sheet">
      <div class="modal-content">
        <h4>Tus proximos vuelos vuelos</h4>
        <p></p>
        <ul class="collection">
          <li class="collection-item avatar">
            <img src="http://obrerosenfoco.es/wp-content/uploads/2015/07/avion.png" class="circle">
            <span class="title"> Titulo </span>
            <p> Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
            tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
            quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
            consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
            cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
            proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
          </li>
        </ul>
        <ul class="collection">
          <li class="collection-item avatar">
            <img src="http://obrerosenfoco.es/wp-content/uploads/2015/07/avion.png" class="circle">
            <span class="title"> Titulo </span>
            <p> Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
            tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
            quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
            consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
            cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
            proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
          </li>
        </ul>
        <ul class="collection">
          <li class="collection-item avatar">
            <img src="http://obrerosenfoco.es/wp-content/uploads/2015/07/avion.png" class="circle">
            <span class="title"> Titulo </span>
            <p> Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
            tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
            quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
            consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
            cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
            proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
          </li>
        </ul>
        <ul class="collection">
          <li class="collection-item avatar">
            <img src="http://obrerosenfoco.es/wp-content/uploads/2015/07/avion.png" class="circle">
            <span class="title"> Titulo </span>
            <p> Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
            tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
            quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
            consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
            cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
            proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
          </li>
        </ul>
      </div>
      <div class="modal-footer">
        <a href="#!" class=" modal-action modal-close waves-effect waves-green btn-flat">Cerrar</a>
      </div>
    </div>


  </div>
  <script type="text/javascript">
    $(document).ready(function(){
      $('.modal-trigger').leanModal();
    });
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
