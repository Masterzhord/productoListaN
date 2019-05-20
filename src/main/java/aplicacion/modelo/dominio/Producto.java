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
public class Producto implements Serializable{
 private String Codigo;
 private String nombre;
 private String cantidad;
 private String marca;
 private String talle;
 private String color;
 private String origen;
 private String precio;

 // Contructor Vacio
 
    public Producto() {
    }
 // Contructor con parametros 
    
    public Producto(String Codigo, String nombre, String cantidad, String marca, String talle, String color, String origen, String precio) {
        this.Codigo = Codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.marca = marca;
        this.talle = talle;
        this.color = color;
        this.origen = origen;
        this.precio = precio;
    }

    
    //Getter and Setter

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTalle() {
        return talle;
    }

    public void setTalle(String talle) {
        this.talle = talle;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
 
 
}
