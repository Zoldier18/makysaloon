/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC_conexion;

import MVC_clases.Clase_partido;
import java.sql.*;

/**
 *
 * @author Lucero
 */
public class Acceso_partido {
    public void Registrar_Juez(Clase_partido ocj) throws ClassNotFoundException, SQLException{
        String cadena;
        Statement st/*= null*/;
        Conexion oc = new Conexion();
        st=oc.getCnn().createStatement();
        cadena = "insert into partido (`fechaEncuentro`, `horaInicio`, `Campeonato_idCampeonato`, `Estadio_idEstadio`)"
                + " values ('"+ocj.getFecha()+"','"+ocj.getHora()+"','"
                +ocj.getCampeonto()+"','"+ocj.getEstadio()+"')";
        st.executeUpdate(cadena);
    }
    
    public ResultSet Listar_partido() throws ClassNotFoundException, SQLException
    {
        Statement st;
        ResultSet rs=null;
        Conexion oc = new Conexion();
        try
        {
        st = oc.getCnn().createStatement();
        String x ="SELECT `partido`.`idPartido`, `partido`.`fechaEncuentro`, `partido`.`horaInicio`, `estadio`.`nombreEstadio`, `campeonato`.`nombreCampeonato` " +
        "FROM `partido` " +
        "LEFT JOIN `campeonato` ON `partido`.`Campeonato_idCampeonato` = `campeonato`.`idCampeonato` " +
        "LEFT JOIN `estadio` ON `partido`.`Estadio_idEstadio` = `estadio`.`idEstadio` ";
        rs=st.executeQuery(x);
        }catch(SQLException e){System.out.println(
            e.getMessage());}
        
        finally{
            return rs;}
        }
    public ResultSet Mostrar_Juez(Integer a) throws ClassNotFoundException, SQLException
    {
        Statement st;
        ResultSet rs = null;
        Conexion oc = new Conexion();
        try
        {
            st= oc.getCnn().createStatement();
            String x = "select * from juez where idJuez='"+a+"'";
            rs=st.executeQuery(x);
        }catch(SQLException e){System.out.println(
            e.getMessage());}
        finally{
            return rs;}
        }
        public ResultSet Mostrar_item(String tabla,String campo,String campo2) throws ClassNotFoundException, SQLException
        {
        Statement st;
        ResultSet rs = null;
        Conexion oc = new Conexion();
        try
        {
            st= oc.getCnn().createStatement();
            String x = "select " + campo + ", " + campo2 + " from " + tabla ;
            rs=st.executeQuery(x);
        }catch(SQLException e){System.out.println(
            e.getMessage());}
            return rs;}
//    public void Modificar_Juez(Clase_partido a) throws ClassNotFoundException, SQLException
//    {
//         String cadena;
//        Statement st/*= null*/;
//        Conexion oc = new Conexion();
//        st=oc.getCnn().createStatement();
//        cadena = "update juez set nombreJuez='"+a.getNombre()+"',apellidoJuez='"+a.getApellido()+"',nacionalidad='"+a.getNacionalidad()+"',fechaNacimiento='"+a.getFecha_nac()+
//          "' where idJuez='"+a.getCodigo()+"'";
//        st.executeUpdate(cadena);
//    }
    
    public void Eliminar_Juez(String a) throws ClassNotFoundException, SQLException
    {
         String cadena;
        Statement st/*= null*/;
        Conexion oc = new Conexion();
        st=oc.getCnn().createStatement();
        cadena = "delete from juez where idJuez='"+a+"'";
        st.executeUpdate(cadena);
    }
}
