/**
 * 
 */
package Ejercicios_con_David;

import java.util.Scanner;

/**
 * 
 */
public class Ejercicios_test_sumar_hasta_num_negativo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer= new Scanner (System.in);
		int num, suma=0;
		System.out.println("Introduce un numero");
		
		num=leer.nextInt();	
		
		while(num>=0) 
		{
			System.out.println("Introduce los numeros");
			num=leer.nextInt();
			suma+=num;
		}
		
		System.out.println(suma);
		
	}

}
