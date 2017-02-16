package org.foobarspam.cotxox.carrera;

import org.foobarspam.cotxox.conductores.Conductor;
import org.foobarspam.cotxox.conductores.PoolConductores;
import org.foobarspam.cotxox.tarifa.Tarifa;

public class Carrera {
	
	// ---------  PROPIEDADES  ----------
	
	private String origen;
	private String destino;
	private double distancia;
	private int tiempoEsperadoMinutos;
	private String tarjetaCredito;
	private Tarifa nuevaTarifa = null;
	private Conductor conductor = null;
	
	// --------- CONSTRUCTORES ----------
	public Carrera(){
	}
	public Carrera(String tarjetaCredito){
		this.tarjetaCredito = tarjetaCredito;
		this.origen = null;
		this.destino = null;
		this.distancia = 0.0d;
		this.tiempoEsperadoMinutos = 0;
		this.tarjetaCredito = null;
	}
	
	// ---------   GETTERS y SETTERS	   ----------
	public void setOrigen(String origen) {
		this.origen = origen;
	}
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
	
	public double getCosteEsperado() {
		nuevaTarifa = new Tarifa(distancia, tiempoEsperadoMinutos);
		return nuevaTarifa.getCosteTotalEsperado();
	}
	public void asignarConductor(PoolConductores conductores) {
		Conductor conductor = conductores.asignarConductor();
		setConductor(conductor);
	}
	private void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}
	public Conductor getConductor() {
		return this.conductor;
	}
}
