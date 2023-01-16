package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		//Creamos las variables del programa 
		int tabla[] = new int [10]; //tabla original
		String opcion; //Variable para guardar la elección del usuario
		int nueValor; //Variable para guardar el nuevo valor introducido
		int nuePosicion; //Variable para guardar la posición del valor introducido
		
		Scanner sc = new Scanner (System.in); //Escáner del programa
		
		//Bucle for para rellenar la tabla con números aleatorios
		for(int i = 0; i < tabla.length; i++) {
			tabla[i] = (int)(Math.random()*100-0);
		}
		
		//Menú del programa
		System.out.println("ELIJA UNA OPCIÓN: \n"
				+ "A) Mostrar valores\n"
				+ "B) Introducir valor\n"
				+ "C) Salir");
			opcion = sc.next();
			
			//Se imprime al menos una vez
		do {	
			//Según la opción introducida
			switch(opcion) {
			case "a": //opción 'a'
				System.out.println(Arrays.toString(tabla)); //Mostramos la tabla
				break;
			case "b": //opción 'b'
				System.out.println("Introduzca el nuevo valor: "); //pedimos un nuevo valor
				nueValor = sc.nextInt();
				System.out.println("Introduzca la posición en la que insertarlo: "); //pedimos la posición en la que introducirlo
				nuePosicion = sc.nextInt();
				tabla[nuePosicion] = nueValor; //introducimos el valor en dicha posición
				break;
			case "c": //opción 'c' 
				System.out.println("Programa cerrado, tenga un buen día."); //Cerramos el programa
				break;
				default:  //Si la opción introducida no existe
					System.out.println("Esa opción no existe"); 
			}
			//Pedimos otra opción
			System.out.println("\nElija otra opción: ");
			opcion = sc.next();
			if(opcion.equals("c")) {
				System.out.println("Programa cerrado, tenga un buen día.");
			}
		} while(!opcion.equals("c")); //El bucle correrá mientras opción != c
		
		sc.close(); //Cerramos el escáner
	}

}
