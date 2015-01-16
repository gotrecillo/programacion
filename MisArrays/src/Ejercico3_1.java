/*
 1. Diseñar un método que reciba un número n y nos permita obtener un array con todos los divisores de ese número.
 */

import java.util.Scanner;
public class Ejercico3_1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a[], divisores, numero;
		
		System.out.println("Introduce el numero del que quieras guardar sus divisores");
		numero = teclado.nextInt();
		divisores = Divisor.contarDivisores(numero);
		a = divisores(numero);
		MisArrays.visualizarArray(a, divisores);
	}
	
	public static int[] divisores(int numero){
		int divisores = Divisor.contarDivisores(numero);
		int a[] = new int[divisores];
		int inicio = 1;
		boolean encontrado = false;
		
		for (int i = 0; i < divisores; i++){
			for (int j = inicio; encontrado == false; j++){
				if (Divisor.esDivisor(numero, j)){
					encontrado = true;
					a[i] = j;
					inicio = j + 1;
				}
			}
			encontrado = false;
		}
		return a;
	}
}
