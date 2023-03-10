package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		//Creamos las variables del programa
		int tablaEnteros[] = new int[10]; //Tabla original
		int numPares[] = new int[0]; //Tabla de pares
		int numImpares[] = new int [0]; //Tabla de impares
		int contImpares = 0; //Contador de impares
		int contPares = 0; //Contador de pares
		
		Scanner sc = new Scanner (System.in); //Scanner del programa
		
		//Bucle for que rellena la tabla
		for(int i = 0; i < tablaEnteros.length; i++) {
			System.out.print("Introduzca un valor: ");
			tablaEnteros[i] = sc.nextInt();
		}
		
		//Bucle for que separa los números en sus correspondientes tablas
		for(int j = 0; j < tablaEnteros.length; j++) {
			if(signo(tablaEnteros[j])) {
				//Creamos una copia de la tabla de impares pero con un hueco más
				numImpares = Arrays.copyOf(numImpares, contImpares+1);
				//Introducimos el nuevo número impar
				numImpares[contImpares] = tablaEnteros[j];
				contImpares++; //Aumentamos el valor del contador de impares
			}
			else {
				//Creamos una copia de la tabla de pares pero con unn hueco más
				numPares = Arrays.copyOf(numPares, contPares+1);
				//Introducimos el nuevo número par
				numPares[contPares] = tablaEnteros[j];
				contPares++; //Aumentamos el valor del contador de pares
			}
		}
		
		//Imprimimos las tablas resultantes
		System.out.println(Arrays.toString(tablaEnteros));
		System.out.println(Arrays.toString(numPares));
		System.out.println(Arrays.toString(numImpares));
		
		//Cerramos el escáner
		sc.close();
		
	}
	
	//Función para separar los números según su signo
	public static boolean signo(int num) {
		boolean impar = true;
		//Si es divisible entre dos es par --> impar == false
		if(num % 2 == 0) {
			impar = false;
		}
		
		return impar;
	}

}