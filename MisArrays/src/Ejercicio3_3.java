/*
 3. Hacer un método que reciba un array  a de tamaño 100  con n números enteros. 
 El método deber averiguar si alguno de los números del array esta repetido, 
 devolverá -1 si no hay ninguno repetido y el índice (posición)  del primer repetido que encuentre, en otro caso.
 */

import java.util.Scanner;
public class Ejercicio3_3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int llenados, posicion;
		int a[] = new int[100];
		System.out.println("¿Cuantos elementos quieres introducir en el array?");
		llenados = teclado.nextInt();
		MisArrays.llenarRandomArray(a, llenados);
		posicion = MisArrays.busquedaRepetido(a, llenados);
		//MisArrays.visualizarArray(a, llenados);
		if (posicion != -1){
		System.out.println("El primer número repetido esta en la posición "+posicion+" y es "+a[posicion]);
		}else{
			System.out.println("No hay ningun número repetido en el array");
		}
	}
}
