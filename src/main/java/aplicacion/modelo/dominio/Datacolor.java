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
public class Datacolor implements Serializable {
    private String color;

  // Contructor Vacio
    public Datacolor() {
    }
 // Contructor con parametros 
    public Datacolor(String color) {
        this.color = color;
    }

     //Getter and Setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
