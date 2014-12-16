/*
 Dise�ar una funci�n que reciba un n�mero n y nos permita obtener un array con todos los 
 divisores de ese n�mero. El tama�o del array ser� exactamente igual al n�mero de divisores del 
 n�mero
 */

import java.util.Scanner;
public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n, divisores, d[];
		
		System.out.println("Introduce el n�mero del cual quieras guardar sus divisores");
		n = teclado.nextInt();
		divisores = Divisor.contarDivisores(n);
		d = new int[divisores];
		for(int i = 1, j = 0; i <= n; i++ ){
			if(Divisor.esDivisor(n, i)){
				d[j] = i;
				j++;
			}
		}
		System.out.println("Los divisores del n�mero son:");
		MisArrays.visualizarArray(d, divisores);
	}

}
