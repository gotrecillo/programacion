/*
 4. Dado un array de tamaño 100 y n elementos enteros,  desarrollar los  métodos que permitan obtener:
a) El índice del primer elemento mayor que su anterior
b) El índice de la primera cima (elemento mayor que sus vecinos). Atención: los extremos, 
primero y ultimo pueden ser cimas, sólo que no tendrían anterior o siguiente (respectivamente) con quienes comparar,
 sino que tendrían sólo que ser mayores que el siguiente o mayor que el anterior (respectivamente).
c) Todas las cimas.
 */

import java.util.Scanner;
public class Ejercicio3_4 {

	public static void main(String[] args) {
		int a[] = new int[100], cimas[];
		int llenados, primerMayor, primeraCima, numCimas;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Cuantos numeros quieres introducir en el array");
		llenados = teclado.nextInt();
		MisArrays.llenarRandomArray(a, llenados);
		primerMayor = MisArrays.busquedaPrimerMayor(a, llenados);
		if (primerMayor != -1){
			System.out.println("El primer número mayor que su anterior es "+a[primerMayor]+" y ocupa la posición "+primerMayor);
		}else{
			System.out.println("No existe ningun número mayor que su anterior");
		}
		MisArrays.visualizarArray(a, llenados);
		primeraCima = MisArrays.posicionPrimeraCima(a, llenados);
		System.out.println("La primera cima es "+a[primeraCima]+" y esta en la posicion "+primeraCima);
		cimas = MisArrays.todasLasCimas(a, llenados);
		numCimas = MisArrays.contarCimas(a, llenados);
		System.out.println("Hay "+numCimas+" cimas en el array");
		System.out.println("Todas las cimas del array son:");
		MisArrays.visualizarArray(cimas, numCimas);
	}

}
