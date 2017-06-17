/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC_conexion;

import MVC_clases.Clase_juez;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Lucero
 */
public class Acceso_juez {
    //instanciar las clases
    //Conexion oc = new Conexion();
    
    public void Registrar_Juez(Clase_juez ocj) throws ClassNotFoundException, SQLException{
        String cadena;
        Statement st/*= null*/;
        Conexion oc = new Conexion();
        st=oc.getCnn().createStatement();
        cadena = "insert into juez (apellidoJuez,nombreJuez,nacionalidad,fechaNacimiento)"
                + " values ('"+ocj.getApellido()+"','"+ocj.getNombre()+"','"
                +ocj.getNacionalidad()+"','"+ocj.getFecha_nac()+"')";
        st.executeUpdate(cadena);
    }
    
    public ResultSet Listar_Juez() throws ClassNotFoundException, SQLException
    {
        Statement st;
        ResultSet rs=null;
        Conexion oc = new Conexion();
        try
        {
        st = oc.getCnn().createStatement();
        String x ="select * from juez";
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
    public void Modificar_Juez(Clase_juez a) throws ClassNotFoundException, SQLException
    {
         String cadena;
        Statement st/*= null*/;
        Conexion oc = new Conexion();
        st=oc.getCnn().createStatement();
        cadena = "update juez set nombreJuez='"+a.getNombre()+"',apellidoJuez='"+a.getApellido()+"',nacionalidad='"+a.getNacionalidad()+"',fechaNacimiento='"+a.getFecha_nac()+
          "' where idJuez='"+a.getCodigo()+"'";
        st.executeUpdate(cadena);
    }
    
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
