/*
 1. Diseñe un módulo que permita eliminar el elemento más pequeño de un vector.Leer 10 enteros,
  almacenarlos en un vector y determinar en qué posición del vector está el mayor número leído.
 */


public class Ejercicio1 {

	public static void main(String[] args) {
		int n = 10;
		int a[] = new int [12];
		MisArrays.llenarArray(a, n);
		System.out.println("Antes");
		System.out.println("--------------");
		MisArrays.visualizarArray(a, n);
		n = MisArrays.borrarMenor(a, n);
		System.out.println("Despues");
		System.out.println("--------------");
		MisArrays.visualizarArray(a, n);
	}

}
