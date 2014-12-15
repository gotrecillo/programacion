/*
  Almacenar en un vector de 10 posiciones los 10 primeros números primos comprendidos entre 100 y 300. Luego mostrarlos en pantalla.
 */

public class Ejercicio4 {

	public static void main(String[] args) {
		int a[] = new int [10];
		for (int i = 100, j = 0; (i <= 300) && (j < 10); i++){
			if(Divisor.esPrimo(i)){
				a[j] = i;
				j++;
			}
		}
		MisArrays.visualizarArray(a, 10);
	}
}
