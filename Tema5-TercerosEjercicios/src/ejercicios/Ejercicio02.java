package ejercicios;

import java.util.Arrays;

/**
 * ejercicio 2
 * @author frodriguez
 *
 */

public class Ejercicio02 {
	
	/**
	 * método main
	 * @param args
	 */

	public static void main(String[] args) {
		/**
		 * Creación de la tabla y asignación de tamaño
		 */
		int tabla[] = new int [20];
		/**
		 * Contador de números impares generados
		 */
		int contadorImpar = 0;
		/**
		 * Contador de números pares generados
		 */
		int contadorPar = 0;	
		/**
		 * Bucle for-each que recorre y va rellenando la tabla
		 */
		for(int i : tabla) {
			i = (int)(Math.random()*100 - 0);
				//Si el número es divisible entre 2, es par
			if(i % 2 == 0) {
				//Lo insertamos en la tabla por el comienzo 
				tabla[contadorPar] = i;
				//Aumentamos el valor del contador pertinente
				contadorPar++;
			}
			//Si no es par, es impar
			else {
				//Insertamos el número en la tabla por detrás en la primera posición disponible
				tabla[(tabla.length-1) - contadorImpar] = i;
				//Aumentamos el valor del contador pertinente
				contadorImpar++;	
			}
		}
		//Imprimimos el array final
		System.out.print(Arrays.toString(tabla));
	}

}