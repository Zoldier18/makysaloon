/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC_clases;

/**
 *
 * @author Lucero
 */
public class Clase_partido {

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * @return the campeonto
     */
    public String getCampeonto() {
        return campeonto;
    }

    /**
     * @param campeonto the campeonto to set
     */
    public void setCampeonto(String campeonto) {
        this.campeonto = campeonto;
    }

    /**
     * @return the estadio
     */
    public String getEstadio() {
        return estadio;
    }

    /**
     * @param estadio the estadio to set
     */
    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    
    private int codigo;
    private String fecha;
    private String hora;
    private String campeonto;
    private String estadio;
            
}
