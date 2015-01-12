/*
 Escriba un programa que, dado un array de enteros, busque si un número 
obtenido por la entrada estándar se encuentra en el array e imprima la 
primera posición en la que se encuentra el número
 */

public class Ejercicio2_13 {

	public static void main(String[] args) {
		int max, llenados, dato, posicion, a[];
		
		dato = (int)(Math.random()*100);
		max = (int)(1+Math.random()*100);
		do{
			llenados = (int)(1+Math.random()*100);
		} while (llenados > max);
		a = new int[max];
		MisArrays.llenarRandomArray(a, llenados);
		posicion = MisArrays.busquedaSecuencial(a, llenados, dato);
		System.out.println("Tamaño del array = "+max);
		System.out.println("Elementos dentro del array = "+llenados);
		System.out.println();
		if (posicion == -1){
			System.out.println("El dato buscado: "+dato+" no se encuentra en el array");
		}else{
			System.out.println("El dato buscado: "+dato+" se encuentra en la posicion: "+posicion+" del array");
		}
	}
}
