/*
 Declarar e inicializar una matriz de enteros de 3x2 e imprimirla.
 */

public class Ejercicio2_7 {

	public static void main(String[] args) {
		int a[][] = new int [3][2];
		int n = 3;
		MisArrays.llenarArray(a, n);
		MisArrays.visualizarArray(a, n);
	}

}
