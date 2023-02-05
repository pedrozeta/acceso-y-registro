package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBD {
	public static Connection getConnection() {
		String url = "jdbc:mysql://127.0.0.1:3306/usuarios";
		String username = "root";
		String password = "1221ppZ!";
		
		String driverName = "com.mysql.cj.jdbc.Driver";

		Connection con = null;
		try {
			Class.forName(driverName);
			con = DriverManager.getConnection(url,username,password);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	
	public static void main(String[] args) {
		Connection con = ConexionBD.getConnection();//f5
		if(con != null) {
			System.out.println("Conexion ok");
		}else {
			System.err.println("Conexion fail");
		}

       /*  try {
            con = getConnection();
            String consulta ="INSERT INTO lista_de_usuarios (nombre,apellido,mail,usuario,contrasena,categoria) VALUES ('Carlos','Reyes','creyes@mail.com','rey','123kkk','2')";
            PreparedStatement sentenciaPreparada = con.prepareStatement(consulta);
            int i = sentenciaPreparada.executeUpdate();

            if(i > 0){
                System.out.println("Se cargaron los datos.");
            }else{
                System.out.println("Se cargaron los datos.");
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace(); 
        }*/
	} 
}
