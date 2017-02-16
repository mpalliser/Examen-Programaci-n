package org.foobarspam.cotxox.conductores;

import java.util.ArrayList;

public class Conductor {
	private String nombre = null;
	private String matricula;
	private String modelo;
	private byte valoracionMedia = 0;
	ArrayList<Byte> valoraciones = new ArrayList<Byte>();	
	private boolean ocupado;
	
	public Conductor(String nombre) {
		this.nombre = nombre;
		this.matricula = null;
		this.modelo = null;
		this.ocupado = false;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setValoracion(byte valoracion) {
		valoraciones.add(valoracion);
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

	public byte getValoracion() {
		for (byte valoracion : valoraciones){
			valoracionMedia = (byte) ((byte) (valoracionMedia + valoracion) / valoraciones.size());
		}
		return this.valoracionMedia;
	}

	public boolean isOcupado() {
		return this.ocupado;
	}
	

}
