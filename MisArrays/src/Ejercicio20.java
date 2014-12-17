/*
Realizar una funci�n que nos permita obtener el menor y el mayor elemento almacenado en
un array a de tama�o m�ximo MAX y N elementos, estos datos ser�n devueltos en un array 
mayorMenor de tama�o m�ximo 2, con dos elementos si hay mayor y menor y son distintos, de 
un elemento si hay mayor y menor pero coinciden y vac�o si el array est� vac�o.
 */

import java.util.Scanner;
public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int max, n, minMax[], a[];
		
		System.out.println("Introduce el tama�o del array");
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
