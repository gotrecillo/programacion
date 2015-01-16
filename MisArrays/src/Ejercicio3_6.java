/*
 6. Sin usar arrays  auxiliares diseñar un algoritmo que permita invertir el contenido de un array de tamaño 100 y n elementos.
 */
public class Ejercicio3_6 {

	public static void main(String[] args) {
		int n = (int)(Math.random()*100);
		int a[] = new int[100];
		MisArrays.llenarRandomArray(a, n);
		System.out.println("El array creado es");
		MisArrays.visualizarArray(a, n);
		MisArrays.invertirArray(a, n);
		System.out.println("El array invertido es");
		MisArrays.visualizarArray(a, n);
	}
}
