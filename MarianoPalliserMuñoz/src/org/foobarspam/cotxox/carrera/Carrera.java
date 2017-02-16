package org.foobarspam.cotxox.carrera;

public class Carrera {
	
	// ---------  PROPIEDADES  ----------
	private String origen = null;
	private String destino = null;
	private double distancia = 0.0d;
	private int tiempoEsperadoMinutos = 0;
	private String tarjetaCredito = null;
	
	// --------- CONSTRUCTORES ----------
	public Carrera(){
	}
	public Carrera(String tarjetaCredito){
		this.tarjetaCredito = tarjetaCredito;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	// ---------   GETTERS y SETTERS	   ----------
	public void setDestino(String destino){
		this.destino = destino;
	}
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	public void setTiempoEsperado(int tiempoEsperadoMinutos) {
		this.tiempoEsperadoMinutos = tiempoEsperadoMinutos;
	}
	public String getTarjetaCredito() {
		return this.tarjetaCredito;
	}
	public String getOrigen() {
		return this.origen;
	}
	public String getDestino(){
		return this.destino;
	}
	public double getDistancia() {
		return this.distancia;
	}
	public int getTiempoEsperado() {
		return this.tiempoEsperadoMinutos;
	}
	
	// ---------   METODOS	   ----------
}
