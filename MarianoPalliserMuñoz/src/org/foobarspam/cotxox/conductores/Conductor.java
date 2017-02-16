package org.foobarspam.cotxox.conductores;

public class Conductor {
	private String nombre = null;
	private String matricula;
	private String modelo;
	private byte valoracion;

	public Conductor(String nombre) {
		this.nombre = nombre;
		this.matricula = null;
		this.modelo = null;
		this.valoracion = 0;
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

}
