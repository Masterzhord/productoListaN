/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.interfaces.dao.imp;

import aplicacion.interfaces.dao.IDataproductoDAO;
import aplicacion.modelo.dominio.Datacolor;
import aplicacion.modelo.dominio.Dataorigen;
import aplicacion.modelo.dominio.Datatalle;
import aplicacion.modelo.dominio.Datatipo;
import aplicacion.modelo.util.ListaDataproducto;
import java.io.Serializable;
import java.text.ParseException;
import java.util.List;

/**
 *
 * @author Masterzhord
 */
public class DataproductoListDAOimp implements Serializable, IDataproductoDAO{
 private ListaDataproducto listardataproductos;   

    public DataproductoListDAOimp() throws ParseException {
        listardataproductos = new ListaDataproducto ();
    }
    
    @Override
    public List<Datacolor> obtenercolor() {
       return listardataproductos.getDatacolores();
        
    }
    @Override
    public List<Datatalle> obtenertalle() {
       return listardataproductos.getDatatalles();
        
    }
    @Override
    public List<Dataorigen> obtenerorigen() {
       return listardataproductos.getDataorigenes();
        
    }
    
    @Override
    public List<Datatipo> obtenertipo() {
       return listardataproductos.getDatatipos();
        
    }
 
}
