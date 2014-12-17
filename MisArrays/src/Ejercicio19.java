/*
 Realizar una función que permita calcular la media de los elementos de un array de números enteros de tamaño máximo MAX y N elementos.
 */

import java.util.Scanner;
public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int max, n, a[];
		double media;
		
		System.out.println("Introduce el tamaño del array");
		max = teclado.nextInt();
		System.out.println("Introduce cuantos elementos quieres introducir");
		n = teclado.nextInt();
		a = new int[max];
		MisArrays.llenarArray(a, n);
		System.out.println("El array es este");
		MisArrays.visualizarArray(a, n);
		media = MisArrays.mediaArray(a, n);
		System.out.println("La media del array es");
		System.out.println(media);
				
	}

}
