/*
 1. Dise�e un m�dulo que permita eliminar el elemento m�s peque�o de un vector.Leer 10 enteros,
  almacenarlos en un vector y determinar en qu� posici�n del vector est� el mayor n�mero le�do.
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
