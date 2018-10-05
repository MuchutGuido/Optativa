package Optativa.prueba;

public class Calculadora {

	/*
	 * Realiza la suma de dos numeros enteros
	 * 
	 * @param dos numeros enteros
	 * 
	 * @author Muchut Guido
	 * */
	public double dividir(int i, int j) {
		// TODO Auto-generated method stub
		if (j == 0) {
			throw new ArithmeticException("Error, Imposible dividir por cero");
		}
		else {
			return i/j;
		}
	}

	public String sumar(int k, int i) {
		// TODO Auto-generated method stub
		if(k == Integer.MAX_VALUE || i == Integer.MAX_VALUE) {
			return "Desbordamiento";
		}
		return String.valueOf(k+i);
	}

}
