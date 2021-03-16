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
public class Lavadora extends Electrodomestico{
    private int capacidad;
    private int potencia;
    
    
   
    public Lavadora() {}
    public Lavadora(String gama,ClaseE clasificacion,String codigo,String nombre,int capacidad,int potencia,float precio,int stock) {
        super(gama, clasificacion, codigo, nombre, precio, stock);
        this.capacidad = capacidad;
        this.potencia=potencia;
    }
    
  
   
   public int getCapacidad(){
       return capacidad;
   }
   public void setCapacidad(){
       this.capacidad=capacidad;
   }
   public int getPotencia(){
       return potencia;
   }
   public void setPotencia(){
       this.potencia=potencia;
   }
   
   
   @Override
    public String toString() {
        return super.toString()+"\nCapacidad: "+getCapacidad();
   }
}
  
