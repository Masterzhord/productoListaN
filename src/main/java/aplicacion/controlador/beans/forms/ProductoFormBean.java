/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.interfaces.dao.IDataproductoDAO;
import aplicacion.interfaces.dao.IProductoDAO;
import aplicacion.interfaces.dao.imp.DataproductoListDAOimp;
import aplicacion.interfaces.dao.imp.ProductoListDAOImp;
import aplicacion.modelo.dominio.Datacolor;
import aplicacion.modelo.dominio.Dataorigen;
import aplicacion.modelo.dominio.Datatalle;
import aplicacion.modelo.dominio.Datatipo;
import aplicacion.modelo.dominio.Producto;
import java.io.Serializable;
import java.text.ParseException;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Masterzhord
 */
@ManagedBean
@SessionScoped

public class ProductoFormBean implements Serializable{
    private Producto producto;
    private IProductoDAO productoDAO;
    private Producto selectproducto;
    private IDataproductoDAO DataproductoDAO;
    boolean flag= false;

    //Contructor Vacio
    public ProductoFormBean() throws ParseException{
        productoDAO = (IProductoDAO) new ProductoListDAOImp();
        producto = new Producto();
        DataproductoDAO= (IDataproductoDAO) new DataproductoListDAOimp();
        
    }
    
     //Obtiene el listado de color para mostrar en un selectOneMenu.
     public List<Datacolor> obtenercolores() {
        return DataproductoDAO.obtenercolor();
    }
    //Obtiene el listado de origen para mostrar en un selectOneMenu.
     public List<Dataorigen> obtenerorigenes() {
        return DataproductoDAO.obtenerorigen();
    }
    //Obtiene el listado talle para mostrar en un selectOneMenu.
     public List<Datatalle> obtenertalles() {
        return DataproductoDAO.obtenertalle();
    }
     
    //Obtiene el listado tipo para mostrar en un selectOneMenu.
     public List<Datatipo> obtenertipo() {
        return DataproductoDAO.obtenertipo();
    }
     //Guarda los Registros en la Lista
    public void guardadproducto (){
      for (Producto buscado : productoDAO.obtener()) {
            if (buscado.getCodigo().equals(producto.getCodigo())) {
                flag = true;

            }
        }  
        if (flag == false) {
            productoDAO.crearProducto(producto);
             producto = new Producto();
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage("Exito",  "Se Agrego Correctamente!!!!"));
            //resetearFitrosTabla("formprincipal:tabla");
        } else {
            flag = false;
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Error, El Codigo ya Existe!!!!", null));
           // resetearFitrosTabla("formprincipal:tabla"); 
            }

    }
         //Obtiene el listado de Libros para mostrarlos en la datatable.
    public List<Producto> obtenerproducto() {
        return productoDAO.obtener();
    }
    
    
    //Getter and Setter
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }


    public Producto getSelectproducto() {
        return selectproducto;
    }

    public void setSelectproducto(Producto selectproducto) {
        this.selectproducto = selectproducto;
    }

    public IDataproductoDAO getDataproductoDAO() {
        return DataproductoDAO;
    }

    public void setDataproductoDAO(IDataproductoDAO DataproductoDAO) {
        this.DataproductoDAO = DataproductoDAO;
    }

    public IProductoDAO getProductoDAO() {
        return productoDAO;
    }

    public void setProductoDAO(IProductoDAO productoDAO) {
        this.productoDAO = productoDAO;
    }
    
    
}
