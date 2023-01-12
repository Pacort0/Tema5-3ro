package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		int tablaEnteros[] = new int[10];
		int numPares[] = new int[tablaEnteros.length];
		int numImpares[] = new int [tablaEnteros.length];
		int contImpares = 0;
		int contPares = 0;
		
		Scanner sc = new Scanner (System.in);
		
		for(int i = 0; i < tablaEnteros.length; i++) {
			System.out.print("Introduzca un valor: ");
			tablaEnteros[i] = sc.nextInt();
		}
		
		for(int j = 0; j < tablaEnteros.length; j++) {
			if(signo(tablaEnteros[j])) {
				numImpares[contImpares] = tablaEnteros[j];
				contImpares++;
			}
			else {
				numPares[contPares] = tablaEnteros[j];
				contPares++;
			}
		}
		
		System.out.println(Arrays.toString(tablaEnteros));
		System.out.println(Arrays.toString(numPares));
		System.out.println(Arrays.toString(numImpares));
		
		sc.close();
		
	}
	
	public static boolean signo(int num) {
		boolean impar = true;
		
		if(num % 2 == 0) {
			impar = false;
		}
		
		return impar;
	}

}
