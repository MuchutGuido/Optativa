package Optativa.prueba;

import static org.junit.Assert.*;

import org.junit.Test;

public class DividirTest {

	private Calculadora c = new Calculadora();
	
	@Test
	public void dividirPorCero() {
		try {
			double res = c.dividir(20, 4);
			System.out.println(res);
		}
		catch (ArithmeticException e){
			final String msj = "Error, Imposible dividir por cero";
			assertEquals(msj, e.getMessage());
		}
	}

}
