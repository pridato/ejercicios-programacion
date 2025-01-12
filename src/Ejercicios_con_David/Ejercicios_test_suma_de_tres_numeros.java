/**
 * 
 */
package Ejercicios_con_David;

import java.util.Scanner;

/**
 * 
 */
public class Ejercicios_test_suma_de_tres_numeros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer= new Scanner (System.in);
		
		int num1, num2, num3, suma;
		
		System.out.println("Escribe 3 numeros");
		
		num1=leer.nextInt();
		
		num2=leer.nextInt();
		
		num3=leer.nextInt();
		
		suma= num1 + num2 + num3;
		
		System.out.println(suma);
		
		
		
	}

}
