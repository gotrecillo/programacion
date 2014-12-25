/*
 Escribir un programa que recoja de la entrada estándar dos arrays de enteros 
de tamaño especificado por el usuario y los multiplique dos a dos, guardando 
el resultado en otro array e imprimiendo los valores de este último array.
 */

import java.util.Scanner;
public class Ejercicio2_5{ 

	public static void main(String[] args){
		int a[], b[], c[], size, n;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el tamaño de los arrays");
		size = teclado.nextInt();
		a = new int[size];
		b = new int[size];
		c = new int[size];
		
		
		System.out.println("Introduce cuantos elementos quieres llenar en los arrays");
		n = teclado.nextInt();
		
		System.out.println("LLenamos el primer array");
		MisArrays.llenarArray(a, n);
		
		System.out.println("LLenamos el segundo array");
		MisArrays.llenarArray(b, n);
		
		c = MisArrays.multiplicacionArray(a, b, n);
		System.out.println("Visualizamos el resultado de la multiplicacion");
		MisArrays.visualizarArray(c, n);
	}
}
