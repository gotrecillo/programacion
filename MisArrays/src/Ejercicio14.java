/*
 Dise�ar una funci�n que reciba dos par�metros, n�mero de filas y n�mero de columnas y dibuje :
	***
	***
	***
*/

import java.util.Scanner;
public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int filas, columnas;
		
		System.out.println("Introduce el n�mero de filas que quieras pintar");
		filas = teclado.nextInt();
		System.out.println("Introduce el n�mero de columnas que quieras pintar");
		columnas = teclado.nextInt();
		MisArrays.pintaCuadrado(filas, columnas);

	}

}
