/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.util;

import aplicacion.modelo.dominio.Producto;
import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Masterzhord
 */
public class ListaProducto implements Serializable{
    private List<Producto> productos;

    //Contructor sin parametro
    public ListaProducto() throws ParseException {
        productos = new ArrayList <Producto>();
         precargarproductos();
    }

       public void precargarproductos(){
    Producto producto = new Producto ("1234", "Campera", "10", "Chelsea Market", "L", "Negro", "Argentina", "3498");
    productos.add(producto);
    Producto producto1 = new Producto ("4562", "Camisa", "10", "Valkymia", "S", "Blanco", "Argentina", "1360");
    productos.add(producto1);
    Producto producto2 = new Producto ("5964", "Pantalon", "10", "Vinson", "L", "Azul", "Argentina", "1221");
    productos.add(producto2);
    Producto producto3 = new Producto ("1256", "Remera", "10", "Wellington Polo  Club", "XL", "Verde", "Argentina", "399");
    productos.add(producto3);
    Producto producto4 = new Producto ("5632", "Sweater", "10", "Moni Tricot", "L", "Negro", "Argentina", "688");
    productos.add(producto4);
    
    }
   //Agrega un nuevo producto
    public void agregarProductos(Producto producto){
    productos.add(producto);
    }
    
    
    
    
    //Getter and Setter
    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
  
    
}
