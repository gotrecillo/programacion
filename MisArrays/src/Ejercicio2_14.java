/*
 Implementar el algoritmo de búsqueda binaria sobre un array/vector de 
enteros ordenado. El programa debe devolver si ha encontrado o no el 
número y el número de comparaciones con elementos del vector que ha 
requerido para encontrarlo. Probarlo con el vector 
 */
public class Ejercicio2_14 {

	public static void main(String[] args) {
		int v[] =  {2,3,4,5,6,7,8,9,10,11,12};
		int dato = 5;
		int posicion;
		int comprobaciones;
		
		posicion = MisArrays.busquedaBinaria(v, 11, dato);
		comprobaciones = MisArrays.contadorBusquedaBinaria(v, 11, dato);
		
		System.out.println("El dato "+dato+" esta situado en la posicion "+posicion+" del array. Y hemos necesitado "+comprobaciones+" comprobaciones para averiguarlo");
	}

}
