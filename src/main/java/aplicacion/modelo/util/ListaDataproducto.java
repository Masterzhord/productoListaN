/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.util;


import aplicacion.modelo.dominio.Datacolor;
import aplicacion.modelo.dominio.Dataorigen;
import aplicacion.modelo.dominio.Datatalle;
import aplicacion.modelo.dominio.Datatipo;
import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Masterzhord
 */
public class ListaDataproducto implements Serializable{
private List<Datacolor> datacolores;
private List<Dataorigen> dataorigenes;
private List<Datatalle> datatalles;
private List<Datatipo> datatipos;

       public void precargacolor() throws ParseException{
           Datacolor color= new Datacolor ("Rojo");
           datacolores.add(color);
           Datacolor color1= new Datacolor ("Azul");
           datacolores.add(color1);
           Datacolor color2= new Datacolor ("Blanco");
           datacolores.add(color2);
           Datacolor color3= new Datacolor ("Negro");
           datacolores.add(color3);
           Datacolor color4= new Datacolor ("Amarillo");
           datacolores.add(color4);
           Datacolor color5= new Datacolor ("Verde");
           datacolores.add(color5);
        
       }
       
       public void precargatalle() throws ParseException{
           Datatalle talle= new Datatalle ("S");
           datatalles.add(talle);
           Datatalle talle1= new Datatalle ("M");
           datatalles.add(talle1);
           Datatalle talle2= new Datatalle ("L");
           datatalles.add(talle2);
           Datatalle talle3= new Datatalle ("XL");
           datatalles.add(talle3);
           Datatalle talle4= new Datatalle ("XXL");
           datatalles.add(talle4);
         }

        public void precargaorigen() throws ParseException{
           Dataorigen origen= new Dataorigen ("Argentina");
           dataorigenes.add(origen);
           Dataorigen origen1= new Dataorigen ("Chile");
           dataorigenes.add(origen1);
           Dataorigen origen2= new Dataorigen ("Brasil");
           dataorigenes.add(origen2);
           Dataorigen origen3= new Dataorigen ("EEUU");
           dataorigenes.add(origen3);
           Dataorigen origen4= new Dataorigen ("España");
           dataorigenes.add(origen4);
           Dataorigen origen5= new Dataorigen ("China");
           dataorigenes.add(origen5);
         }

        public void precargatipo() throws ParseException{
           Datatipo tipo= new Datatipo ("Campera");
           datatipos.add(tipo);
           Datatipo tipo1= new Datatipo ("Camisa");
           datatipos.add(tipo1);
           Datatipo tipo2= new Datatipo ("Pantalon");
           datatipos.add(tipo2);
           Datatipo tipo3= new Datatipo ("Remera");
           datatipos.add(tipo3);
           Datatipo tipo4= new Datatipo ("Sweater");
           datatipos.add(tipo4);
         } 
        
        
    
    public ListaDataproducto() throws ParseException {
        datacolores = new ArrayList <Datacolor>();
        precargacolor();
        datatalles = new ArrayList <Datatalle>();
        precargatalle();
        dataorigenes = new ArrayList <Dataorigen>();
        precargaorigen();
        datatipos = new ArrayList <Datatipo>();
        precargatipo();
    }

    //getter and Setter
    public List<Datacolor> getDatacolores() {
        return datacolores;
    }

    public void setDatacolores(List<Datacolor> datacolores) {
        this.datacolores = datacolores;
    }

    public List<Dataorigen> getDataorigenes() {
        return dataorigenes;
    }

    public void setDataorigenes(List<Dataorigen> dataorigenes) {
        this.dataorigenes = dataorigenes;
    }

    public List<Datatalle> getDatatalles() {
        return datatalles;
    }

    public void setDatatalles(List<Datatalle> datatalles) {
        this.datatalles = datatalles;
    }

    public List<Datatipo> getDatatipos() {
        return datatipos;
    }

    public void setDatatipos(List<Datatipo> datatipos) {
        this.datatipos = datatipos;
    }
        
    
}
