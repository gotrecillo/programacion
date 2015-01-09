/*Escribir un programa que calcule el determinante de una matriz de 3x3. 
Pruébelo con la matriz [ [1,2,3], [4,5,6], [7,8,8] ] cuyo determinante es 3
*/

public class Ejercicio2_8 {

	public static void main(String[] args) {
		int matriz [][] = new int [3][3];
		int determinante;
		matriz [0][0] = 1;
		matriz [0][1] = 2;
		matriz [0][2] = 3;
		matriz [1][0] = 4;
		matriz [1][1] = 5;
		matriz [1][2] = 6;
		matriz [2][0] = 7;
		matriz [2][1] = 8;
		matriz [2][2] = 8;
		
		determinante = MisMates.determinante(matriz);
		System.out.println(determinante);
			
	}

}
