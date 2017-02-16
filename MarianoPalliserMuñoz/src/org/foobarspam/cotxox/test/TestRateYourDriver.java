package org.foobarspam.cotxox.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.foobarspam.cotxox.carrera.Carrera;
import org.foobarspam.cotxox.conductores.Conductor;
import org.foobarspam.cotxox.conductores.PoolConductores;
import org.junit.Test;

public class TestRateYourDriver {

	@Test
	public void test() {
		String tarjetaCredito = "4916119711304546";
		String origen = "Aeroport Son Sant Joan";
		String destino= "Magaluf";
		double distancia = 7.75;
		int tiempoEsperadoMinutos = 10;
		
		Carrera carrera = new Carrera(tarjetaCredito);
		carrera.setOrigen(origen);
		carrera.setDestino(destino);
		carrera.setDistancia(distancia);
		carrera.setTiempoEsperado(tiempoEsperadoMinutos);
		
		ArrayList<Conductor> poolConductores = new ArrayList<>();
		Conductor conductor = null;
				
		String[] nombres = {"Samantha", "Fox", "Mola"};
		for(String nombre: nombres){
			conductor = new Conductor(nombre);
			poolConductores.add(conductor);
		}
		
		String[] matricula = {"4ABC123", "5DHJ444", "7JKK555"};
		String[] modelos = {"Chevy Malibu", "Toyota Prius", "Mercedes A"};
		
		int index = 0;
		for(Conductor conductora: poolConductores){			
			conductora.setMatricula(matricula[index]);
			conductora.setModelo(modelos[index]);
			conductora.setValoracion((byte) 4);
			index++;
		}
		PoolConductores conductores = new PoolConductores(poolConductores);
		carrera.asignarConductor(conductores);
		carrera.realizarPago(carrera.getCosteEsperado());
		carrera.recibirPropina(1);
		carrera.liberarConductor();
		assertEquals(carrera.getConductor().getValoracion(), 4);
		carrera.getConductor().setValoracion((byte) 5);
		assertEquals(carrera.getConductor().getValoracion(), 4.5, 0);


		
	}

}
