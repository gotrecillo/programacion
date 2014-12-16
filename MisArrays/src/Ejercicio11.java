/*
 Leer 10 números enteros, almacenarlos en un vector y determinar cuántos números de los almacenados en dicho vector terminan en 15.
 */

public class Ejercicio11 {

	public static void main(String[] args) {
		int contador = 0;
		int a[] = new int[10];
		
		for (int i = 0; i < 10; i++){
			if (a[i]%100 == 15){
				contador++;
			}
		}
		System.out.println("La cantidad de números que terminan en 15 es "+contador);
	}

}
