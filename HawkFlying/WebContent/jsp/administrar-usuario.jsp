<!DOCTYPE html>
<html>
<head>
  <title>Portafolio</title>
  <!-- Latest compiled and minified CSS -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script src="https://use.fontawesome.com/9def2d878d.js"></script>
	<meta charset="UTF-8">
	<!-- Compiled and minified CSS -->
 
  <!-- Compiled and minified JavaScript -->
  <spring:url value="/css/materialize.min.css" var="mainCss2" />
<link href="${mainCss2}" rel="stylesheet" />
  <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.7/js/materialize.min.js"></script>
  <link rel="stylesheet" type="text/css" href="css/style-intra-index.css">
  <link rel="stylesheet" type="text/css" href="css/admin-usuario.css">
</head>
<body>
	
  <div class="login-page">
    <div class="form">
      <form class="login-form">
        <input type="text" placeholder="Username"/>
        <input type="text" placeholder="Password"/>
        <input type="text" placeholder="Nombre"/>
        <input type="text" placeholder="Apellido"/>
        <input type="text" placeholder="Email"/>
        <input type="date" class="datepicker" placeholder="Fecha de nacimiento">
        <input type="rut" placeholder="Rut ej: 11111111-1">
        <button>Actualizar datos</button>
      </form>
    </div>
  </div>
  <script>
   $('.datepicker').pickadate({
    selectMonths: true, // Creates a dropdown to control month
    selectYears: 15 // Creates a dropdown of 15 years to control year
  });
        
  </script>
</body>
</html>
