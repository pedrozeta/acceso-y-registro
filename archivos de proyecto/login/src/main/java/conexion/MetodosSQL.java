package conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class MetodosSQL {
    private Connection conexion;
    private PreparedStatement sentencia;

    public boolean registrarUsuario(String nombre, String apellido, String mail, String usuario, String contrasena, int categoria) {
        boolean registro = false;

        try {
            conexion = ConexionBD.getConnection();
            String consulta = "INSERT INTO lista_de_usuarios (nombre,apellido,mail,usuario,contrasena,categoria) VALUES(?,?,?,?,?,'2')";
            sentencia = conexion.prepareStatement(consulta);
            sentencia.setString(1,nombre);
            sentencia.setString(2,apellido);
            sentencia.setString(3,mail);
            sentencia.setString(4,usuario);
            sentencia.setString(5,contrasena);
            sentencia.setLong(6,categoria);

            int resultadoRegistrar = sentencia.executeUpdate();

            if(resultadoRegistrar > 0){
                registro = true;
                System.out.println("  Usuario registrado correctamente.");
            }else{
                registro = false;
                System.out.println("  El registro no se completó.");   
            }

            conexion.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("  Valor del registro: " + registro);
        return registro;
    }

}