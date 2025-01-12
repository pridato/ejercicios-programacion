/**
 * 
 */
package Ejercicios_con_David;

import java.util.Scanner;

/**
 * 
 */
public class Ejercicios_test_edades {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer=new Scanner(System.in);
		
		int edad;
		
		System.out.println("Introduce la edad");
		
		edad=leer.nextInt();
		
		
		if(edad>=18) 
		{
			System.out.println("Eres mayor de edad");
			
		}else {
			System.out.println("Eres menor de edad");
		}
		 
		 
		 
		 
		 
		 
		
	}

}
