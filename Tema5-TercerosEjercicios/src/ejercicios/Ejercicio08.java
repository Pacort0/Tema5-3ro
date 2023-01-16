package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		//Creamos las variables del programa
		int vInicial; //Valor inicial
		int incremento; //Valor por el que incrementar el valor inicial
		int limite; //Cantidad de valores de la secuencia
		
		Scanner sc = new Scanner(System.in); //Scanner del programa
		
		//Pedimos todos los valores para cada variable
		System.out.print("Introduzca el valor inicial de la secuencia: ");
		vInicial = sc.nextInt();
		System.out.print("Introduzca el valor por el que se va a incrementar dicho valor: ");
		incremento = sc.nextInt();
		System.out.print("Introduzca la cantidad de números a generar de la secuencia: ");
		limite = sc.nextInt();
		
		int tabla[] = new int[limite]; //Creamos la tabla de longitud 'limite'
		
		//Bucle for que rellena la tabla y aumenta el valor a introducir tras cada iteración
		for(int i = 0; i < limite; i++) {
			tabla[i] = vInicial;
			vInicial += incremento;
		}
		
		//imprimimos la tabla resultante
		System.out.println(Arrays.toString(tabla));
		
		sc.close(); //Cerramos el escáner
	} 

}
