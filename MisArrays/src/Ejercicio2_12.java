/*.Escribe un programa que ordene los números de un vector. Utilizar el 
algoritmo de la burbuja y probarlo sobre los vectores [4,3,2,1] y [3,2,1,4]. 
*/

public class Ejercicio2_12 {

	public static void main(String[] args) {
		int a[] = {4,3,2,1};
		int b[] = {3,2,1,4};
		
		MisArrays.ordenacionBurbuja(a, 4);
		MisArrays.ordenacionBurbuja(b, 4);
		MisArrays.visualizarArray(a, 4);
		MisArrays.visualizarArray(b, 4);
		}
}
