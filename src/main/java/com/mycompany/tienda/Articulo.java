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
public class Articulo {


	private String codigo;
	private String nombre;
	private float precio;
	private int stock;
        private ArrayList<Opinion> opinion;
	
	public Articulo() {
        opinion=new ArrayList<Opinion>();
        };
	
	public Articulo(String codigo,String nombre,float precio, int stock){
		setCodigo(codigo);
		setNombre(nombre);
		setPrecio(precio);
		setStock(stock);
                opinion=new ArrayList<Opinion>();
	}
	
	public String getCodigo() {
		return codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public int getStock() {
		return stock;
	}
	public void setCodigo(String codigo) {
		this.codigo=codigo;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setPrecio(float precio) {
		this.precio=precio;
	}
	public void setStock(int stock) {
		this.stock=stock;
	}
	@Override
	public String toString() {
		return "Codigo: "+this.codigo+"\nnombre:"+this.nombre+"\nnprecio:"+this.precio+"\nstock:"+this.stock+"\n";
	}
	public boolean disponible (int cantidad) {
		return cantidad<stock;
	}
	public void ajustarStock(int cantidad) {
		this.stock += cantidad;
	}
	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		
		if (this.getClass() != o.getClass())
			return false;
		else
		{
			Articulo a = (Articulo) o;
			if (this.codigo.equals(a.getCodigo()))
					return true;
			else
				return false;
		}
	}
        public void AddOpinion(Opinion opinion){
            opinion.add(opinion);
        }
        public String showOpinions(){
            StringBuilder sb= new StringBuilder();
            for (Opinion o: opinion) {
			sb.append("\n").append(o);
		}
            return sb.toString();
        }
       public void mediaOpinions(){
           float media =0;
           for (Opinion o: opinion) {
               
           if(o.getPuntuacion()==Puntuacion.mal){
              
           }
       }

}

}
