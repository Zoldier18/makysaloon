/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC_controlJuez;

import MVC_clases.Clase_juez;
import MVC_conexion.Acceso_juez;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lucero
 */
@WebServlet(name = "Mod_juez", urlPatterns = {"/Mod_juez"})
public class Mod_juez extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            Integer a = Integer.parseInt(request.getParameter("id"));
            // String a = request.getParameter("id");
            Acceso_juez oad = new Acceso_juez();
            Clase_juez valor= new Clase_juez();
            ResultSet x=oad.Mostrar_Juez(a);
                if(x==null){
                    request.getRequestDispatcher("/Vista_Error.jsp").forward(request, response);
                }
                else{
                    while(x.next()){
                    valor.setCodigo(x.getInt(1));
                    valor.setNombre(x.getString(2));
                    valor.setApellido(x.getString(3));
                    valor.setNacionalidad(x.getString(4));
                    valor.setFecha_nac(x.getString(5));
                    }
                    
                    request.getSession().setAttribute("valor", valor);
                    getServletContext().getRequestDispatcher("/JUEZ/M_juez.jsp").forward(request, response);
                }
            }catch (Exception ex){
                System.out.println(ex.getMessage());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
