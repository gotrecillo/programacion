/*
 Diseñar una función que nos permita eliminar de un array de números enteros
 todos aquellos elementos iguales a uno dado ( por ej. todos los elementos iguales a 9).
 */
 
import java.util.Scanner;
public class Ejercicio12 {
	
	public static void main (String[]args){
		Scanner teclado = new Scanner(System.in);
		boolean encontrado;
		int a[] = new int[10];
		int indice, n = 10, dato;
		
		System.out.println("Introduce el dato que quiere borrar del array todas las veces que se repita ");
		dato = teclado.nextInt();
		
		do{
			encontrado = false;
			indice = MisArrays.busquedaSecuencial(a, n, dato);
			if (indice != -1 ){
				n = MisArrays.borrarDato(a, n, indice);
				encontrado = true;
			}
		} while(encontrado == true);
		
	}
}
