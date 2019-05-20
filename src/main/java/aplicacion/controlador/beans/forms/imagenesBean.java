/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Malen
 */
@ManagedBean
public class imagenesBean {
    
    private List<String> images;
     
    
  @PostConstruct
    public void init() {
        
        images = new ArrayList<String>();
        for (int i = 1; i <= 12;i++) {
            images.add("HotSale" + i +".jpg");
        }
    }
 
    public List<String> getImages() {
        return images;
    }
}
    

