/*
 . Escribe un programa que dada una matriz de 3x3 realice las siguientes 
funciones: 
• Calcule la media de todos los valores
• Calcule el valor mínimo y el máximo de todos los valores
• Sumar los valores en la diagonal descendente. 
• Sumar los valores en la diagonal ascendente. 
• Sumar los valores que están por encima de la diagonal descendente. 
• Sumar los valores que están por debajo de la diagonal descendente. 
• Probarlo con la matriz  [ [1,2,3], [4,5,6], [7,8,9] ]
 */

public class Ejercicio2_10 {

	public static void main(String[] args) {
		int matriz[][] = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("La media de la matriz es:");
		System.out.println(media(matriz));
		System.out.println("El mínimo de la matriz es:");
		System.out.println(minimo(matriz));
		System.out.println("El máximo de la matriz es:");
		System.out.println(maximo(matriz));
		System.out.println("La diagonal descendente es:");
		System.out.println(diagonalDescendiente(matriz));
		System.out.println("La diagonal ascendente es:");
		System.out.println(diagonalAscendiente(matriz));
		System.out.println("El triángulo derecho es:");
		System.out.println(trianguloDerecho(matriz));
		System.out.println("El triángulo izuierdo es:");
		System.out.println(trianguloIzquierdo(matriz));
		
	}
	
	public static double media(int matriz[][]){
		int suma = 0;
		double media;
		
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				suma = suma + matriz[i][j];
			}
		}
		
		media = suma / 9.0;
		
		return media;
	}
	
	public static int maximo(int matriz[][]){
		int maximo = matriz[0][0];
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				if (matriz[i][j] > maximo){
					maximo = matriz[i][j];
				}
			}
		}
		return maximo;
	}
	
	public static int minimo(int matriz[][]){
		int minimo = matriz[0][0];
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				if (matriz[i][j] < minimo){
					minimo = matriz[i][j];
				}
			}
		}
		return minimo;
	}
	
	public static int diagonalDescendiente(int matriz[][]){
		return matriz[0][0]+matriz[1][1]+matriz[2][2];
	}
	
	public static int diagonalAscendiente(int matriz[][]){
		return matriz[2][0]+matriz[1][1]+matriz[0][2];
	}
	
	public static int trianguloDerecho(int matriz[][]){
		return matriz[0][1]+matriz[0][2]+matriz[1][2];
	}
	
	public static int trianguloIzquierdo(int matriz[][]){
		return matriz[1][0]+matriz[2][0]+matriz[2][1];
	}

}
