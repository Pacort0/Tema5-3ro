package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		int tabla[] = new int[10];
		int aux = 0;
		int contPrimo = 0;
		
		Scanner sc = new Scanner (System.in);
		
		//Rellenamos la tabla
		for(int i = 0; i < tabla.length; i++) {
			System.out.println("Introduzca un valor entero: ");
			tabla[i] = sc.nextInt();
		} 
		
		for(int i = 0; i < tabla.length; i++) {
			if(esPrimo(tabla[i])) {
				
				aux = tabla[contPrimo];
				tabla[contPrimo] = tabla[i];
				tabla[i] = aux;
				
				contPrimo++;
			}
		}
		
		System.out.println(Arrays.toString(tabla));
		sc.close();
		
		
	}
	
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
