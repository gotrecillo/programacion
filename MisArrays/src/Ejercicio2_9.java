/*
 Escribir un programa que lea un número de enteros entre 1 y 100 de la 
entrada estándar y genere un histograma con las frecuencias de cada entero
en la secuencia.  Para representar las barras del histograma utilizar 
secuencias del carácter ‘*’. Por ejemplo, la secuencia: 1, 1, 20, 1, 2, 20, 3, 3, 
3,4,4,4,33,3 generaría la siguiente salida:
1: ***
2: *
3: ****
4: ***
20:**
33:*
 */

import java.util.Scanner;
public class Ejercicio2_9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a[];
		int n, max, dato, repeticiones;
		
		System.out.println("Introduce el tamaño maximo del array");
		max = teclado.nextInt();
		System.out.println("Introduce numero de elementos que quieres introducir");
		n = teclado.nextInt();
		a = new int[max];
		
		for (int i = 0; i < n; i++){
			System.out.println("Introduce un numero entre 1 y 100");
			dato = teclado.nextInt();
			while ((dato > 100) || (dato < 1)){
				System.out.println("El numero tiene que estar comprendido entre 1 y 100");
				dato = teclado.nextInt();
			}
			a[i] = dato;
		}
		
		System.out.println("Las frecuencias de los números es:");
		for (int i = 1; i <= 100; i++){
			repeticiones = MisArrays.contarDato(a, n, i);
			if (repeticiones != 0){
				System.out.print(i+": ");
				pintaAsteriscos(repeticiones);
				System.out.println();
			}
		}
		

	}
	
	public static void pintaAsteriscos(int cantidad){
		for (int i = 0; i < cantidad; i++){
			System.out.print("*");
		}
	}
}
