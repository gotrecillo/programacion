/*
Diseñar una función buscar() que busque un dato en un array de números enteros y devuelva
una referencia a un array que contiene las posiciones donde se encuentra el dato buscado. El 
tamaño del array será exactamente igual al número de veces que se encuentre el elemento 
buscado
*/

import java.util.Scanner;
public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int size, llenos, dato;
		int a[], posiciones[];
		
		System.out.println("Introduce el tamaño del array");
		size = teclado.nextInt();
		System.out.println("Introduce cuantos elementos quieres que esten ocupados");
		llenos = teclado.nextInt();
		System.out.println("Introduce el dato que quieras buscar dentro del array");
		dato = teclado.nextInt();
		a = new int [size];
		MisArrays.llenarArray(a, llenos);
		System.out.println("Este es el array:");
		MisArrays.visualizarArray(a, llenos);
		posiciones = MisArrays.buscar(a, llenos, dato);
		System.out.println("Las posiciones en las que esta el dato buscado son:");
		MisArrays.visualizarArray(posiciones, posiciones.length);
	}
}