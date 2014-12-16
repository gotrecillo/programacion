/*
 Diseñar una función Borrar () que permita borrar un dato almacenado en un array, que reciba
la referencia a un array de números enteros , el número de elementos del array y el dato que 
queremos borrar.
 */

import java.util.Scanner;
public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int size, llenos, dato;
		int a[];
		
		System.out.println("Introduce el tamaño del array");
		size = teclado.nextInt();
		System.out.println("Introduce cuantos elementos quieres que esten ocupados");
		llenos = teclado.nextInt();
		System.out.println("Introduce el dato que quieras eliminar del array");
		dato = teclado.nextInt();
		a = new int [size];
		MisArrays.llenarArray(a, llenos);
		System.out.println("Este es el array:");
		MisArrays.visualizarArray(a, llenos);
		llenos = MisArrays.borrar(a, llenos, dato);
		System.out.println("El array ha quedado asi");
		MisArrays.visualizarArray(a, llenos);
	}

}
