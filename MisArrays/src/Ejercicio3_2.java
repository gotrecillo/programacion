/*
 2. Diseñar un método  que reciba un número n y nos permita obtener un array con todos los divisores primos de ese número.
 */

import java.util.Scanner;
public class Ejercicio3_2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, divisores, a[];
		System.out.println("Introduce el numero del que quieras obtener sus divisores primos");
		numero = teclado.nextInt();
		divisores = Divisor.contarDivisoresPrimos(numero);
		a = divisoresPrimos(numero);
		MisArrays.visualizarArray(a, divisores);
	}
	
	public static int[] divisoresPrimos (int numero){
		int divisores = Divisor.contarDivisoresPrimos(numero);
		int a[] = new int[divisores];
		int inicio = 2;
		boolean encontrado = false;
		for (int i = 0; i < divisores; i++){
			for (int j = inicio; encontrado == false; j++){
				if (Divisor.esDivisor(numero, j) && Divisor.esPrimo(j)){
					a[i] = j;
					encontrado = true;
					inicio = j+1;
				}
			}
			encontrado = false;
		}
		return a;
	}
}
