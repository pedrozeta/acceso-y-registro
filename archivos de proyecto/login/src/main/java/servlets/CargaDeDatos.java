package servlets;

import conexion.MetodosSQL;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CargaDeDatos extends HttpServlet {
        /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        MetodosSQL metodos = new MetodosSQL();
        String textoNombre = request.getParameter("textoNombre");
        String textoApellido = request.getParameter("textoApellido");
        String textoEmail = request.getParameter("textoEmail");
        String textoUsuario = request.getParameter("textoUsuario");
        String textoContrasena = request.getParameter("textoContrasena");

        boolean registro = metodos.registrarUsuario(textoNombre, textoApellido, textoEmail, textoUsuario, textoContrasena, 2);




            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<body>");
            out.println("<script type=\"text/javascript\">");
            if(registro == true){
                out.println("alert('  El registro se ha completado correctamente.')");
                out.println("location='index.jsp'");
            }else{
                out.println("alert('  No se ha completado el registro.')"); 
                out.println("location='index.jsp'");
            }
            System.out.println("El valor de registro en SERVLET es: " + registro);
                
            out.println("</script>");
            out.println("</body>");
            out.println("</html>");
            }
}
