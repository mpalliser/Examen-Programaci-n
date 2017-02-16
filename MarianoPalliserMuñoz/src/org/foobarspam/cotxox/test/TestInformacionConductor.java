package org.foobarspam.cotxox.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.foobarspam.cotxox.conductores.Conductor;
import org.junit.Test;

public class TestInformacionConductor {

	@Test
	public void test() {
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
		for (Conductor driver : poolConductores){
			assertEquals(driver.getClass(), conductor.getClass());
		}
	}

}
