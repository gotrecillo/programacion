/*
 Implementar el algoritmo de búsqueda binaria sobre un array/vector de 
enteros ordenado. El programa debe devolver si ha encontrado o no el 
número y el número de comparaciones con elementos del vector que ha 
requerido para encontrarlo. Probarlo con el vector 
 */
public class Ejercicio2_14 {

	public static void main(String[] args) {
		int v[] =  {2,3,4,5,6,7,8,9,10,11,12};
		int posicion11;
		int posicion13;
		posicion11 = MisArrays.busquedaSecuencial(v, 11, 11);
		//posicion13 = MisArrays.busquedaBinaria(v, 11, 13);
		System.out.println(posicion11);
		//System.out.println(posicion13);
	}

}
