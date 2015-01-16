/*
 8. Dados n números, almacenarlos en un array, mostrar cuántos de esos números son capicúa 
 (son aquellos k se lee igual hacia delante y hacia atrás).
 */

public class Ejercicio3_8 {

	public static void main(String[] args) {
		int n = (int)(Math.random()*100);
		int a[] = new int[100];
		MisArrays.llenarRandomArray(a, n);
		System.out.println("Los numeros capicua del array son");
		for( int i = 0; i < n; i++){
			if (MisMates.esCapicua(a[i])){
				System.out.println(a[i]);
			}
		}
	}
}
