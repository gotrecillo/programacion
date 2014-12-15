/*
  Cargar un vector de 10 posiciones con los 10 primeros elementos de la serie de Fibonacci y mostrarlo en pantalla.
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		int a[] = new int [10];
		int fa = 1, fb = 1, fc;
		
		a[0] = fa;
		a[1] = fb;
		for (int i = 2; i < 10;i++){
			fc = fa + fb;
			fa = fb;
			fb = fc;
			a[i] = fc;
		}
		MisArrays.visualizarArray(a, 10);
	}
}
