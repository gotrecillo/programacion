/*
 Leer 10 números enteros, almacenarlos en un vector y determinar en qué posición está el número cuya suma de dígitos sea la mayor.
 */

public class Ejercicio8 {

	public static void main(String[] args) {
		int sumaDigitos[] = new int[10], a[] = new int [10];
		int posicion;
		
		MisArrays.llenarArray(a, 10);
		for (int i = 0; i < 10; i++){
			sumaDigitos[i] = MisMates.sumaDigitos(a[i]);
		}
		posicion = MisArrays.busquedaMayor(sumaDigitos, 10);
		System.out.println("El numero cuya suma de digitos es mayor esta en la posicion "+posicion+" y vale "+a[posicion]);
	}

}
