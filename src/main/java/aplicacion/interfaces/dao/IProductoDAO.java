/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.interfaces.dao;

import aplicacion.modelo.dominio.Producto;
import java.util.List;

/**
 *
 * @author Masterzhord
 */
public interface IProductoDAO {
    
    // agrega un nuevo producto
    void crearProducto (Producto producto);
     // lista todos los productos
    List <Producto>obtener();
}
