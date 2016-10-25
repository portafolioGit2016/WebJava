<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administración de Usuarios</title>
    </head>

    <body>
        <c:set var="contextPath" value="${pageContext.request.contextPath}"/>
        <div align="center">
            <h1>Usuarios</h1>
            <h3><a href="${contextPath}/register">Crear Usuario</a></h3>
            <table border="1">
                <th>Usuario</th>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Email</th>
                <th>Fecha Nacimiento</th>
                <th>Rut</th>
                <th>Accion</th>
                 
                <c:forEach var="usuario" items="${listaUsuarios}" varStatus="status">
                <tr>
                    <td>${usuario.username}</td>
                    <td>${usuario.nombre}</td>
                    <td>${usuario.apellido}</td>
                    <td>${usuario.email}</td>
                    <td>${usuario.fechaNac}</td>
                    <td>${usuario.rut}</td>
                    <td>
                        <a href="${contextPath}/editUser?id=${usuario.idUsuario}">Edit</a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="${contextPath}/deleteUser?id=${usuario.idUsuario}">Delete</a>
                    </td>
                             
                </tr>
                </c:forEach>             
            </table>
        </div>
    </body>
</html>