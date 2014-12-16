/*
 Diseñar una función que reciba un número n y nos permita obtener un array con todos los 
 divisores de ese número. El tamaño del array será exactamente igual al número de divisores del 
 número
 */

import java.util.Scanner;
public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n, divisores, d[];
		
		System.out.println("Introduce el número del cual quieras guardar sus divisores");
		n = teclado.nextInt();
		divisores = Divisor.contarDivisores(n);
		d = new int[divisores];
		for(int i = 1, j = 0; i <= n; i++ ){
			if(Divisor.esDivisor(n, i)){
				d[j] = i;
				j++;
			}
		}
		System.out.println("Los divisores del número son:");
		MisArrays.visualizarArray(d, divisores);
	}

}
