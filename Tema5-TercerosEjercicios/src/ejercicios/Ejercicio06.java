package ejercicios;

import java.util.Arrays;

public class Ejercicio06 {

	public static void main(String[] args) {
		int tablaAsciende[] = new int[100];
		int tablaDesciende[] = new int[tablaAsciende.length];
		int cont = 0;
		
		for(int i = 0; i < 100; i++) {
			tablaAsciende[i] = i + 1;
		}
		
		for(int j = tablaDesciende.length - 1; j >= 0; j--) {
			tablaDesciende[j] = tablaAsciende[cont];
			cont++;
		}
		System.out.println(Arrays.toString(tablaAsciende));
		System.out.println(Arrays.toString(tablaDesciende));
	}

}
