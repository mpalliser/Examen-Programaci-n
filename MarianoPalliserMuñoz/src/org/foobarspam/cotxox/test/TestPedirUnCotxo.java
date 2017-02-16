package org.foobarspam.cotxox.test;

import static org.junit.Assert.*;

import org.foobarspam.cotxox.carrera.Carrera;
import org.junit.Test;

public class TestPedirUnCotxo {

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
		assertEquals(carrera.getOrigen(), origen);
		assertEquals(carrera.getDestino(), destino);
		assertEquals(carrera.getDistancia(), distancia, 0.1);
		assertEquals(carrera.getTiempoEsperado(), tiempoEsperadoMinutos);
	}

}
