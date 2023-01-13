package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		int vInicial;
		int incremento;
		int limite;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el valor inicial de la secuencia: ");
		vInicial = sc.nextInt();
		System.out.print("Introduzca el valor por el que se va a incrementar dicho valor: ");
		incremento = sc.nextInt();
		System.out.print("Introduzca la cantidad de números a generar de la secuencia: ");
		limite = sc.nextInt();
		
		int tabla[] = new int[limite];
		
		for(int i = 0; i < limite; i++) {
			tabla[i] = vInicial;
			vInicial += incremento;
		}
		
		System.out.println(Arrays.toString(tabla));
		
		sc.close();
	} 

}
