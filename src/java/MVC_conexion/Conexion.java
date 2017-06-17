/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC_conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Lucero
 */
public class Conexion {
    //variable global
    private Connection cnn = null;
    //constructor
  public Conexion() throws ClassNotFoundException{
      String url, driver, usuario, pass;
      url="jdbc:mysql://localhost/futbol";
      driver="com.mysql.jdbc.Driver";
      usuario="root";
      pass="";
        try{
        Class.forName(driver);
        cnn=DriverManager.getConnection(url, usuario, pass );
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        } 
  }
       
    /**
     * @return the cnn
     */
    public Connection getCnn() {
        return cnn;
    }
        public ResultSet Mostrar_Datos(String x)
        {
        Statement st;
        ResultSet rs=null;
        try
        {
        st = getCnn().createStatement();
        
        rs=st.executeQuery(x);
        }catch(SQLException e){System.out.println(
            e.getMessage().toString());}
        finally{return rs;}
        }
}
