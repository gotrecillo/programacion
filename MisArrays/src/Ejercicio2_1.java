/*
 . Escribir un bucle equivalente al del siguiente programa sin utilizar el 
operador &&.
int lim = 10;
int c = 1;
Scanner sc = new Scanner(System.in);
for (int i = 0; i < lim && c != 0; i++, c = sc.nextInt()) {}
 */

import java.util.Scanner;
public class Ejercicio2_1 {

	public static void main(String[] args) {
		int lim = 10, c = 1, i = 0;
		Scanner teclado = new Scanner(System.in);
		
		while (c != 0){
			//lo que queramos
			c = teclado.nextInt();
			i++;
			if (i == lim){
				c = 0;
			}
		}
	}
}
