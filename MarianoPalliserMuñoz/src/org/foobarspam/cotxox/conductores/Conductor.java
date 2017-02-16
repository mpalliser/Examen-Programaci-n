package org.foobarspam.cotxox.conductores;

public class Conductor {
	private String nombre = null;
	private String matricula;
	private String modelo;
	private byte valoracion;
	private boolean ocupado;

	public Conductor(String nombre) {
		this.nombre = nombre;
		this.matricula = null;
		this.modelo = null;
		this.valoracion = 0;
		this.ocupado = false;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setValoracion(byte valoracion) {
		this.valoracion = valoracion;
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
		return this.valoracion;
	}

	public boolean isOcupado() {
		return this.ocupado;
	}
	

}
