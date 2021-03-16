/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tienda;

import java.util.ArrayList;

/**
 *
 * @author lucia
 */
public class usuario {
    String nombre;
    String password;
    String email;

    @Override
    public String toString() {
        return "usuario{" + "nombre=" + nombre + ", password=" + password + ", email=" + email + '}';
    }
  
    
    public usuario(){}
    public usuario(String nombre,String password,String email){
        this.nombre=nombre;
        this.password=password;
        this.email=email;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getPass(){
        return password;
    }
    public void setPass(String password){
        this.password=password;
    }
     public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    /**
    *metodo control de usuario correcto
    */
    public boolean checkNombre(String nombre){
       return nombre.length() >= 6;
    }
    /**
    *metodo control email correcto
    */
       public boolean CheckEmail(String email){
            return email.matches("[.*@.*]");
       }
    /**
    *metodo control password correcto
    */
       public boolean CheckPassword(String passw){
           boolean ok= false;
           if(passw.matches(".*[A-Z].*")&& passw.length()>=8)
               ok= true;
           
           return ok;
            
       }
}       