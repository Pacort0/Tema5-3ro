package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		//Creamos las variables del programa
		//tabla de tamaño '10'
		int tabla[] = new int[10];
		//Variable auxiliar para mover números en la tabla
		int aux = 0;
		//Contador de los números primos que llevamos
		int contPrimo = 0;
		
		Scanner sc = new Scanner (System.in); //Escáner del programa
		
		//Rellenamos la tabla manualmente
		for(int i = 0; i < tabla.length; i++) {
			System.out.println("Introduzca un valor entero: ");
			tabla[i] = sc.nextInt();
		} 
		
		//Buscamos los números primos de la tabla y los movemos a las primeras posiciones
		for(int i = 0; i < tabla.length; i++) {
			if(esPrimo(tabla[i])) { //Si tabla[i] es primo
				
				aux = tabla[contPrimo]; //El valor de aux pasa a ser el valor de tabla[contPrimo]
				tabla[contPrimo] = tabla[i]; //El valor de tabla[contPrimo] pasa a ser el valor de tabla[i]
				tabla[i] = aux; //El valor de tabla[i] pasa a ser el valor de 'aux'
				
				contPrimo++; //Incrementamos el valor del contPrimo en uno
			}
		}
		
		System.out.println(Arrays.toString(tabla)); //Imprimimos el resultado final
		sc.close();
		
		
	}
	//Función para detectar los números primos de la tabla,
	//recibe por parámetro un número entero y devuelve un booleano
	public static boolean esPrimo(int num) { 
		boolean primo = true;
		
		for(int i = num - 1; i > 1; i--){
			if(num % i == 0) {
				primo = false;
			}
		}
		
		return primo;
	}

}