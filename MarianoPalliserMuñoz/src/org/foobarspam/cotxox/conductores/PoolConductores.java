package org.foobarspam.cotxox.conductores;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class PoolConductores {
	
	// ---------  PROPIEDADES  ----------
	
	ArrayList<Conductor> poolConductores;
	
	// ---------   CONSTRUCTORES	   ----------

	public PoolConductores(ArrayList<Conductor> poolConductores) {
		this.poolConductores = poolConductores;
	}
	
	// ---------   METODOS	   ----------

	public Conductor asignarConductor(){
		Conductor conductorAleatorio = null;
		conductorAleatorio = poolConductores.get(numeroRandom());
		while (conductorAleatorio.getOcupado() == true){
			conductorAleatorio = poolConductores.get(numeroRandom());
		}
		conductorAleatorio.setOcupado(true);
		return conductorAleatorio;
	}
	public int numeroRandom(){
		int totalConductores = poolConductores.size();
		return ThreadLocalRandom.current().nextInt(0,totalConductores);
	}
}
