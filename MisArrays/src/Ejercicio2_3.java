/*
 Escriba un programa que sume todos los elementos de un array de enteros. 
Utilícelo para sumar el vector: 
int[] a = {1, 2, 3, 4, 5, 6};
 */
public class Ejercicio2_3 {

	public static void main(String[] args) {
		int a[] = new int [10];
		int n = 6, suma;
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		a[5] = 6;
		
		suma = MisArrays.sumaArray(a, n);
		System.out.println("La suma es "+suma);
	}
}
