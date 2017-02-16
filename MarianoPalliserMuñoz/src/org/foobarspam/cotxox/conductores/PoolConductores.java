package org.foobarspam.cotxox.conductores;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class PoolConductores {
	ArrayList<Conductor> poolConductores;
	
	public PoolConductores(ArrayList<Conductor> poolConductores) {
		this.poolConductores = poolConductores;
	}
	public Conductor asignarConductor(){
		Conductor conductorAleatorio = null;
		int totalConductores = poolConductores.size();
		int numeroEnRangoRandom = ThreadLocalRandom.current().nextInt(0,totalConductores-1);
		
		conductorAleatorio = poolConductores.get(numeroEnRangoRandom);
		conductorAleatorio.setOcupado(true);
		return conductorAleatorio;
	}

}
