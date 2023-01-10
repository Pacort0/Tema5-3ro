package ejercicios;

import java.util.Arrays;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		int tabla[] = new int [20];
		
		for(int i = 0; i < tabla.length; i++) {
			tabla[i] = (int)(Math.random()*100 - 0);
		}
		
		for(int i = 0; i < tabla.length; i++) {
			
		}
		
		System.out.print(Arrays.toString(tabla));
	}

}
