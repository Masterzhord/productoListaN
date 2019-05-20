/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.interfaces.dao.imp;

import aplicacion.interfaces.dao.IProductoDAO;
import aplicacion.modelo.dominio.Producto;
import aplicacion.modelo.util.ListaProducto;
import java.io.Serializable;
import java.text.ParseException;
import java.util.List;

/**
 *
 * @author Masterzhord
 */
public class ProductoListDAOImp implements Serializable, IProductoDAO{
    
    private ListaProducto listaproducto;

    //Contructor vacio
    public ProductoListDAOImp() throws ParseException {
        listaproducto = new ListaProducto();
    }
    
    //crea un producto y a agrega a la lista
    @Override
    public void crearProducto (Producto producto){
        listaproducto.agregarProductos(producto);
    }
    //Lista todos los productos
    @Override
    public List<Producto> obtener(){
        return listaproducto.getProductos();
    }
    //Implementa  eliminar un Producto
    @Override
    public void Eliminar(Producto producto) {
        listaproducto.Eliminar(producto);
    }
}
