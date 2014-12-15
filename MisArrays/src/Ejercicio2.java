/*
  Leer 10 enteros, almacenarlos en un vector y determinar en qué 
  posición del vector está el mayor número primo leído.
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		int a[] = new int[10];
		int n = 10, posicion = -1, mayor = 0;
		boolean encontrado = false;
		
		MisArrays.llenarArray(a, n);
		for (int i = 0; i < n; i++){
			if (Divisor.esPrimo(a[i])){
				if (encontrado = false){
					encontrado = true;
					mayor = a[i];
					posicion = i;
				}else{
					if (a[i] > mayor){
						posicion = i;
						mayor = a[i];
					}
				}
			}
		}	
		if (posicion == -1){
			System.out.println("No hay ningun primo en el array");
		}else{
			System.out.println("El primo mayor esta situado en la posicion: "+posicion+" y vale: "+mayor);
		}
	}
}
