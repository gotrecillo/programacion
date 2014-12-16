/*
 Diseñar una función que reciba dos parámetros, número de filas y número de columnas y dibuje :
	***
	***
	***
*/

import java.util.Scanner;
public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int filas, columnas;
		
		System.out.println("Introduce el número de filas que quieras pintar");
		filas = teclado.nextInt();
		System.out.println("Introduce el número de columnas que quieras pintar");
		columnas = teclado.nextInt();
		MisArrays.pintaCuadrado(filas, columnas);

	}

}
