/*
 7. Diseñar un algoritmo que simule el proceso de obtención de números primos entre 1 y n llamado “Criba de Erastótenes”.
En el proceso se siguen los siguientes pasos:
Se almacenan en un array los números naturales entre 1 y n. Se elimina el 1. Se deja el 2 y se eliminan todos los demás números pares. 
Se deja el tres y se eliminan todos sus múltiplos. etc...
Así, cuando pasemos del 13, estarán  eliminados14, 15 y 16, con lo que seguimos el proceso en el 17…
 */

import java.util.Scanner;
public class Ejercicio3_7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n, raiz, primos[];
		System.out.println("¿ Hasta que numero quieres obtener los números primos ?");
		n = teclado.nextInt();
		primos = new int[n];
		for (int i = 0; i < n; i++){
			primos[i] = i + 1;
		}
		for (int i = 1; i < n ; i++){
			for ( int j = 2, borrable = 0; borrable < primos[n-1]; j++){
				borrable = primos[i] * j;
				n = MisArrays.borrar(primos, n, borrable);
			}
			
		}
		MisArrays.visualizarArray(primos, n);
	}

}
