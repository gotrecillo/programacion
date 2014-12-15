/*
 Leer 10 números enteros, almacenarlos en un vector y determinar si el promedio entero de estos datos está almacenado en el vector.
 */

public class Ejercicio7 {

	public static void main(String[] args) {
		int a[] = new int [10];
		int suma = 0, promedio, posicion;
		
		MisArrays.llenarArray(a, 10);
		for(int i = 0; i < 10; i++){
			suma = suma + a[i];
		}
		promedio = suma / 10;
		posicion = MisArrays.busquedaSecuencial(a, 10, promedio);
		if(posicion==-1){
			System.out.println("El promedio entero no esta almacenado en el vector");
		}else{
			System.out.println("El promedio entero se encuentra en la posicion "+posicion+" del vector");
		}
	}

}
