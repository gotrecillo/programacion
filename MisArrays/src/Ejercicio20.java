/*
Realizar una función que nos permita obtener el menor y el mayor elemento almacenado en
un array a de tamaño máximo MAX y N elementos, estos datos serán devueltos en un array 
mayorMenor de tamaño máximo 2, con dos elementos si hay mayor y menor y son distintos, de 
un elemento si hay mayor y menor pero coinciden y vacío si el array está vacío.
 */

import java.util.Scanner;
public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int max, n, minMax[], a[];
		
		System.out.println("Introduce el tamaño del array");
		max = teclado.nextInt();
		System.out.println("Introduce cuantos elementos quieres introducir");
		n = teclado.nextInt();
		a = new int[max];
		MisArrays.llenarArray(a, n);
		System.out.println("El array es este");
		MisArrays.visualizarArray(a, n);
		minMax = MisArrays.mayorMenor(a, n);
		System.out.println("El menor y el mayor son:");
		MisArrays.visualizarArray(minMax, minMax.length);
	}

}
