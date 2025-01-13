/**
 * 
 */
package Ejercicios_con_David;

/**
 * 
 */
public class FizzBuzz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escribe un programa que imprima los números del 1 al 100, pero:
		 * 
		 * Si un número es divisible por 3, imprime "Fizz" en lugar del número. Si es
		 * divisible por 5, imprime "Buzz". Si es divisible por ambos (3 y 5), imprime
		 * "FizzBuzz". Si no cumple ninguna de las condiciones, imprime el número.
		 */

		for (int i = 1; i < 101; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(i);
			}

		}
	
	}

}
