package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		int tabla[] = new int [10];
		int tablaPrima[] = new int[tabla.length];
		int contPrimo = 0;
		int contNoPrimo = tabla.length-1;
		boolean primo = true;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < tabla.length; i++) {
			System.out.print("Introduzca el " + (i+1) + "º valor de la tabla: ");
			tabla[i] = sc.nextInt();
			
			for(int j = (tabla[i] - 1); j > 1; j--) {
				if(tabla[i] % j == 0) {
					primo = false;
					break;
				}
			}
			if (primo == true) {
				tablaPrima[contPrimo] = tabla[i];
				contPrimo++;
			} 
			else {
				tablaPrima[contNoPrimo] = tabla[i];
				contNoPrimo--;
			} 
		}
		
		System.out.println(Arrays.toString(tabla));
		System.out.print(Arrays.toString(tablaPrima));
		
		sc.close();
	}

}
