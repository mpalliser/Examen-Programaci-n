package org.foobarspam.cotxox.carrera;

import org.foobarspam.cotxox.conductores.Conductor;
import org.foobarspam.cotxox.conductores.PoolConductores;
import org.foobarspam.cotxox.tarifa.Tarifa;

public class Carrera {
	
	// ---------  PROPIEDADES  ----------
	
	private String origen = null;
	private String destino = null;
	private double distancia = 0.0d;
	private int tiempoEsperadoMinutos = 0;
	private String tarjetaCredito = null;
	private Tarifa nuevaTarifa;
	private Conductor conductor = null;
	private double costeTotal = 0;
	private int totalPropinas = 0;
	
	// --------- CONSTRUCTORES ----------
	
	public Carrera(){
	}
	public Carrera(String tarjetaCredito){
		this.tarjetaCredito = tarjetaCredito;
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
	public void realizarPago(double costeEsperado) {
		costeTotal = costeEsperado;
	}
	public void recibirPropina(int propina) {
		totalPropinas = totalPropinas + propina;
	}
	public int getPropina() {
		return this.totalPropinas;
	}
	public void liberarConductor() {
		this.conductor.setOcupado(false);
	}
}
