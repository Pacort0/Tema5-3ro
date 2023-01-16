package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		//Creamos las tablas con el mismo tamaño
		int tablaEnteros[] = new int [10];
		int tablaNoRepite[] = new int[0];
		//Creamos un contador para no machacar la nueva tabla
		int posicionNueva = 0;
		
		//Escáner del programa
		Scanner sc = new Scanner (System.in);
		
		//Rellenamos la tabla manualmente
		for(int i = 0; i < tablaEnteros.length; i++) {
			System.out.print("Introduzca un valor: ");
			tablaEnteros[i] = sc.nextInt();
		}
		
		//Recorremos la tabla buscando números no repetidos para añadirlos a la nueva tabla
		for(int i = 0; i < tablaEnteros.length; i++){
			//Llamamos a la función 'busqueda'
			if(!busqueda(tablaEnteros[i], tablaNoRepite)) {
				tablaNoRepite = Arrays.copyOf(tablaNoRepite, tablaNoRepite.length+1);
				tablaNoRepite[posicionNueva] = tablaEnteros[i];
				posicionNueva++;
			}
		}
		
		//Imprimimos ambas tablas
		System.out.println(Arrays.toString(tablaEnteros));
		System.out.println(Arrays.toString(tablaNoRepite));
		sc.close();
	}
	
	//Función 'busqueda, recibe por parámetros un número a buscar
	//y una tabla donde buscar
	public static boolean busqueda(int num, int tabla[]) {
		//Creamos la variable a devolver y un indice de búsqueda
		boolean repetido = false;
		
		//Buscamos en la tablaEnteros si algún número se repite con los que hay en la nueva tabla
		for(int j=0; j<tabla.length; j++) {
			if(num == tabla[j]) {
				repetido = true;
				break;
			}
		}
		//Se devuelve el valor de 'repetido'
		return repetido;
	}

}