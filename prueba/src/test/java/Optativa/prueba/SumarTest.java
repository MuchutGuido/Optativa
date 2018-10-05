	package Optativa.prueba;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumarTest {
	private Calculadora c = new Calculadora();

	@Test
	public void sumar() {
		String res = c.sumar(8, 2);
		assertEquals("10", res);
	}
	
	@Test
	public void sumarMax() {
		String res = c.sumar(Integer.MAX_VALUE, 1);
		assertEquals("Desbordamiento", res);
	}

}
