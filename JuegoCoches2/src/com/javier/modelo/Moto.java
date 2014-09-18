package com.javier.modelo;

public class Moto extends Vehiculo {
 private String permiso;

public Moto() {
	
}

public Moto(String marca, String modelo, String color, String numeroSerie,String permiso) {
	super(marca, modelo, color, numeroSerie);
	   this.permiso=permiso;
}

public String getPermiso() {
	return permiso;
}

public void setPermiso(String permiso) {
	this.permiso = permiso;
}
 
 
}
