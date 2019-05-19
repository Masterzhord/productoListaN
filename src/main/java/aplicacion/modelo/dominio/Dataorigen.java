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
public class Dataorigen implements Serializable{
   private String origen; 

    // Contructor Vacio
    public Dataorigen() {
    }
 // Contructor con parametros 
    public Dataorigen(String origen) {
        this.origen = origen;
    }

     //Getter and Setter
    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
   
   
}
