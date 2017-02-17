package org.foobarspam.cotxox.conductores;

import java.util.ArrayList;

public class Conductor {
	private String nombre = null;
	private String matricula = null;
	private String modelo = null;
	private float valoracionMedia = 0;
	ArrayList<Float> valoraciones = new ArrayList<>();	
	private boolean ocupado = false;
	
	public Conductor(String nombre) {
		this.nombre = nombre;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setValoracion(byte valoracion) {
		valoraciones.add((float) valoracion);
	}
	public boolean getOcupado(){
		return this.ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	public String getNombre(){
		return this.nombre;
	}

	public String getModelo() {
		return this.modelo;
	}

	public String getMatricula() {
		return this.matricula;
	}

	public float getValoracion() {
		for (Float valoracion : valoraciones){
			valoracionMedia =  (valoracionMedia + valoracion) / valoraciones.size();
		}
		return this.valoracionMedia;
	}

	public boolean isOcupado() {
		return this.ocupado;
	}
	

}
