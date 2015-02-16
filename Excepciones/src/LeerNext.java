/*
 4. Las excepciones de la clase InputMismatchException, FormatNumberException  controlan que el formato de lo  que se 
 lee por teclado con nextInt(), nextDouble(), …    sea realmente un número del tipo correcto. Realizar un programa que nos permita leer 
 un número entero, controlando la excepción que se generaría si no se introduce un número entero.
  (Utilizar next() para leer del buffer el elemento no reconocido para eliminarlo).
 */

import java.util.Scanner;

public class LeerNext {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int x;
		double y;
		
		try {
			x = sc.next();
		} catch (Exception  e) {
			// TODO: handle exception
		}
	}	
}
