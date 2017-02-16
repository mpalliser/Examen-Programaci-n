package org.foobarspam.cotxox.test;

import static org.junit.Assert.*;

import org.foobarspam.cotxox.carrera.Carrera;
import org.foobarspam.cotxox.tarifa.Tarifa;
import org.junit.Test;

public class TestCuantoCuesta {

	@Test
	public void test() {
		String tarjetaCredito = "4916119711304546";
		String origen = "Aeroport Son Sant Joan";
		String destino= "Magaluf";
		double distancia = 7.75;
		int tiempoEsperadoMinutos = 10;
		
		Carrera carrera = new Carrera(tarjetaCredito);
		Tarifa tarifa = new Tarifa(distancia, tiempoEsperadoMinutos);
		carrera.setOrigen(origen);
		carrera.setDestino(destino);
		carrera.setDistancia(distancia);
		carrera.setTiempoEsperado(tiempoEsperadoMinutos);
		assertEquals(carrera.getCosteEsperado(), tarifa.getCosteTotalEsperado(), 0);
		assertEquals(tarifa.getCosteDistancia(distancia), distancia * tarifa.getCosteMilla(), 0);
		assertEquals(tarifa.getCosteTiempo(tiempoEsperadoMinutos),tiempoEsperadoMinutos * tarifa.getCosteMinuto(),0);
	}

}
