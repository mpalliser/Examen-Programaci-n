package org.foobarspam.cotxox.tarifa;

import org.foobarspam.cotxox.carrera.Carrera;

public class Tarifa extends Carrera {
	
	
	// ---------  PROPIEDADES  ----------
	private  final double costeMilla = 1.35;
	private final double costeMinuto = 0.35;
	private final double costeMinimo = 5;
	private double distancia = 0.0d;
	private double minutos = 0.0d;
	
	// --------- CONSTRUCTORES ----------
	public Tarifa(double distancia, double minutos){
		this.distancia = distancia;
		this.minutos = minutos;
	}

	// ---------   METODOS	   ----------
	public double getCosteMinuto(){
		return this.costeMinuto;
	}
	public double getCosteMilla(){
		return this.costeMilla;
	}
	public double getCosteDistancia(double distancia){
		return distancia * costeMilla;
	}
	public double getCosteTiempo(double minutos){
		return minutos * costeMinuto;
	}
	public double getCosteTotalEsperado(){
		double costeTotal = getCosteDistancia(distancia) + getCosteTiempo(minutos);
		if (costeTotal < costeMinimo){
			return costeMinimo;
		}
		return costeTotal;
	}
}
