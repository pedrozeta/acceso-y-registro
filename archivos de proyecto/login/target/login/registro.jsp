<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="head.jsp" %>
        <%
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); //Borrar memoria cache
        response.setHeader("Pragma", "no-cache");
        response.setDateHeader("Expires", 0); 
        %>
    </head>
<body>
    <div class="contenedor">
        <div class="form">
            <h2>Crear cuenta</h2>
            <form id="user" action="#" method="post" action="CargaDeDatos">
                <input type="text" id="textoNombre" placeholder="Nombre" required name="textoNombre">
                <input type="text" id="textoApellido" placeholder="Apellido" required name="textoApellido">
                <input type="email" id="textoEmail" placeholder="Correo electrónico" required name="textoEmail">
                <input type="text" id="textoUsuario" placeholder="Usuario" required name="textoUsuario">
                <input type="text" id="textoContrasena" placeholder="Contraseña" required name="textoContrasena">
                <input type="submit" id="btnRegistro" value="Registrarse" disabled="">
            </form>
            <form class="btn" action="index.jsp">
                <input type="submit" value="Iniciar sesión">
        </form> 
        </div>
    </div>
</body>
</html>