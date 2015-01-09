/*
 Escriba un programa simule varios lanzamientos de un dado y muestre la 
frecuencia de cada una de las caras así como la proporción del número de 
veces que haya salido cada cara con respecto al total. Para ello simule 6000 
lanzamientos de un dado utilizando la función Math.random()*6 para simular 
cada lanzamiento.
 */

public class Ejercicio2_11 {

	public static void main(String[] args) {
		int frequencia;
		int conjunto[] = new int[6000];
		
		for (int i = 0; i < 6000; i++){
			conjunto[i] = (int)((Math.random()*6)+1);
		}
		
		for (int i = 1; i < 7;i++){
			frequencia = MisArrays.contarDato(conjunto, 6000, i);
			System.out.println("El número "+i+" se repite "+frequencia+" veces");
		}
	}
}
