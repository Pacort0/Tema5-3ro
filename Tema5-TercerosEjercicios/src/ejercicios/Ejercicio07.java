package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		int tabla[] = new int [10];
		String opcion;
		int nueValor;
		int nuePosicion;
		
		Scanner sc = new Scanner (System.in);
		
		for(int i = 0; i < tabla.length; i++) {
			tabla[i] = (int)(Math.random()*100-0);
		}
		
		System.out.println("ELIJA UNA OPCIÓN: \n"
				+ "A) Mostrar valores\n"
				+ "B) Introducir valor\n"
				+ "C) Salir");
			opcion = sc.next();
		do {	
			switch(opcion) {
			case "a":
				System.out.println(Arrays.toString(tabla));
				break;
			case "b":
				System.out.println("Introduzca el nuevo valor: ");
				nueValor = sc.nextInt();
				System.out.println("Introduzca la posición en la que insertarlo: ");
				nuePosicion = sc.nextInt();
				tabla[nuePosicion] = nueValor;
				break;
			case "c":
				System.out.println("Programa cerrado, tenga un buen día.");
				break;
				default: 
					System.out.println("Esa opción no existe");
			}
			System.out.println("\nElija otra opción: ");
			opcion = sc.next();
			if(opcion.equals("c")) {
				System.out.println("Programa cerrado, tenga un buen día.");
			}
		} while(!opcion.equals("c"));
		
		sc.close();
	}

}
