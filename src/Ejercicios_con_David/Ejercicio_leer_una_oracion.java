/**
 * 
 */
package Ejercicios_con_David;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Crea un programa que lea una oracion e imprima cuantas palabras contiene
 */
public class Ejercicio_leer_una_oracion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);
		
		System.out.println("Escribe una frase:");
		
		String frase = leer.nextLine();
		int contador=1;
		//String[] palabras= frase.split(" ");

		for(int i=0; i<frase.length();i++)
		{
			char palabra= frase.charAt(i);
			
			if(palabra==' ') 
			
			contador++;
			
			
		}
		System.out.println(contador);
		
		
//System.out.println(palabras.length);


	}

}
