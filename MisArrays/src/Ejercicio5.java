/*
 Leer 10 números enteros, almacenarlos en un vector y determinar en qué posiciones se encuentran los números terminados en 4.
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		int a[] = new int [10];
		int posiciones[] = new int [10];
		int j = 0;
		
		MisArrays.llenarArray(a, 10);
		for(int i = 0; i < 10; i++){
			if (a[i]%10==4){
				posiciones[j] = i;
				j++;
			}
		}
		if (j==0){
			System.out.println("No hay números terminados en 4");
		}else{
			System.out.println("Las posiciones en las que hay números terminados en 4 son: ");
			MisArrays.visualizarArray(posiciones, j);
		}
	}

}
