package ejercicios;

import java.util.Arrays;
import java.util.Scanner;
/**
 * ejercicio 1
 * @author frodriguez
 *
 */
public class Ejercicio01 {
	
	/**
	 * Variable global que indica el tamaño de la tablas
	 */
	final static int TAM = 15;
	
	/**
	 * Método main
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Dos tablas de tamaño idéntico
		 */
		int tabla1[] = new int [TAM];
		int tabla2[] = new int [TAM];
		/**
		 * Último número que se introduzca por teclado
		 */
		int ultimo;
		
		/**
		 * Escáner del programa
		 */
		final Scanner scan = new Scanner(System.in);
		
		/**
		 * Bucle for para rellenar la tabla 1
		 */
		for(int i = 0; i < tabla1.length; i++) {
			System.out.print("Introduzca un valor: ");
			tabla1[i] = scan.nextInt();
		}
		
		/**
		 * El último valor introducido se guarda en ultimo
		 */
		 ultimo = tabla1[TAM - 1];
		 
		 /**
		  * Copiamos los valores de la tabla 1 a la tabla 2 de las posiciones 0 a la 14,
		  *  empezando por la segunda posición de la tabla 2
		  */
		 System.arraycopy(tabla1, 0, tabla2, 1, 14);
		 
		 /**
		  * La primera posición de la tabla 2 es 'ultimo'
		  */
		 tabla2[0] = ultimo;
		 
		 System.out.println(Arrays.toString(tabla1));
		 System.out.print(Arrays.toString(tabla2));
		
		 scan.close();
	}
}
