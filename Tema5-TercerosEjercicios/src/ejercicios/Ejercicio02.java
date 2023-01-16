package ejercicios;

import java.util.Arrays;

public class Ejercicio02 {

	public static void main(String[] args) {
		//Creación de la tabla y asignación de tamaño
		int tabla[] = new int [20];
		// Contador de números impares generados
		int contadorImpar = tabla.length-1;
		//Contador de números pares generados
		int contadorPar = 0;
		//Variable para guardar cada número generadO
		int num;
		
		//Bucle for que recorre y va rellenando la tabla
		for(int i = 0; i < tabla.length; i++) {
			num = (int)(Math.random()*101);
				//Si el número es divisible entre 2, es par]
			if(num % 2 == 0) {
				//Lo insertamos en la tabla por el comienzo 
				tabla[contadorPar] = num;
				//Aumentamos el valor del contador pertinente
				contadorPar++;
			}
			//Si no es par, es impar
			else {
				//Insertamos el número en la tabla por detrás en la primera posición disponible
				tabla[contadorImpar] = num;
				//Aumentamos el valor del contador pertinente
				contadorImpar--;	
			}
		}
		//Imprimimos el array final
		System.out.print(Arrays.toString(tabla));
	}

}