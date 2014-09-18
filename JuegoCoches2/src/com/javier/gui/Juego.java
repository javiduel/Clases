package com.javier.gui;
import com.javier.modelo.Coche;
import com.javier.modelo.Moto;
import com.javier.modelo.Vehiculo;
public class Juego {
  public static void main(String args[]){
	Coche c1=new Coche("Keroseno",125,5.5);  
    Coche c2=new Coche();
	Vehiculo c3=new Coche("Toyota","Yaris","Gris","23456","Gasoil",45,5.5);
	Moto m1=new Moto("Honda", "Hornet", "Negra", "123456", "A");  
    c1.setColor("Rojo");
    c1.setConsumo(6.5);
    double cons=c1.consumido(23,1.4);
    System.out.println(cons);
    System.out.println(c1.getMarca());
    detalles(c1);
    detalles(c2);
    detalles(m1);
  
  }

 public static void detalles(Vehiculo v){
	 if (v instanceof Coche){
		 System.out.println("Es un coche");
	     Coche c=(Coche) v;
	     c.getConsumo();
	
	 }else if (v instanceof Moto) {
			System.out.println("Es una moto");
		}       
 
  v.imprimir();
 }
 



}
