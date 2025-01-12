/**
 * 
 */
package Ejercicios_con_David;

import java.util.Scanner;

/**
 * 
 */
public class Ejercicios_test_calificaciones {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer=new Scanner(System.in);
		
		int nota;
		
		System.out.println("Escribe la nota que sacaste");
		
		nota=leer.nextInt();
		
		if(nota>=9) 
		{
			System.out.println("Excelente trabajo");
		}
		else if(nota<5) 
		{
			System.out.println("Suspendió");
		}
		else if(nota>=5) 
		{
			System.out.println("Aprobó");
		}
		
	}

}
