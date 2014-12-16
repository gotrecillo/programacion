/*
 Leer 10 números enteros, almacenarlos en un vector y calcularle el factorial a cada uno de los números leídos almacenándolos en otro vector.
 */

public class Ejercicio10 {

	public static void main(String[] args) {
		int a[] = new int[10], f[] = new int[10];
		
		MisArrays.llenarArray(a, 10);
		for (int i = 0; i < 10; i++){
			f[i] = MisMates.factorial(a[i]);
		}
	}
}
