/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tienda;

/**
 *
 * @author lucia
 */
public class Ropa  extends Articulo{
    private String color;
    private TallaSML talla;
    public Ropa() { }
    
    public Ropa(String color,TallaSML talla, String codigo, String nombre,float precio,int stock) {
        super(codigo, nombre, precio, stock);
        this.color = color;
        this.talla = talla; 
    }
public String getColor() {
    return color;
    }
public void setColor(){
    this.color=color;
}
public TallaSML getTalla(){
    return talla;
}
public void setTalla(TallaSML tall){
    this.talla=tall;
}
  @Override
  public String toString() {
    return super.toString() + "color:"+ getColor()+ "\nTalla:"+getTalla();
  }
    
}
