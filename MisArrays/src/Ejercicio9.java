/*
 Leer 10 n�meros enteros, almacenarlos en un vector y determinar en qu� posici�n est� el n�mero con mas d�gitos.
 */

public class Ejercicio9 {

	public static void main(String[] args) {
		int a[] = new int[10], digitos[] = new int[10];
		int posicion;
		
		MisArrays.llenarArray(a, 10);
		for(int i = 0; i < 10; i++){
			digitos[i] = MisMates.contarDigitos(a[i]);
		}
		posicion = MisArrays.busquedaMayor(digitos, 10);
		System.out.println("La posicion del n�mero con mas d�gitos es "+posicion+" y el numero es "+a[posicion]);
	}
}
