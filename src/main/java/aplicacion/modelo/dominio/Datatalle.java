/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author Masterzhord
 */
public class Datatalle implements Serializable{
 private String talle; 

  // Contructor Vacio
    public Datatalle() {
    }
 // Contructor con parametros 
    public Datatalle(String talle) {
        this.talle = talle;
    }

     //Getter and Setter
    public String getTalle() {
        return talle;
    }

    public void setTalle(String talle) {
        this.talle = talle;
    }
 
 
}
