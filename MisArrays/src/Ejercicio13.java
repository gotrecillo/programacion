import java.util.Scanner;

/*
 Diseñar una función que se utilice para eliminar de un array de números enteros todos los elementos pares.
 */
public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		boolean encontrado;
		int a[] = new int[10];
		int indice, n = 10;
			
		do{
			encontrado = false;
			for (int i = 0; (i < n) && (encontrado == false); i++){
				if (a[i]%2 == 0){
					encontrado = true;
					n = MisArrays.borrarDato(a, n, i);
				}
			}
		} while(encontrado == true);

	}

}
