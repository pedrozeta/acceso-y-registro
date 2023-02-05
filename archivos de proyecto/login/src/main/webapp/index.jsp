<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="head.jsp" %>
        
<!--    <%response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); //Borrar memoria cache
        response.setHeader("Pragma", "no-cache");
        response.setDateHeader("Expires", 0); 
        %> -->
    </head> 
<body>
    <div class="contenedor">
        <div class="form">
            <h2>Iniciar sesión</h2>
            <form id="login" action="#">
                <input type="text" id="datoUsuario" placeholder="Usuario" required>
                <input type="password" id="datoContrasena" placeholder="Contraseña" required>
                <input type="submit" id="btnInicioSesion" value="Iniciar sesión">
            </form>               
            <form class="btn" action="registro.jsp">
                <input type="submit" value="Crear una cuenta">
        </form> 
            <div class="reset-contrasena">
                <a href="#">Olvidé mi contraseña</a>
            </div>
        </div>
    </div>
</body>
</html>
