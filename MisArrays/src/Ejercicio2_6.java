/*
Escriba un programa que lea de la entrada un número y utilice ese número 
para crear un array de enteros de ese tamaño. A continuación, el programa 
inicializará el array con los valores que el usuario introduzca por la entrada. 
Finalmente, se deberá recorrer el array e imprimir tantos caracteres ‘*’ como 
indique el valor de cada elemento del array. Ejemplo: los valores 5,4,3,2 
producirán la siguiente salida:
*****
****
***
**
 */

import java.util.Scanner;
public class Ejercicio2_6 {

	public static void main(String[] args) {
		int a[], size, n;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el tamaño del array");
		size = teclado.nextInt();
		System.out.println("Introduce el numero de elementos que quieras introducir en el array");
		n = teclado.nextInt();
		a = new int[size];
		MisArrays.llenarArray(a, n);
		MisArrays.pintaAsteriscos(a, n);
	}

}
