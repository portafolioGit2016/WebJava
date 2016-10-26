package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import cl.duoc.hf.viewBean.VueloBean;

public class UsuarioTest {

	@Test
	public void origenDisponible() {
		VueloBean vuelo = new VueloBean();
		vuelo.setOrigen("Santiago");
		assertEquals("Disponible", vuelo.origenVueloDisponible(vuelo));
	}
	
	@Test
	public void origenNoDisponible(){
		VueloBean vuelo = new VueloBean();
		vuelo.setOrigen("Machu pichu");
		assertEquals("Origen no disponible", vuelo.origenVueloDisponible(vuelo));
	}
	
	@Test
	public void destinoDisponible() {
		VueloBean vuelo = new VueloBean();
		vuelo.setOrigen("Puerto Montt");
		assertEquals("Disponible", vuelo.destinoVueloDisponible(vuelo));
	}
	
	@Test
	public void destinoNoDisponible(){
		VueloBean vuelo = new VueloBean();
		vuelo.setOrigen("Machu pichu");
		assertEquals("Destino no disponible", vuelo.destinoVueloDisponible(vuelo));
	}

}
