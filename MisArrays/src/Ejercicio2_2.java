/*
 Escriba un programa que lea de la entrada un número y determine si es un 
número primo.
 */

import java.util.Scanner;
public class Ejercicio2_2 {
	
	public static void main(String[] args) {
		int n;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		n = teclado.nextInt();
		
		if(Divisor.esPrimo(n)){
			System.out.println(n+" es primo");
		}else{
			System.out.println(n+" no es primo");
		}

	}

}
