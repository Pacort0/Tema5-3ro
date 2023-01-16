package ejercicios;

import java.util.Arrays;

public class Ejercicio06 {

	public static void main(String[] args) {
		//Creamos las variables del programa
		int tablaAsciende[] = new int[100]; //Tabla ascendente
		int tablaDesciende[] = new int[tablaAsciende.length]; //Tabla descendente
		int cont = 0; //contador para rellenar la segunda tabla
		
		//Bucle for que rellena la tabla ascendente.
		for(int i = 0; i < 100; i++) {
			tablaAsciende[i] = i + 1;
		}
		
		//Bucle for que rellena la tabla descendente en función de los valores de la tabla ascendente.
		for(int j = tablaDesciende.length - 1; j >= 0; j--) {
			tablaDesciende[j] = tablaAsciende[cont];
			cont++;
		}
		//Imprimimos ambas tablas
		System.out.println(Arrays.toString(tablaAsciende));
		System.out.println(Arrays.toString(tablaDesciende));
	}

}
