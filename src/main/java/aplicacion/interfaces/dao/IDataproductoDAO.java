/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.interfaces.dao;

import aplicacion.modelo.dominio.Datacolor;
import aplicacion.modelo.dominio.Dataorigen;
import aplicacion.modelo.dominio.Datatalle;
import aplicacion.modelo.dominio.Datatipo;
import java.util.List;

/**
 *
 * @author Masterzhord
 */
public interface IDataproductoDAO {
    
    List<Datacolor> obtenercolor();
    List<Datatalle> obtenertalle();
    List<Dataorigen> obtenerorigen();
    List<Datatipo> obtenertipo();
}
