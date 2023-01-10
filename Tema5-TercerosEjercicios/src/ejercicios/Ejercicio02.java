package ejercicios;

import java.util.Arrays;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		int tabla[] = new int [20];
		int contadorImpar = 0;
		int contadorPar = 0;
		int num;
		
		for(int i = 0; i < tabla.length; i++) {
			num = (int)(Math.random()*100 - 0);
			if(num % 2 == 0) {
				tabla[contadorPar] = num;
				contadorPar++;
			}
			else {
				tabla[(tabla.length-1) - contadorImpar] = num;
				contadorImpar++;	
			}
		}
		
		System.out.print(Arrays.toString(tabla));
	}

}
