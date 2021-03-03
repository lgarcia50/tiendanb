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
public class Ropa  extends Articulo{
    String color;
    int talla;
    public Ropa() { }
    
    public Ropa(String color,int talla, String codigo, String nombre,float precio,int stock) {
        super(codigo, nombre, precio, stock);
        this.color = color;
        this.talla = talla; 
    }

    Ropa(String string, String falda, float f, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  @Override
  public String toString() {
      return + super.toString()+ "Color: " + color + "\nTalla: "
  }
    
}
