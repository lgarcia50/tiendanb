/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tienda;

/**
 *
 * @author anaga
 */
public class Electrodomestico extends Articulo{
   private ClaseE clasificacion;
   private String gama;
   
    public Electrodomestico() {}
    public Electrodomestico(String gama, ClaseE clasificacion, String codigo, String nombre,float precio,int stock) {
        super(codigo, nombre, precio, stock);
        this.gama =gama;
        this.clasificacion = clasificacion; 
    }
    
   public String getGama(){
       return gama;
   }
   public void setGama() {
       this.gama=gama;
   }
   public ClaseE getClasificacion() {
       return clasificacion;
   }
   public void setClasificacion(ClaseE clasif) {
       this.clasificacion=clasif;
   }
   @Override
    public String toString() {
        return super.toString()+"gama:"+getGama()+"\nClasificacion"+getClasificacion();
   }
}