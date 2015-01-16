/*
Escriba un programa que pida un número al usuario y muestre por pantalla el 
resultado de su raíz cuadrada. Para realizar este ejercicio se puede utilizar un 
método aproximado que permita llegar a la solución con un error menor de 
0,0001. Lógicamente para su resolución no se puede utilizar la función de 
biblioteca Math.sqrt() pero sí se puede utilizar la que devuelve el valor 
absoluto de un real (Math.abs(numero)). 
 */

import java.util.Scanner;
public class Ejercicio2_15 {

	public static void main(String[] args) {
		double margen = 0.0001;
		Scanner teclado = new Scanner(System.in);
		int numero, contador=0;
		double raiz = 0;
		
		System.out.println("Introduce un número");
		numero = teclado.nextInt();
		while (Math.abs(raiz*raiz - numero) > margen){
			raiz = raiz + margen;
			contador++;
		}
		System.out.println("La raiz del numero es "+raiz+" "+contador);
		
		

	}

}
