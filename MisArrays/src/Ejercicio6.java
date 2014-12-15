/*
  Leer 10 números enteros, almacenarlos en un vector y determinar cuántas veces está repetido el mayor.
 */

public class Ejercicio6 {
	
	public static void main(String []args){
		int a[] = new int[10];
		int repeticiones = 0, indiceMayor;
		
		MisArrays.llenarArray(a, 10);
		indiceMayor = MisArrays.busquedaMayor(a, 10);
		for (int i = 0; i < 10; i++){
			if (a[i] == a[indiceMayor]){
				repeticiones++;
			}
		}
		System.out.println("El número mayor del array se repite "+repeticiones+" veces");
	}
}
