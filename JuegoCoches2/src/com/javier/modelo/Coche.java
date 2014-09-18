package com.javier.modelo;

public class Coche extends Vehiculo {
  private String combustible;
  private int deposito;
  private double consumo;
public Coche() {
 combustible="nada";
 deposito=0;
 consumo=0;
 
}
//Creamos el constructor que permite recibir los argumentos del objeto
public Coche(String combustible, int deposito, double consumo) {
	
	this.combustible = combustible;
	this.deposito = deposito;
	this.consumo = consumo;
 }
//Constructor con super clase
public Coche(String marca, String modelo, String color, String numeroSerie,String combustible, int deposito, double consumo) {
	super(marca, modelo, color, numeroSerie);
	this.combustible = combustible;
	this.deposito = deposito;
	this.consumo = consumo;
 }
//Creamos los getters y setters
public String getCombustible() {
	return combustible;
}
public void setCombustible(String combustible) {
	this.combustible = combustible;
}
public int getDeposito() {
	return deposito;
}
public void setDeposito(int deposito) {
	this.deposito = deposito;
}
public double getConsumo() {
	return consumo;
}
public void setConsumo(double consumo) {
	this.consumo = consumo;
}

public double consumido(double kms){

	double kmsrec=kms/100;
	return kmsrec*consumo;
 }

public double consumido(double kms, double precio){
	double kmsrec=kms/100;
	return kmsrec*consumo*precio;
	
 }

public void imprimir(){
	super.imprimir();
	System.out.println("que consume "+consumo);
}


}


 



